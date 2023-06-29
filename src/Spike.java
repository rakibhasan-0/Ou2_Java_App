public class Spike implements DogBuilder{
    private DogEssential dogs;
    public Spike (DogEssential dog){
        this.dogs = dog;
    }
    @Override
    public void buildDogName() {
        this.dogs.setName("Spike");
    }
    @Override
    public void buildDogAge() {
        this.dogs.setAge(2);
    }
    @Override
    public void buildDogTyoe() {
        this.dogs.setType("Bulldog");
    }
    @Override
    public void addToys(String toys) {
        this.dogs.setToys(toys);
    }
    public DogEssential getDog(){
        return this.dogs;
    }

}
