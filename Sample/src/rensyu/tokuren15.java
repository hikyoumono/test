package rensyu;

public class tokuren15 {
	private String employeename;
	private String divisionname;
	private int vitality;
	
	tokuren15(){
	}

	tokuren15(String employeename,String divisinname,int vitality){
		this.employeename = employeename;
		this.divisionname = divisionname;
		this.vitality = vitality;

	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getDivisionname() {
		return divisionname;
	}

	public void setDivisionname(String divisionname) {
		this.divisionname = divisionname;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

}
