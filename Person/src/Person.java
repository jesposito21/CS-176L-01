public class Person {
	private String name;
	private String birthYear;
	
	public Person() {
		this.name = "";
		this.birthYear= "";
		
	}
	
	public Person (String name, String birthYear) {
		this.name= name;
		this.birthYear=birthYear;
	}
	public String getName() {
		return name;
	}
	public String getYear() {
		return birthYear;
	}
	
     
   public String toString()
   {
      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
   }}
