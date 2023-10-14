public class MainClass{
	public static void main(String args[]){
		Teacher One=new Teacher();
		Student Two=new Student();
		One.a=12;
		One.b=236;
		double area=One.add();
		One.a=234;
		One.b=120;
		double aera=One.sub();
		System.out.println("12+236="+area);
		System.out.println("234-120="+aera);
		Two.speak();
	}
}

