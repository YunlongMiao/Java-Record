class Cylinder extends Circle{
	double H;
	void getR(double s,double k){
		System.out.println("Բ�İ뾶��Բ���ĸߣ�");
		R=s;
		H=k;
		System.out.println(R+","+H);
	}
	void getVolume(){
		double area=area();
		double volume=area*H;
		System.out.println("�����"+volume);
	}
	void show(double a,double b){
		getR(a,b);
		perimeter();
		area();
		getVolume();
	}
	
}