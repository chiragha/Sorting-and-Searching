
package algorithms;

public class InsertionSort {
    
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
    
    public void sort(int[] arr){
        int n = arr.length;   // total length 6
        for(int i=1; i<n; i++){// start from [5]
            int temp = arr[i]; // [5 store in temp]
            int j = i-1; // sorted value
            
            
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j]; //shifting larger elements to temp by 1 position
                j = j-1;
                
            }
            arr[j+1] = temp;
            
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {6,5,7,9,10,8,1};
        InsertionSort is = new InsertionSort();
        is.printArray(arr);
        is.sort(arr);
        is.printArray(arr);
        
        
    }
    
}
