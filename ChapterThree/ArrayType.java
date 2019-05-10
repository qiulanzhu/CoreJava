import java.util.Arrays;

public class ArrayType {
    public static void main(String[] args){
        int[] arr = new int[100];

        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }

        // 遍历
        for(int i : arr){
            System.out.println(i);
        }

        // 打印对象，输入[I@1540e19d
        System.out.println(arr);

        // 输出逗号分隔的所有内容
        System.out.println(Arrays.toString(arr));

        // 带数据初始化
        int[] arrTest = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrTest));

        // 数组引用
        int[] arrOne = {1, 2, 3, 4, 5};
        int[] arrTwo = arrOne;
        arrTwo[0] = 111;
        System.out.println(Arrays.toString(arrOne));
        System.out.println(Arrays.toString(arrTwo));

        // 数组拷贝
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        arr2[0] = 111;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //数据扩容
        int[] arrFirst = {1, 2, 3, 4, 5};
        int[] arrSecond = Arrays.copyOf(arrFirst, 2 * arrFirst.length);
        System.out.println(Arrays.toString(arrSecond));
    }
}
