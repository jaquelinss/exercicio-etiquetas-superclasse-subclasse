package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct() {
    }


    public UsedProduct(String name, Double price, Date manufactrueDate) {
        super(name, price);
        this.manufactureDate = manufactrueDate;
    }

    public Date getManufactrueDate() {
        return manufactureDate;
    }

    public void setManufactrueDate(Date manufactrueDate) {
        this.manufactureDate = manufactrueDate;
    }

    @Override
    public String toString() {
        return
                name +
                        " $ " + price +
                        " (Manufacture Date: " + manufactureDate + ")";
    }
}
