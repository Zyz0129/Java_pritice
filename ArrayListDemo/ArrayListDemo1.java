package ArrayListDemo;

import java.util.ArrayList;

/*
    集合的作用
    1.增：add(E e);return boolen;
    2.删：remove(E e);return boolen;
         remove(int index);return E e;
    3.改：set(int index,E e);return E e;(将被修改的原先的属性值作为返回值返回)
    4.查：get(int index);return E e;获取指定索引的元素
    5.求长度：size();
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //集合的存储对象只能是引用数据类型，如string，数组，自建的引用数据类型
        //基本数据类型要进行数据包装，成为包装类
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
        //1.增
        AL.add("aaa");
        AL.add("aaa");
        AL.add("bbb");
        AL.add("ccc");
        AL.add("ddd");
        //2.删
        //按照元素内容删除：
        //AL.remove("ddd");
        //按照索引删出：
        //AL.remove(2);
        //3.改
        AL.set(1,"sbsb");
        //4.查
        String s= AL.get(0);
        System.out.println(s);
        //5.集合的遍历
        //al.fori快捷键
        for (int i = 0; i < AL.size(); i++) {
            String ss=AL.get(i);
            System.out.println(ss);
        }
        System.out.println(AL);
        ArrayList<Integer> ali=new ArrayList<>();//基本数据类型的包装类在上边
        ali.add(1);
        ali.add(2);
        ali.add(3);
        ali.add(4);
        ali.add(5);
        System.out.println(ali);
    }
}
