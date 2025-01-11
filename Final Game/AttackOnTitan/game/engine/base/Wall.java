package game.engine.base;
import game.engine.interfaces.*;

//import game.engine.*;

public class Wall implements Attackee {
	private final int baseHealth;
	private int currentHealth;
	
public Wall(int baseHealth){
	this.baseHealth = baseHealth;
	currentHealth=this.baseHealth;
}
public int getCurrentHealth() {
	return currentHealth;
}
public void setCurrentHealth(int health) {
	if( health<=0) {
	this.currentHealth = 0;
}else{
	this.currentHealth=health;
	}
}
public int getBaseHealth() {
	return baseHealth;
}

public int getResourcesValue(){
		return -1;			
}
}



