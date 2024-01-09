package duplicate;

/*
Учитывая целочисленный массив фиксированной длины arr,
продублируйте каждое вхождение нуля, сдвигая оставшиеся элементы вправо.
Ограничения:

1 <= arr.length <= 10^4
0 <= arr[i] <= 9
 */
class Solution { //Класс, который содержит метод, реализующий алогритм
    public void duplicateZeros(int[] arr) {//Метод, реализующий алгоритм
    for (int i=0; i< arr.length; i++){
        if (arr[i]==0){
            for(short j = (short) (arr.length-1); j>i; j--) {
                arr[j] = arr[j - 1];
            }
            i++;
        }
    }
    }
}

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr= {1,0,0,4,5,6,0};
        Solution solution=new Solution();
        solution.duplicateZeros(arr);
    }
}
