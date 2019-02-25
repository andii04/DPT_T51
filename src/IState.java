import java.util.ArrayList;

public interface IState {
    ArrayList<IStateListener> stateListeners = new ArrayList<>();
    void changeState(Driverstate driverstate);
    void addStateListener(IStateListener listener);
}
