public class Grades
{
	public static void main(String[] args)
	{
		float grade = 45.00f;
		
		if (grade>=85.00){
			System.out.println("Student grade is A");
		}else if(grade>=70.00){
			System.out.println("Student grade is B");
		}else if (grade>=55.00){
			System.out.println("Student grade is C");
		}else if (grade>=40.00){
			System.out.println("Student grade is D");
		}else if (grade>=25.00){
			System.out.println("Student grade is E");
		}else if (grade>=10.00){
			System.out.println("Student grade is F");
		}else{
			System.out.println("Student grade is C");
		}
	}
}