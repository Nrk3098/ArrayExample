package ArrayExample;
import java.util.*;
public class FibanacciSeries {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter length:");
        n=sc.nextInt();
        int[] num =new int[n];
        num[0]=0;
        num[1]=1;
        for(int i=2;i<n;i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        System.out.println("The nth fibonacci series:>" );
        for(int i=0;i<n;i++){
            System.out.print(num[i]+ " ");
        }


        }

    }

