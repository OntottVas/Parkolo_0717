import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkingLot newParkingLot = new ParkingLot(10);

        newParkingLot.parking(newParkingLot.getParkingLot(), new Car("black", 4));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Car("black", 4));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Car("black", 4));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Car("black", 4));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Car("black", 4));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Car("black", 4));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Lorry("brown", 2));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Lorry("brown", 2));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Lorry("brown", 2));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Lorry("brown", 2));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Lorry("brown", 2));
        newParkingLot.parking(newParkingLot.getParkingLot(), new Lorry("brown", 2));

        System.out.println();

        for (Parkable actual : newParkingLot.getParkingLot()) {
            System.out.println(actual);
        }

        System.out.println();

        System.out.println("Occupied spaces: " + newParkingLot.getCounter());

        newParkingLot.leaving(newParkingLot.getParkingLot(),1);

        System.out.println();

        System.out.println("Occupied spaces: " + newParkingLot.getCounter());

        System.out.println();

        for (Parkable actual : newParkingLot.getParkingLot()) {
            System.out.println(actual);
        }
    }


}