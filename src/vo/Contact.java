package vo;

public class Contact {
    private long id;
    private String name;
    private int age;
    private String phone;

    //생성자
    public Contact(Long id, String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    //Getter
    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getPhone() {
        return this.phone;
    }
    // Setter
    public void setName(String name) {
        this.name =name;
    }
    public void setAge() {
        this.age =age;
    }
    public void  setPhone() {
        this.phone =phone;
    }
}
