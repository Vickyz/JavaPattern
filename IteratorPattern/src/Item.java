public class Item {
    private String ttitle;
    private String ulr;

    public Item(String ttitle, String ulr) {
        this.ttitle = ttitle;
        this.ulr = ulr;
    }

    public void setTtitle(String ttitle) {
        this.ttitle = ttitle;
    }

    public void setUlr(String ulr) {
        this.ulr = ulr;
    }

    public String getTtitle() {
        return ttitle;
    }

    public String getUlr() {
        return ulr;
    }
}
