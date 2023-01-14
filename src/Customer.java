import java.util.*;

public class Customer extends Account {
    protected ArrayList<String> cust_name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> cust_email = new ArrayList<String>();
    
    Customer(String id, String pass, String cname, String addr, String cmail) {
        super(id, pass);
        this.cust_name.add(cname);
        this.address.add(addr);
        this.cust_email.add(cmail);
    }

    void set_data(String id, String pass, String cname, String addr, String cmail){
        super.username.add(id);
        super.password.add(pass);
        this.cust_name.add(cname);
        this.address.add(addr);
        this.cust_email.add(cmail);
    }
    
    void get_data(int i){
        System.out.println("Username = " + super.username.get(i));
        System.out.println("Password = " + super.password.get(i));
        System.out.println("Name = " + this.cust_name.get(i));
        System.out.println("Address = " + this.address.get(i));
        System.out.println("Email = " + this.cust_email.get(i));
    }
    
    void modify_data(){
        
    }
    
    void print_data(){
        for(int i=0;i<cust_name.size();i++){
            System.out.println("Username = " + super.username.get(i));
            System.out.println("Password = " + super.password.get(i));
            System.out.println("Name = " + this.cust_name.get(i));
            System.out.println("Address = " + this.address.get(i));
            System.out.println("Email = " + this.cust_email.get(i));
        }
    }

    // void print_udata(String id, String pass){   //for user view profile
    //     int num = check_userid(id, pass, id);
    //     System.out.println("Username = " + super.username.get(num));
    //     System.out.println("Password = " + super.password.get(num));
    //     System.out.println("Name = " + this.cust_name.get(num));
    //     System.out.println("Address = " + this.address.get(num));
    //     System.out.println("Email = " + this.cust_email.get(num));
    // }

    // int check_userid(String id, String pass, String string){
    //     int num;
    //     for(int i=0;i<string.size();i++){
    //         if((id.compareTo(id.get(i)) && pass.compareTo(pass.get(i))) == 0){
    //             num = i;
    //         }
    //     }
    //     return num;
    // }
}