

import java.time.LocalDate;
import java.time.LocalDate;

public class Ingredient {

    private String name;
    private LocalDate  expirationDate;
    private double quantity;
    
    
    //Constructor
    public Ingredient(String name, double quantity, LocalDate expirationDate) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        
        
    }
  
    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    

    //functioanlities
    public Boolean isExpired() {
        return expirationDate.isBefore(LocalDate.now()); 
    }
}
