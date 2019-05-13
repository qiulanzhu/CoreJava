/**
 * P186
 *与String类似，所有的包装类都是final类，即不可变类
 * 参考：
 */

public class Box {
    private static void trible(Integer x){  //x是拷贝的引用
        x = x * 3; // 拷贝的引用指向新的对象
    }

    public static void main(String[] args){
        Integer n = 10;

        Box.trible(n);

        System.out.println(n);
    }
}
