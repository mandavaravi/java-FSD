import java.text.*;
import java.util.*;

public class Main5 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		/* MM-dd-yyyy
		 * hh-mm-ss
		 * MMMM - for full month name
		 * HH  - 24hr format
		 * E   - Day
		 * MMM  - 3 chars of month Eg: Jan, Apr
		*/

	}

}
