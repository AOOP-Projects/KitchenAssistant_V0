public class AdminUser extends User{


    //Constructor
    public AdminUser(String username, String email) {
        super(username, email);
        
    }

    //functionalities

    public void DeleteUser()
    {
        //Manipulation of DB

    }

    public void CreateUser(String userName,String email,String typeUser){
        if(typeUser.toLowerCase() == "Admin")
        {
            AdminUser newAdmin = new AdminUser(userName,email);
            //add into the Db on the table of Admin
        }

        RegularUser newUser = new RegularUser(userName, email);
            //add into the Db on the table of RegularUser

    }

    

}
