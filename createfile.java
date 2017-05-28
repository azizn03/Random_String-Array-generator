import java.util.*;														// Libary which allows arrays
import java.lang.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class createfile {

			public void addRecords(){
				String [] arr1 = {
				"1st String_1 ",
				"1st String_2 ",
				"1st String_3 ",
				"1st String_4 ",
				"1st String_5 ",
				"1st String_6 ",
				"1st String_7 ",
				"1st String_8 ",
				"1st String_9 ",
				"1st String_10 ",
				};
				
				String [] arr2 = {
				"2nd String_1",
				"2nd String_2",
				"2nd String_3",
				"2nd String_4",
				"2nd String_5",
				"2nd String_6",
				"2nd String_7",
				"2nd String_8",
				"2nd String_9",
				"2nd String_10",
				};
				
				String [] arr3 = {
				"3rd String_1",
				"3rd String_2",
				"3rd String_3",
				"3rd String_4",
				"3rd String_5",
				"3rd String_6",
				"3rd String_7",
				"3rd String_8",
				"3rd String_9",
				"3rd String_10",
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
