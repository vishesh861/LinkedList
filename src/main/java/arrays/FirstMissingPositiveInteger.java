package arrays;

public class FirstMissingPositiveInteger {

    public int first(int[] arr) {

        for(int i=0; i<arr.length; i++){
            while(arr[i]>=1 && arr[i]<arr.length+1 && arr[i]!=arr[arr[i]-1]){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return arr.length + 1;
    }
}
