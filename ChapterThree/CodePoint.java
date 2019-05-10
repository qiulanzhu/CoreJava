/**
 * P49
 * 码点与代码单元
 * 参考：https://www.jianshu.com/p/ad4bff4d9fa3
 */
public class CodePoint {
    public static void main(String[] args){
        String str = "你s\uD83D\uDC66";

        System.out.println(str);

        System.out.println(str.length());   // 字符串长度
        System.out.println(str.codePointCount(0, str.length()));    // 码点个数
        System.out.println(str.codePointCount(2, 4));   //  代码单元=2的码点

        // 遍历，方法1
        for(int i=0; i<str.length();){
            int j = i;
            int codePoint = str.codePointAt(i);
            if(Character.isSupplementaryCodePoint(codePoint)){
                i += 2;
            }else{
                i += 1;
            }

            System.out.println(str.substring(j, i));
        }

        // 遍历，方法2
        int[] codePoints = str.codePoints().toArray();
        for(int codePoint : codePoints){
            System.out.println(Character.toChars(codePoint));
        }

    }
}
