package InternetStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Seller {


    SellerPerson sellerPerson;
    private Scanner scanner = new Scanner(System.in);
    private boolean endlessCycle;
    public ArrayList<SellerPerson> list = new ArrayList<>();


    public void menu() {
        endlessCycle = true;
        while (endlessCycle) {
            System.out.println("What do you want to do?\n" + "1.add seller\n" + "2.search seller\n" + "3.exit");
            String sig = scanner.nextLine();
            switch (sig) {
                case ("1"):
                    addSeller();
                    break;

                case ("2"):
                    searchSeller();
                    break;

                case ("3"):
                    exit();
                    break;
            }
        }
    }

    public void addSeller() {


        sellerPerson = new SellerPerson();

        System.out.println("Enter seller name");
        sellerPerson.setName(scanner.nextLine());

        System.out.println("Enter phone number");
        sellerPerson.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter rating");
        sellerPerson.setRating(scanner.nextByte());
        scanner.nextLine();


        list.add(sellerPerson);
        System.out.println(list);
    }


    public void searchSeller() {
        System.out.println("Enter name search");
        String nameSearch = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(nameSearch)) {
                System.out.println(list.get(i));
                break;
            }

        }
        System.out.println("Enter:\n" + "1.add product\n" + "2.exit");
        String nameProduct = scanner.nextLine();
        switch (nameProduct) {
            case ("1"):
                sellerPerson.addProduct();
            case ("2"):
                menu();

        }


    }

    private void exit() {
        endlessCycle = false;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Seller{");
        sb.append("sellerPerson=").append(sellerPerson);
        sb.append(", scanner=").append(scanner);
        sb.append(", endlessCycle=").append(endlessCycle);
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}




