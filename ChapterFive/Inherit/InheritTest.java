package Inherit;

/**
 * P169
 * 那使用instanceof关键字和直接比较Class对象有何不同呢？这两种方法不都可以判断对象是不是特定类型么？
 * 事实上，instanceof关键词判断的是该对象是否为这个类或超类的实例，而如果直接比较Class对象，就不包含继承关系，只为是或不是这个对象
 */
public class InheritTest {
    public static void main(String[] args){
        Object e = new Employee("qiuyi", 1000000, 2018, 12, 14);
        Object m = new Manager("qiuyi", 1000000, 2018, 12, 14);

        System.out.println(e.getClass().getName());
        System.out.println(m.getClass().getName());

        System.out.println(e instanceof Manager);
        System.out.println(e instanceof Employee);

        System.out.println(m instanceof Manager);
        System.out.println(m instanceof Employee);




    }
}
