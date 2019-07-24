import java.util.ArrayList;
import java.util.Iterator;


class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name, int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}


public class ExampleArrayList {

	public static void main(String[] args) {
		
	/*	ArrayList <String> al = new ArrayList<String>();
		al.add("Test1");
		al.add("Test2");
		al.add("Test3");
		
		Iterator itr =  al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}  */
	  Student s1 = new Student(11, "Test1", 23);
	  Student s2 = new Student(22,"Test2", 26);
      ArrayList <Student> al = new ArrayList<Student>();
      al.add(s1);
      al.add(s2);
      Iterator itr1 = al.iterator();
      while(itr1.hasNext()) {
    	
    	  Student st = (Student) itr1.next();
    	  System.out.println(st.rollno + " " + st.name + " " + st.age);
      }
    
      
		
	}

}
