package StringDome;

public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");//���Խ�StringBuilder�ഴ���Ķ��󿴳�һ������
        sb.append(1);//String Builder������Ԫ�ط������������������ͣ�����������
        sb.append(2.3);
        sb.append(true);
        sb.append("def");


        System.out.println(sb);//StringBuilder�ཨ������ֱ�Ӵ�ӡ�����ǵ�ֵַ����������ֵ
        sb.reverse();//�������е�Ԫ�ط�ת
        System.out.println(sb);
        int num=sb.length();
        System.out.println(num);//��������Ԫ�ظ�����Ҳ�����ַ�������
        /*
            �����StringBuilder�Ķ��������е�Ԫ��ת��ΪString�ַ�������
            Ӧ����ToString����
         */
        String s=sb.toString();
        System.out.println(s);
    }
}
