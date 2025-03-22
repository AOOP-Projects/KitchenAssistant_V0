import java.util.ArrayList;
import java.util.List;

public class User implements IUser{

    private String username;
    private String email;
    private List<String> preferences = new ArrayList<>();
    private List<String> history = new ArrayList<>();

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getPreferences() {
        return preferences;
    }
    public void setPreferences(List<String> preferences) {
        this.preferences = preferences;
    }
    public List<String> getHistory() {
        return history;
    }
    public void setHistory(List<String> history) {
        this.history = history;
    }
    
    public void Logout(){

    }
    public void Login(){

    }
    public void savePreferences(){
        
    }
    public void updateProfile(){

    }
    //Duplicated Method 
    //public List getHistory(){}
}
