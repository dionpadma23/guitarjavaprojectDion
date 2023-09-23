
public class Acoustic extends Gitar {
	
	protected String isHybrid;
		

	public String getIsHybrid() {
		return isHybrid;
	}

	public void setIsHybrid(String isHybrid) {
		this.isHybrid = isHybrid;
	}
	

	
	public void melihat() {
		System.out.println("Model: "+getModel());
		System.out.println("Brand: "+getBrand());
		System.out.println("Number of Strinh: " + getNumberstr());
		System.out.println("Hybrid: "+getIsHybrid());
	}
	

}
