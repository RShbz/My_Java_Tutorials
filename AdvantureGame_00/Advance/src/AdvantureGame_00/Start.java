package AdvantureGame_00;

import java.util.Scanner;

public class Start  extends Init{

	public Start() {
		super.Inited();
	}

	public String  SelectPlayerName() {
		System.out.println("Oyuncu Adý giriniz: ");
		Scanner pName=new Scanner(System.in);
		
		return pName.next().toString();
		
	}
	
	public int SelectChracter()
	{	
		super.ShowChracters();
		System.out.println("-----------Karater Seçiniz");
		 Scanner s=new Scanner(System.in);
		
		return s.nextInt();
	}

	public int  SelectGun()
	{	
		super.ShowGuns();
		System.out.println("-----------Silah Seçiniz");
		 Scanner s=new Scanner(System.in);
		
		 return s.nextInt();
	}
	
	public int  SelectArmor()
	{	
		super.ShowArmors();
		System.out.println("-----------Zýrh Seçiniz");
		 Scanner s=new Scanner(System.in);
		
		 return s.nextInt();
 
	}
	
	public int  SelectLocations()
	{	
		super.ShowLocations();
		System.out.println("-----------Mekan Seçiniz");
		 Scanner s=new Scanner(System.in);
		
		 return s.nextInt();
 
	}
}
