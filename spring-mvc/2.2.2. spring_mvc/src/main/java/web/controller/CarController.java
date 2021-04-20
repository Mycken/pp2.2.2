package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class CarController {
    @GetMapping("/cars")
    public String printListOfCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota",123,1980));
        cars.add(new Car("Mazda",234,1990));
        cars.add(new Car("Renault",345,2000));
        cars.add(new Car("Volkswagen",456,2010));
        cars.add(new Car("Ford",567,2020));

        List<Car> carsRequest = new ArrayList<>();

        int i = 0;
        int j = (count == null || count > 5) ? 5 : count;
            while (i < j) {
                carsRequest.add(cars.get(i));
                i++;
            }
        model.addAttribute("message", carsRequest);
        model.addAttribute("counter",count);

        return "first/cars";
    }
}
