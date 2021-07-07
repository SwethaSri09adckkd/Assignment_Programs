import java.util.*; 
class Rotation
{
    public static void rightRotateByOne(int[] A)
    {
        int last = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            A[i + 1] = A[i];
        }
         A[0] = last;
    }
    public static void rightRotate(int[] A, int k)
    {
        for (int i = 0; i < k; i++) {
            rightRotateByOne(A);
        }
    }
 
    public static void main(String[] args)
    {
	int k, n;
 	Scanner sc = new Scanner(System.in);
  	System.out.println("Enter array size:");
  	n = sc.nextInt();
  	System.out.println("Enter no.of rotations:");
	k = sc.nextInt();
        int[] A = new int[n];
 	System.out.println("Enter array elements:");
  	for(int i = 0; i < n; i++){
	  A[i] = sc.nextInt();
  	}
        rightRotate(A, k);
        System.out.println(Arrays.toString(A));
    }
}