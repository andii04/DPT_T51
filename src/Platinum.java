public class Platinum implements IState {
    int points;
    @Override
    public void promote(Passenger passenger,int points) {
        //points.....;
        this.points += points;
        System.out.println("Highest State reached");
    }
}
