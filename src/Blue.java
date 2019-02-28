public class Blue implements IState {

    int points;
    public void promote(Passenger passenger, int points) {
        //points.....;
        if(points>=2000) {
            passenger.setState(new Platinum());
        }
        //noch falsche Werte für Points
        else if(points>=4000 && points <=8000)
        {
            passenger.setState(new Gold());
        }
    }
}
