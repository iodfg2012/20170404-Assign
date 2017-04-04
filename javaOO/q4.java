public class Cylinder{
	
	Circle cir;
	private double height;

	public Cylinder(Circle cir, double height) {
		this.cir = cir;
		this.height = height;
		
	}
	
	public double getVolume(double CircleArea, double height){
		return CircleArea * height;
	}
	
	public static void main(String[] args) {
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println("원 기둥 부피 : " + cd.getVolume(cd.cir.getArea(),cd.height));
	
	}
	
}
