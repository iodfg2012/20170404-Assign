public class Student {
	
	String major;
	int number;


	public static void main(String[] args) {
		Student Info = new Student();
		Info.major = "컴퓨터정보공학과";
		Info.number = 20141644;
		
		System.out.println("학과 : "+Info.major);
		System.out.println("학번 : "+Info.number);

	}

}
