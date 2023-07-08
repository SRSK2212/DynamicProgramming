import java.util.*;
public class DynamicAndStaticArrays{
    public void resize(int[] arr){
        System.out.println("Static Array Length Before Resizing: " + arr.length);
        // creating new array with capacity twice of original array
        int newArr[] = new int[2*arr.length];
        // copying elements from original array to new array
        for(int i=0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        // assigning the new array to original array
        arr = newArr;
        System.out.println("Static Array Length After Resizing: " + arr.length );
    }
    public static void main(String[] args){
        // static array 
        int statArr[] = new int[4];
        statArr[0]=2; statArr[1]=2; statArr[2]=1; statArr[3]=2;
        System.out.println("Static Array Size: " + statArr.length);
        for(int i=0; i<statArr.length; i++){
            System.out.println("Static Array statArra[" + i + "] = " + statArr[i]);
        }
        
        // dynamic array
        ArrayList<Integer> dynArr = new ArrayList<>();
        System.out.println("Dynamic Array Size Before Adding Elements: " + dynArr.size());
        dynArr.add(2);
        dynArr.add(2);
        dynArr.add(1);
        dynArr.add(2);
        System.out.println("Dynamic Array Size After Adding Elements: " + dynArr.size());
        System.out.println("Dynamic Array : " + dynArr);
        dynArr.remove(0);
        dynArr.remove(1);
        System.out.println("Dynamic Array Size After Removing Elements: " + dynArr.size());
        System.out.println("Dynamic Array After Removing Elements: " + dynArr);

        // static array resizing 
        DynamicAndStaticArrays obj = new DynamicAndStaticArrays();
        obj.resize(statArr);
    }
}
