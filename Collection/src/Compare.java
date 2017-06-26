package Collection;
public class Compare {
	static Student[] students = new Student[5];

	public static void sort(int t) {
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t - i - 1; j++) {
				if (students[j].getCgpa() < students[j + 1].getCgpa()) {
					swap(j, j + 1);
				} else if (students[j].getCgpa() == students[j + 1].getCgpa()) {
					if (students[j].getFname().compareTo(students[j + 1].getFname()) > 0) {
						swap(j, j + 1);
					}
					if (students[j].getFname().compareTo(students[j + 1].getFname()) == 0) {
						if (students[j].getId() > students[j + 1].getId())
							;
						{
							swap(j, j + 1);
						}
					}
				}
			}
		}
	}

	public static void swap(int i, int j) {
		Student t1 = students[i];
		students[i] = students[j];
		students[j] = t1;
	}

	
}
