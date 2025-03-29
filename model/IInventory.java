
import java.util.List;

public interface IInventory {
    void addIngredient(Ingredient ingredient);
    List<Ingredient> checkLowStock();
    void removeIngredient(Ingredient ingredient);

}
