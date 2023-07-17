import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkingLot newParkingLot = new ParkingLot(10);

        List<Parkable> parkingSpaces = newParkingLot.createParkingLot();

        newParkingLot.parking(parkingSpaces, new Car("black", 4));
        newParkingLot.parking(parkingSpaces, new Car("black", 4));
        newParkingLot.parking(parkingSpaces, new Car("black", 4));
        newParkingLot.parking(parkingSpaces, new Car("black", 4));
        newParkingLot.parking(parkingSpaces, new Car("black", 4));
        newParkingLot.parking(parkingSpaces, new Car("black", 4));
        newParkingLot.parking(parkingSpaces, new Lorry("brown", 2));
        newParkingLot.parking(parkingSpaces, new Lorry("brown", 2));
        newParkingLot.parking(parkingSpaces, new Lorry("brown", 2));
        newParkingLot.parking(parkingSpaces, new Lorry("brown", 2));
        newParkingLot.parking(parkingSpaces, new Lorry("brown", 2));
        newParkingLot.parking(parkingSpaces, new Lorry("brown", 2));

        System.out.println();

        for (Parkable actual : parkingSpaces) {
            System.out.println(actual);
        }

        System.out.println();

        System.out.println("Occupied spaces: " + newParkingLot.getCounter());

        newParkingLot.leaving(parkingSpaces,1);

        System.out.println();

        System.out.println("Occupied spaces: " + newParkingLot.getCounter());

        System.out.println();

        for (Parkable actual : parkingSpaces) {
            System.out.println(actual);
        }
    }


}