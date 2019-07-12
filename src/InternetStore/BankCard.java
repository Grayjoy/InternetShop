package InternetStore;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankCard {
    private double money;
    private String cardNumber;
    private String date;
    private String cvv;
    private Scanner scanner = new Scanner(System.in);
    private String pattern = "\\d+";
    private Pattern r = Pattern.compile(pattern);


    public void logic() {
        cardNumber();
        cvvCard();
        if (cardNumber != null) {
            if (cvv != null) {
                System.out.println("CardNumber: " + cardNumber + "\n" + "cvv code: " + cvv);
            }
            else {
                System.out.println("One or more parameters were entered incorrectly");
            }
        }
    }

public void cardNumber() {
    System.out.println("Enter number card");
    String scr = scanner.nextLine();
    setNumber(scr);

}
public void cvvCard() {
        System.out.println("Enter cvv of card");
        String scr1 = scanner.nextLine();
        setCvv(scr1);


    }
    public String getNumber() {

        return cardNumber;
    }

    public void setNumber(String cardNumber) {
        if (cardNumber.length() == 16) {
            Matcher m = r.matcher(cardNumber);
            if (m.find()) {
                this.cardNumber = cardNumber;
            }
        }
        else {
            System.out.println("Number of card must contain 16 characters");
            cardNumber();
        if (this.cardNumber == null) {
            System.out.println("Enter numeric values only");
            cardNumber();
        } else {
            System.out.println(cardNumber);
        }


        }
    }
    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        if (cvv.length() == 3) {
            Matcher m = r.matcher(cvv);
            if (m.find()) {
                this.cvv = cvv;
            }
            if (this.cvv == null) {
                System.out.println("Enter numeric values only");
                cvvCard();
            } else {
                System.out.println(cvv);
            }
        }
        else {
            System.out.println("CVV of card must contain 3 characters");
           cvvCard();
        }

    }
}
