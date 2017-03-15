import java.util.*;

public class Day_04_Class_vs_Instance {
    private int age;	
  
	public Day_04_Class_vs_Instance(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            age = 0;
            System.out.println ("Age is not valid, setting age to 0.");
        } else
            age = initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String conclusion;
        if (age < 13)
            conclusion = "You are young.";
        else if (age >= 13 && age < 18)
            conclusion = "You are a teenager.";
        else
            conclusion = "You are old.";
        System.out.println(conclusion);
	}

	public void yearPasses() {
  		// Increment this person's age.
        age++;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day_04_Class_vs_Instance p = new Day_04_Class_vs_Instance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println("");
        }
		sc.close();
    }
}
