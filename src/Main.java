import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AssetManager manager = new AssetManager();

        while (true) {
            System.out.println("\nIT Asset Management System");
            System.out.println("1. Add Asset");
            System.out.println("2. View Assets");
            System.out.println("3. Update Asset Status");
            System.out.println("4. Delete Asset");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter Status: ");
                    String status = scanner.nextLine();

                    manager.addAsset(new Asset(id, name, category, status));
                    break;

                case 2:
                    manager.viewAssets();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new status: ");
                    String newStatus = scanner.nextLine();

                    manager.updateAssetStatus(updateId, newStatus);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    manager.deleteAsset(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

