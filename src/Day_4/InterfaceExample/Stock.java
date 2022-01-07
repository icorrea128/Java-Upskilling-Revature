package Day_4.InterfaceExample;

public class Stock implements Asset{
    @Override
    public AssetModel asset(AssetModel assetModel) {
        System.out.println("Business Logic that returns an Stocks information from a database");
        return null;
    }

    @Override
    public AssetModel updateAsset(AssetModel assetModel) {
        System.out.println("Business logic that updates a Stocks Information in a database");
        return null;
    }

    @Override
    public AssetModel saveAsset(AssetModel saveAsset) {
        System.out.println("Business logic that saves an Asset into a database");
        return null;
    }

    @Override
    public void deletedAsset() {
        System.out.println("Business logic that deletes an asset");

    }

    @Override
    public double sharpeRatio(float portfolioReturn, float riskFreeReturn, double standardDeviation) {
        double sharpeRatio = (portfolioReturn - riskFreeReturn)/standardDeviation;
        System.out.println("Sharpe ratio is " + sharpeRatio);
        return sharpeRatio;
    }
}
