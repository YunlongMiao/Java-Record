public abstract class AbsClass{
	public abstract double count(double a,double b); 
}
class T_Class extends to AbsClass{
	double length; 
	double high;
	public double count(length,high){
		double x=(length*high)/2;
		System.out.println("���������:"+x);
	}
}


class R_Class extends to AbsClass{
	double Long; 
	double width;
	public double count(Long,width){
		double x=(Long*width);
		System.out.println("�������:"+x);
	}
}

class Three{
	public static void main(String args[]){
		T_Class t_Class=new T_Class("Java",1001,39.8);
		
	}
}