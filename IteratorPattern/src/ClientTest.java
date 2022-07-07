public class ClientTest {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add(new Item("nuber 1", "nuber 1"));
        menu.add(new Item("nuber 2", "nuber 2"));
        menu.add(new Item("nuber 3", "nuber 3"));
        menu.add(new Item("nuber 4", "nuber 4"));

        ItemIterator<Item> iterator = menu.iterator();

        while (iterator.hasNext()){
            Item item = iterator.next();
            System.out.println(item.getTtitle());
        }
    }
}
