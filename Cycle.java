import java.util.Arrays;

class Cycle{
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {3,5,4,1,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}