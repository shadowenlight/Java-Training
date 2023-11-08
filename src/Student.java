public class Student {
	long id;
	String name;
	String faculty;
	
	Student(long id, String name, String faculty){
		this.id = id;
		this.name = name;
		this.faculty = faculty;
	}
	
	Student(){
		this.id = (Long) null;
		this.name = "";
		this.faculty = "";
	}
	
	Student findStudent(Student[] s, int id) {
		int i;
		
		for(i=0;i<s.length;i++) {
			if(s[i].id==id)
				break;
		}
		return s[i]; 
	}
	
	Student[] facultyMembers(Student[] s, String faculty) {
		
		Student[] facStu = new Student[s.length];
		
		for(int i=0;i<s.length;i++) {
			if(s[i].faculty == faculty) {
				facStu[i] = s[i];
			}
		}
		
		return facStu;
	}
}
