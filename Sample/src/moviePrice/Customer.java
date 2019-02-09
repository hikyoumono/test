package moviePrice;

class Customer {

	private int nennrei;
	private String seibetu;
	private boolean isFirstday = false;
	private boolean isLadiesday = false;
	private boolean isLateshow = false;
	private boolean is3D = false;

	// コンストラクタ
	Customer() {
	}

	// System.out.println("基本料金");場所

	Customer(int nennrei, String seibetu ,boolean isFirst,boolean isLadies,
			boolean isLate,boolean is3D) {
		this.nennrei = nennrei;
		this.seibetu = seibetu;
		this.isFirstday = isFirst;
		this.isLadiesday = isLadies;
		this.isLateshow = isLate;
		this.is3D = is3D;


	}

	public int getNennrei() {
		return nennrei;
	}

	public void setNennrei(int nennrei) {
		this.nennrei = nennrei;
	}

	public String getSeibetu() {
		return seibetu;
	}

	public void setSeibetu(String seibetu) {
		this.seibetu = seibetu;
	}

	public boolean isFirstday() {
		return isFirstday;
	}

	public void setFirstday(boolean isFirstday) {
		this.isFirstday = isFirstday;
	}

	public boolean isLadiesday() {
		return isLadiesday;
	}

	public void setLadiesday(boolean isLadiesday) {
		this.isLadiesday = isLadiesday;
	}

	public boolean isLateshow() {
		return isLateshow;
	}

	public void setLateshow(boolean isLateshow) {
		this.isLateshow = isLateshow;
	}

	public boolean isIs3D() {
		return is3D;
	}

	public void setIs3D(boolean is3d) {
		is3D = is3d;
	}




}
