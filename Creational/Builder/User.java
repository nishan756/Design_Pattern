package Builder;

public class User {

    protected String firstName; 
    protected String lastName;
    protected String userName;
    protected String email ;
    protected String password;

   public User(UserBuilder builder){

    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.userName = builder.userName;
    this.email = builder.email;
    this.password = builder.password;

   }

   @Override 
   public String toString(){
    return("First Name: "+this.firstName+"\nLast Name: "+this.lastName+"\nUsername: "+this.userName+"\nEmail: "+this.email);
   }

}