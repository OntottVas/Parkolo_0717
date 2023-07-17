import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int counter = 0;
    private int size;
    private List<Parkable> parkingLot;

    public ParkingLot(int size) {
        this.size = size;
        this.parkingLot = new ArrayList<>();
    }

    public List<Parkable> getParkingLot() {
        return this.parkingLot;
    }

    public int getSize() {
        return this.size;
    }

    public int getCounter() {
        return this.counter;
    }

    public void parking(List<Parkable> parkingLot, Car forParking) {
        if (parkingLot.size() < this.size) {
            counter++;
            System.out.println("Your number is " + counter + ". " +
                    "Please keep it, because we will need it when you leave.");
            parkingLot.add(forParking);
        } else {
            System.out.println("The parking lot is full.");
        }
    }

    public void parking(List<Parkable> parkingLot, Lorry forParking) {
        if (parkingLot.size() < this.size) {
            counter++;
            System.out.println("Your number is " + counter + ". " +
                    "Please keep it, because we will need it when you leave.");
            parkingLot.add(forParking);
        } else {
            System.out.println("The parking lot is full.");
        }
    }

    public void leaving(List<Parkable> parkingLot, int number) {
        if (parkingLot.size() > 0) {
            parkingLot.remove(number-1);
            System.out.println("Have a great day, thank you for choosing us.");
            this.counter--;
        } else {
            System.out.println("There are no vehicles in the parking lot.");
        }
    }


}
