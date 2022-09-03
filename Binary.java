public class Binary{
    static int binarySearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(target > arr[mid]) {
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,18,74,79};
        
        // for(int i=0; i<arr.length; i++) 
        // {
        //     int repeat=0;

        //     for(int j=0; j<arr.length-1-i; j++) 
        //     {
        //         if(arr[j] > arr[j+1]);

        //         int temp = arr[j];
        //         arr[j] = arr[j+1];
        //         arr[j+1] = temp ;
        //         repeat = 1;
        //     }
        //     if(repeat==0){
        //         break;
        //     }
            
        // }
        // for(int i=0; i<arr.length; i++)
        //      {
        //     System.out.print(arr[i]+" ");
        //      }

             int target = 18;
             System.out.println(binarySearch(arr, target));
    }
    
    
    }
