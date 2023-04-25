import java.util.Scanner;

public class ManavProgrami {

	public static void main(String[] args) {
		
		double armut, elma, domates, muz, patlican;
		
		Scanner inp = new Scanner(System.in);
		
		double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;
		
		double toplam;
		
		System.out.print("Armutun kilosunu giriniz :");
		armut = inp.nextDouble();
		
		System.out.print("Elmanın kilosunu giriniz :");
		elma = inp.nextDouble();
		
		System.out.print("Domatesin kilosunu giriniz :");
		domates = inp.nextDouble();
		
		System.out.print("Muzun kilosunu giriniz :");
		muz = inp.nextDouble();
		
		System.out.print("Patlıcanın kilosunu giriniz :");
		patlican = inp.nextDouble();
		
		toplam = (armutFiyat * armut) + (elmaFiyat * elma) + (domatesFiyat * domates) + (muzFiyat * muz) + (patlicanFiyat * patlican);
		
		System.out.println("Ödenecek Tutar" + toplam + "tl");
	}

}
