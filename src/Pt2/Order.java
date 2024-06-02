package Pt2;

import java.util.List;

public class Order {
    private final String customerName;
    private final List<Items> items;
    private double totalPrice;

    public Order(String customerName, List<Items> items) {
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = calculateTotalPrice();
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Items> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Items item : items) {
            total += item.getPrice();
        }
        return total;
    }
}