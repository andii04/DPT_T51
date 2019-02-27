import java.util.ArrayList;

public interface IState {
    ArrayList<IStateListener> stateListeners = new ArrayList<>();
    void changeState(Passenger passenger);
    void addStateListener(IStateListener listener);
}
