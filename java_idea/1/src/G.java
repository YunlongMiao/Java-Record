public class G extends K{
    double maths,chinese;
    int sno;
    G(int sno,double maths,double chinese){
        this.maths=maths;
        this.chinese=chinese;
        this.sno=sno;
    }
    public double total(){
        return (maths+chinese)/2;
    }
}
