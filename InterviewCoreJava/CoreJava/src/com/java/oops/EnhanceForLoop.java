package com.java.oops;

class X
{
	
}
public class EnhanceForLoop {

	public static void main(String[] args) {
		X obj = new X();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("************************");
		float t[]= new float[3];
		int x[] = {10,20,30,40,50};
		int []y = {10,20,30};
		int z[] = new int[3];
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(t);
		//System.out.println(z.toString());
		int []m= new int[3] ;
		int k[]=new int[]{1,2,3};
		/*for(int i = 0; i<x.length ; i++){
			System.out.println(x[i]);
		}*/
		for(int m1 : x){
			System.out.println(m1);
		}
		/*int n[][]={{1,2,3},{4,5,6}};
		for(int i = 0; i<2; i++){
			for(int j = 0; j<3; j++ ){
				System.out.println(n[i][j]);
			}
		}*/
		//int n[][]= new int[3][3];
		//int [][]n= new int[3][3];
		//int []n[]= new int[3][3];
		int n[][]= new int[3][];
		n[0]= new int[10];
		n[1]= new int[20];
		n[2]= new int[30];
		for(int g[]:n){
			for(int h : g){
				System.out.println(h);
			}
		}
	}

}
