public class MergeTwoSortedArrays{
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int merged[] = new int[100];
        for(int i =0;i<5;i++){
            merged[i] = merged[i] + arr1[i];
        }
        for(int i =0;i<5;i++){
            merged[5+i] = merged[5+i] + arr2[i];
        }
        
        for(int i =0;i<4;i++){
            for(int j = i;j<4 - i;j++){
                if(merged[j] > merged[j+1]){
                    int temp = merged[j];
                    merged[j] = merged[j+1];
                    merged[j+1] = temp;
                }
            }
        }
        
        for(int i =0;i<10;i++){
            System.out.println(merged[i]);
        }
    }
}