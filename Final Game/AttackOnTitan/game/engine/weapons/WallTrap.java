package game.engine.weapons;

public class WallTrap extends Weapon {
	
	final static public int WEAPON_CODE =4;
	
	public WallTrap(int baseDamage){
		super(baseDamage);
	}

	public static int getWeaponCode() {
		return WEAPON_CODE;
	}
	
	
}
