package game.engine.weapons;

public class SniperCannon extends Weapon {
 
	final static public int WEAPON_CODE=2;
	

	public SniperCannon(int baseDamage){
		super(baseDamage);
	}
	
	public static int getWeaponCode() {
		return WEAPON_CODE;
	}
}
