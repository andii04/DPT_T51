public class L02_Bronze_Silver extends Lounge {
    public L02_Bronze_Silver(Lounge successor) {
        this.setSuccessor(successor);
    }
    public void choseLounge(Lounge lounge) {
        if(lounge.equals("L02_Bronze_Silver"))
        {
            System.out.println("Lounge : " + lounge);
        }
        else
        {
            super.choseLounge(lounge);
        }
    }
}
