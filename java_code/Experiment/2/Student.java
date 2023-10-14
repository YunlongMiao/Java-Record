class Student{
	String name;
	double english,math;
	Student(String a,double b,double c){
		name=a;
		english=b;
		math=c;
	}
	void output(){			//方法1
		System.out.println("name:"+name);
	}
	void total(){			//方法2
		double sum=english+math;
		System.out.println("总成绩:"+sum);
	}
}