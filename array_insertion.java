package com.company;

import java.util.Scanner;

public class Codechefe {


    public static void main(String[] args) {
        int i,num,pos,size;
        int a[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:: ");
        size=sc.nextInt();
        System.out.println("Enter the array elements:: ");
        for(i=0;i<size;i++){
            System.out.print("\n Enter the array"+i+"Elements ");
            a[i]=sc.nextInt();
        }
        System.out.println("stored the data of array");
        for(i=0;i<size;i++){
            System.out.print(" "+a[i]+" ");
        }
        System.out.println();
        System.out.print("enter the position to inseart:: ");
        pos=sc.nextInt();
        if(pos>size){
            System.out.println("Out of range");
        }else{
            System.out.print("enter the number to be insearted ");
            num=sc.nextInt();
            --pos;
            for(i=size;i>=pos;i--){
                a[i+1]=a[i];
            }
            a[pos]=num;
            System.out.print("New array is:: ");
            for(i=0;i<size+1;i++){
                System.out.print(" "+a[i]+" ");
            }
        }

        System.out.println();

    }


}




