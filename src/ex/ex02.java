package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		float data[]=new float[n];
		float sum=0;
		float all=0;
		for(int i=0;i<n;i++){
			 data[i]=scn.nextInt();
        	 sum+=data[i];
		}sum/=n;
		for(int i=0;i<n;i++){
			all+= var(sum,data[i]);
		}        System.out.println(std(all/n));}
	public static float var(float sum,float data){
		float total=0;
		total+=(sum-data)*(sum-data);
		return total;}
		public static double std(double fin){
			fin=Math.pow(fin,1/2);return fin;
		}
		
		
	}


