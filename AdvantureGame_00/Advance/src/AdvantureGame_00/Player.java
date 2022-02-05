package AdvantureGame_00;

public class Player extends Init {

	private Gamer gamer= new Gamer();
	
	public Player(String name, Chracters chracter, Guns gun,Armors armor, Locations location) {

		this.gamer.setPlayerName(name);
		this.gamer.setChracter(chracter);
		this.gamer.setGuns(gun);
		this.gamer.setArmor(armor);
		this.gamer.setLocation(location);
		
		
	}
	
	public void ShowPlayerAbout() {
		
		System.out.println("OYUNCU ADI:"+this.gamer.getPlayerName());
		System.out.println("Karakteri:"+this.gamer.getChracter().getName());
		System.out.println("Silahý:"+this.gamer.getGuns().get(0).getName());
		System.out.println("Zýrhý:"+this.gamer.getArmor().get(0).getName());
		System.out.println("Lokasyon:"+this.gamer.getLocation().get(0).getName());

	}

	
}
