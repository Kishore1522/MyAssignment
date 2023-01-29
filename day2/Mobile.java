package week1.day2;

public class Mobile {
	public void samsung() {
		String mobileBrandName="Samsung F22";
		System.out.println("Name Of The Mobile :"+mobileBrandName);
		
		char mobileLogo='s';
		System.out.println("MOBILE LOGO        :"+mobileLogo);
		
		short noOfMobilePiece=1;
		System.out.println("NO OF MOBILE PIECE :"+noOfMobilePiece);
		
		int modelNumber=22;
		System.out.println("MODEL NUMBER       :"+modelNumber);
		
		long mobileImeiNumber=273654129027615283l;
		System.out.println("MOBILE IMEI NUMBER :"+mobileImeiNumber);
		
		float mobilePrice=12000f;
		System.out.println("MOBILE PRICE       :"+mobilePrice);
		
		boolean isDamaged=false;
		System.out.println("MOBILE IS DAMAGED  :"+isDamaged);
		
	}
	public static void main(String[] args) {
		Mobile samsung =new Mobile ();
		samsung.samsung();
		
	}

}