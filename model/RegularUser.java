

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegularUser extends User {

    List<Recipe> favRecipes;
    Planner plannedMeals; 

    //Constructor
    public RegularUser(String username, String email) {
        super(username, email);
        this.favRecipes = new ArrayList<>();
        this.plannedMeals = new Planner();
    }
    
    //Getter
    public List<Recipe> getFavRecipes() {
        return favRecipes;
    }

    //functionalities
        public void addFavoriteRecipe(Recipe recipe){
            this.favRecipes.add(recipe);
    }

    public void planMeal(LocalDate date, Recipe recipe){
        plannedMeals.scheduleMeal(date, recipe);
    }
}
