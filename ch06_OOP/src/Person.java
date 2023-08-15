public class Person {
    String name;
    int age;
    char gender;

    public void studying(){
        System.out.println("studying");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        age += addAge;
    }

}
