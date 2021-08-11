import java.util.*;
class Bubblesortdes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Before sorting : ");
show(a);
bubble(a,n);
System.out.println();
System.out.println("After sorting : ");
show(a);
}
static void bubble(int a[],int n)
{
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1;j++)
{
if(a[j]<a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
}
static void show(int a[])
{
for(int i:a)
System.out.print(i+" ");
}
}

output:

Enter array size : 
8
Enter array elements : 
4 18 1 16 2 16 21 13
Before sorting : 
4 18 1 16 2 16 21 13 
After sorting : 
21 18 16 16 13 4 2 1 