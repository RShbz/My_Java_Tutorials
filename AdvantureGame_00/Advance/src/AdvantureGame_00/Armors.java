package AdvantureGame_00;

public class Armors extends GameBase{

private static int id=1;
	
	public Armors(String name ,int engelleme,int money) {
		this.setName(name);
		this.setEngelleme(engelleme);;
		this.setMoney(money);
	}


	
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Armors.id = id+1;
	}



	
}
