/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main
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
		System.out.println("1.Login as User");
		System.out.println("2.Login as Admin");
		System.out.println("3.Register");
		System.out.println("Input Choice:");
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
