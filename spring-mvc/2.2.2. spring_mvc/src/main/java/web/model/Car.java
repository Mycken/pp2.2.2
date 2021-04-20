package web.model;

public class Car {
    private String marka;
    private int serie;
    private int year;

    public Car() {
    }

    public Car(String marka, int serie, int year) {
        this.marka = marka;
        this.serie = serie;
        this.year = year;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                '\'' + marka + '\'' +
                " " + serie +
                " " + year;
    }
}
