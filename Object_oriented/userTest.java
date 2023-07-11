package Object_oriented;

public class userTest {
    public static void main(String[] args) {
        User s1=new User();
        s1.setName("张三");
        s1.setPassword("zyz112233");
        s1.setMail("208721789@qq.com");
        s1.setSex("男");
        s1.setAge(20);
        System.out.println(s1.getName()+" "+s1.getPassword()+" "+s1.getMail()+" "+s1.getSex()+" "+s1.getAge());
        System.out.println("---------------------------------");
        User s2=new User("吴彦祖","200129","www.baidu.com","男",22);
        System.out.println(s2.getName()+" "+s2.getPassword()+" "+s2.getMail()+" "+s2.getSex()+" "+s2.getAge());
    }
}
