import java.util.HashMap;
public class UseStudent1 {
		public static void main (String[]args) {
			
			Student1 s1=new Student1(101,"Gowdham","Male");
			Student1 s2=new Student1(104,"Harish","Male");
			Student1 s3=new Student1(167,"Mathi","Female");
			Student1 s4=new Student1(177,"Lochani","Female");
			Student1 s5=new Student1(204,"Gopi","Male");
			
			HashMap<Integer,Student1> a=new HashMap<>();
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
			
			/*
			 * for(Integer k:a.keySet()) { if(k>104) {
			 * System.out.println(a.get(k).getName()+","+a.get(k).getGender()); } }
			 */
			for(Student1 k:a.values()) {
				if(k.getGender().equals("Male")) {
					System.out.println(k);		
				}	
			}
		}
}
