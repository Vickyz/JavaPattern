public class ClientTest {

    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("https://abcd.com/dev.png");

        System.out.println("Fist load");
        proxyImage.load();

        System.out.println("Seconds load");
        proxyImage.load();
    }
}
