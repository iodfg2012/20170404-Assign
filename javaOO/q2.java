public class Student {
	
	private String major;
	private int number;
	
	public String getMajor(){
		return major;
	}
	
	public int getNum(){
		return number;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	
	public void setNum(int number){
		this.number = number;
	}


	public static void main(String[] args) {
		Student Info = new Student();
		Info.setMajor("컴퓨터정보공학과");
		Info.setNum(20141644);
		
		System.out.println("학과 : "+Info.getMajor());
		System.out.println("학번 : "+Info.getNum());

	}

}
