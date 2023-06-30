import java.util.ArrayList;
import java.util.List;

public class Dog implements DogElements {
    private String name;
    private String type;
    private Integer age;
    private List <String> toys = new ArrayList<String>();
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setToys(String toys) {
        this.toys.add(toys);
    }

    String getName(){
        return this.name;
    }

    String getType(){
        return this.type;
    }

    Integer getAge(){
        return this.age;
    }

    List<String> getToys(){
        return this.toys;
    }

}

