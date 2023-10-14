public class H extends K{
    double area,price;
    H(double area,double price){
        this.area=area;
        this.price=price;
    }
    public double total(){
        return area*price;
    }
}
