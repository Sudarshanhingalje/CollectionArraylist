import java.util.Scanner;
public class StudentService {
public static void addStudent() {
	int[] Student=new int[5];
	
	Scanner sc = new Scanner(System.in);
	for(int i =0;i<Student.length;i++) {
		System.out.println("Enter id");
		int id= sc.nextInt();
		System.out.println("Enter name");
		String name= sc.nextLine();
		System.out.println("Enter mark1");
		int m1= sc.nextInt();
		System.out.println("Enter mark2");
		int m2= sc.nextInt();
		System.out.println("Enter mark3");
		int m3= sc.nextInt();
}
}
}