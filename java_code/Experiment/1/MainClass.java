public class MainClass{
	public static void main(String args[]){
		A Atx= new A();
		Atx.aa=5.3;
		Atx.bb=3.5;
		double area=Atx.getArea();
		B Btx= new B();
		Btx.cc=5.3;
		Btx.dd=3.5;
		double aera=Btx.getArea();
		System.out.println("A+B="+area+aera);
	}
}