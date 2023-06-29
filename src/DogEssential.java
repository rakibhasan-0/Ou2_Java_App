import java.util.ArrayList;
import java.util.List;

public class DogEssential implements DogElements{
    private String name;
    private String type;
    private Integer age;
    private List <String> toys;
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
        if(this.toys.isEmpty()){
            this.toys = new ArrayList<>();
        }else{
            this.toys.add(toys);
        }
    }

}
