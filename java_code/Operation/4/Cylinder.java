class Cylinder extends Circle{
	double H;
	void getR(double s,double k){
		System.out.println("圆的半径和圆柱的高：");
		R=s;
		H=k;
		System.out.println(R+","+H);
	}
	void getVolume(){
		double area=area();
		double volume=area*H;
		System.out.println("体积："+volume);
	}
	void show(double a,double b){
		getR(a,b);
		perimeter();
		area();
		getVolume();
	}
	
}