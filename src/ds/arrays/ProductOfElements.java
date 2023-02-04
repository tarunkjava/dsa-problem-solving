package ds.arrays;

public class ProductOfElements {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int resArray [] = {1,1,1,1,1};

        for (int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    resArray [i] = resArray[i] * arr[j];
                }
            }
        }

        for(int i=0;i<resArray.length;i++){
            System.out.println(resArray[i]);
        }
    }
}
