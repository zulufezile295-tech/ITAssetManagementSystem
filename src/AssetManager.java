import java.util.ArrayList;

public class AssetManager {
    private ArrayList<Asset> assets = new ArrayList<>();

    public void addAsset(Asset asset) {
        assets.add(asset);
        System.out.println("Asset Added successfully.");

    }

    public void viewAssets() {
        if (assets.isEmpty()) {
            System.out.println("No assets found.");
            return;
        }
        for (Asset asset : assets) {
            System.out.println(asset);
        }
    }

    public void updateAssetStatus(int id, String updatedStatus) {
        for (Asset asset : assets) {
            if (asset.getId() == id) {
                asset.setStatus(updatedStatus);
                System.out.println("Asset updated.");
                return;
            }
        }
        System.out.println("Asset not found.");
    }

    public void deleteAsset(int id) {
        for (Asset asset : assets) {
            if (asset.getId() == id) {
                assets.remove(asset);
                System.out.println("Asset deleted.");
                return;
            }
        }
        System.out.println("Asset not Found.");
    }
}
