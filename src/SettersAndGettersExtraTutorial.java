// Exercise #16 for For Beginners Java Course
/*
	tutorial from marjel101

*/


// getters and setters

// This is the class for a event. It contains all properties and methods that are needed to create a new event and print it on the screen.
public class Event {
	// in the next lines the variables of the class are defined. 
	private String name;
	private int day;
	private int month;
	private int year;
	private String place;
	private int hour;
	private int minute;
	
	/*
	This method is called the constructor. It will be executed every time a new instance of the class is created.
	*/
	Event() {
	// default answers for when the event is not totally filled
		this.name = "Fill in a description for this event";
		this.place = "Where will this event take place?";
	}
	
	// all the setters
	public void setName(String descr) {
		this.name = descr;
	}
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	// and all the getters
	public String getName() {
		return name;
	}
	public int getDay() {
		return day;
	}
	public String getMonth() {
		return nameOfMonth(month);
	}
	public int getYear() {
		return year;
	}
	public String getPlace() {
		return place;
	}
	public int getMinute() {
		return minute;
	}
	public int getHour() {
		return hour;
	}
	
	// method to print all conditions of the event
	public void output() {
		System.out.printf ("Event:\t%s\n", this.getName());
		System.out.printf ("Place:\t%s\n", this.getPlace());
		System.out.printf ("Date:\t%s %02d, %04d\n", this.getMonth(), this.getDay(), this.getYear());
		System.out.printf ("Time:\t%02d:%02d\n", this.getHour(), this.getMinute());
		System.out.println("----------------------------------\n");
	}
	// static method to use the month name in stead of a number
	public static String nameOfMonth(int month) {
		String monthName = "January";
		switch(month) {
			case 1: monthName = "January";
					break;
			case 2: monthName = "February";
					break;
			case 3: monthName = "March";
					break;
			case 4: monthName = "April";
					break;
			case 5: monthName = "May";
					break;
			case 6: monthName = "June";
					break;
			case 7: monthName = "July";
					break;
			case 8: monthName = "August";
					break;
			case 9: monthName = "September";
					break;
			case 10: monthName = "October";
					break;
			case 11: monthName = "November";
					break;
			case 12: monthName = "December";
					break;
		}
		return monthName;
	}	
}

// This is the Main program. The compiler will start at this point to execute the code.
public class Program
{
	public static void main(String[] args) {
		// This line creates a new instance of the class event.
		Event meeting = new Event();
		
		// use the setters to fill the fields of the newly created Event
		meeting.setName("Lunch with the Java For Beginners group");
		meeting.setPlace("New York, Rockefeller Center");
		// set day, month and year
		meeting.setDate(23, 10, 2019);
		// set hour and minute
		meeting.setTime(12, 45);
		
		// This line will call the output method and print the entered values of the Event meeting onscreen.
		meeting.output();
		
		// change an input
		meeting.setTime(14, 55);
		meeting.output();
		
		// create a second meeting, but leave the fields empty
		Event m2 = new Event();
		m2.output();
	}
}