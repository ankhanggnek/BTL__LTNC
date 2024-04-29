import java.util.Date;

public class Medicine {
    private String ID;
    private String name;
    private String type;
    private double unitPrice;
    private int quantityInStock;
    private Date expirationDate;
    private String supplier;
    private String note;

    // Constructors
    public Medicine() {
    }

    public Medicine(String ID, String name, String type, double unitPrice, int quantityInStock, Date expirationDate, String supplier, String note) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.expirationDate = expirationDate;
        this.supplier = supplier;
        this.note = note;
    }

    // Getters and setters
     public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    
}
