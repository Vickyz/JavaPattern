public class ClientTest {
    public static void main(String[] args) {
        EagerInalization eager1 = EagerInalization.getInstance();
        eager1.setName("John");
        System.out.println(eager1.getName());

        EagerInalization eager2 = EagerInalization.getInstance();
        System.out.println(eager2.getName());
    }
}
