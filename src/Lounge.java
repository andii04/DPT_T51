import java.util.ArrayList;
import java.util.List;

public abstract class Lounge {
    int maxCapacity = 2500;
    private Lounge successor;

    List<Passenger> passengersInLounge;

    public Lounge(Lounge successor) {
        this.successor = successor;
        passengersInLounge = new ArrayList<>();
    }

    abstract void choseLounge(Passenger passenger);

    abstract boolean canHandle(Passenger passenger);

    public Lounge getSuccessor() {
        return successor;
    }

    public void setSuccessor(Lounge successor) {
        this.successor = successor;
    }
}
