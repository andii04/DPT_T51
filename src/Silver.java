public class Silver implements IState {
    int points;
    @Override
    public void promote(Passenger passenger, int points) {
        //points.....;
        this.points += points;
        if(points>=6500 && points <11500)
        {
            passenger.setState(new Gold());
        }
        else {
            System.out.println("State is not changing");
        }
    }
}
