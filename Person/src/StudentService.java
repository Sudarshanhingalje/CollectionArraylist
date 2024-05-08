
public class StudentService {
	public static void CalculateMark(int m1,int m2, int m3) {
		Double result=(double) (m1+m2+m3)/3;
		Double Mark = result*100;
		System.out.println("Marks : "+Mark);
	}
}
