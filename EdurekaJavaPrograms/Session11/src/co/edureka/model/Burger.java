package co.edureka.model;

public class Burger extends FoodItem {

	String burgerName;
	String dressing;
	
	public Burger() {
	
	}

	public Burger(String burgerName, String dressing) {
		this.burgerName = burgerName;
		this.dressing = dressing;
	}

	public String getBurgerName() {
		return burgerName;
	}

	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	public String getDressing() {
		return dressing;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	@Override
	public String toString() {
		return "Burger [burgerName=" + burgerName + ", dressing=" + dressing + ", fid=" + fid + ", name=" + name
				+ ", price=" + price + "]";
	}
	
}
