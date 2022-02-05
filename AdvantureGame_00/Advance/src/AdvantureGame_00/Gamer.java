package AdvantureGame_00;

import java.util.ArrayList;
import java.util.List;

public  class Gamer {

	private String playerName;
	private Chracters chracter;
	private int healthy;
	private int money;
	private List<Guns> guns= new ArrayList<Guns>();
	private List<Armors> armor=new ArrayList<Armors>();
	private List<String> objects=new ArrayList<String>();
	private List<Locations> location=new ArrayList<Locations>();
	
	
	
	public List<Locations> getLocation() {
		return location;
	}
	public void setLocation(Locations location) {
		this.location.add(location);
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
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Chracters getChracter() {
		return chracter;
	}
	public void setChracter(Chracters chracter) {
		this.chracter = chracter;
	}
	public List<Guns> getGuns() {
		return guns;
	}
	public void setGuns(Guns guns) {
		this.guns.add(guns);
	}
	public List<Armors> getArmor() {
		return armor;
	}
	public void setArmor(Armors armor) {
		this.armor.add(armor);
	}
	public List<String> getObjects() {
		return objects;
	}
	public void setObjects(String objects) {
		this.objects.add(objects);
	}
	

	//..............
	

	
}
