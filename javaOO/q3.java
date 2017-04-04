public class Cylinder {
	
	public double radius;
	public static double PI = 3.141592;
	public double h;
	
	public Cylinder(double radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
	
	public double getVolume(){
		return getArea() * 5.6;
	}
	
	public static void main(String[] args) {
		Cylinder cd = new Cylinder(2.8);
		System.out.println("원기둥 부피 : "+ cd.getVolume());

	}

}
