package week1.day1;

public class Car {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
		
	}
		public void driveCar() {
			System.out.println("Start car driving");
		}
        public void applyBrake() {
        	System.out.println("Apply Brake for the first time");
		}
        public void soundHorn() {
        	System.out.println("Click on soundhorn");
}
        public void isPuncture() {
        	System.out.println("Car tyre is puncture");
}
	}


