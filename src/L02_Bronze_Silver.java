public class L02_Bronze_Silver extends Lounge {
    public L02_Bronze_Silver(Lounge successor) {
        this.setSuccessor(successor);
    }
    public void choseLounge(Passenger passenger) {
        if(passenger.getState() instanceof Bronze || passenger.getState() instanceof Silver)
        {
            System.out.println("Lounge Bronze/Silver");
        }
        else
        {
            super.choseLounge(passenger);
        }
    }
}
