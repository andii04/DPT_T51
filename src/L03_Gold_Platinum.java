public class L03_Gold_Platinum extends Lounge {
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
