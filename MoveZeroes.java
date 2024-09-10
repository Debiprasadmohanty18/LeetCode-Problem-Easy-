import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) 
	{
		int[] arr = {0,1,0,3,12};
		moveZeroes(arr);
	}
	
	public static void moveZeroes(int[] arr)
	{
		int j = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				continue;
			}
			else 
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}	
}
