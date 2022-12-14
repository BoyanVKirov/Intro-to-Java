/*The ParkedCar Class: This class should simulate a parked car. The class’s responsibilities are as follows:
–  To know the car’s make, model, color, license number, and the number of minutes that the car has been parked.*/

public class ParkedCar {
    private String make, model, color, licenseNumber;
    private int parkedMinutes;

    public ParkedCar() {

    }

    public ParkedCar(String carMake, String carModel, String carColor, String carLicenseNumber, int carParkedMinutes) {
        make = carMake;
        model = carModel;
        color = carColor;
        licenseNumber = carLicenseNumber;
        parkedMinutes = carParkedMinutes;
    }

    public String getMake() {
        return make;
    }

    public void  setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getParkedMinutes() {
        return parkedMinutes;
    }

    public void setParkedMinutes(int parkedMinutes) {
        this.parkedMinutes = parkedMinutes;
    }
}