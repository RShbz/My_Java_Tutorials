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

		this.c.add(new Chracters("Savaþçý",5,21,15));
		this.c.add(new Chracters("Okçu",5,18,20));
		this.c.add(new Chracters("Mýzrakçý",8,24,5));
	}
	
	public void GunsCreate() {

		this.gun.add(new Guns("Ok-Yay",2,1));
		this.gun.add(new Guns("Tabanca",3,2));
		this.gun.add(new Guns("Tüfek",7,3));
	}
	
	public void EnemysCreate() {

		this.enemy.add(new Enemys("Domuz Canavarý",1,5,5));
		this.enemy.add(new Enemys("Yýlan Adam",2,9,9));
		this.enemy.add(new Enemys("Ejderha Atý",3,10,12));
	}
	public void ArmorsCreate() {

		this.armor.add(new Armors("Gömlek Zýrh",6,10));
		this.armor.add(new Armors("Kafa Zýrh",10,15));
		this.armor.add(new Armors("Þeffaf Duvar Zýrh",15,18));
		

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
		
		System.out.println("\n*****Zýrhlar:");
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

		this.location.add(new selectLocation("Maðara","Savaþ","Odun",this.gun.get(0),this.armor.get(0),this.enemy.get(0)));
		this.location.add(new selectLocation("Orman","Savaþ","Odun",this.gun.get(0),this.armor.get(0),this.enemy.get(0)));	
		this.location.add(new selectLocation("Nehir","Savaþ","Odun",this.gun.get(0),this.armor.get(0),this.enemy.get(0)));
		this.location.add(new selectLocation("Güvenli Ev","Can yenileniyor."));
		
		
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
			System.out.println("Düþman :"+c1.getEnemys().get(0).getName());
			}
			}
		System.out.println("");
	
	}
	
}
