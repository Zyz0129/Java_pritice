package ArrayListDemo;

import java.util.ArrayList;

/*
    ���ϵ�����
    1.����add(E e);return boolen;
    2.ɾ��remove(E e);return boolen;
         remove(int index);return E e;
    3.�ģ�set(int index,E e);return E e;(�����޸ĵ�ԭ�ȵ�����ֵ��Ϊ����ֵ����)
    4.�飺get(int index);return E e;��ȡָ��������Ԫ��
    5.�󳤶ȣ�size();
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //���ϵĴ洢����ֻ���������������ͣ���string�����飬�Խ���������������
        //������������Ҫ�������ݰ�װ����Ϊ��װ��
        /*
             byte--Byte
             short--Short
             char--Character
             int--Integer
             long--Long
             float--Float
             double--Double
         */
        ArrayList<String> AL =new ArrayList<>();
        //1.��
        AL.add("aaa");
        AL.add("aaa");
        AL.add("bbb");
        AL.add("ccc");
        AL.add("ddd");
        //2.ɾ
        //����Ԫ������ɾ����
        //AL.remove("ddd");
        //��������ɾ����
        //AL.remove(2);
        //3.��
        AL.set(1,"sbsb");
        //4.��
        String s= AL.get(0);
        System.out.println(s);
        //5.���ϵı���
        //al.fori��ݼ�
        for (int i = 0; i < AL.size(); i++) {
            String ss=AL.get(i);
            System.out.println(ss);
        }
        System.out.println(AL);
        ArrayList<Integer> ali=new ArrayList<>();//�����������͵İ�װ�����ϱ�
        ali.add(1);
        ali.add(2);
        ali.add(3);
        ali.add(4);
        ali.add(5);
        System.out.println(ali);
    }
}
