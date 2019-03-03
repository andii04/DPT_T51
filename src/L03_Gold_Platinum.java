public class L03_Gold_Platinum extends Lounge {

    public L03_Gold_Platinum(Lounge successor) {
        this.setSuccessor(successor);
    }
    public void choseLounge(Lounge lounge) {
        if(lounge.equals("L03_Gold_Platinum"))
        {
            System.out.println("Lounge : " + lounge);
        }
        else
        {
            super.choseLounge(lounge);
        }
    }
}
