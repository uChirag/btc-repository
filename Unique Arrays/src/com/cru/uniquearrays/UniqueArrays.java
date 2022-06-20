package com.cru.uniquearrays;

import java.util.Scanner;

public class UniqueArrays {
	
	public static void check(int a[],int l)
	{
	    int count=0;
	    for(int i = 0; i < l; i++) {  
	    for(int j = i + 1; j < l; j++) {  
	        if(a[i] == a[j])  
	        {
	            count++;
	        }
	    }  
	}  
	if(count>=1)
	{
	    System.out.println("false");
	}
	else
	{
	    System.out.println("true");   
	}   
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter size : ");
	    int num=scan.nextInt();
	    int arr[]=new int[num];
	    System.out.println("Enter the elements into array : ");
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=scan.nextInt();
	    }
	    check(arr,num);  
	}
}

