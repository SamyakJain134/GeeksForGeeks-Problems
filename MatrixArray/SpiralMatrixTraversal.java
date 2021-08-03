package MatrixArray;

public class SpiralMatrixTraversal {
	public static void print(int arr[][])
	{
		int top=0; //top row
		int down=arr.length-1;//bottom row
		int left=0; //left column 
		int right=arr[0].length-1; //right column
		int direction=0;

		//direction=0 -- left to right
		//direction=1 -- top  to dowm(bottom ) 
		//direction=2 -- right to left
		//direction=3 -- down  to top
		while(top<=down && left<=right)
		{
			if(direction==0)
			{
				for(int i=left;i<=right;i++)
				{
					System.out.print(arr[top][i]+" ");
				}
				top++; //pointing to row 1
			}
			else if(direction==1)
			{
				for(int i=top;i<=down;i++)
				{
					System.out.print(arr[i][right]+" ");
				}
				right--;
			}
			else if(direction==2)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(arr[down][i]+" ");
				}
				down--; //shifting row
			}
			else if(direction==3)
			{
				for(int i=down;i>=top;i--)
				{
					System.out.print(arr[i][left]+" ");
				}
				left++;
			}
			direction=(direction+1)%4;
		}
	}
	public static void printanother(int arr[][])
	{
		int top=0; //top row
		
		int down=arr.length-1;//bottom row
		int left=0; //left column 
		int right=arr[0].length-1; //right column
		int direction=0;

		//direction=0 -- left to right
		//direction=1 -- top  to dowm(bottom ) 
		//direction=2 -- right to left
		//direction=3 -- down  to top
		while(top<=down && left<=right)
		{
			if(direction==0)
			{
				for(int i=top;i<=down;i++)
				{
					System.out.print(arr[i][left]+" ");
				}
				left++; //pointing to row 1
			}
			else if(direction==1)
			{
				for(int i=left;i<=right;i++)
				{
					System.out.print(arr[down][i]+" ");
				}
				down--;
			}
			else if(direction==2)
			{
				for(int i=down;i>=top;i--)
				{
					System.out.print(arr[i][right]+" ");
				}
				right--; //shifting row
			}
			else if(direction==3)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(arr[top][i]+" ");
				}
				top++;
			}
			direction=(direction+1)%4;
		}
	}
	public static void main(String args[])
		{
		int matrix[][] = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}} ;
		printanother(matrix);
		}

}
