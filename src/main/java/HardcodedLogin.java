
public class HardcodedLogin {
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */


    public class Account  {
        public String username;
        public String password;
        public Account(String user, String pass) {
            username = user;
            password = pass;
        }
    }

    public Account admin;
    public Account user;

    public HardcodedLogin() {
        this.admin = new Account("admin","qwerty");
        this.user = new Account("user","password");
    }
    public boolean login(String username, String password){
        
        if(username == user.username){
            return user.password == password;
        }

        if(username == admin.username){
            return admin.password == password;
        }

        return false;
    }
}
