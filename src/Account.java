import java.util.*;

public class Account {
    protected String username;
    protected String password;
    protected String login_status;
    
    account(String id, String pass){
        this.username = id; 
        this.password = pass; 
    }
    void set_data(String id, String pass){
        this.username = id; 
        this.password = pass;
    }
    
    void set_id(String id){
        this.username = id; 
    }
    
    void set_pass(String pass){
        this.password = pass; 
    }
    
    String get_id(){
        return id; 
    }
    
    String get_pass(){
        return pass; 
    }
    
}