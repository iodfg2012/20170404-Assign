public class Cylinder{
	
	private double height;

	public Cylinder(Circle cir ,double height) {
		this.height = height;
		
	}
	
	public double getVolume(Circle cir, double height){
		return cir.getArea() * height;
	}
	
	public static void main(String[] args) {
		Circle cir = new Circle(2.8);
		Cylinder cd = new Cylinder(cir, 5.6);
		System.out.println("원 기둥 부피 : " + cd.getVolume(cir, 5.6));
	
	}
	
}
