package ashok;

import java.util.*;

public class Main extends Compare {
	public static void main(String[] s) {
		Scanner s1 = new Scanner(System.in);
		int t = s1.nextInt();
		int id[] = new int[t];
		String name[] = new String[t];
		double cgpa[] = new double[t];

		for (int i = 0; i < t; i++) {
			id[i] = s1.nextInt();
			name[i] = s1.next();
			cgpa[i] = s1.nextDouble();
		}
		for (int i = 0; i < t; i++) {
			Student s2 = new Student(id[i], name[i], cgpa[i]);
			students[i] = s2;
		}
		sort(t);
		for (int i = 0; i < t; i++) {
			System.out.println(students[i].getFname());
		}
	s1.close();
	}
}
