package pack;

public class student {
	String sname;
	int sid;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public student(String sname, int sid) {
		
		this.sname = sname;
		this.sid = sid;
		
	}
	public student() {
		
	}
	public student(int sid) {
		this.sid = sid;
	}
	
	
}
