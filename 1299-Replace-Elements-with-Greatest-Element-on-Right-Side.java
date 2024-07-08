class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                arr[i]=-1;
            } else {
                int max = max(arr, i + 1);
                arr[i] = max;
            }
        }
        return arr;
    }
    static int max(int[]arr, int index){
        int maxi=arr[index];
        for(int i=index+1; i<arr.length; i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
}