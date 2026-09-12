public class Student{
	private String studentId;
	private String name;
	private int [] marks;
	
//constucter

	public Student(String studentId,String name,int [] marks){
		this.studentId=studentId;
		this.name=name;
		this.marks=marks;
	}
	
	public String getStudentId(){
		return studentId;
	}
	public String getName(){
		return name;
	}
	public int[]  getMarks(){
		return marks;
	}
	
	public double calculateAverage(){
		int sum=0;
		for(int mark:marks){
			sum+=mark;
		}
		return(double) sum / marks.length; 
	}

}