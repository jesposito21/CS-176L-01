public class Instructor extends Person {
		private double salary;
		
		public Instructor() {
			super();
			this.salary=0;
			 
	}
		public Instructor(String name, String birthYear, double salary) {
			super(name,birthYear);
			this.salary = salary;
		}
		public double getSalary() {
			return this.salary;
		}


   public String toString()
   {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
   }}
