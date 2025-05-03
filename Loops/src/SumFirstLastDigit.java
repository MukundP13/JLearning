public class SumFirstLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }public static int sumFirstAndLastDigit(int n){
        if(n<0){
            return -1;
        }
        int sum =n%10;
        while(n>9){
            n/=10;
        }sum+=n;
        return sum;
    }
}
