public class App
{
    void usersetting(){
        
    }
    
    void adminsetting(){
        
    }
    
    void registersetting(){
        
    }
    
	public static void main(String[] args) {
		int choice;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Main Page");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("Input Choice (1/2) :");
		choice = myObj.nextInt();
		do{
		if(choice == 1){
		    usersetting();
		}
		else if(choice == 2){
		    adminsetting();
		}
		else if(choice == 3){
		    registersetting();
		}
		else{
		    System.out.println("Wrong Input!");
		}
	}
	}while(choice !=1 || choice !=2 || choice !=3);
}
