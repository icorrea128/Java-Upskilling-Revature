package Day_4.InterfaceExample;

public class AssetMainMethod {
    public static void main(String[] args) {
        Asset stock = new Stock();
        AssetModel apple = new AssetModel();
        apple.setId(1000);
        apple.setAssetName("Apple");
        apple.setAssetTicker("AAPL");
        apple.setAssetPrice(172.25);
        stock.asset(apple);
        stock.saveAsset(apple);
        stock.updateAsset(apple);
        stock.deletedAsset();
        stock.sharpeRatio(.20F,.05F,15);
    }
}
