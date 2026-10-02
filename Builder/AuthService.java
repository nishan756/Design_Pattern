package Builder;

public class AuthService {
    
    public User signUp(String firstName , String lastName , String userName , String email , String password){

        UserBuilder builder = new UserBuilder()
        .setfirstName(firstName)
        .setlastName(lastName)
        .setusername(userName)
        .setemail(email);

        User user = new User(builder);

        System.out.println("Signup successfull: "+user.toString());
        return user;

    }
}
