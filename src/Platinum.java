public class Platinum implements IState {
    private final Passenger passenger;
    public Platinum(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public void changeState(Passenger passenger) {

    }

    @Override
    public void addStateListener(IStateListener listener) {

    }
}
