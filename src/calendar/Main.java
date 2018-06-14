package calendar;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

/*@author hai*/
/**
 * desciption:
 */
public class Main {

	 /*=================== ATTRIBUTEs ==================================*/

 /*=================== CONSTRUCTORs ================================*/

 /*=================== GETTTERs & SETTERs  ============================*/

 /*=================== OTHER METHODs  ===============================*/
	 public static void main(String[] args) {
		  Date today = Date.valueOf(LocalDate.now());
		  Date batDauDangKyHocPhan = new Date(today.getYear() , 10, 1);

		  System.out.println(today.getMonth());

//	   ArrayList<String> list = new ArrayList<>();
//		  System.out.println(list.size() == 0 );

	 }
}//class Main
