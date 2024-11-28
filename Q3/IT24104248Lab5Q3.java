import java.util.Scanner;
public class IT24104248Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your start date : ");
        int start = scanner.nextInt();

        System.out.println("Enter your end number : ");
        int end = scanner.nextInt();

        if (start<1 || start<31)
        {System.out.println("Error");}

        if (end<1 || end<31)
        {System.out.println("Error : ");}

        int total_days=end-start;
        System.out.println("No of days reserved = " +total_days);

        if(total_days<3){
            int pay1=(total_days*48000);
            System.out.println("Your Amount is = "+pay1);

        }
        else if (total_days>=3 && total_days<=4) {
            double pay2 = (total_days * 48000) * 0.9;
            System.out.println("our amount is = "+pay2);

        }
        else if(total_days >= 5){
            double pay3=(total_days*48000)*0.8;
            System.out.println("our amount is = "+pay3);
        }
    }
}