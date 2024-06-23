#include<stdio.h>
void print(int arr[],int n){
    for(int i=0;i<n;i++)
     printf("%d ",arr[i]);
    printf("\n"); 
}
void main(){
  int n;
  printf("Enter size of Array: ");
  scanf("%d",&n);
  int arr[n];
  printf("Enter Array:\n");
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
    printf("Entered Array is:\n");
    print(arr,n);
  for(int round=n-1;round>=0;round--){
    for(int i=0;i<round;i++){
        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    int flag=1;
    for(int i=0;i<n;i++)
     if(arr[i]>arr[i+1]){
        flag=0;
        break;
    }
    if(flag==1)break;
  }
  printf("Sorted Array is:\n");
    print(arr,n);    
}