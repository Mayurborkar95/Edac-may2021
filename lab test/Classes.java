public class Classes {
	public static void main(String [] args) {
	     Student student = new Student();
	     student.setDetails(053, "Mayur", "Nagpur");
	     System.out.println("The ID is " + student.getId());
	     System.out.println("The Name is " + student.getName());
	     System.out.println("The Location is " + student.getLocation());
	}
}
class Student{
	int id;
	String name;
	String location;
	
	void setDetails(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	int getId() { return id; }
	
	String getName() { return name; }
	
	String getLocation() { return location; }
	
	String getAllDetails() {
		return String.format("Name:%s, Location: %s, ID: %d", name, location, id);
	}
}