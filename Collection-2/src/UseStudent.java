import java.util.HashMap;
public class UseStudent {
	public static void main (String[]args) {
		
		Student s1=new Student(101,"Gowdham","Male");
		Student s2=new Student(104,"Harish","Male");
		Student s3=new Student(167,"Mathi","Female");
		Student s4=new Student(177,"Lochani","Female");
		Student s5=new Student(204,"Gopi","Male");
		
		HashMap<Integer,Student> a=new HashMap<>();
		a.put(s1.getId(),s1);
		a.put(s2.getId(),s2);
		a.put(s3.getId(),s3);
		a.put(s4.getId(),s4);
		a.put(s5.getId(),s5);
		
		a.get(s1);
		a.get(s2);
		a.get(s3);
		a.get(s4);
		a.get(s5);
		
		for(Integer x:a.keySet()) {
			System.out.println(a.get(x));
			System.out.println(" ");
			System.out.println(a.get(x).getName()+","+a.get(x).getGender());
			System.out.println(" ");
			
		}
		
		a.forEach((x,y)->System.out.println(a.get(x)));
		System.out.println(" ");
		a.forEach((x,y)->System.out.println(a));
		System.out.println(" ");
		a.forEach((x,y)->System.out.println(a.get(x).getName()+","+a.get(x).getGender()));
		System.out.println(" ");
	
	}
	
	

}
