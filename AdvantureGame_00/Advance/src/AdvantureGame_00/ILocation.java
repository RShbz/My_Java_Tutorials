package AdvantureGame_00;

import java.util.Random;

public interface ILocation {

	 //public static  String enemyName = "";
	 
	 default String enemyName(String name) {return name;};
	 
	default  int howMuchEnemy() {
		Random r= new Random();
		return r.nextInt(3);}
		
}
