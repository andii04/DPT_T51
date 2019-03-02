public class Application {
    public static void main(String[] args) {
        Passenger p = new Passenger("Peter");
        p.setState(new Blue());
        System.out.println(p);
        System.out.println();
        p.promote();
        System.out.println(p);


    }
}
