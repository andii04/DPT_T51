public class L01_Blue extends Lounge {

    public L01_Blue(Lounge successor) {
        this.setSuccessor(successor);
    }

    public void choseLounge(Lounge lounge) {
        if(lounge.equals("L01_Blue"))
        {
            System.out.println("Lounge : " + lounge);
        }
        else
        {
            super.choseLounge(lounge);
        }
    }
}
