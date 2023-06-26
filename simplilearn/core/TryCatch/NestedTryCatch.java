package TryCatch;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr[] = {1,2,3,4};
                    System.out.println(arr[10]);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array index out of bound exception 3");
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException 2");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException 1");
        }
    }
}
