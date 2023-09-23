
public class Gitar {
	protected String model;
	protected String brand;
	protected int numberstr;	
	
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumberstr() {
		return numberstr;
	}

	public void setNumberstr(int numberstr) {
		this.numberstr = numberstr;
	}
	
	public void melihat() {
		System.out.println("Model: "+getModel());
		System.out.println("Brand: "+getBrand());
		System.out.println("Number of Strinh: " + getNumberstr());
	}
}
