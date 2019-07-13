package InternetStore;


import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private String name;
    private String Email;
    private Scanner scanner = new Scanner(System.in);
    private Order order = new Order();
    private ArrayList<Product> listTwo = new ArrayList<>();
    private boolean endlessCycle;
    private int count;
    private int sumPrice;

    public void mainUser(SellerPerson sellerPerson, BankCard bankCard) {
        endlessCycle = true;
        while (endlessCycle) {
            System.out.println("What do you want to do?\n" + "1.add product in order\n" + "2.info about order\n" + "3.buy\n" + "4.exit");
            String scr = scanner.nextLine();
            switch (scr) {
                case ("1"):
                    order.mainmenu(sellerPerson);
                    break;
                case ("2"):
                    System.out.println(order.products);
                    break;
                case ("3"):
                    buy(order,bankCard);
                    break;
                case ("4") :
                    exit();
                    break;

            }
        }

    }
    public void buy(Order order,BankCard bankCard) {
        count = 0;

        //int sumPrice = (int) (order.products.get(count).getPrice() + count++ + order.products.get(count).getPrice() + count++);
        for (int i = 0; i < order.products.size(); i++) {
            sumPrice += (int) order.products.get(i).getPrice();
        }
        System.out.println(sumPrice);
        if ( sumPrice < bankCard.getMoney()) {
                    listTwo = order.products;
                }
            bankCard.setMoney(bankCard.getMoney() - sumPrice);
        System.out.println(bankCard.getMoney());

        System.out.println(listTwo);
    }


public void exit () {
        endlessCycle = false;
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
