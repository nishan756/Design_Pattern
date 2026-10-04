package Builder;

public class UserBuilder {
    
    String firstName;
    String lastName;
    String userName;
    String email;
    String password;

    public UserBuilder setfirstName(String firstName){this.firstName = firstName;return this;}

    public UserBuilder setlastName(String lastName){this.lastName = lastName;return this;}

    public UserBuilder setusername(String userName){this.userName = userName;return this;}

    public UserBuilder setemail(String email){this.email = email;return this;}

    public UserBuilder setpassword(String password){this.password = password;return this;}
}
