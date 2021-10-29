package Lab_6_7.Set1.Accounts_Payments_Application;

public class Invoice implements Payable {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public void display() {
        System.out.println("Part No : " + partNumber);
        System.out.println("Description : " + partDescription);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price Per Item : ₹" + pricePerItem);
    }
}
