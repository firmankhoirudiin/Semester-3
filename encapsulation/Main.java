package encapsulation;

 
class Person { 
    private String name; 
    private int age; 

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
} 

public class Main { 
    public static void main(String[] args) { 
        Person person = new Person(); 
        person.setName("jumiten"); 
        person.setAge(30); 

        System.out.println("nama: " + person.getName()); 
        System.out.println("umur: " + person.getAge()); 
    } 
}