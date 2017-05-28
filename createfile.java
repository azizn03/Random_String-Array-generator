import java.util.*;														// Libary which allows arrays
import java.lang.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class createfile {

			public void addRecords(){
				String [] arr1 = {
				"IT ",
				"Technical ",
				"Telecommunications ",
				"System ",
				"Network ",
				"Junior ",
				"Information ",
				"Help Desk ",
				"Desktop ",
				"Computer ",
				};
				
				String [] arr2 = {
				"Support Engineer",
				"Specialist",
				"Administrator",
				"Operations Officer",
				"Assistant",
				"Officer",
				"Engineer",
				"Assistant Officer",
				"Analyst",
				"Support Analyst",
				};
				
				String [] arr3 = {
				"Reed.co.uk",
				"indeed.co.uk",
				"monster.com",
				"www.cwjobs.co.uk",
				"www.technojobs.co.uk/",
				"www.jobsite.co.uk/",
				"www.graduate-jobs.com",
				"www.totaljobs.com",
				"www.recruitmentjobs.com",
				"careerbuilder.co.uk",
				};
				
				Random random = new Random();

				int select = random.nextInt(arr1.length);
				int select2 = random.nextInt(arr2.length);
				int select3 = random.nextInt(arr3.length); 	 				
	
				String value = String.format("%s%s%s%s%s", arr1[select] , arr2[select2] ," at ", arr3[select3], "\n");
				System.out.println("\n");
				System.out.println(value);

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection strSel = new StringSelection(value);
		clipboard.setContents(strSel, null);
			}
		}