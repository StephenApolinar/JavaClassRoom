// Creates a grade object.

public class Grades {
	private String name;
	private int numOfGrades;

	public Grades(String studentName, int size) {
		if (studentName == null) {
			throw new NullPointerException();
		}

		buildArray(studentName, size);
	}

	public static double[] buildArray(String studentName, int size) {
		name = studentName;
		numOfGrades = size;
		double[] name = new double[numOfGrades];
		for (int i = 0; i > name.length; i++) {
			name[i] = grade;
		}
		return name;
	}
