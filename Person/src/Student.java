
public class Student {
	private int SId;
	private String SName;
	private String SDateOfAdmission;
	private int Smark1;
	private int Smark2;
	private int Smark3;
	
	public Student() {
		this.SId=SId;
		this.SName=SName;
		this.SDateOfAdmission=SDateOfAdmission;
		this.Smark1=Smark1;
		this.Smark2=Smark2;
		this.Smark3=Smark3;
	}
	public Student(int id,String nm,String dob,int m1,int m2, int m3) {
		this.SId=id;
		this.SName=nm;
		this.SDateOfAdmission=dob;
		this.Smark1=m1;
		this.Smark2=m2;
		this.Smark3=m3;
		System.out.println("SId=" + SId + ", SName=" + SName + ", SDateOfAdmission=" + SDateOfAdmission + ", Smark1="
				+ Smark1 + ", Smark2=" + Smark2 + ", Smark3=" + Smark3);
	}
	
	
	
	public String toString() {
		return "Student [SId=" + SId + ", SName=" + SName + ", SDateOfAdmission=" + SDateOfAdmission + ", Smark1="
				+ Smark1 + ", Smark2=" + Smark2 + ", Smark3=" + Smark3 + "]";
	}
	public int getSId() {
		return SId;
	}
	public void setSId(int sId) {
		SId = sId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSDateOfAdmission() {
		return SDateOfAdmission;
	}
	public void setSDateOfAdmission(String sDateOfAdmission) {
		SDateOfAdmission = sDateOfAdmission;
	}
	public int getSmark1() {
		return Smark1;
	}
	public void setSmark1(int smark1) {
		Smark1 = smark1;
	}
	public int getSmark2() {
		return Smark2;
	}
	public void setSmark2(int smark2) {
		Smark2 = smark2;
	}
	public int getSmark3() {
		return Smark3;
	}
	public void setSmark3(int smark3) {
		Smark3 = smark3;
	}
	
	
}
