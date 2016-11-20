package ex;
import java.util.Scanner;


/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        float data[]=new float [n];
        int sum=0;
        for(int i=0;i<n;i++){
        	 data[i]=scn.nextInt();
        	 sum+=data[i];
        }sum/=n;
        System.out.println(var(sum,data)/n);
        	}
public static float var(float sum,float data[]){
	float total=0;
	for(int i=0;i<data.length;i++){
		total+=(sum-data[i])*(sum-data[i]);
	}return sum;
}
}
