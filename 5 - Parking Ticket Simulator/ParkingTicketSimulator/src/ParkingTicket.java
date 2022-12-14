/*The ParkingTicket Class: This class should simulate a parking ticket. The class’s responsibilities are as follows:
–  To report the make, model, color, and license number of the illegally parked car
–  To report the amount of the fine, which is $25 for the first hour or part of an hour that the car is illegally parked,
plus $10 for every additional hour or part of an hour that the car is illegally parked
–  To report the name and badge number of the police officer issuing the ticket*/

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer cop;
    private ParkingMeter parkingMeter;
    double fine;

    public ParkingTicket() {
    }

    public ParkingTicket(ParkedCar car, PoliceOfficer cop) {
        this.car = car;
        this.cop = cop;
    }

    public ParkedCar getCar() {
        return car;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public PoliceOfficer getCop() {
        return cop;
    }

    public void setCop(PoliceOfficer cop){
        this.cop = cop;
    }

    @Override
    public String toString() {
        String toString = "License Number: "+car.getLicenseNumber() + "\nMake: "+car.getMake()+
                "\nModel: "+car.getModel() +"\nColor: "+car.getColor()+ "\nFine: "+String.format("%.2f", this.fine) + "$"+
                "\nOfficer: "+cop.getName()+"\nBadge: "+cop.getBadge();
        return toString;
    }
}
