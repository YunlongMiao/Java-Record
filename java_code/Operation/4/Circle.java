public class Circle{
	final double PI=3.1415;
	double R;
	void getR(double s){
		System.out.println("������Բ�İ뾶");
		R=s;
	}
	
	void perimeter(){
		System.out.println("�ܳ���"+2*PI*R);
	}
	double area(){
		double arrea=PI*R*R;
		System.out.println("�����"+arrea);
		return arrea;
	}
	
}