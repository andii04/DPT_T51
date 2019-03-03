public class L03_Gold_Platinum extends Lounge {

    public L03_Gold_Platinum(Lounge successor) {
        super(successor);
    }

    @Override
    void choseLounge(Passenger passenger) {
        if (canHandle(passenger)) {
            if (passengersInLounge.size() < maxCapacity) {
                super.passengersInLounge.add(passenger);
            }
        }
        getSuccessor().choseLounge(passenger);
    }


    @Override
    boolean canHandle(Passenger passenger) {
        if (passenger.getState() instanceof Gold || passenger.getState() instanceof Platinum) {
            return true;
        }
        return false;
    }
}
