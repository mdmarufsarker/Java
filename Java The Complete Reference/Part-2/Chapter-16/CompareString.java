// A bubble sort for Strings.
class SortString{
    static String arr[] = {
        "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country"
    };
}

public class CompareString {
    public static void main(String[] args) {
        for(int j = 0; j < SortString.arr.length; j++){
            for(int i = j + 1; i < SortString.arr.length; i++){
                if(SortString.arr[i].compareTo(SortString.arr[j]) < 0){
                    String t = SortString.arr[j];
                    SortString.arr[j] = SortString.arr[i];
                    SortString.arr[i] = t;
                }
            }
            System.out.println(SortString.arr[j]);
        }

    }
}
