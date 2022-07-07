public class ProxyImage implements Image{

    private String ulr;
    private RealImage realImage;

    public ProxyImage(String ulr) {
        this.ulr = ulr;
    }

    @Override
    public void load() {
        if(realImage == null){
            realImage = new RealImage(ulr);
        }else {
            System.out.println("Image already existed");
        }
        realImage.load();
    }
}
