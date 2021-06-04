package PractiseQuestions;

public class MissingElementInAnArray {
//Given an array of size N-1 such that it 
	//only contains distinct integers in the range of 1 to N. 
	//Find the missing element.
	int MissingNumber(int array[], int n) {
        int sum = (n*(n+1))/2;
        int sumOfArray=0;
        for(int i=0;i<array.length;i++)
        {
            sumOfArray=sumOfArray+array[i];
        }
        return sum-sumOfArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
