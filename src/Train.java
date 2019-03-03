import java.util.ArrayList;

public class Train {
    int capacity = 500;
    SeatClass firstclass;
    SeatClass businessclass;
    SeatClass economy;

    private ArrayList<ITrainListener> listeners;

    public Train() {
        listeners = new ArrayList<>();
    }

    public void addListener(ITrainListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ITrainListener listener) {
        listeners.remove(listener);
    }



}
