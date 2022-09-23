package hafta1;

public class odev1 {

	public static void main(String[] args) {
		//sayı asal mı?
		int number = -100;
		boolean asal =true;
		for(int i=2;i<=number/2;i++) {
			if (number%i==0) {
				asal=false;
			}
		}
		if (number==1) {
			System.out.println("sayi asal degildir");
		}else if(number<1) {
			System.out.println("gecersiz sayi girdiniz");
		}else if(asal) {
			System.out.println("sayı asaldir");
		}
		else {
			System.out.println("sayi asal degildir");
		}

	
	//sesli harfler
	char harf = 'E';
	switch (harf) {
	case 'A': 
	case 'O':
	case 'I':
	case 'U':
		System.out.println("kalin sesli harftir");
		break;
		default:
			System.out.println("ince sesli harftir");
			break;
		}
	//mukemmel sayi midir?6-1,2,3=6
	int sayi2=-10;
	int sum =0;
	for (int i = 1; i < sayi2; i++) {
		if(sayi2%i==0) {
			sum+=i;
		}
		
	}
	if(sayi2==sum) {
		System.out.println("girdiginiz sayi mukemmeldir");
	}else if(sayi2<1) {
		System.out.println("gecersiz sayi");
	}
	else {
		System.out.println("girdiginiz sayi mukemmel degildir");
	}
	//arkadas sayilar : 220-284
	int x = 220;
	int y = 274;
	int sum1=0;
	int sum2=0;
	for(int i=1;i<x; i++) {
		if(x%i==0) {
			sum1+=i;
		}
	}
	for(int i=1;i<y; i++) {
		if(y%i==0) {
			sum2+=i;
		}
	}
	if(sum1==y && sum2==x) {
		System.out.println("bu sayilar arkadastir");
	}else {
		System.out.println("bu sayilar arkadas degildir");
	}
	int[] sayilar = {1,2,3,5,7,9,0};
	int aranacakSayi = 10;
	boolean varMi = false;
	for(int i = 0;i<sayilar.length;i++) {
		if(aranacakSayi==sayilar[i]) {
			varMi=true;
		}
	}
	if(varMi==true) {
		System.out.println("aradiginiz sayi dizidedir" );
	}else {
		System.out.println("aradiginiz sayi dizide yoktur" );
	}

}
}
