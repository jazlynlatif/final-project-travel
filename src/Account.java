import java.util.*;

public class Account {
    protected ArrayList<String> username = new ArrayList<String>();
    protected ArrayList<String> password = new ArrayList<String>();
    protected ArrayList<String> login_status = new ArrayList<String>();
    
    Account(String id, String pass){
        this.username.add(id);
        this.password.add(pass);
    }

    boolean check_id(String id,String pass){
        for(int i=0;i<username.size();i++){
            if(id.equals(username.get(i)) && pass.equals(password.get(i))){
                return true;
            }
        }
        return false;
    }
    public void set_data(ArrayList<String> id, ArrayList<String>pass) {
        this.username = id;
        this.password = pass;
    }
    public ArrayList<String> get_id() {
        return username;
    }
    public ArrayList<String> get_pass() {
        return password;
    }
    public void get_logstatus() {
        boolean checkid;
        if(checkid = true){
            System.out.println("Login Success");
        }
        else{
            System.out.println("Login Failed");
        }
    }
}