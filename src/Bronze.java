public class Bronze implements IState {
    int points;
    @Override
    public void promote(Passenger passenger,int points) {
        //points.....;
        this.points += points;
        if(points>=4250 && points <6500)
        {
            passenger.setState(new Silver());
        }
        else {
            System.out.println("State is not changing");
        }
    }
}
