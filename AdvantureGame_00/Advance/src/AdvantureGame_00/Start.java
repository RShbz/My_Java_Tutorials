package AdvantureGame_00;

import java.util.Scanner;

public class Start  extends Init{

	public Start() {
		super.Inited();
	}

	public String  SelectPlayerName() {
		System.out.println("Oyuncu Ad� giriniz: ");
		Scanner pName=new Scanner(System.in);
		
		return pName.next().toString();
		
	}
	
	public int SelectChracter()
	{	
		super.ShowChracters();
		System.out.println("-----------Karater Se�iniz");
		 Scanner s=new Scanner(System.in);
		
		return s.nextInt();
	}

	public int  SelectGun()
	{	
		super.ShowGuns();
		System.out.println("-----------Silah Se�iniz");
		 Scanner s=new Scanner(System.in);
		
		 return s.nextInt();
	}
	
	public int  SelectArmor()
	{	
		super.ShowArmors();
		System.out.println("-----------Z�rh Se�iniz");
		 Scanner s=new Scanner(System.in);
		
		 return s.nextInt();
 
	}
	
	public int  SelectLocations()
	{	
		super.ShowLocations();
		System.out.println("-----------Mekan Se�iniz");
		 Scanner s=new Scanner(System.in);
		
		 return s.nextInt();
 
	}
}
