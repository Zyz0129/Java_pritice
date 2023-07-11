package MathDemo;

import java.math.BigInteger;

public class MathDemo1 {
    public static void main(String[] args) {
//        int a=-12;
//        int ans;
//        ans= Math.abs(a);
//        a=1;
//        int b=2;
//        int max=Math.max(a,b);
//        int min= Math.min(a,b);
//        System.out.println(ans);
//        System.out.println(max);
//        System.out.println(min);
        BigInteger bi1=new BigInteger("100000000000000000000000000");
        BigInteger bi2=new BigInteger("999999999999999999999999999");
        BigInteger res=bi1.multiply(bi2);
        res=bi2.divide(bi1);
        System.out.println(res);
    }
}
