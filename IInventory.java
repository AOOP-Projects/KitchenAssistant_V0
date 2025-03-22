import java.util.List;

public interface IInventory {
    Ingredient addIngredient(Ingredient ingredient);
    List<Ingredient> checkLowStock();
    String removeIngredient();

}
