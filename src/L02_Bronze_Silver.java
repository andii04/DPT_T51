public class L02_Bronze_Silver extends Lounge {

    public L02_Bronze_Silver(Lounge successor) {
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
        if (passenger.getState() instanceof Silver || passenger.getState() instanceof Bronze) {
            return true;
        }
        return false;
    }
}
