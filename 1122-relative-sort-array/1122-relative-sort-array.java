class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       int[] result=new int[arr1.length];
       int index=0; 

       for(int i=0;i<arr2.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(arr2[i]==arr1[j]){
                result[index]=arr1[j];
                index++;
            }
        }
       }

       int[] remain=new int[arr1.length];
       int count=0;

       for(int i=0;i<arr1.length;i++){
        boolean found=false;
         
          for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                found=true;
                break;
            }

            
        }

        if(!found){
            remain[count]=arr1[i];
            count++;
        }
       }
       Arrays.sort(remain,0,count);
       for(int i=0;i<count;i++){
        result[index]=remain[i];
        index++;
       }

       return result;
    }
}