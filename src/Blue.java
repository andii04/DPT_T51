//State
public class Blue implements IState {
    int points=0;
    public void promote(Passenger passenger, int points) {
        this.points+=points;
        if(this.points>1999 && this.points <4250) {
            passenger.setState(new Bronze(this.points));
            System.out.println("Promoted to bronze");
        }
        else {
            System.out.println("State is not changing");
        }


    }

    @Override
    public int getPoints() {
        return points;
    }

}

