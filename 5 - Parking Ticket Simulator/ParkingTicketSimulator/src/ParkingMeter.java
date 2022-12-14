/*The ParkingMeter Class: This class should simulate a parking meter. The class’s only responsibility is as follows:
–  To know the number of minutes of parking time that has been purchased.*/

public class ParkingMeter {
    private int purchasedMinutes;

    ParkingMeter() {

    }

    public int getPurchasedMinutes() {
        return purchasedMinutes;
    }

    public void setPurchasedMinutes(int purchasedMinutes) {
        this.purchasedMinutes = purchasedMinutes;
    }
}