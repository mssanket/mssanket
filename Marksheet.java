import java.util.*;

public class Marksheet {

	public static void main(String[] args) {
		String name;
		int rollnumber, marks = 0, totalmarks = 0;
		String subjects[] = { "Marathi", "English", "Hindi", "History", "Science", "Mathematics", "Geography" };

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = input.next();
		System.out.println("Enter your roll number: ");
		rollnumber = input.nextInt();
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter your marks: " + subjects[i]);
			marks = input.nextInt();
			totalmarks = totalmarks + marks;

		}

		if (marks > 0) {
			System.out.println("You are pass ");
		} else {
			System.out.println("You are failed ");
		}
		System.out.println("Your roll number is: " + rollnumber);
		System.out.println("Your name is: " + name);
		System.out.println("Your total marks are : " + totalmarks);

	}

}
