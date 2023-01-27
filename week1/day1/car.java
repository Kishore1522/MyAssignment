package week1.day1;

public class car {
	public void applyGear() {
		System.out.println("apply gear");
	}
	public void applyHandBrake() {
		System.out.println("apply handbrake");
	}
	public void switchOnAc() {
		System.out.println("On Ac");
	}
	public void applyClutch() {
		System.out.println("Apply Clutch"); 
	}
public static void main(String[] args) {
	car object=new car();
	object.applyGear();
	object.applyHandBrake();
	object.switchOnAc();
	object.applyClutch();
}
}
