public class Platinum implements IState {
    int points;

    public Platinum(int points) {
        this.points =points;
    }

    @Override
    public void promote(Passenger passenger,int points) {
        //points.....;
        this.points += points;
        System.out.println("Highest State reached");
    }

    @Override
    public int getPoints() {
        return points;
    }
}
