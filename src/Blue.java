public class Blue implements IState {
    private final Passenger passenger;

    public Blue(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public void changeState(Passenger passenger) {
        //passenger.setDriverstate(passenger.getDriverstate());
        System.out.println("ConcreteState0");
        //Zustandswechsel, ggf. mit Bedingung
        //context.setState(context.getConcreteState2());
        passenger.setState(passenger.getState());
    }

    @Override
    public void addStateListener(IStateListener listener) {

    }
}
