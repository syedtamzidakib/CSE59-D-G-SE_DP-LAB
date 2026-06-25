
public class Main1 {
    public static void main(String[] args) {
        User user = new User("Akib", "akib@gmail.com");
        
        if (EmailValidator.isValidEmail(user.getEmail())){
        UserRepository repository = new UserRepository();
        repository.save(user);
            }
    }
    
}
// 1 respos: Storing
class User{
    private String username;
    private String email;
    
    public User(String username, String email){
    this.username = username;
    this.email = email;
    }
    public String getUsername() {
    return username;
    }
    public String getEmail(){
    return email;
    }

}
// rspons 2: email validating
class EmailValidator{
public static boolean isValidEmail(String email){
if(email!=null && email.contains("@")){
    return true;
}
    System.out.println("Invalid email format");
    return false;
}
}
class UserRepository{
     public void save(User user){
         System.out.println("Connecting to database.....");
         System.out.println("Saving user"+ user.getUsername()+ "to the users table.");
     }

}

