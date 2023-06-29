public class Tom implements DogBuilder {
    private final DogEssential dogs;
    public Tom (DogEssential dogs){
        this.dogs = dogs;
    }
    @Override
    public void buildDogName(){
        this.dogs.setName("Tom");
    }
    @Override
    public void buildDogAge() {
        this.dogs.setAge(2);
    }
    @Override
    public void buildDogTyoe() {
        this.dogs.setType("afgan hound");
    }
    @Override
    public void addToys(String toy) {
        this.dogs.setToys(toy);
    }
    public DogEssential getDog(){
        return this.dogs;
    }
}
