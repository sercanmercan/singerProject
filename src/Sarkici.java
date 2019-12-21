import java.util.*;
public class Sarkici {

	private ArrayList<String> sarkici_listesi= new ArrayList<String>();
	
	public void sarkiciyi_bastir() {
		System.out.println("�ark�c� listesinde "+sarkici_listesi.size()+" kadar �ark�c� var.");
		
		for(int i=0;i<sarkici_listesi.size();i++) {
			System.out.println((i+1)+". �ark�c� : "+sarkici_listesi.get(i));
		}
	}
	
	public void sarkici_ekle(String isim) {
		sarkici_listesi.add(isim);
		
		System.out.println("�ark�c� listesi eklendi...");
	}
	
	public void sarkici_g�ncelle(String yeni_isim, int pozisyon) {
		sarkici_listesi.set(pozisyon, yeni_isim);
		System.out.println("�ark�c� listesi g�ncellendi...");
	}
	
	public void sarkici_sil(int pozisyon) {
		
		String isim= sarkici_listesi.get(pozisyon);
		sarkici_listesi.remove(pozisyon);
		
		System.out.println(isim+" �ark�c� listesinden silinmi�tir.");
		
	}
	
	public void sarkici_ara(String isim) {
		
		int pozisyon = sarkici_listesi.indexOf(isim);
		
		if(pozisyon>=0) {
			System.out.println("�ark�c� bulundu.");
			System.out.println(isim+ " isimli �ark�c� "+(pozisyon+1)+" . pozisyonda");
		}
		
		else
			System.out.println("�ark�c� bulunamad�.");
	}
}
