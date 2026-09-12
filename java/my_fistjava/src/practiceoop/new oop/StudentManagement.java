import java.util.Scanner;
public class StudentManagement{
	
	public static Student searchStudent(Student[] student,String targetId){
		for(Student students: student){
			if(students.getStudentId().equalsIgnoreCase(targetId)){
				return students;
			}
			
		}return null;
	}
	public static void main(String[]args){
		
		Student [] student=new Student[5];
		student[0]=new Student("S001","Alice",new int[]{85,90,80});
		student[1]=new Student("S002","bob",new int[]{75,80,88});
		student[2]=new Student("S003","robb",new int[]{65,67,89});
		student[3]=new Student("S004","david",new int[]{75,67,60});
		student[4]=new Student("S005","Emma",new int[]{88,84,91});
		
		System.out.println("=== Student Records ===");
		for(int i=0;i<student.length;i++){
			System.out.println((i+1)+","+student[i].getName().toUpperCase()+"(ID: "+student[i].getStudentId()+")- AVG:"+student[i].calculateAverage());
		}
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student ID to search: ");
        String targetId = scanner.nextLine().trim();
		Student result = searchStudent(student, targetId);
		
		
		if (result != null) {
            System.out.println("Student Found! Name: " + result.getName() + ", Average Mark: " + result.calculateAverage());
        } else {
            System.out.println("Student with ID " + targetId + " not found.");
        }
		scanner.close();
	}

}