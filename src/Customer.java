import java.util.*;

public class Customer extends Account {
    protected ArrayList<String> cust_name = new ArrayList<String>();
    private ArrayList<String> address = new ArrayList<String>();
    private ArrayList<String> cust_email = new ArrayList<String>();
    
    Customer(String id, String pass, String cname, String addr, String cust_email) {
        super(id, pass);
        this.cust_name.add(cname);
        this.address.address(addr);
        this.cust_email.add(cmail);
    }
    
    // void usersetting(){
        
    // }
    
//     void register(){
// 		Scanner myObj = new Scanner(System.in);
// 		System.out.println("Username: ");
// 	    uname = myObj.next();
// 	    System.out.println("Password: ");
// 	    upass = myObj.next();
// 	    System.out.println("Full Name: ");
// 	    ufname = myObj.next();
// 	    System.out.println("Address: ");
// 	    adrs = myObj.next();
// 	    System.out.println("Email: ");
// 	    mail = myObj.next();
// 	    customer data = new customer(uname, upass, ufname, adrs, mail);
// 		System.out.println("Your data has been registered!");
//     }
    
//     void login(){
//         int choice;
// 		Scanner myObj = new Scanner(System.in);
// 		paket travel = new paket(String pakett,String jenisken,String dest,int harga,int jumlah);
// 		System.out.println("========================");
// 		System.out.println("1. View Profile");
// 		System.out.println("2. Modify Profile");
// 		System.out.println("3. Choose Travel Package");
// 		System.out.println("4. Exit")
// 		System.out.println("========================");
// 		System.out.println("Input Choice (1-4) :");
// 		choice = myObj.nextInt();
// 		switch (choice){
// 		    case 1:
// 		        print_data();
// 		    case 2:
// 		        modify_data();
// 		    case 3:
            
// 		}
//     }
    
    void set_data(String id, String pass, String cust_name, String addr, String cust_email){
        super.username.add(id);
        super.password.add(pass);
        this.cust_name.add(cname);
        this.address.add(addr);
        this.cust_email.add(cmail);
    }
    
    void get_data(){
        return this.username, this.password, this.cust_name, this.address, this.cust_email;
    }
    
    void modify_data(){
        
    }
    
    void print_data(){
        System.out.println("Username = " + super.username);
        System.out.println("Password = " + super.password)
        System.out.println("Name = " + this.cust_name);
        System.out.println("Address = " + this.address);
        System.out.println("Email = " + this.cust_email);
    }
}