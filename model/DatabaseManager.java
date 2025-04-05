import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/your_db"; //TODO
    private static final String USER = "your_user"; //TODO
    private static final String PASSWORD = "your_password"; //TODO

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    //save User
    public void saveData(User user) {
        try (Connection conn = getConnection()) {
            conn.setAutoCommit(false);

            // Serialize list data
            String prefs = String.join(",", user.getPreferences());
            String history = String.join(",", user.getHistory());

            String sql = """
                INSERT INTO users (username, email, preferences, history)
                VALUES (?, ?, ?, ?)
                ON DUPLICATE KEY UPDATE email = VALUES(email), preferences = VALUES(preferences), history = VALUES(history)
            """;

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getEmail());
                ps.setString(3, prefs);
                ps.setString(4, history);
                ps.executeUpdate();
            }

            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //save Ingredients TODO
    public void saveData(List<Ingredient> ingredients, Connection conn) throws SQLException {
        
        /*            IF YOU NEED TO DELETE SOME DATA BEFORE A=UPDATE IT

        String deleteSql = "DELETE FROM ingredients WHERE username = ?";
        try (PreparedStatement ps = conn.prepareStatement(deleteSql)) {
            ps.setString(1, username);
            ps.executeUpdate();
        }
        */

        //            DO A FOR IF NEED IT , BECAUSE ITS A LIST WE'LL NEED TO INSERT A LOT OF INGREDIENTS.
        /*String insertSql = "INSERT INTO ingredients (username, name, quantity, expiration_date) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(insertSql)) {
            for (Ingredient ing : ingredients) {
                ps.setString(1, name);
                ps.setString(2, ing.getName());
                ps.setDouble(3, ing.getQuantity());
                ps.setDate(4, Date.valueOf(ing.getExpirationDate()));
                ps.addBatch();
            }
            ps.executeBatch();
        }
            */
    }

    //save Recepie TODO
    public void saveData(Recipe recipe, Connection conn) throws SQLException {
       
    }

    //save Planner TODO
    public void saveData(Planner planner, String username, Connection conn) throws SQLException {
        /*                          JUST SOME IDEA
        String deletePlanner = "DELETE FROM planner WHERE username = ?";
        try (PreparedStatement ps = conn.prepareStatement(deletePlanner)) {
            ps.setString(1, username);
            ps.executeUpdate();
        }

        String insertPlanner = "INSERT INTO planner (username, plan_date, recipe_name) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(insertPlanner)) {
            for (Map.Entry<LocalDate, List<Recipe>> entry : planner.getPlannedMeals().entrySet()) {
                for (Recipe recipe : entry.getValue()) {
                    saveData(recipe, conn); // save recipe too
                    ps.setString(1, username);
                    ps.setDate(2, Date.valueOf(entry.getKey()));
                    ps.setString(3, recipe.getName());
                    ps.addBatch();
                }
            }
            ps.executeBatch();
        }
            */
    }

    //Missing the load
    
    
}






