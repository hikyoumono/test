package rensyu;

import java.time.LocalDateTime;
import java.time.OffsetDateTime; 
import java.time.ZonedDateTime;

public class tokuren18 {
	
	public static void main(String[] args){
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println();
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		System.out.println();
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		System.out.println();
		
		
		
	}

}
