public class Gold implements IState {
    private final Passenger passenger;
    public Gold(Passenger passenger) {
        this.passenger = passenger;

    }

    @Override
    public void changeState(Passenger passenger) {

    }

    @Override
    public void addStateListener(IStateListener listener) {

    }
}
