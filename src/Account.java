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
    
    boolean check_id(String id,String pass){
        for(int i=0;i<username.size();i++){
            if(id.equals(username.get(i)) && pass.equals(password.get(i))){
                System.out.println("Login Success");
                return true;
            }
        }
        return false;
    }
    
    String get_id(int i){
        return username.get(i); 
    }
    
    String get_pass(int i){
        return password.get(i); 
    }
    
    
}
