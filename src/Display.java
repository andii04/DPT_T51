import java.util.ArrayList;

public class Display {
    private String text;
    private ArrayList<ITrainListener> listeners;
    public Display() {
        listeners = new ArrayList<>();
    }

    public void addListener(ITrainListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ITrainListener listener) {
        listeners.remove(listener);
    }

    public void notifyPassengers(Train train) {
        System.out.println("Display: Train to " + train.target + " is ready");
        for (ITrainListener p : listeners) {
            if (train.target == p.getTarget())
                p.trainReady(train);
        }
    }
}
