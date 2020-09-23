import java.io.*;
import java.util.*;

public class Person {
    private int age;
    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, "
                + "setting age to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        String answer;

        if (age < 13) {
            answer = "You are young.";
        } else if (13<= age && age < 18) {
            answer = "You are a teenager.";
        } else {
            answer = "You are old.";
        }

        System.out.println(answer);
    }

    public void yearPasses() {
        age++;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}