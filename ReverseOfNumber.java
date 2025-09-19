public class ReverseOfNumber {
    public static void main(String[] args) {
        int n=12345;
        int rev=0; // Variable to store reversed number

        // Loop runs until all digits of n are processed
        while(n>0){
            rev=rev*10+n%10;  // Extract last digit and add to reversed number
            n /= 10;         // Remove last digit from n
        }
        System.out.println("Reverse of number is "+rev);
    }
}
