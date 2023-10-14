class Circle implements Geometry{
/*	double R;
	final double PI=3.1415926;
	Circle(double R){
		this.R=R;
	}
*/
	final double PI=3.1415926;
	public void getArea(double R){
		double area=PI*R*R;
		System.out.println("Ô²µÄÃæ»ý£º"+area);
	}
}