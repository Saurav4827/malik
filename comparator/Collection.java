package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int t=s.nextInt();
List<Student> list=new ArrayList<Student>();
while(t>0)
{
int id=s.nextInt();
String name=s.next();
double cgpa=s.nextDouble();
Student s1=new Student(id,name,cgpa);
list.add(s1);
t--;
	}
Collections.sort(list,new Comparator1());
for(Student s2:list)
{
System.out.println(s2.name);	
}
	s.close();
	}

}
