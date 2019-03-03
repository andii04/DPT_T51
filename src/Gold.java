public class Gold implements IState {
    private int points;

    public Gold(int points) {
        this.points = points;
    }

    public void promote(Passenger passenger, int points) {
        this.points += points;
        if (this.points >= 11500) {
            passenger.setState(new Platinum(this.points));
        } else {
            System.out.println("State not changing");
        }
    }

    @Override
    public int getPoints() {
        return points;
    }
}
