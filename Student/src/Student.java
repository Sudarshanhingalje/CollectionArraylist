import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {
	private int sId;
	private String sName;
	private Date sDoa;
	private int mark1;
	private int mark2;
	private int mark3;
	
	
	public Student() {
		this.sId = 0;
		this.sName = null;
		this.sDoa = null;
		this.mark1 = 0;
		this.mark2 = 0;
		this.mark3 = 0;
	}
	
	public Student(int sId, String sName, Date sDoa, int mark1, int mark2, int mark) {
		
		this.sId = sId;
		this.sName = sName;
		this.sDoa = sDoa;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark;
	}

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Date getsDoa() {
		return sDoa;
	}
	public void setsDoa(Date sDoa) {
		this.sDoa = sDoa;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark() {
		return mark3;
	}
	public void setMark(int mark) {
		this.mark3 = mark;
	}
	
	public String toString() {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		String doa=sdf.format(sDoa);
		return "Student [sId=" + sId + ", sName=" + sName + ", sDoa=" + doa + ", mark1=" + mark1 + ", mark2=" + mark2
				+ ", mark=" + mark3 + "]";
	}
	
	
}
