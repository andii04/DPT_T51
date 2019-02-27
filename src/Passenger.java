public class Passenger {
    private IState state;
    private String name;
    private Passenger passenger;

    public Passenger(IState state, String name) {
        this.state = state;
        this.name = name;
    }

    public void operate(){
        state.changeState(passenger);
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

}
