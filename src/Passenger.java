public class Passenger {
    private IState state;
    private String name;
    private City target;
    private SeatClass seatClass;

    public Passenger(String name) {
        //folgende Zeile geändert: Passenger Startzustand S0 = Blue ?
        this.state = new Blue();
        this.name = name;
    }


    //welche points hier übergeben ?
    public void promote(){
        state.promote(this,100);
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
