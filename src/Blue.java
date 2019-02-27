public class Blue implements IState {

    private final Passenger passenger;
    private IStateListener listener;



    public Blue(Passenger passenger) {
        this.passenger = passenger;
        passenger.setState(new Blue(this.passenger));
    }

    @Override
    public void changeState(Passenger passenger) {

        System.out.println("ConcreteState0");
        //Zustandswechsel, ggf. mit Bedingung
        //context.setState(context.getConcreteState2());

        passenger.setState(new Bronze(this.passenger));
    }

    @Override
    public void addStateListener(IStateListener listener) {
        stateListeners.add(0,listener);
    }
}
