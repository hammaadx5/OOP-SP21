/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockExtended extends Clock {

	void display() {
		Date current = new Date();

		SimpleDateFormat for_matter = new SimpleDateFormat("kk:mm:ss");
		String timeIn24Hours = for_matter.format(current);

		SimpleDateFormat forAmPm = new SimpleDateFormat("kk:mm:ss a");
		String timeInAmPm = forAmPm.format(current);

		System.out.println("Current time in AM/PM format: " + timeInAmPm);
		System.out.println("Current time in 24 hours format : " + timeIn24Hours);
	}

}
