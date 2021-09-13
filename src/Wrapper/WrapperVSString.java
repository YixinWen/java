package Wrapper;

/**
 * @Author YixinWen
 * @Date 2021/9/13 14:53
 * 包装类的转换
 **/
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer) -> String

        Integer i  = 100;//自动装箱
        //方式一 对 i 没有影响
        String str1 = i + "";
        //方式二
        String str2 = i.toString();
        //方式三
        String str3 = String.valueOf(i);


        //String -> Integer
        String str4 = "1234";
        Integer i1 = Integer.parseInt(str4);//自动装箱
        Integer i2 = new Integer(str4);//构造器

        System.out.println("ok...");


    }
}
