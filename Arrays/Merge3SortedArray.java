package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Merge3SortedArray {
	static ArrayList<Integer> mergeTwo(List<Integer> A,
            List<Integer> B)
{
// Get sizes of vectors
int m = A.size();
int n = B.size();

// ArrayList for storing Result
ArrayList<Integer> D = new ArrayList<Integer>(m + n);

int i = 0, j = 0;
while (i < m && j < n) {

if (A.get(i) <= B.get(j))
D.add(A.get(i++));
else
D.add(B.get(j++));
}

// B has exhausted
while (i < m)
D.add(A.get(i++));

// A has exhausted
while (j < n)
D.add(B.get(j++));

return D;
}

// Driver code
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int p=s.nextInt();
	int q=s.nextInt();
	int r=s.nextInt();
Integer[] a = new Integer[p];
Integer[] b = new Integer[q];
Integer[] c = new Integer[r];
for(int i=0;i<p;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<q;i++)
{
	b[i]=s.nextInt();
}
for(int i=0;i<r;i++)
{
	c[i]=s.nextInt();
}
List<Integer> A = Arrays.asList(a);
List<Integer> B = Arrays.asList(b);
List<Integer> C = Arrays.asList(c);

// First Merge A and B
ArrayList<Integer> T = mergeTwo(A, B);

// Print Result after merging T with C
System.out.println(mergeTwo(T, C));
}
}
