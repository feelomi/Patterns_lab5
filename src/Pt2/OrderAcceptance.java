package Pt2;

public class OrderAcceptance {

    public void processOrder(Order order) {
        if (isOrderValid(order)) {
            prepareItems();
            notifyCustomer();
        } else {
            System.out.println("The order is not correct");
        }
    }

    private boolean isOrderValid(Order order) {
        boolean emptyCustomerName = order.getCustomerName().isEmpty();
        boolean emptyItems = order.getItems().isEmpty();
        boolean emptyTotalPrice = order.getTotalPrice() >= 0;
        return !emptyCustomerName && !emptyItems && emptyTotalPrice;
    }

    private void prepareItems() {
        // Логіка для підготовки товарів до відправлення
    }

    private void notifyCustomer() {
        // Логіка для повідомлення клієнта про статус замовлення
    }
}