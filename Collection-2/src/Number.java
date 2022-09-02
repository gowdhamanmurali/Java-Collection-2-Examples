import java.util.HashMap;
public class Number {
	public static void main (String[]args) {
		HashMap<Integer,String> names=new HashMap<>();
		names.put(102,"Gowdham");
		names.put(302,"Harish");
		names.put(225, "Gopi");
		names.put(304, "Suresh");
		names.get(102);
		names.get(302);
		names.get(225);
		names.get(304);
		
		for(Integer i:names.keySet()) {//enhanced for loop
			if(i>102) {
				System.out.println(names.get(i));
			}
		}
		names.keySet().forEach(x-> System.out.println(x));//for each
	}

}
