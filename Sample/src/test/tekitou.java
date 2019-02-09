package test;

class tekitou {
	private String employeeName;
	private String divisionName;
	private int vitality;

		// TODO 自動生成されたメソッド・スタブ
		
		tekitou(){}
		
		tekitou(String employeeName,String divisionName, int vitality){
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;

	}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getDivisionName() {
			return divisionName;
		}

		public void setDivisionName(String divisionName) {
			this.divisionName = divisionName;
		}

		public int getVitality() {
			return vitality;
		}

		public void setVitality(int vitality) {
			this.vitality = vitality;
		}
		

}
