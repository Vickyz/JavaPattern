public class FurnitureFacade {
    private static FurnitureFacade instance;

    private Funitune chair;
    private Funitune tv;
    private Funitune table;

    public FurnitureFacade(){
        table = new Table();
        chair = new Chair();
        tv = new Televion();
    }

    public static FurnitureFacade getInstance(){
        if (instance == null){
            instance = new FurnitureFacade();
        }
        return instance;
    }

    public void makeTableAndChair(){
        table.make();
        chair.make();
    }

    public void makeTvAndChair(){
        chair.make();
        tv.make();
    }
}
