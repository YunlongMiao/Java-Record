public class J extends K{
    double m,c,e;
    String name;
    int num;
    public J() {
    }
    J(double m,double c,double e){
        this.m=m;
        this.c=c;
        this.e=e;
    }
    public double count(){
        return (m+c+e)/3;
    }
}
