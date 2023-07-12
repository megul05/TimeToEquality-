package TimeToEquality;

public class TimeToEquality {

	public static int minimumTime (int array[]){
        int maxElement = Integer.MIN_VALUE;
        for (int elements : array){
            maxElement = Math.max(maxElement, elements);
        }
        int time = 0;
        for (int elements : array){
            time += (maxElement - elements);
        }
        return time;
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int max =Integer.MIN_VALUE;
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
			if(max < arr[i])
			{
				max = arr[i];
			}
		}	
        System.out.println(minimumTime(arr));

	}

}
