public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(125));
        System.out.println(isPalindromeL(1221));
        System.out.println(isPalindromeL(125));
    }
    public static boolean isPalindrome(int n){
        int reverse=0;
        int t=n;
        while(t!=0){
            reverse *= 10;
            reverse+=t%10;
            t/=10;
        }
        return (reverse==n);
    }
    public static boolean isPalindromeL(int n){
        int reverse=0;
        for(int i=n;i!=0;i/=10){
            reverse=(reverse*10)+(i%10);
        }
        return (reverse==n);
    }

}
