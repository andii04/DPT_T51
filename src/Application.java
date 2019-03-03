import java.util.ArrayList;
import java.util.Random;
public class Application {
    public static void main(String[] args) {
        ArrayList<Train> trains;
        Passenger[] passengers = new Passenger[5000];
        for (int i = 0; i < passengers.length; i++) {
            passengers[i] = new Passenger("Test");
            passengers[i].setState(new Blue());
        }
        Display display = new Display();
        Train trainA = new Train(City.A);
        Train trainB = new Train(City.B);
        Train trainC = new Train(City.C);
        Train trainD = new Train(City.D);
        Train trainE = new Train(City.E);
        Train trainF = new Train(City.F);
        Train trainG = new Train(City.G);
        Train trainH = new Train(City.H);
        Train trainI = new Train(City.I);
        Train trainJ = new Train(City.J);
        trains = new ArrayList<>();
        trains.add(trainA);
        trains.add(trainB);
        trains.add(trainC);
        trains.add(trainD);
        trains.add(trainE);
        trains.add(trainF);
        trains.add(trainG);
        trains.add(trainH);
        trains.add(trainI);
        trains.add(trainJ);
        Integer[] counterTrain = new Integer[10];
        for (int i = 0; i < 10; i++) {
            counterTrain[i] = 0;
        }
        for (int i = 0; i < 5000; i++) {
            Random r = new Random();
            int x = r.nextInt(10);
            if (counterTrain[x] < 500) {
                counterTrain[x]++;
                passengers[i].setTarget(inttoTarget(x));
            } else {
                while (counterTrain[x] == 500) {
                    x++;
                    if (x == 10) x = 0;
                }
                counterTrain[x]++;
                passengers[i].setTarget(inttoTarget(x));
            }
        }
        for (Passenger p : passengers) {
            if (p.getTarget() == City.A) {
                Train t = trains.get(0);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.B) {
                Train t = trains.get(1);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.C) {
                Train t = trains.get(2);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.D) {
                Train t = trains.get(3);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.E) {
                Train t = trains.get(4);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.F) {
                Train t = trains.get(5);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.G) {
                Train t = trains.get(6);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.H) {
                Train t = trains.get(7);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.I) {
                Train t = trains.get(8);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            } else if (p.getTarget() == City.J) {
                Train t = trains.get(9);
                if (t.getCapacityFirst() == 0) {
                    if (t.getCapacityEconomy() == 0) {
                        p.setSeatClass(SeatClass.Business);
                        t.setCapacityBusiness(t.getCapacityBusiness() - 1);
                    } else {
                        p.setSeatClass(SeatClass.Economy);
                        t.setCapacityEconomy(t.getCapacityEconomy() - 1);
                    }
                } else {
                    p.setSeatClass(SeatClass.First);
                    t.setCapacityFirst(t.getCapacityFirst() - 1);
                }
            }
        } //Bad code
        L03_Gold_Platinum goldLounge = new L03_Gold_Platinum(null);
        L02_Bronze_Silver bronzeLounge = new L02_Bronze_Silver(goldLounge);
        L01_Blue blueLounge = new L01_Blue(bronzeLounge);
        for (Passenger p : passengers) {
            display.addListener(p);
            blueLounge.choseLounge(p);
        }
        //Trains start
        for (int i = 0; i < 10; i++) {
            display.notifyPassengers(trains.get(i));
            trains.get(i).calculatepoints();
        }

    }

    public static City inttoTarget(int i) {
        switch (i) {
            case 0:
                return City.A;
            case 1:
                return City.B;
            case 2:
                return City.C;
            case 3:
                return City.D;
            case 4:
                return City.E;
            case 5:
                return City.F;
            case 6:
                return City.G;
            case 7:
                return City.H;
            case 8:
                return City.I;
            case 9:
                return City.J;
            default:
                return null;
        }
    }
}

