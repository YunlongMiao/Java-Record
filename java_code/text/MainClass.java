class Book{
	String b_name;
	int b_number;
	int b_price;
	Book(String a,int b,int c){
		b_name=a;
		b_number=b;
		b_price=c;
	}
	void outPut(){
		System.out.print("ͼ������: \��");
		System.out.print(b_name);
		System.out.print("\��,ͼ���ţ�\��"+b_number+"\��,");
		System.out.print("ͼ��۸�"+b_price);
	}

}
class MainClass{
	public static void main(String args[]){
		Book book=new Book("Java",1001,39.8);
		book.outPut();
	}
}