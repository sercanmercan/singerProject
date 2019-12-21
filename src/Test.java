import java.util.*;

public class Test {

	private static Sarkici sarkicilar= new Sarkici();
	private static Scanner scanner= new Scanner(System.in);
	
	public static void islemleri_bastir() {
		
		System.out.println("Þarkýcý Uygulamasýna Hoþgeldiniz...");
		System.out.println("0- iþlemleri görüntüle");
		System.out.println("1- þarkýcýlarý görüntüle");
		System.out.println("2- þarkýcýlarý ekle");
		System.out.println("3- þarkýcý güncelle");
		System.out.println("4- þarkýcý sil");
		System.out.println("5-  þarkýcý ara");
		System.out.println("6-  uygulamadan çýk");

	}
	
	public static void goruntule() {
		sarkicilar.sarkiciyi_bastir();
	}
	
	public static void ekle() {
		String yeni_isim;
		System.out.println("Eklemek istediðiniz þarkýcý ismi :");
		yeni_isim = scanner.nextLine();
		
		sarkicilar.sarkici_ekle(yeni_isim);
		
	}
	
	public static void guncelle() {
		System.out.println("Güncellemek istediðiniz þarkýcý ismi :");
		String isim = scanner.nextLine();
		System.out.println("Güncellemek istediðiniz þarkýcý pozisyonu(1,2,3 gibi) :");
		int poz = scanner.nextInt();
		sarkicilar.sarkici_güncelle(isim, poz-1);
		
	}
	
	
	public static void sil() {
		
		System.out.println("Silmek istediðiniz þarkýcý pozisyonu(1,2,3 gibi) :");
		int poz = scanner.nextInt();
		sarkicilar.sarkici_sil(poz);
		
	}
	
	public static void ara() {
		System.out.println("Aramak istediðiniz þarkýcý ismi :");
		String isim = scanner.nextLine();
		
		sarkicilar.sarkici_ara(isim);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		islemleri_bastir();
		
		boolean cikis= false;
		int islem;
		
		while(!cikis) {
			System.out.println("Bir iþlem seçiniz.");
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
					System.out.println("Uygulamadan çýkýlýyor.");
					break;
			}
		}
	}

}
