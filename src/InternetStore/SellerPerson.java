package InternetStore;

import java.util.ArrayList;

import java.util.Scanner;

public class SellerPerson {

    private Product product;
    private String name;
    private String phoneNumber;
    private int rating;
    private ArrayList <Product> listOne = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        product = new Product();

        System.out.println("Enter product name");
        product.setName(scanner.nextLine());

        System.out.println("Enter price");
        product.setPrice(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter type");
        product.setType(scanner.nextLine());

        System.out.println("Enter id");
        product.setId(scanner.nextInt());
        scanner.nextLine();


        listOne.add(product);
        System.out.println(listOne);

    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SellerPerson{");
        sb.append(", name='").append(name).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", listOne=").append(listOne);
        sb.append('}');
        return sb.toString();
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }


    public void setRating(int rating) {

        this.rating = rating;
    }

    public int getRating() {

        return rating;
    }

    public ArrayList<Product> getListOne() {

        return listOne;
    }

    public void setListOne(ArrayList<Product> listOne) {

        this.listOne = listOne;
    }

}
