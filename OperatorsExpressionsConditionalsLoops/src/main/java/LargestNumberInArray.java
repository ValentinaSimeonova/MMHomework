public class LargestNumberInArray {
    public static void main(String[] args) {
        int arr[]={8,5,20,13};

        int result = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(result < arr[i]) {
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
