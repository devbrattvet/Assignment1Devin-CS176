
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {17 ,-1, -1 ,-1, -1 ,-1, -1 ,-1, -1 ,29};
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			array[i]=array[i]+1;
			
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println();
		
		System.out.println(java.util.Arrays.toString(array));
	}

}
