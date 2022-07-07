public class LaziIntilazation {
    private static LaziIntilazation instance;

    private LaziIntilazation(){}

    public static LaziIntilazation getInstance(){
        if (instance == null){
            instance = new LaziIntilazation();
        }
        return instance;
    }
}
