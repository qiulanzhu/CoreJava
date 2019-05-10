/**
 * P34
 * 浮点类型的舍入误差
 */
public class FloatType {

    public static void main(String[] args){
        double doubleValue = 1.0 - 0.8;
        System.out.println(doubleValue);
        System.out.println(1.0 - 0.8);

        System.out.println(String.format("1.0-0.8=%.20f", doubleValue));
        System.out.println(String.format("1.0-0.8=%.20f", 1-0.8));

        // 银行家舍入法：四舍六入五考虑，五后非零就进一，五后为零看奇偶，五前为偶应舍去，五前为奇要进一
        System.out.println(String.format("1.0-0.8=%f", doubleValue));
        System.out.println(String.format("1.0-0.8=%f", 1-0.8));

    }
}
