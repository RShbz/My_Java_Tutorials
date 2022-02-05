package AdvantureGame_00;

import java.util.ArrayList;
import java.util.List;

public class Init {
	
		List<Chracters> c=new ArrayList<Chracters>();
		List<Guns> gun=new ArrayList<Guns>();
		List<Enemys> enemy=new ArrayList<Enemys>();
		List<Armors> armor=new ArrayList<Armors>();
		
		List<selectLocation> location=new ArrayList<selectLocation>();

		
	public Init() {

	}	
	public void Inited()
	{
		chractersCreate();
		GunsCreate();
		EnemysCreate();
		ArmorsCreate();
		LocationsCreate();
	
	}
	
	public void chractersCreate() {

		this.c.add(new Chracters("Sava���",5,21,15));
		this.c.add(new Chracters("Ok�u",5,18,20));
		this.c.add(new Chracters("M�zrak��",8,24,5));
	}
	
	public void GunsCreate() {

		this.gun.add(new Guns("Ok-Yay",2,1));
		this.gun.add(new Guns("Tabanca",3,2));
		this.gun.add(new Guns("T�fek",7,3));
	}
	
	public void EnemysCreate() {

		this.enemy.add(new Enemys("Domuz Canavar�",1,5,5));
		this.enemy.add(new Enemys("Y�lan Adam",2,9,9));
		this.enemy.add(new Enemys("Ejderha At�",3,10,12));
	}
	public void ArmorsCreate() {

		this.armor.add(new Armors("G�mlek Z�rh",6,10));
		this.armor.add(new Armors("Kafa Z�rh",10,15));
		this.armor.add(new Armors("�effaf Duvar Z�rh",15,18));
		

	}	
	//.. Show
	

	public void ShowChracters(){
		
		System.out.println("\n*****Karakterler :");
		int s=1;
		for(Chracters c1:c) {
			System.out.print(""+s+++"->\t");
			System.out.print("Name :"+c1.getName()+"\t");
			System.out.print("Damage :"+ c1.getDamage()+"\t");
			System.out.print("Healthy :"+c1.getHealthy()+"\t");
			System.out.println("Money :"+c1.getMoney());
			}
	
	}
	public void ShowGuns(){
		
		System.out.println("\n*****Silahlar :");
		int s=1;
		for(Guns c1:gun) {
			System.out.print(""+s+++"->\t");
			System.out.print("Name :"+c1.getName()+"\t");
			System.out.print("Damage :"+ c1.getDamage()+"\t");
			System.out.print("Healthy :"+c1.getHealthy()+"\t");
			System.out.println("Money :"+c1.getMoney());
			}
	
	}
	public void ShowArmors(){
		
		System.out.println("\n*****Z�rhlar:");
		int s=1;
		for(Armors c1:armor) {
			System.out.print(""+s+++"->\t");
			System.out.print("Name :"+c1.getName()+"\t");
			System.out.print("Engelleme :"+ c1.getEngelleme()+"\t");
			System.out.println("Money :"+c1.getMoney());
			}
	
	}
//LOCATINS CREATE ALL PROPERTIES	
	
	public void LocationsCreate() {

		this.location.add(new selectLocation("Ma�ara","Sava�","Odun",this.gun.get(0),this.armor.get(0),this.enemy.get(0)));
		this.location.add(new selectLocation("Orman","Sava�","Odun",this.gun.get(0),this.armor.get(0),this.enemy.get(0)));	
		this.location.add(new selectLocation("Nehir","Sava�","Odun",this.gun.get(0),this.armor.get(0),this.enemy.get(0)));
		this.location.add(new selectLocation("G�venli Ev","Can yenileniyor."));
		
		
	}
	//show locations............
	
	public void ShowLocations(){
		
		System.out.println("\n*****Mekanlar:");
		int s=1;
		for(Locations c1:location) {
			System.out.print(""+s+++"->\t");
			System.out.print("Name :"+c1.getName()+"\t");
			System.out.print("Property :"+ c1.getProperty()+"\t");
			
			if(s!=5) {
			System.out.print("Gain Gun :"+c1.getGun().get(0).getName()+"\t");
			System.out.println("Gain Armors :"+c1.getArmor().get(0).getName());
			System.out.println("D��man :"+c1.getEnemys().get(0).getName());
			}
			}
		System.out.println("");
	
	}
	
}
