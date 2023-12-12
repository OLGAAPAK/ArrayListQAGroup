import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    int[] array = new int[] {2, 3, 5};
    ArrayList arrayList = new ArrayList(array);
        PrintArray(arrayList);
    int[] newArray = new int[] {2, 3, 4};
    arrayList.Add(newArray);
        System.out.println(" ===");
        PrintArray(arrayList);

    }
    public static void PrintArray(ArrayList arrayList){
        for(int i = 0; i < arrayList.Count; i++){
            System.out.print(arrayList.Get(i));
        }
    }
}