package ReCapDemo;

public class Main {

	public static void main(String[] args) {
		/*
		int say1 = 5;
		int say2 = 8;
		int say3 = 1;
		int enBuyuk = say1;
		
		if(enBuyuk<say2) {
			enBuyuk = say2;
		}
		if(enBuyuk<say3) {
			enBuyuk = say3;
		}
		
		System.out.println("En Büyük Sayı: "+ enBuyuk);
		*/
		/*
		if(x>y) { 
			if(x>z) {
				System.out.println("x büyüktür");
			}else {
				System.out.println("z büyüktür");
			}
			}else {
				if(y>z) {
				System.out.println("y büyüktür");
				}else {
				System.out.println("z büyüktür");
				}
			} */
			
			double[] myList = {1.2,1.3,4.3,5.6};
			double total = 0;
			double max = myList[0];
			
			for(double number:myList) {
				System.out.println(number);
				total = total + number;
				if(max<number) {
					max = number;
				}
			}
		
			System.out.println(total);
			System.out.println("En Büyük Sayı:" + max);
			
			
			String message = "Bugün hava çok güzel";
			System.out.println(message.charAt(6));
			
			int number = 1;
			//int remainder = number%2;
			boolean isPrime = true;
			
			if(number == 1) {
				System.out.println("Sayı Asal Değildir");
				return;
			}
			
			for (int i=2; i<number; i++) {
				if(number%i == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime) {
				System.out.println("Sayı Asaldır");
			}else {
				System.out.println("Sayı Asal Değildir!!!");
			}
			
			
			
			
			
			
			
			
		}
		
	}


