public class Blue implements IState {
    private final Passenger passenger;
    private IStateListener listener;

    public Blue(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public void changeState(Passenger passenger) {
        //passenger.setDriverstate(passenger.getDriverstate());
        System.out.println("ConcreteState0");
        //Zustandswechsel, ggf. mit Bedingung
        //context.setState(context.getConcreteState2());

        //not sure if richtig: //passenger.setState(new Bronze());
    }

    @Override
    public void addStateListener(IStateListener listener) {
        stateListeners.add(0,listener);
    }
}
