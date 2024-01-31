package busReserv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	String passangerName;
	int busno;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name");
		passangerName = scanner.next();
		System.out.println("Enter the Bus Number");
		busno = scanner.nextInt();
		System.out.println("Enter the Journey Date in dd-MM-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateformat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Booking> bookins, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus: buses) {
			if(bus.getBusno()==busno) {
				capacity = bus.getCapacity();
			}
		}
			int booked=0;
			for(Booking b : bookins) {
				if(b.busno==busno && b.date.equals(date)) {
					booked++;
				}
			}
		return booked<capacity?true:false;
	}

	

}
