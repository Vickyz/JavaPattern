public class EagerInalization {
    private static final EagerInalization INSTANCE = new EagerInalization();

    private EagerInalization(){}

    public static EagerInalization getInstance(){
        return INSTANCE;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
