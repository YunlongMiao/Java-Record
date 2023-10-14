 class Teacher extends Person{
    int Tno;
    String Office;
    void show(String a,int b,int c,String d){
        Name=a;
        Age=b;
        Tno=c;
        Office=d;
        System.out.println("姓名："+Name);
        System.out.println("年龄："+Age);
        System.out.println("教师号："+Tno);
        System.out.println("职称："+Office);
    }
}
