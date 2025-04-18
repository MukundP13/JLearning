public class methodOverloading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(10));
        System.out.println(convertToCentimeters(5,4));
    }
    public static double convertToCentimeters(int i){
        return i*2.54;
    }
    public static double convertToCentimeters(int f,int i){
        return convertToCentimeters((f*12)+i);
    }
}
