public class ClientTest {

    public static void main(String[] args) {
        Boss boss = new Boss(60,"Tom", 8000);
        BusinessAnalyst ba = new BusinessAnalyst(27,"Jame", 2100);

        Leader leader = new Leader(45, "San", 5000);
        Deveper dev1 = new Deveper(30, "Jonh", 2100);
        Deveper dev2 = new Deveper(25, "Ana", 2200);

        leader.add(dev1);
        leader.add(dev2);
        boss.add(leader);
        boss.add(ba);

        boss.print();
    }
}
