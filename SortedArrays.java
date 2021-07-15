import java.util.*;
class SortedArrays {
    public static void sortedMerge(int arr1[], int arr2[], int result[], int n, int m)    {
        int i = 0, j = 0, k = 0;
        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        Arrays.sort(result);
    }
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first array size:");
	int n = sc.nextInt();
	int arr1[] = new int[n];
	System.out.println("Enter first array elements:");
	for(int p = 0; p < n; p++){
		arr1[p] = sc.nextInt();
	}
	System.out.println("Enter second array size:");
	int m = sc.nextInt();
	int arr2[] = new int[m];
	System.out.println("Enter second array elements:");
        for(int p = 0; p < n; p++){
		arr2[p] = sc.nextInt();
	}
        int result[]=new int[n + m];
        sortedMerge(arr1, arr2, result, n, m);    
        System.out.print("Sorted merged list :");
        for (int i = 0; i < n + m; i++)
            System.out.print(" " + result[i]);
    }
}