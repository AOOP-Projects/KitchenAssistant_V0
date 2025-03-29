
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Planner { //LUCASQUESTIONS DO WE REALLY NEED THAT?
    
    private Map<LocalDate, Recipe> plannedMeals;
    
    //Constructor
    public Planner() {
        
    }
    
    //Getters and Setters
    public Map<LocalDate, Recipe> getPlannedMeals() {
        return plannedMeals;
    }
    public void setPlannedMeals(Map<LocalDate, Recipe> plannedMeals) {
        this.plannedMeals = plannedMeals;
    }

   

    public List<Ingredient> generateShoppingList() {
        return new ArrayList<>();
        //LUCASQUESTION WTF??? no need
    }

    public void scheduleMeal(LocalDate date, Recipe recipe) {
        plannedMeals.putIfAbsent(date, recipe);
    }
   
}
