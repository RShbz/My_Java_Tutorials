package AdvantureGame_00;

public class Chracters extends GameBase {

	private static int id=1;
	
	public Chracters(String name,int damage, int healthy, int money) {
		this.setName(name);
		this.setDamage(damage);
		this.setHealthy(healthy);
		this.setMoney(money);
		this.setId();
		
	}

	public  int getId() {
		return id;
	}

	public  void setId() {
		Chracters.id = id+1;
	}


}
