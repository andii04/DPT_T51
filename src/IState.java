//State
public interface IState {
    void promote(Passenger passenger,int points);
    int getPoints();
}
