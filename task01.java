/**
 * Реализовать алгоритм сортировки слиянием
 */

public class task01 {
    
    private static String arrToStr(int[] arr) {
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for(int i = 0; i < arr.length; i++){
            if(i > 0){
                str.append(", ");
            }
            str.append(arr[i]);
        }
        str.append(" ]");
        return str.toString();
        
    }

    private static int[] mergSort(int[] arr) {
        int[] var;
        int[] carrArr = arr;
        int[] carrDupl = new int[arr.length];

        int size = 1;
        while(size < arr.length){
            for(int i = 0; i < arr.length; i += 2 * size){
                merg(carrArr, i, carrArr, i+size, carrDupl, i, size);
            }
            var = carrArr;
            carrArr = carrDupl;
            carrDupl = var;
            
            size *= 2;

            System.out.println(arrToStr(carrArr));
        }

        return carrArr;

    }

    private static void merg(int[] carrArr1, int i1Start,  int[] carrArr2, int i2Start,
                             int[] carrDupl, int iDuplStart, int size) {
        int index1 = i1Start;
        int index2 = i2Start;
        
        int arr1End = Math.min(i1Start + size, carrArr1.length);
        int arr2End = Math.min(i2Start + size, carrArr2.length);

        if(i1Start + size > carrArr1.length){
            for(int i = i1Start; i < arr1End; i++){
                carrDupl[i] = carrArr1[i];
            }
            return;
        }
        
        int interCount = arr1End - i1Start + arr2End - i2Start;
        for(int j = iDuplStart; j < iDuplStart + interCount; j++){
            if(index1 < arr1End && (index2 >= arr2End || carrArr1[index1] < carrArr2[index2])){
                carrDupl[j] = carrArr1[index1];
                index1++;
            }
            else{
                carrDupl[j] = carrArr2[index2];
                index2++;
            }
        }    
    }


    public static void main(String[] args) {
        int[] myArr = {15, 78, 79, 63, 58, 44, 40, 36, 29, 18, 13, 9, 5, 2};
        System.out.println(arrToStr(myArr));
        myArr = mergSort(myArr);
        System.out.println(arrToStr(myArr));
    }
}
    
