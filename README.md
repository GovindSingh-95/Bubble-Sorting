# Bubble-Sorting
<h2>what is it?</h2>
<p>
  Bubble sort is a simple sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.<br>
  <br>Have Time complexity of O(n^2) for worst and average cases,but for best case it it O(n).Where n is the number of elements in the Array.<br>
  <br>Maximum number of passes here is n(n-1)/2 ,where n is the number of elements in the Array.<br>
</p>
<h2>Algorithm</h2>
<p>
  <br>Here we have to Traverse in the Array atmost of n-1 times for swapping the elements.So consider a for loop varaible int round going from 0 to n-1 or vice versa.<br>
  <br>Now, after each round largest element in the array will be places in the last,irrespective of it's position.So,after each round we need to reduce the array size by one so as to avoid unnecessary checking.<br>
  <br>So,to fix this before outer loop declare a variable int limit=n-1, and after each inner loop pass decrease it's value by one.<br>
  <br>Now for inner loop, int i have to go from 0 to limit-1. Inside it make an if statment of if(arr[i]>arr[i+1]), then swap the elements.As limit value is decreasing one by one So,The inner loop have to travel less<br>
  <br>This is whole algorithm,but we have a loop hole in it.What if the given Array is already sorted.We need to make sure that the loop doesn't go for unnecessay rounds.<br>
  <br>For this after each inner loop round check whether the Array is sorted or not.After inner loop make boolean flag=true,and Travel in the loop and check if(arr[i]>arr[i+1]).If it's there make flag=false and break the checking loop.<br>
  <br>After this check if(flag==true) if it's there break the round loop,cuz now Array is sorted.<br>
</p>

