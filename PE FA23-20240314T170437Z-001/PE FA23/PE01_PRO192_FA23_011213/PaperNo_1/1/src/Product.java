
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;

    public Product() {

    }

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void setDiscount(int discount) {
        if (discount < 0) {
            this.discount = 0;
        }
        else {
            this.discount = discount;
        }
    }

    public String toString() {
    // Tính toán subTotal với việc giảm giá được áp dụng
    double subTotal = quantity * price * (100.00 - discount) / 100.00;

    String s = String.format(Locale.US, "%s,%s,%.2f,%d,%.2f", id, name, price, quantity, subTotal);

    return s;
}
}
