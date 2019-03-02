public class Blue implements IState {

    int points=0;
    public void promote(Passenger passenger, int points) {
        //points.....;
        this.points += points;
        if(points>1999 && points <4250) {
            passenger.setState(new Bronze());
        }
        else {
            System.out.println("State is not changing");
        }



        //old code:
        /*this.points += points;
        if(points>1999 && points <4250) {
            passenger.setState(new Bronze());
        }
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
        }*/

    }
}
