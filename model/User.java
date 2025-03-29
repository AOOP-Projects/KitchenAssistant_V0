

import java.util.ArrayList;
import java.util.List;

public class User implements IUser{

    private String username;
    private String email;
    private List<String> preferences; //LUCASQUESTION Not on regular?
    private List<String> history;//LUCASQUESTION Not on regular?

    //Constructors
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.preferences = new ArrayList<>();
        this.history = new ArrayList<>();
    }
    public User(String username, String email, List<String> preferences, List<String> history) {
        this.username = username;
        this.email = email;
        this.preferences = preferences;
        this.history = history;
    }
    
    //Getters and Setters
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
    
    //functionalities
    //needed? LUCASQUESTION
    public void Logout(){

    }
    //needed?
    public void Login(){

    }
    
    public void savePreferences(){
        //instead do a addPreferences and DeletePreferences  -- or an editPreferences LUCASQUESTION
    }
    public void updateProfile(String newUsername, String newEmail, List<String> newPreferences){
        if (newUsername != null && !newUsername.trim().isEmpty()) {
            this.username = newUsername;
        }
        if (newEmail != null && !newEmail.trim().isEmpty()) {
            this.email = newEmail;
        }
        //LUCASQUESTION , preferences?
    }

}
