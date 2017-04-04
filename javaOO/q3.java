public class Cylinder{
	
	private double height;
	
	public double getVolume(Circle cir){
		return cir.getArea() * height;
	}
	
	public static void main(String[] args) {
		Circle cir = new Circle(2.8);
		Cylinder cd = new Cylinder();
		cd.height = 5.6;
		System.out.println("원 기둥 부피 : " + cd.getVolume(cir));
	
	}
	
}
