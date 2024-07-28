package org.example;
//create class named Product
public class Product {
    //class attributes
    private double productCost;
    private int quantity;
    private String productName;

    //used generate to make constructor accepting all 3 attributes for creating /initializing objects
    public Product(double productCost, int quantity, String productName) {
        this.productCost = productCost;
        this.quantity = quantity;
        this.productName = productName;
    }
    //public method to print the total cost of the products
    public void totalCost () {
        double totalCoast = this.productCost * this.quantity;
        //calculate total coast
        System.out.println("Total cost is " + totalCoast);
    }

    //public method to print the product details
    public void printProduct (){
        System.out.println
                (this.productName + " costs " +
                        this.productCost + " and " +
                        this.quantity + " units were purchased.");

    }
    //main method to test the product class
    public static void main (String[] args) {
        //create instance of product
        Product milk = new Product (4.55, 11, "A gallon of milk");
        //print the product details
        milk.printProduct();
        milk.totalCost();
    }

}
