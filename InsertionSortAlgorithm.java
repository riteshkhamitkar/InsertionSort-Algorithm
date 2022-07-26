.................
Main.java
.................
class Main {
    public static void main(String[] args){
        int array[] = {2,6,4,5,1,8,9,0};
        InsertionSort.insertionSort(array);
        InsertionSort.printArray(array);
          
    }
}
..................................
InsertionSort.java
..................................
public class InsertionSort {

    static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length ; i++){
            int temp = arr[i] , j=i;
            while(j >0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

     
  
      public static void printArray(int []array) {
          for (int i = 0; i < array.length; i++) {
              System.out.print(array[i]+"  ");
          }
      }
  
  }
  
...........
//////finish///////////
