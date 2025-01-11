package game.engine.weapons;
import game.engine.interfaces.*;
public abstract class Weapon implements Attacker {
	final private int baseDamage;
	

	public Weapon(int baseDamage){
		this.baseDamage= baseDamage;
	}
	
	public int getDamage() {
		return baseDamage;
	}
}
