import java.util.ArrayList;
import java.util.Map;

public class Train {
    public Map<City, Integer> distanceMap = Map.of(
            City.A, 125,
            City.B, 225,
            City.C, 185,
            City.D, 85,
            City.E, 85,
            City.F, 50,
            City.G, 85,
            City.H, 250,
            City.I, 115,
            City.J, 200
    );
    int capacity = 500;
    int capacityFirst = 25;
    int capacityBusiness = 75;
    City target;
    private int capacityEconomy = 400;
    private ArrayList<Passenger> passengersInTrain;
    public Train(City target) {
        this.target = target;
        passengersInTrain = new ArrayList<>();
    }

    public int getCapacityEconomy() {
        return capacityEconomy;
    }

    public void setCapacityEconomy(int capacityEconomy) {
        this.capacityEconomy = capacityEconomy;
    }

    public int getCapacityFirst() {
        return capacityFirst;
    }

    public void setCapacityFirst(int capacityFirst) {
        this.capacityFirst = capacityFirst;
    }

    public int getCapacityBusiness() {
        return capacityBusiness;
    }

    public void setCapacityBusiness(int capacityBusiness) {
        this.capacityBusiness = capacityBusiness;
    }

    public void passengerEnter(Passenger passenger) {
        passengersInTrain.add(passenger);
        capacity--;
        if (capacity == 0) {
            System.out.println("Train " + target + " is full");
        }
    }

    public void calculatepoints() {
        for (Passenger p : passengersInTrain
        ) {
            String seatClass = p.getSeatClass().toString();
            switch (seatClass) {
                case "First":
                    p.promote(distanceMap.get(target) * 2);
                    break;
                case "Economy":
                    if (p.getTravelledDistance() >= 3) {
                        p.promote(distanceMap.get(target) + 50);
                    }
                    break;
                case "Business":
                    if (p.getTravelledDistance() >= 3) {
                        p.promote(distanceMap.get(target) * 2);
                    }
                    break;
                default:
                    break;
            }
            if (p.getTravelledDistance() % 10 == 0 && p.getTravelledDistance() > 0) {
                p.promote(distanceMap.get(target) * 3);
            }
            p.incresetravelledDistance();
        }
    }
}
