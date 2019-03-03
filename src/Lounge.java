public class Lounge {
    //EnumLounge name;
    //int maxCapacity = 2500;
    private Lounge successor;

    public void choseLounge(Lounge lounge){
        if (getSuccessor() != null)
            getSuccessor().choseLounge(lounge);
        else
            System.out.println("unable to find the correct lounge : " + lounge);
    }



    public Lounge getSuccessor() {
        return successor;
    }

    public void setSuccessor(Lounge successor) {
        this.successor = successor;
    }
}
