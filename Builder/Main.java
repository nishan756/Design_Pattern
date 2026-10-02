package Builder;

public class Main {
    
    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder();
        
        builder

        .setfirstName("Ata Alahy")
        
        .setemail("aanishan339@gmail.com")
        
        .setlastName("Nishan")
        
        .setusername("nishan000")
        
        .setpassword("nishan000");

        User user = new User(builder);

        System.out.println(user.toString());

        AuthService auth = new AuthService();

        auth.signUp("Ata Alahy", "Nishan", "nishan000", "aanishan339@gmail.com", "nishan000");

        
    }
}