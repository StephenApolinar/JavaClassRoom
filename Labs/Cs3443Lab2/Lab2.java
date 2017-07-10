

public class Lab2 {
	public static void main(String[] args) {
		}

	public static void testGrades(Grades grades) {
    System.out.println(grades.toString()); 
    System.out.printf("\tName:    %s\n", grades.getName());
    System.out.printf("\tLength:  %d\n", grades.length());
    System.out.printf("\tAverage: %.2f\n", grades.average());
    System.out.printf("\tMedian:  %.1f\n", grades.median());
    System.out.printf("\tMaximum: %d\n", grades.maximum());
    System.out.printf("\tMininum: %d\n", grades.minimum());
}
