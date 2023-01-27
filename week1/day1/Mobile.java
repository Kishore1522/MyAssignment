package week1.day1;

public class Mobile {
	public void sendMessege() {
		System.out.println("Send Messege");
	}
	public void capturePhotos() {
		System.out.println("Capture Photos");
	}
	public void shareDocuments() {
		System.out.println("Share Documents");
	}
public static void main(String[] args) {
	Mobile object=new Mobile();
	object.sendMessege();
	object.capturePhotos();
	object.shareDocuments();
}
}
