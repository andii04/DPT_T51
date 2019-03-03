//Observer
public interface ITrainListener {
    void trainReady(Train train);

    City getTarget();

}
