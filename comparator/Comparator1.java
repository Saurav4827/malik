package comparator;

import java.util.Comparator;

public class Comparator1 implements Comparator <Student>
{

public int compare(Student e1,Student e2) {
	
		if(e1.cgpa<e2.cgpa)
		{
			return 1;
		}
		else if(e1.cgpa>e2.cgpa)
		{
			return -1;
		}
		else
		{
			if(e1.name.compareTo(e2.name) > 0)
			{
				return 1;
			}
			else if(e1.name.compareTo(e2.name) < 0)
			{
				return -1;
			}
			else
			{
				if(e1.id>e2.id)
				{
					return 1;
				}
				else if(e1.id<e2.id)
				{
					return -1;
				}
				
			}
		}return 0;
	}

}
