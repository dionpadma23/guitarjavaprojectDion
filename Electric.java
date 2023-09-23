
public class Electric extends Gitar {

	protected String includeAmp;
	

	public String getIncludeAmp() {
		return includeAmp;
	}

	public void setIncludeAmp(String includeAmp) {
		this.includeAmp = includeAmp;
	}


	
	public void melihat() {
		System.out.println("Model: "+getModel());
		System.out.println("Brand: "+getBrand());
		System.out.println("Number of Strinh: " + getNumberstr());
		System.out.println("AMP: " + getIncludeAmp());
	}
	
}
