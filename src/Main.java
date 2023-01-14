import java.util.*;
import java.io.*;
public class Main
{
    
    static void adminsetting(){
        System.out.print("\033[H\033[2J"); 
        int choice;
		Scanner myObj = new Scanner(System.in);
// 		paket travel = new paket(String pakett,String jenisken,String dest,int harga,int jumlah);
		System.out.println("========================");
		System.out.println("1. Add New Package");
		System.out.println("2. Delete Package");
		System.out.println("3. Modify Package");
		System.out.println("4. Exit");
		System.out.println("========================");
		System.out.println("Input Choice (1-4) :");
		choice = myObj.nextInt();
		System.out.print("\033[H\033[2J"); 
		switch(choice){
		    case 1:
		        System.out.print("Package Name:");
		        String name = myObj.nextLine();
		        
		        System.out.print("Transportation:");
		        String jeniskend = myObj.next();
		        
		        System.out.print("Destination:");
		        String dest = myObj.nextLine();
		        
		        System.out.print("Price:");
		        int harga = myObj.nextInt();
		        
		        System.out.print("Ticket Amount:");
		        int jumlahtiket = myObj.nextInt();
		        
		      //  Packages output = new Packages();  
		    case 2:
		        System.out.print("Choose Package Number(Ex:1);");
		        int choice1 = myObj.nextInt();
		        
		    case 3:
		        System.out.println("Choose Package Number(Ex:1):");
		        int choice2 = myObj.nextInt();
		    case 4:
		        System.exit(0);
		}
		
    }
    
    static void usersetting(String id, String pass){
        System.out.print("\033[H\033[2J"); 
        int choice;
		Scanner myObj = new Scanner(System.in);
		Customer cust = new Customer(null, null, null, null, null);
		System.out.println("========================");
		System.out.println("1. View Profile");
		System.out.println("2. Modify Profile");
		System.out.println("3. Choose Travel Package");
		System.out.println("4. Exit");
		System.out.println("========================");
		System.out.println("Input Choice (1-4) :");
		choice = myObj.nextInt();
		switch (choice){
		    case 1:
				// cust.print_udata(id, pass);
		    case 2:
				cust.modify_data();
		    case 3:
				main(null);
		    case 4:
		        System.exit(0);
            
		}
    }
    
    static void registersetting(){
        System.out.print("\033[H\033[2J"); 
		Scanner myObj = new Scanner(System.in);
		System.out.print("Username: ");
	    String uname = myObj.nextLine();
	    
	    System.out.print("Password: ");
	    String upass = myObj.nextLine();
	    
	    System.out.print("Full Name: ");
	    String ufname = myObj.nextLine();
	    
	    System.out.print("Address: ");
	    String adrs = myObj.nextLine();
	    
	    System.out.print("Email: ");
	    String mail = myObj.nextLine();
	    
	    Customer data = new Customer(uname, upass, ufname, adrs, mail);
		System.out.println("Your data has been registered!");
		main(null);
    }
    
	public static void main(String[] args) {
	    System.out.print("\033[H\033[2J"); 
	    Account check = new Account("tes","check");
		Scanner myObj = new Scanner(System.in);
		System.out.print("\033[H\033[2J"); 
		System.out.println("Main Page");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		System.out.print("Input Choice (1-3) :");
		int choice = myObj.nextInt();
		do{
		    System.out.print("\033[H\033[2J"); 
		    if(choice == 1){
			    System.out.println("Input ID: ");
			    String id = myObj.next();
			    System.out.println("Input Password: ");
			    String pass = myObj.next();
			
			    if((id.equals("ADM123"))&&(pass.equals("ADMPASS"))){
				    adminsetting(); 
			    }
			    else if(check.check_id(id,pass)){
				    usersetting(id, pass);
		    	}
		    }
		    else if(choice == 2){
		        registersetting();
		    }
		    else if(choice == 3){
		        System.exit(0);
		    }
		    else{
		        System.out.println("Wrong Input!");
	    	}
		}while(choice != 1 || choice != 2);
	}
}