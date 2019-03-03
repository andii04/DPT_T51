//COR

import java.util.ArrayList;
import java.util.List;

public abstract class Lounge {
    int maxCapacity = 2500;
    List<Passenger> passengersInLounge;
    private Lounge successor;

    public Lounge(Lounge successor) {
        this.successor = successor;
        passengersInLounge = new ArrayList<>();
    }

    public List<Passenger> getPassengersInLounge() {
        return passengersInLounge;
    }

    public void choseLounge(Passenger passenger) {
        if (successor == null) {
            System.out.println("Unable to handle " + passenger);
        } else successor.choseLounge(passenger);
    }

    abstract boolean canHandle(Passenger passenger);

    public Lounge getSuccessor() {
        return successor;
    }

    public void setSuccessor(Lounge successor) {
        this.successor = successor;
    }
}
