public class Silver implements IState {
    private int points;

    public Silver(int points) {
        this.points = points;
    }

    @Override
    public void promote(Passenger passenger, int points) {
        //points.....;
        this.points += points;
        if (this.points >= 6500 && this.points < 11500) {
            passenger.setState(new Gold(this.points));
        } else {
            System.out.println("State is not changing");
        }
    }

    @Override
    public int getPoints() {
        return points;
    }
}
