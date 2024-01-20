import java.util.Scanner;
public class SUMOfDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to sum of Digits ");
        System.out.println("Please enter your Number: ");
        int num = input.nextInt();
        int sum= SumOfDigit(num);
        System.out.println("Your Sum of Digit is: "+ sum);

    }
    public static int SumOfDigit(int num){
        int sum =0;
        while (num>0){
            sum+=num %10;
            num/=10;
           sum++;
        }
        return sum;
    }
}
