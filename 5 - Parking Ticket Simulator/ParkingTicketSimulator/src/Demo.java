public class Demo {
    public static void main(String[] args) {
        //We create new car with some characteristics
        ParkedCar car = new ParkedCar();
        car.setMake("BMV");
        car.setModel("Q7");
        car.setColor("Red");
        car.setLicenseNumber("AC 8752 BM");
        //this is timer for how long the car is parked
        car.setParkedMinutes(122);

        //this sets for how many minutes is paid for certain car to pe parked
        ParkingMeter meter = new ParkingMeter();
        meter.setPurchasedMinutes(60);

        //This sets the police officer who is responsible for the parking spot
        PoliceOfficer officer = new PoliceOfficer();
        officer.setName("Jim Halpert");
        officer.setBadge("JH684172");

        //if statement that checks if certain car is illegally parked and if so, issues a ticket to it
        if (officer.checkIllegallyParked(car, meter)) {
            ParkingTicket ticket = officer.writeTicket(car, meter);
            System.out.println("Ticket Generated:");
            System.out.println(ticket);
        }
        else {
            System.out.println("No Ticket Needed");
        }
    }
}