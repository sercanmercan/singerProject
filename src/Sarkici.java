import java.util.*;
public class Sarkici {

	private ArrayList<String> sarkici_listesi= new ArrayList<String>();
	
	public void sarkiciyi_bastir() {
		System.out.println("Þarkýcý listesinde "+sarkici_listesi.size()+" kadar þarkýcý var.");
		
		for(int i=0;i<sarkici_listesi.size();i++) {
			System.out.println((i+1)+". þarkýcý : "+sarkici_listesi.get(i));
		}
	}
	
	public void sarkici_ekle(String isim) {
		sarkici_listesi.add(isim);
		
		System.out.println("Þarkýcý listesi eklendi...");
	}
	
	public void sarkici_güncelle(String yeni_isim, int pozisyon) {
		sarkici_listesi.set(pozisyon, yeni_isim);
		System.out.println("þarkýcý listesi güncellendi...");
	}
	
	public void sarkici_sil(int pozisyon) {
		
		String isim= sarkici_listesi.get(pozisyon);
		sarkici_listesi.remove(pozisyon);
		
		System.out.println(isim+" þarkýcý listesinden silinmiþtir.");
		
	}
	
	public void sarkici_ara(String isim) {
		
		int pozisyon = sarkici_listesi.indexOf(isim);
		
		if(pozisyon>=0) {
			System.out.println("Þarkýcý bulundu.");
			System.out.println(isim+ " isimli þarkýcý "+(pozisyon+1)+" . pozisyonda");
		}
		
		else
			System.out.println("þarkýcý bulunamadý.");
	}
}
