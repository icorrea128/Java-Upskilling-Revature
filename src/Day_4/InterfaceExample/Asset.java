package Day_4.InterfaceExample;

public interface Asset {
    AssetModel asset(AssetModel assetModel);
    AssetModel updateAsset(AssetModel assetModel);
    AssetModel saveAsset(AssetModel saveAsset);
    void deletedAsset();
    double sharpeRatio(float portfolioReturn,float riskFreeReturn, double standardDeviation);

}
