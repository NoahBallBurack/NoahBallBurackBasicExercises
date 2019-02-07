public class Car {

    private int year;
    private String make;
    private String model;
    private int miles;

    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles=0;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMiles() {
        return miles;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String toString() {
        return "This car is a "+ this.getYear()+ " "+this.getMake()+" "+this.getModel()+" with "+this.getMiles()+" miles.";
    }
}