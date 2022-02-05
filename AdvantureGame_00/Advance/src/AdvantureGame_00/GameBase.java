package AdvantureGame_00;

public abstract class GameBase {

	private String name;
	private char chracterIcon;
	private int damage;
	private int healthy;
	private int money;
	private int engelleme;
  
	
	
	
	
	public void setDamage(int damage) {
		this.damage=damage;
	}

	public char getChracterIcon() {
		return chracterIcon;
	}

	public void setChracterIcon(char chracterIcon) {
		this.chracterIcon = chracterIcon;
	}

	public int getEngelleme() {
		return engelleme;
	}

	public void setEngelleme(int engelleme) {
		this.engelleme = engelleme;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		
		return this.damage;
	}
	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//..............................................
	
	//Locations
	
}
