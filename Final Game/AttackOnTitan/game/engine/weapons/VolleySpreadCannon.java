package game.engine.weapons;

public class VolleySpreadCannon extends Weapon {
 
	final static public int WEAPON_CODE=3;
	final private int minRange;
	final private int maxRange;
	
 public VolleySpreadCannon(int baseDamage, int minRange, int maxRange){
		super(baseDamage);
		this.minRange= minRange;
		this.maxRange=maxRange;
	}

public static int getWeaponCode() {
	return WEAPON_CODE;
}

public int getMinRange() {
	return minRange;
}

public int getMaxRange() {
	return maxRange;
}
 
 
}
