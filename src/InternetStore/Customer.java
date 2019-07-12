package InternetStore;


import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private String name;
    private String Email;
    private Scanner scanner = new Scanner(System.in);
    private Order order = new Order();
    private ArrayList<Order> listTwo = new ArrayList<>();
    private BankCard bankCard = new BankCard();

    public void mainUser(SellerPerson sellerPerson) {

        System.out.println("What do you want to do?\n" + "1.add product in order\n" + "2.info about order\n" + "3.info about sellers\n" + "4.info about products");
        String scr = scanner.nextLine();
        switch (scr) {
            case ("1"):
                order.mainmenu(sellerPerson);
            case ("2"):
                System.out.println(order.products);

        }
    }


    public void buy() {

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


}
