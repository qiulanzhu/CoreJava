package Inherit;

public class InheritTest {
    public static void main(String[] args){
        Object o = new Manager("qiuyi", 1000000, 2018, 12, 14);

        System.out.println(o.getClass().getName());
    }
}
