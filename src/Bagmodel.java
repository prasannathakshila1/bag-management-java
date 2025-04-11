/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thakshila
 */
public class Bagmodel {
    private String name;
    private String brand;
    private String category;
    private int quantity;
    private double price;

    public Bagmodel(String name, String brand, String category, int quantity, double price) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}
