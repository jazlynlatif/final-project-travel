public class App
{
    void usersetting(){
        
    }
    
    void adminsetting(){
        
    }
    
    void registersetting(){
        
    }
    
	public static void main(String[] args) {
		int choice, id, pass;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Main Page");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		System.out.println("Input Choice (1-3) :");
		choice = myObj.nextInt();
		do{
		if(choice == 1){
			System.out.println("Input ID: ");
			id = myObj.next();
			pass = myObj.next();
			if((id equals(ADM123))&&(pass equals(ADMPASS)){
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
	}while(choice !=1 || choice !=2);
}
