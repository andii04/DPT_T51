public class Lounge {
    //EnumLounge name;
    int maxCapacity = 2500;
    private Lounge successor;

    public void choseLounge(Lounge lounge){
        if (getSuccessor() != null)
        {
            getSuccessor().choseLounge(lounge);
            maxCapacity--;
        }
        else
            System.out.println("unable to find the correct lounge : " + lounge);
    }

    protected boolean canChoseLounge(Lounge lounge,Passenger passenger) {
        if(lounge.maxCapacity >0 && passenger.getState().equals(lounge))
        {
            return true;
        }
        else{
            return false;
        }
    }

    public Lounge getSuccessor() {
        return successor;
    }

    public void setSuccessor(Lounge successor) {
        this.successor = successor;
    }
}
