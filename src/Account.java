import java.util.*;

public class Account {
    protected ArrayList<String> username = new ArrayList<String>();
    protected ArrayList<String> password = new ArrayList<String>();
    protected ArrayList<String> login_status = new ArrayList<String>();
    
    Account(String id, String pass){
        this.username.add(id); 
        this.password.add(pass); 
    }
    void set_data(String id, String pass){
        this.username.add(id); 
        this.password.add(pass);
    }
    
    void set_id(String id){
        this.username.add(id); 
    }
    
    void set_pass(String pass){
        this.password.add(pass); 
    }
    
    String get_id(){
        return this.username;
    }
    
    String get_pass(){
        return this.password;
    }
    
}