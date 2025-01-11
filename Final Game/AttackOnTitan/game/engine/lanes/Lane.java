package game.engine.lanes;
import game.engine.weapons.*;

import game.engine.base.*;
import game.engine.titans.*;
import java.util.*;
public class Lane implements Comparable<Lane> {

	private final Wall laneWall;
	private int dangerLevel=0;
	private final PriorityQueue<Titan> titans;
	private final ArrayList<Weapon> weapons;
	
	
	public Lane(Wall laneWall) {

        this.laneWall = laneWall;
        dangerLevel=0;
        titans=new PriorityQueue<>() ;
        weapons= new ArrayList<>() ;
             
	}
	
	
	
	public int compareTo(Lane o) {
 if (this.dangerLevel<o.dangerLevel)
	 return -1;
 if (this.dangerLevel>o.dangerLevel)
	 return 1;
 return 0;
 
      
	}
	public int getDangerLevel() {
		return dangerLevel;
	}
	

	public void setDangerLevel(int dangerLevel) {
		this.dangerLevel = dangerLevel;
	}


	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}



	public Wall getLaneWall() {
		return laneWall;
	}


	public PriorityQueue<Titan> getTitans() {
		return titans;
	}
	
	
}
