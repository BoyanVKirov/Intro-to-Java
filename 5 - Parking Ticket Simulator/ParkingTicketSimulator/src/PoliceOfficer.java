/*The PoliceOfficer Class: This class should simulate a police officer inspecting parked cars. The class’s responsibilities
are as follows:
–  To know the police officer’s name and badge number
–  To examine a ParkedCar object and a ParkingMeter object, and determine whether the car’s time has expired
–  To issue a parking ticket (generate a ParkingTicket object) if the car’s time has expired*/

public class PoliceOfficer {
    String name, badge;

    public PoliceOfficer() {
    }

    public PoliceOfficer(String name, String badge) {
        this.name = name;
        this.badge = badge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    //method to check if the car is parked longer than what is paid for
    public boolean checkIllegallyParked(ParkedCar car, ParkingMeter minutes) {
        if (car.getParkedMinutes() > minutes.getPurchasedMinutes()) {
            return true;
        } else {
            return false;
        }
    }

    //method that calculates what will be the fine for car that is parked without paying
    public ParkingTicket writeTicket(ParkedCar car, ParkingMeter minutes) {
        ParkingTicket ticket = new ParkingTicket(car, this);
        int remainingMinutes = car.getParkedMinutes() - minutes.getPurchasedMinutes();

        if (checkIllegallyParked(car, minutes)){
            if (remainingMinutes <= 60) {
                ticket.fine = 25;
            } else {
                ticket.fine = 25 + (10*(remainingMinutes/60));
            }
        }
        return ticket;
    }
}
