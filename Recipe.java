import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients = new ArrayList<>();
    private List<String> steps = new ArrayList<>();
    private EnumFoodCategory category;
    private int time;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    public List<String> getSteps() {
        return steps;
    }
    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
    public EnumFoodCategory getCategory() {
        return category;
    }
    public void setCategory(EnumFoodCategory category) {
        this.category = category;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public String getInstructions(){
        return "";
    }
}
