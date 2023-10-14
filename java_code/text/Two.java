class Vehicle{
	int maxSpeed;
	int weight;
	Vehicle(int a,int b){
		maxSpeed=a;
		weight=b;
	}
}
class Car extends to Vehicle{
	int seatNum;
	Car(int a,int b,int c){
		maxSpeed=a;
		weight=b;
		seatNum=c;
	}
	public void outPut(){
		System.out.println("最高时速:"+maxSpeed);
		System.out.println("载重量:"+weight);
		System.out.println("座位数:"+seatNum);		
	}
}}
class Two{
	public static void main(String args[]){
		Car car=new Car(180,800,5);
		car.outPut();
	}
}