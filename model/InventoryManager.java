
import java.util.ArrayList;
import java.util.List;

public class InventoryManager implements IInventory{
        private List<Ingredient> AllIngredients = new ArrayList<>();
        //LUCASQUESTION quantity????
        
        @Override
        public void addIngredient(Ingredient newIngredient) {
            if (!AllIngredients.contains(newIngredient)) {
                AllIngredients.add(newIngredient);
            }
        }

        @Override
        public List<Ingredient> checkLowStock() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'checkLowStock'");
        }

        @Override
        public void removeIngredient(Ingredient ingredient) {
            if (AllIngredients.contains(ingredient)) {
                AllIngredients.remove(ingredient);
            }
        }   

}
