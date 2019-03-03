public class L01_Blue extends Lounge {

    public L01_Blue(Lounge successor) {
        this.setSuccessor(successor);
    }

    public void choseLounge(Passenger passenger) {
        if(passenger.getState() instanceof Blue)
        {
            System.out.println("Lounge Blue");
        }
        else
        {
            super.choseLounge(passenger);
        }
    }
}
