import java.util.Arrays;
import java.util.Scanner;

public class ProBuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of people");
        int a = sc.nextInt();
        System.out.println("enter the number of buses");
        int b = sc.nextInt();
        int c;
        int[] arr;
        int k=0;
        int sum=0;
        arr= new int[b];
        for(int i=1;i<=b;i++){
            
            while(k<i){
                arr[k]=fib(i);
                k++;
            }

        }
        for (int i = 0;i<b;i++){
             sum+=arr[i];
            
        }
        System.out.println("the total capacity of "+b+" buses is "+sum);
        
         if(sum==a){
            System.out.println(Arrays.toString(arr));
            System.out.println(sum);

         }
         else if(a<sum){
            c=sum-a;
            arr[b-1]=arr[b-1]-c;
            if(arr[b-1]<0){
                arr[b-2]=arr[b-2]+arr[b-1];
                arr[b-1]=0;
                System.out.println(Arrays.toString(arr));
            }else{
                System.out.println(Arrays.toString(arr));
                System.out.println("there are still "+c+" seats left in last bus");
            }
            
            

         }else if (a>sum){
            System.out.println("please send more buses to pick up the passengers ");
         }
         
        
         
        
        } 
        public static int fib(int b){
            int c=0,d=1;
            int sum=0;
            if (b==1){
                return 1;
            }else if(b>1){
                for(int i = 0;i<b;i++){
                    sum = c+d;
                    c=d;
                    d=sum;
                    
                }
        }
    
                 return sum;
        
    }
    

    }
    