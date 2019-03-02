public class Gold implements IState {
    int points;
    public void promote(Passenger passenger,int points) {
        //points.....;
        this.points += points;
        if(points>=11500)
        {
            passenger.setState(new Platinum());
        }
        else {
            System.out.println("State not changing");
        }
    }
}
