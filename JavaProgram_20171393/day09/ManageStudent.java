package day09;

public class ManageStudent {	
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Daejeon", "010-111-1111", "sook@a.b");
		return student;
	}
	
	public void printStudents(Student[] student) {
		for(int i = 0; i < 3; i++) {
			System.out.println(student[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = null;
		ManageStudent ms = new ManageStudent();
		student = ms.addStudent();
		ms.printStudents(student);
		}

}
