package comparator;

public class Student {

	
		int id;
		String name;
		double cgpa;
		public Student(int id,String name,double cgpa)
		{
			super();
			this.id=id;
			this.name=name;
			this.cgpa=cgpa;
		}
		int getId()
		{
			return id;
		}
		String getName()
		{
			return name;
		}
		double getCgpa()
		{
			return cgpa;
		}
	}


