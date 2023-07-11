package Object_oriented;
/*
  一个标准的Javabean，所有的成员变量都应该用private修饰
  每个成员变量都要提供set与get方法
  必须具备至少两个构造方法
  分别为有参构造方法与无参构造方法
 */
public class User {
    private String name;
    private String password;
    private String mail;
    private String sex;
    private int age;
    public User(){
        System.out.println("创建对象成功");
    }
    public User(String name,String password,String mail,String sex,int age){
        this.name=name;
        this.password=password;
        this.mail=mail;
        this.sex=sex;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public String getMail(){
        return mail;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

















