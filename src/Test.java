import java.util.*;

public class Test {

	private static Sarkici sarkicilar= new Sarkici();
	private static Scanner scanner= new Scanner(System.in);
	
	public static void islemleri_bastir() {
		
		System.out.println("�ark�c� Uygulamas�na Ho�geldiniz...");
		System.out.println("0- i�lemleri g�r�nt�le");
		System.out.println("1- �ark�c�lar� g�r�nt�le");
		System.out.println("2- �ark�c�lar� ekle");
		System.out.println("3- �ark�c� g�ncelle");
		System.out.println("4- �ark�c� sil");
		System.out.println("5-  �ark�c� ara");
		System.out.println("6-  uygulamadan ��k");

	}
	
	public static void goruntule() {
		sarkicilar.sarkiciyi_bastir();
	}
	
	public static void ekle() {
		String yeni_isim;
		System.out.println("Eklemek istedi�iniz �ark�c� ismi :");
		yeni_isim = scanner.nextLine();
		
		sarkicilar.sarkici_ekle(yeni_isim);
		
	}
	
	public static void guncelle() {
		System.out.println("G�ncellemek istedi�iniz �ark�c� ismi :");
		String isim = scanner.nextLine();
		System.out.println("G�ncellemek istedi�iniz �ark�c� pozisyonu(1,2,3 gibi) :");
		int poz = scanner.nextInt();
		sarkicilar.sarkici_g�ncelle(isim, poz-1);
		
	}
	
	
	public static void sil() {
		
		System.out.println("Silmek istedi�iniz �ark�c� pozisyonu(1,2,3 gibi) :");
		int poz = scanner.nextInt();
		sarkicilar.sarkici_sil(poz);
		
	}
	
	public static void ara() {
		System.out.println("Aramak istedi�iniz �ark�c� ismi :");
		String isim = scanner.nextLine();
		
		sarkicilar.sarkici_ara(isim);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		islemleri_bastir();
		
		boolean cikis= false;
		int islem;
		
		while(!cikis) {
			System.out.println("Bir i�lem se�iniz.");
			islem = scanner.nextInt();

			scanner.nextLine();
			switch(islem) {
				case 0:
					islemleri_bastir();
					break;
					
				case 1:
					goruntule();
					break;
					
				case 2:
					ekle();
					break;
					
				case 3:
					guncelle();
					break;
					
				case 4:
					sil();
					break;
					
				case 5: 
					ara();
					break;
					
				case 6:
					cikis = true;
					System.out.println("Uygulamadan ��k�l�yor.");
					break;
			}
		}
	}

}
