package game.engine.weapons;

public class WeaponRegistry {
		
	
	final private int code;
	private int price;
    private int damage ; 
	private String name;
	private int minRange;
	private int maxRange;
	
	public WeaponRegistry(int code, int price){
		this.code= code;
		this.price=price;
	}
	
	
	public WeaponRegistry(int code, int price, int damage, String name){
		this(code,price);
		this.damage= damage ;
		this.name=name;
	}
	
	
	public WeaponRegistry(int code, int price, int damage, String name, int minRange, int maxRange){
		this(code,price,damage,name);
		this.minRange=minRange;
		this.maxRange=maxRange;
	}


	public int getPrice() {
		return price;
	}




	public String getName() {
		return name;
	}



	public int getMinRange() {
		return minRange;
	}


	

	public int getMaxRange() {
		return maxRange;
	}


	

	public int getCode() {
		return code;
	}


	public int getDamage() {
		return damage;
	}
	
	
	
	
}
