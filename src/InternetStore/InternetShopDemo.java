package InternetStore;

import java.util.Scanner;

public class InternetShopDemo {

    private Scanner scanner = new Scanner(System.in);
    public Seller seller = new Seller();
    private Customer customer = new Customer();
    private boolean endlessCycle = true;
    private BankCard bankCard = new BankCard();




    public void mainmenu() {

        while (endlessCycle) {

            System.out.println("Who are you?\n" + "1.seller\n" + "2.customer\n" + "3.exit\n" + "4.Test BankCard");
            String sig = scanner.nextLine();

            switch (sig) {
                case ("1"):
                    seller.menu();
                    break;


                case ("2"):
                    bankCard.logic();
                    customer.mainUser(seller.sellerPerson,bankCard);
                    break;

                case ("3") :
                    endlessCycle = false;
                    break;
                case ("4") :
                    bankCard.logic();

            }

        }

    }

    }



