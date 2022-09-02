
public class Student1 {
	private int id;
	private String name;
	private String gender;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	
	public Student1(int id, String name, String gender) {
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	
	public String toString() {
		return "Id="+id+",Name="+name+",Gender="+gender;
	}

}


