// From "Building Java Programs" text book.
// Ch10.2 The Comparable Interface
//
// The CalendarDate class stores information about a single 
// calendar date (month and day but no year).

public class CalendarDate implements Comparable<CalendarDate> {
	private int month;
	private int day;

	public CalendarDate(int month, int day) {
		this.month = month;
		this.day = day;
	}

	// Compares this calendar date to another date.
	// Dates are compared by month and then by day.
	public int compareTo(CalendarDate other) {
		if (month != other.month) {
			return month - other.month;
		} else {
			return day - other.day;
		}
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String toString() {
		return month + "/" + day;
	}
}
