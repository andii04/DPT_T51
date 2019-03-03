public class L03_Gold_Platinum extends Lounge {

    public L03_Gold_Platinum(Lounge successor) {
        this.setSuccessor(successor);
    }
    public void choseLounge(Passenger passenger) {
        if(passenger.getState() instanceof Gold || passenger.getState() instanceof Platinum)
        {
            System.out.println("Lounge Gold/Platinum");
        }
        else
        {
            super.choseLounge(passenger);
        }
    }
}
