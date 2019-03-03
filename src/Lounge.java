public class Lounge {
    //EnumLounge name;
    int maxCapacity = 2500;
    private Lounge successor;

    public void choseLounge(Passenger passenger){

        if (getSuccessor() != null)
        {
            getSuccessor().choseLounge(passenger);
        }
        else
            System.out.println("unable to find the correct lounge : " );
    }

    protected boolean canChoseLounge(Passenger passenger) {
        if(passenger.getState() instanceof Blue && maxCapacity >0)
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
