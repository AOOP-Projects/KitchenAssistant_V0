import java.util.ArrayList;
import java.util.List;

public class InventoryManager implements IInventory{
        private List<Ingredient> ingredients = new ArrayList<>();

        @Override
        public Ingredient addIngredient(Ingredient ingredient) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'addIngredient'");
        }

        @Override
        public List<Ingredient> checkLowStock() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'checkLowStock'");
        }

        @Override
        public String removeIngredient() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'removeIngredient'");
        }

}
