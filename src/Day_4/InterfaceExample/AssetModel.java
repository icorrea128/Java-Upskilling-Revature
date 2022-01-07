package Day_4.InterfaceExample;

public class AssetModel {
    private long id;
    private String assetName;
    private String assetTicker;
    private double assetPrice;

    public AssetModel(long id, String assetName, String assetTicker, double assetPrice) {
        this.id = id;
        this.assetName = assetName;
        this.assetTicker = assetTicker;
        this.assetPrice = assetPrice;
    }

    public AssetModel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetTicker() {
        return assetTicker;
    }

    public void setAssetTicker(String assetTicker) {
        this.assetTicker = assetTicker;
    }

    public double getAssetPrice() {
        return assetPrice;
    }

    public void setAssetPrice(double assetPrice) {
        this.assetPrice = assetPrice;
    }
}
