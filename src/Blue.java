public class Blue implements IState {

    int points;
    public void promote(Passenger passenger, int points) {
        //points.....;
        this.points += points;
        if(points>1999 && points <4250) {
            passenger.setState(new Bronze());
        }
        //noch falsche Werte für Points
        else if(points>=4250 && points <6500)
        {
            passenger.setState(new Silver());
        }
        else if(points>=6500 && points <11500)
        {
            passenger.setState(new Gold());
        }
        else if(points>=11500)
        {
            passenger.setState(new Platinum());
        }
        else {
            System.out.println("Fehler");
        }

    }
}
