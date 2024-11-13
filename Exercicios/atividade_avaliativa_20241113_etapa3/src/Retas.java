public class Retas {
    private Double x1;
    private Double y1;
    private Double x2;
    private Double y2;
    public static int cont;

    public Retas(Double x1, Double y1, Double x2, Double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        cont ++;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getY1() {
        return y1;
    }

    public void setY1(Double y1) {
        this.y1 = y1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public Double getY2() {
        return y2;
    }

    public void setY2(Double y2) {
        this.y2 = y2;
    }

    public double comprimento(){
        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
    }

    public String exibe(){
        return "Comprimento:"+comprimento();
    }

    public static boolean valida(double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2)
            return false;
        else
            return true;
    }
}
