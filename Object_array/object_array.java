package object_array;

import java.util.Scanner;

public class object_array {
    public static void main(String[] args) {
        array []shopping=new array[3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < shopping.length; i++) {
            array s=new array();
            s.setId(input.nextInt());
            s.setName(input.next());
            s.setPrice(input.nextDouble());
            s.setNum(input.nextInt());
            shopping[i]=s;
        }
        for (array array : shopping) {
            System.out.println(array.getId() + " " + array.getName()
                    + " " + array.getPrice() + " " + array.getNum() + " ");
        }
    }
}
