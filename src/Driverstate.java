public class Driverstate {
    private IState state;
    public void pressButton(){

    }
    public void notifyListeners(){

    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
