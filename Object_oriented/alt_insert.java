package Object_oriented;

public class alt_insert {
    private String name;
    private String password;
    private String mail;
    private String sex;
    private int age;
    //¿ì½Ý¼ü£ºalt+insert

    public alt_insert() {
    }

    public alt_insert(String name, String password, String mail, String sex, int age) {
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
