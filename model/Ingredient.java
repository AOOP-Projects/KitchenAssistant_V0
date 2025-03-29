

import java.time.LocalDateTime;

public class Ingredient {

    private String name;
    private LocalDateTime  expirationDate;
    private double quantity;
    
    
    //Constructor
    public Ingredient(String name, double quantity, LocalDateTime expirationDate) {
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

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDateTime expirationDate) {
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
        return expirationDate.isBefore(LocalDateTime.now()); 
    }
}
