public class EGrau2 {
    double a;
    double b;
    double c;

    public EGrau2(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcX1(double delta){
        return ((-this.b+Math.sqrt(delta))/(2*this.a));
    }
    public double calcX2(double delta){
        return ((-this.b-Math.sqrt(delta))/(2*this.a));
    }

    public double calcDelta(){
        return ((this.b*this.b)-4*this.a*this.c);
    }
}
