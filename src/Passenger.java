public class Passenger {
    private IState state;
    private String name;
    private City target;
    private SeatClass seatClass;

    public Passenger(IState state, String name) {
        this.state = state;
        this.name = name;
    }


    public void promote(){
        state.promote(this);
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
