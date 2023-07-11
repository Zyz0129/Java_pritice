package Object_oriented;

public class Phone_Test {
    public static void main(String[] args) {
        Phone p=new Phone("xiaomi",1999);
        System.out.println(p.getName()+" "+p.getPrice());
        p.call();
        p.playgame();
    }
}
