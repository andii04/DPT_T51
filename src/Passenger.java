//Listener
public class Passenger implements ITrainListener {
    private IState state;
    private String name;
    private int travelledDistances;
    private int travelledDistance = 0;
    private City target;
    private SeatClass seatClass;

    public Passenger(String name) {
        //folgende Zeile geändert: Passenger Startzustand S0 = Blue ?
        this.state = new Blue();
        this.name = name;
    }

    public void incresetravelledDistance() {
        travelledDistance++;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }

    public City getTarget() {
        return target;
    }

    public void setTarget(City target) {
        this.target = target;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public void promote(int points) {
        state.promote(this, points);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void trainReady(Train train) {
        train.passengerEnter(this);
    }
}
