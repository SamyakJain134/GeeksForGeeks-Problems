package MatrixArray;

public class RowWithMax1s {
	public static int max1s(int arr[][])
	{
		int r=arr.length;
		int c=arr[0].length;
		int answerrow=-1;
		int max1ones=0;
		for(int i=0;i<r;i++)
		{
			int rowmeseone=0;
			for(int j=c-1;j>=0;j--)
			{
				if(arr[i][j]==1)
				{
					rowmeseone++;
				}
				else
				{
					break;
				}
			}
			if(rowmeseone>max1ones)
			{
				max1ones=rowmeseone;
				answerrow=i;
			}
		}
		return answerrow;
	}
	/////////////////////////////////////////////
	
	/////////////////////////////////////////////
	
	//Efficient 
	public static  int rowWithMax1s(int arr[][], int n, int m) 
	{
        int ansrow=-1;
        int j=arr[0].length-1;
        while(j>=0 && arr[0][j]==1)
        {
        	j--;
        }
        for(int i=1;i<arr.length;i++)
        {
        	while(j>=0 && arr[i][j]==1)
        	{
        		j--;
        		ansrow=i;
        	}
        }
        return ansrow;
        
    }
	public static  int rowWithMax1ss(int arr[][]) 
	{
        int ansrow=-1;
        int j=arr[0].length-1;
        for(int i=0;i<arr.length;i++)
        {
        	while(j>=0 && arr[i][j]==1)
        	{
        		j--;
        		ansrow=i;
        	}
        }
        return ansrow;
        
    }
	public static void main(String args[])
	{
	int matrix[][] = {{0, 1, 1, 1},
	           {0, 0, 1, 1},
	           {1, 1, 1, 1},
	           {0, 0, 0, 0}};
	System.out.println(max1s(matrix));
	}


}
