package InternetStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
    private boolean endlessCycle;

    public void mainmenu(SellerPerson sellerPerson) {
        endlessCycle = true;
        while (endlessCycle) {
            System.out.println("Enter:\n" + "1.add product\n" + "2.exit");
            String nameSearch = scanner.nextLine();
            switch (nameSearch) {
                case ("1"):
                    System.out.println(sellerPerson.getListOne());
                    addProduct(sellerPerson);
                    break;
                case ("2"):
                    exit();
                    break;
            }

        }
}

    public void addProduct(SellerPerson sellerPersone) {
        System.out.println("Enter name of product");
        String nameSearch = scanner.nextLine();
        for (int i = 0; i < sellerPersone.getListOne().size(); i++) {
            if (sellerPersone.getListOne().get(i).getName().equals(nameSearch)) {
                products.add(sellerPersone.getListOne().get(i));
                break;
            }
        }
        System.out.println(products);

    }


    public void exit() {
        endlessCycle = false;
    }


    public void deleteProduct() {
    }

    public void buy() {
    }


}
