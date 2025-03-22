import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Planner {
    
    private Map<LocalDate, List<Recipe>> plannedMeals;

    public Planner() {
        
    }

    public Map<LocalDate, List<Recipe>> getPlannedMeals() {
        return plannedMeals;
    }

    public void setPlannedMeals(Map<LocalDate, List<Recipe>> plannedMeals) {
        this.plannedMeals = plannedMeals;
    }

   

    public List<Ingredient> generateShoppingList() {
        return new ArrayList<>();
    }

    public void scheduleMeal(LocalDate date, Recipe recipe) {
        plannedMeals.putIfAbsent(date, new ArrayList<>());
        plannedMeals.get(date).add(recipe);
        System.out.println("Scheduled " + recipe.getName() + " on " + date);
    }
   
}
