public class TheadSafe {
    private static volatile TheadSafe instance;

    private TheadSafe(){}

    private static synchronized TheadSafe getInstance(){
        if (instance == null){
            instance = new TheadSafe();
        }
        return instance;
    }
}
