package collegeEx;

public abstract class Member implements Tesk {
	private String name;
	private String ID;
	private String PW;
	
	
	public Member(String name, String iD, String pW) {
		super();
		this.name = name;
		ID = iD;
		PW = pW;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
}
