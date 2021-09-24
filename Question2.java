import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
		double[] array=new double[10];
		array[0]=in.nextDouble();
		array[1]=in.nextDouble();
		array[2]=in.nextDouble();
		array[3]=in.nextDouble();
		array[4]=in.nextDouble();
		array[5]=in.nextDouble();
		array[6]=in.nextDouble();
		array[7]=in.nextDouble();
		array[8]=in.nextDouble();
		array[9]=in.nextDouble();
		
		System.out.println("The numbers entered at even indices are: ");
		System.out.print(array[2]+", ");
		System.out.print(array[4]+", ");
		System.out.print(array[6]+", ");
		System.out.print(array[8]);
		System.out.println();
		
		System.out.print("Even numbers entered: ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.print(array[i]+", ");
			}
		}
		System.out.println();
		
		System.out.print("Odd numbers entered: ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.print(array[i]+", ");
			}
		}
		System.out.println();

		System.out.println("Numbers entered, in reverse order: ");
		System.out.print(array[9]+", ");
		System.out.print(array[8]+", ");
		System.out.print(array[7]+", ");
		System.out.print(array[6]+", ");
		System.out.print(array[5]+", ");
		System.out.print(array[4]+", ");
		System.out.print(array[3]+", ");
		System.out.print(array[2]+", ");
		System.out.print(array[1]+", ");
		System.out.print(array[0]);
		System.out.println();
		
		System.out.println("The first, fifth, and last number entered are: ");
		System.out.print(array[0]+", ");
		System.out.print(array[4]+", ");
		System.out.print(array[9]);
		System.out.println();
		
		double largest=array[0];
		double smallest=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>largest)
				largest=array[i];
			if(array[i]<smallest)
				smallest=array[i];
		}
		System.out.println("The smallest and largest numbers are: "+smallest +" and "+largest );
		
		double sum=0;
		for(int i=0;i<array.length;i++)
		{
			if((i%2)!=1)
			{
				sum+=array[i];
	        }
			else
			{
				sum-=array[i];
			}
		}
		System.out.println("The alternating sum is: "+sum);
		
		in.close();
	}

}
