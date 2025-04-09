public class FCLas {
    public static void main(String[] args) {
        double d1=20.00,d2=80.00;
        double d3=(d1+d2)*100.00;
        double d4=d3%40.00;
        boolean is0=d4==0.00?true:false;
        System.out.println(is0);
        if(!is0){
            System.out.println("got some remainder");
        }
    }
}
