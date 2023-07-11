package InterfaceDemo;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        tableTennisSporter sp1=new tableTennisSporter("张继科",32);
        System.out.println(sp1.getName()+", "+sp1.getAge());
        sp1.work();
        sp1.speak();
        tableTennisCoach c1=new tableTennisCoach("刘国梁",55);
        System.out.println(c1.getName()+", "+c1.getAge());
        c1.work();
        c1.speak();
        basketballSporter sp2=new basketballSporter("Kobe",1000);
        System.out.println(sp2.getName()+", "+sp2.getAge());
        sp2.work();
        basketballCoach c2=new basketballCoach("Yaoming",56);
        System.out.println(c2.getName()+", "+c2.getAge());
        c2.work();
    }
}
abstract class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void work();
}
interface speakEnglish{
    public abstract void speak();
}
class tableTennisSporter extends Person implements speakEnglish{

    public tableTennisSporter() {
    }

    public tableTennisSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
class tableTennisCoach extends Person implements speakEnglish{

    public tableTennisCoach() {
    }

    public tableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
class basketballSporter extends Person{

    public basketballSporter() {
    }

    public basketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学打篮球");
    }
}
class basketballCoach extends Person{

    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {

    }
}