public class Weapon {
    // Instance variables
	private String name;
	private int maxDamage;
	// default constructor
	public Weapon () {
		name = "Pointy Stick";
		maxDamage = 1;
	}
	// overload constructor
	public Weapon (String name, int maxDamage) {
		this.name = name;
		this.maxDamage = maxDamage;
	}
	// getters
	public String getName () {
		return name;
	}
	public int getMaxDamage () {
		return maxDamage;
	}
	// setters
	public void setName (String name) {
		this.name = name;
	}
	public void setMaxDamage (int maxDamage) {
		this.maxDamage = maxDamage;
	}
}
