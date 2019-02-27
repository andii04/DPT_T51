public class Silver implements IState {
    private final Passenger passenger;
    @Override
    public void changeState(Passenger passenger) {

    }

    @Override
    public void addStateListener(IStateListener listener) {

    }

    public Silver(Passenger passenger) {
        this.passenger = passenger;
    }
}
