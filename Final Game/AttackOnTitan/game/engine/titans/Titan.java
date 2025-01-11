package game.engine.titans;
 import game.engine.interfaces.*;

public abstract class  Titan implements Attacker, Attackee, Mobil , Comparable<Titan>{
	
	private final int baseHealth;
    private int currentHealth;
    private final int baseDamage;
    private final int heightInMeters;
    private int distanceFromBase;
    private int speed;
    private final int resourcesValue;
    private final int dangerLevel;
 public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed,
			int resourcesValue, int dangerLevel) {
		
		
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
		this.baseDamage = baseDamage;
		this.heightInMeters = heightInMeters;
		this.distanceFromBase = distanceFromBase;
		this.speed = speed;
		this.resourcesValue = resourcesValue;
		this.dangerLevel = dangerLevel;
		
	}
 public int getCurrentHealth() {
	return currentHealth;
}
 public void setCurrentHealth(int health) {
	if(health>=0) {
	this.currentHealth = health;
 }else {if(health<0)
		this.currentHealth=0;
}}
 public int getDistance() {
	return distanceFromBase;
}
 public void setDistance(int distance) {
	if (distance>0) {
	this.distanceFromBase = distance;
}}
 public int getSpeed() {
	return speed;
}
 public void setSpeed(int speed) {
	if(speed>0) {
	this.speed = speed;
}}
public int getBaseHealth() {
	return baseHealth;
}
public int getDamage() {
	return baseDamage;
}
public int getHeightInMeters() {
	return heightInMeters;
}
public int getResourcesValue() {
	return resourcesValue;
}
public int getDangerLevel() {
	return dangerLevel;
} 
public int compareTo(Titan o) {
	return this.distanceFromBase - o.distanceFromBase;
}





 
	
 
	
}
