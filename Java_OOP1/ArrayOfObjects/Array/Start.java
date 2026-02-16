import java.util.Scanner;
public class Start{
	public static void main(String []args){
		Scanner scNum = new Scanner(System.in);
		//Scanner scStr = new Scanner(System.in);
		int size = scNum.nextInt();
		double ages[] = new double[size];
		
		System.out.println("Provide Ages");
		for(int i=0;i<ages.length;i++){
			ages[i] = scNum.nextDouble();
		}
		
		System.out.println("Ages Are");
		for(int i=0;i<ages.length;i++){
			System.out.println(ages[i]);
		}
		
		double max = ages[0];
		for(int i=1;i<ages.length;i++){
			if(max<ages[i]){
				max = ages[i];
			}
		}
		System.out.println("Max Age is: "+max);
		
	}
}