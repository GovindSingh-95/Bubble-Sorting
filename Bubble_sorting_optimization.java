import java.util.*;
public class Bubble_sorting_optimization{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter your Array: ");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
        int limit=n-1;
        System.out.println("Entered Array is: ");
        print(arr);
        for(int round=0;round<n-1;round++){
            for(int i=0;i<limit;i++)
                if(arr[i]>arr[i+1]){
                    arr[i]=arr[i]+arr[i+1];
                    arr[i+1]=arr[i]-arr[i+1];
                    arr[i]=arr[i]-arr[i+1];
                }
            boolean flag=true;
            for(int i=0;i<limit;i++)
                if(arr[i]>arr[i+1]){
                    flag=false;
                    break;
                }
            limit--;
            if(flag==true)break;
        }
        System.out.println("Sorted Array is:");
        print(arr);
    }
    static void print(int[] arr){
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
    }
}
