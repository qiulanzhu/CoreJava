import java.awt.*;

/**
 * P172
 * 绝大多数的toString方法都遵循这样的格式java.awt.Point[x=1,y=3]（类名[属性1=value1，属性2=value2, ...]）
 */
public class ToString {
    private Point p;

    public ToString(){
        p = new Point(1, 3);
    }

    public static void main(String[] args){
        ToString toString = new ToString();
        System.out.println(toString.p);
    }
}
