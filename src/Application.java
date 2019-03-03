import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        /*Passenger p = new Passenger("Peter");
        p.setState(new Blue());
        System.out.println(p);
        System.out.println();
        p.promote();
        System.out.println(p);*/

        Passenger[] passengers = new Passenger[5000];
        for(int i=0;i<passengers.length;i++)
        {
            passengers[i].setState(new Blue());
            passengers[i].promote();
        }

    }
}
