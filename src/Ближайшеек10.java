public class Ближайшеек10 {
    public static void main(String[] args) {
        double m,n,a,b,d;
        m = 7.2;
        n = 15;
        d = 10;
        a = Math.abs(m-d);
        b = Math.abs(n-d);
        if(a<b) {
            System.out.println(m+" Ближнее");
        } else if(a>b) {
            System.out.println(n+" Ближнее");
        } else {
            System.out.println("Расстояние от "+m+" до 10 - расстояние от"+n+" до 10");
        }
    }
}
