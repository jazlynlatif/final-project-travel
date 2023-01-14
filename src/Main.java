import java.util.*;

public class Main
{
    void adminsetting(){
        System.out.print("\033[H\033[2J"); 
        int choice;
		Scanner myObj = new Scanner(System.in);
		System.out.println("========================");
		System.out.println("1. Add New Package");
		System.out.println("2. Delete Package");
		System.out.println("3. Modify Package");
		System.out.println("4. Exit");
		System.out.println("========================");
		System.out.println("Input Choice (1-4) :");
		choice = myObj.nextInt();
		switch(choice){
		    System.out.print("\033[H\033[2J"); 
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

		        Packages output = new Packages(name, jeniskend, dest, harga, jumlahtiket);

		    case 2:
		        System.out.print("Choose Package Number(Ex:1);");
		        
		    case 3:
		        
		    case 4:
				System.exit();
		}
		
    }
    
    void usersetting(){
        System.out.print("\033[H\033[2J"); 
        int choice;
		Scanner myObj = new Scanner(System.in);
		Customer cust = new Customer(null);
		Package travel = new Package(String pakett,String jenisken,String dest,int harga,int jumlah);
		System.out.println("========================");
		System.out.println("1. View Profile");
		System.out.println("2. Modify Profile");
		System.out.println("3. Choose Travel Package");
		System.out.println("4. Exit")
		System.out.println("========================");
		System.out.println("Input Choice (1-4) :");
		choice = myObj.nextInt();
		switch (choice){
		    case 1:
		        cust.print_data();
		    case 2:
		        cust.modify_data();
		    case 3:
		        main();
		    case 4:
		        System.exit();
            
		}
    }
    
    void registersetting(){
        System.out.print("\033[H\033[2J"); 
		Scanner myObj = new Scanner(System.in);
		System.out.println("Username: ");
	    String uname = myObj.next();
	    
	    System.out.println("Password: ");
	    String upass = myObj.next();
	    
	    System.out.println("Full Name: ");
	    String ufname = myObj.nextLine();
	    
	    System.out.println("Address: ");
	    String adrs = myObj.nextLine();
	    
	    System.out.println("Email: ");
	    String mail = myObj.next();
	    
	    Customer data = new Customer(uname, upass, ufname, adrs, mail);
		System.out.println("Your data has been registered!");
    }
    
	public static void main(String[] args) {
	    System.out.print("\033[H\033[2J"); 
		int choice, id, pass;
		Scanner myObj = new Scanner(System.in);
		System.out.print("\033[H\033[2J"); 
		System.out.println("Main Page");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		System.out.println("Input Choice (1-3) :");
		choice = myObj.nextInt();
		do{
		    System.out.print("\033[H\033[2J"); 
		    if(choice == 1){
			    System.out.println("Input ID: ");
			    id = myObj.next();
			    System.out.println("Input Password: ");
			    pass = myObj.next();
			
			    if((id equals("ADM123"))&&(pass equals("ADMPASS"))){
				    adminsetting();
			    }
			    else{
				    usersetting();
		    	}
		    }
		    else if(choice == 2){
		        registersetting();
		    }
		    else{
		        System.out.println("Wrong Input!");
	    	}
	    }
	}while(choice != 1 || choice != 2);
}