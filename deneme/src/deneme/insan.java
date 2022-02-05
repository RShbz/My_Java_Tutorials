package deneme;

public class insan {

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getTc() {
		return tc;
	}
	public void setTc(int tc) {
		this.tc = tc;
	}
	

	
public insan() {
		insan.insansayisi+=1;
	}

	//........................
	private String ad;
	private String soyad;
	private String babaadi;
	private String anneadi;
	private int  tc;
	private String id;
	private static int insansayisi=0;
//.......................
	
	
	public String getBabaadi() {
		return babaadi;
	}
	public void setBabaadi(String babaadi) {
		this.babaadi = babaadi;
	}
	public String getAnneadi() {
		return anneadi;
	}
	public void setAnneadi(String anneadi) {
		this.anneadi = anneadi;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = "000"+insan.insansayisi +"";
	}
}
