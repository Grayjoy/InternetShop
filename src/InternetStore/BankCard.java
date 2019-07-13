package InternetStore;


import java.io.FileWriter;
import java.io.IOException;

public class BankCard {
    private int money = 1000 ;
    private String cardNumber ;
    private String date;
    private String cvv;
    

    public void logic() {
        money = 1000;
        cardNumber = "0000000000000000";
        date = "00/00";
        cvv = "000";
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}































    // ТУТ НАХОДИТСЯ ЛОГИКА ДОБАВЛЕНИЯ БАНКОВСКОЙ КАРТЫ, ГДЕ ПОЛЯ ВЗЯТЫ РАНДОМНО И ЗАПИСАНЫ В ФАЙЛ

    //private int varOfrandom = 1;

/*
    public void logic() {
        numberCard();
        cvv();
        date();
        money();

        try (FileWriter fileWriter = new FileWriter("Test.txt", false)) {
            fileWriter.write("Card Number: "  + cardNumber + "\r\ncvv: " + cvv + "\r\ndate: " + date + "\r\nmoney: " + money + "$");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void numberCard() {
        cardNumber = "";
        for (int i = 0; i < 16; i++) {
            varOfrandom = (int) (Math.random() * 9);
            cardNumber += String.valueOf(varOfrandom);
        }
        System.out.println(cardNumber);
        /*String cardNumber1 = cardNumber.substring(4); /*тут я заебался кодить, и по этому не придумал лучше как последовательно
                                                        добавлять интовые значения в стрингу. Используется костыль, когда я
                                                        обрезаю значение null, так как после первого прохождения цикла "cardNumber"
                                                        еще ничего не значит. UPD: мне на будущее, изначально можно присвоить "cardNumber"
                                                        пустой строке, и тогда null не будет появляться


        //cardNumber = cardNumber1;



    }
    public void cvv () {
        cvv = "";
        for (int i = 0; i < 3; i++) {
            varOfrandom = (int) (Math.random() * 9);
            cvv += String.valueOf(varOfrandom);
        }



        System.out.println(cvv);
    }

    public void date() {
        int varOfrandom1 = 0;
        int startMonth = 0;
        int endMonth = 12;
        varOfrandom = startMonth + (int) (Math.random() * endMonth);
        varOfrandom1 = startMonth + (int) (Math.random() * 31);
        if (varOfrandom1 < 10) {
            date = String.valueOf(varOfrandom + "/" + "0" + varOfrandom1);
        }
            if (varOfrandom < 10) {
                date = String.valueOf("0" + varOfrandom + "/" + varOfrandom1);
            }
            if (varOfrandom < 10 & varOfrandom1 < 10) {
                date = String.valueOf("0" + varOfrandom + "/" + "0" + varOfrandom1);
            }
            if (varOfrandom > 9 & varOfrandom1 > 9) {
                date = String.valueOf(varOfrandom + "/" + varOfrandom1);
            }
            System.out.println(date);
        }
        public void money() {
        money = 100 + (int) (Math.random() * 1000);
        }


    }

*/


// ТУТ НАХОДИТСЯ ЛОГИКА ДОБАВЛЕНИЯ БАНКОВСКОЙ КАРТЫ ВРУЧНУЮ



   /* public void logic() {
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
}*/
