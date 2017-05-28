/*
* Declares three arrays which then three random integers are assigned a random string value from each array and is then pasted into a single string into the clipboard which can then be pasted. 
*/
import java.util.*;														                                                             
import java.lang.*;



 class UCReport {
	
	public static void main(String[] args) {
		int MenuOption = 0;	
		
		createfile g = new createfile();
	
		
			while(MenuOption != 6){													
																					
		System.out.println(
		
					"\nMultiple random array into string generator\n" +
					"----------------------------\n" +
					"1.   Generate Text Line \n" +
					"6.   Close Program\n" +
					"----------------------------\n");
				
		
		Scanner menu = new Scanner(System.in);									    
		MenuOption = menu.nextInt();												
		
		
		switch (MenuOption) {

			case 1: 
			
			g.addRecords();
			
			break;
			
			case 6: 
			
				System.out.println("Close Program");												
				System.exit(0);	
				
			break;
			
			default:
			
				System.out.println("Invalid choice.");
				
            break;
			}
		}
	}
}
