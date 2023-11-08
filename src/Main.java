import java.util.Scanner;
public class Main {
			
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an initial number of students: ");
		int n = scan.nextInt();
		
		Student s[] = new Student[n];
		
		for(int i=0;i<s.length;i++) {
			System.out.print("Enter id for student: ");
			s[i].id = scan.nextLong();
			System.out.print("\nEnter name for student: ");
			s[i].name = scan.next();
			System.out.print("\nEnter age for student: ");
			s[i].faculty = scan.next();
		}
		
		for(int i=0;i<s.length;i++) {
			System.out.println("List of students ");
			System.out.println(s[i].id+"	"+s[i].name+"	"+s[i].faculty);
		}
		scan.close();
	}
}
