public class Passenger {
    private IState state;
    private String name;
    private Driverstate driverstate;


    public Passenger(IState state, String name, Driverstate driverstate) {
        this.state = state;
        this.name = name;
        this.driverstate = driverstate;
    }


    /*public void pressButton(){

    }
    public void notifyListeners(){

    }*/

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driverstate getDriverstate() {
        return driverstate;
    }

    public void setDriverstate(Driverstate driverstate) {
        this.driverstate = driverstate;
    }
}
