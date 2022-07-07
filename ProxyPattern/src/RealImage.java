public class RealImage implements Image{
    private String ulr;

    public RealImage(String ulr) {
        this.ulr = ulr;
        System.out.println("Int");
    }

    @Override
    public void load() {
        System.out.println("Load from "+this.ulr);
    }
}
