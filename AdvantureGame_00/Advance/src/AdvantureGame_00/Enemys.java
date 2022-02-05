package AdvantureGame_00;

public class Enemys extends GameBase{

	private static int id=1;
	
	public Enemys(String name,int damage,int healthy,int money) {
		this.setName(name);
		this.setDamage(damage);
		this.setHealthy(healthy);
		this.setMoney(money);
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Enemys.id = id+1;
	}
	
}
