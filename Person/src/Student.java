public class Student extends Person{
	private String major;
	
	public Student() {
		super();
		this.major = "";
		
	}
	public Student(String name, String birthYear, String major) {
		super(name,birthYear);
		this.major=major;
	}
	public String getMajor() {
		return this.major;
	}
	
   public String toString()
   {
      return "Student[super=" + super.toString() + ",major=" + major + "]";
   }}
