package game.engine.weapons.factory;
import java.util.*;

import game.engine.weapons.*;

import java.io.*;

import game.engine.dataloader.*;

public class WeaponFactory {
	
	  final private HashMap<Integer, WeaponRegistry> weaponShop;
	
	
	public WeaponFactory() throws IOException {
		weaponShop= DataLoader.readWeaponRegistry();
	}

	public HashMap<Integer, WeaponRegistry> getWeaponShop() {
		return weaponShop; 
	} 
	
}
 