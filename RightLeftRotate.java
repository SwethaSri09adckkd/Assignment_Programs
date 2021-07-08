class RightLeftRotate 
{    
 public static void main(String[] args) 
 {          
        int [] arr = new int [] {10, 22, 43, 84, 95};          
        int r = 3,l=3;                         
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }      
        System.out.println();
        System.out.println("Array after right rotation: ");           
        for(int i = 0; i < r; i++){    
            int j, last;                   
            last = arr[arr.length-1];                
            for(j = arr.length-1; j > 0; j--)
            {                      
                arr[j] = arr[j-1];    
            }                    
            arr[0] = last;                             
            for(int k = 0; k< arr.length; k++)
            {    
                System.out.print(arr[k] + " ");    
            }  
            System.out.println();
        }          
        int [] arr1 = new int [] {11, 82, 63, 54, 65};
        System.out.println(); 
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i < l; i++)
        {  
            int j, first;             
            first = arr1[0];  
            for(j = 0; j < arr1.length-1; j++)
            {                 
                arr1[j] = arr1[j+1];  
            }              
            arr1[j] = first;           
        for(int k = 0; k< arr1.length; k++)
        {  
            System.out.print(arr1[k] + " ");  
        }
        System.out.println(); 
        }
    }    
}