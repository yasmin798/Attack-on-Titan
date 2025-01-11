package game.engine.weapons;

public class PiercingCannon extends Weapon {
	
 final static public int WEAPON_CODE =1;
	
 public PiercingCannon(int baseDamage){
	 super(baseDamage);
	 
	 
 }
public int getWeapon() {
	return WEAPON_CODE;
}
 
}
