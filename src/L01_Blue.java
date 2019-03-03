public class L01_Blue extends Lounge {

    public L01_Blue(Lounge successor) {
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
        if (passenger.getState() instanceof Blue) {
            return true;
        }
        return false;
    }
}
