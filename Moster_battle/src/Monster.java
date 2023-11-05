public class Monster {
    	// Instance variables
	private String name;
	private int healthScore;
	private Weapon weapon;
	// overload constructor
	public Monster (String name, int healthScore, Weapon weapon) {
		this.name = name;
		this.healthScore = healthScore;
		this.weapon = weapon;
	}
	// getters
	public String getName () {
		return name;
	}
	public int getHealthScore () {
		return healthScore;
	}
	public String getWeaponName () {
		return weapon.getName();
	}
	// attack method
	public int attack (Monster monster) {
		int damagePoints = (int)(Math.random() * weapon.getMaxDamage());
		monster.healthScore -= damagePoints;
		return damagePoints;
	}
}
