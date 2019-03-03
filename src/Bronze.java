public class Bronze implements IState {
    int points;

    public Bronze(int points) {
        this.points = points;
    }

    @Override
    public void promote(Passenger passenger, int points) {
        //points.....;
        this.points += points;
        if (this.points >= 4250 && this.points < 6500) {
            passenger.setState(new Silver(this.points));
        } else {
            System.out.println("State is not changing");
        }
    }

    @Override
    public int getPoints() {
        return points;
    }
}
