package RegexDemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        //判断QQ号是否符合规则
        //1.不能以0开头
        //2.长度6-10位
        //3.必须是纯数字
        //String qq="208721789";
       // System.out.println(qq.matches("[1-9]\\d{5,9}"));
        //System.out.println("a".matches("[a-d[m-p]]"));
        String regex2="0[1-9]\\d{1,2}[-]\\d{8}";
        String num="0451-55555555";
        System.out.println(num.matches(regex2));
        String regex3="";
    }
}
