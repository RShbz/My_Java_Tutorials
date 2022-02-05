package AdvantureGame_00;

import java.util.ArrayList;
import java.util.List;

public abstract class Locations implements ILocation{
	
	private String name;
	private List<String> property= new ArrayList<String>();
	private String objects;
	private List<Enemys> enemys=new ArrayList<Enemys>();
	private List<Armors> armor=new ArrayList<Armors>();;
	private List<Guns> gun=new ArrayList<Guns>();
	
	
	public Locations(String name,String propertys) {
	this.setProperty(propertys);
	this.setName(name);
	}
	
	public Locations(String name,String propertys,String object,Guns gun,Armors armor, Enemys enemy) {
	this.setProperty(propertys);
	this.setEnemys(enemy);
	this.setGun(gun);
	this.setArmor(armor);
	this.setObjects(object);
	this.setName(name);


}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property.add(property);
	}
	public String getObjects() {
		return objects;
	}
	public void setObjects(String objects) {
		this.objects = objects;
	}
	public List<Enemys> getEnemys() {
		return enemys;
	}
	public void setEnemys(Enemys enemy) {
		this.enemys.add(enemy);
	}
	public List<Armors> getArmor() {
		return armor;
	}
	public void setArmor(Armors armor) {
		this.armor.add(armor);
	}
	public List<Guns> getGun() {
		return gun;
	}
	public void setGun(Guns gun) {
		this.gun.add(gun);
	};
	
	
	
	
	
	
}
