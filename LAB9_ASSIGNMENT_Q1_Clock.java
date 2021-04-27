package q1;

import java.time.LocalTime;




public class Clock {
	
	
	void display() {
		
		LocalTime time = LocalTime.now();
		System.out.println("Local Time Now: "+time);
	}

}
