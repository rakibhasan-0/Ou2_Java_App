public class Tom implements DogBuilder {
    private final Dog dogs;
    public Tom(){
        this.dogs = new Dog();
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
    public void buildDogType() {
        this.dogs.setType("afgan hound");
    }
    @Override
    public void addToys() {
        this.dogs.setToys("Ball");
        this.dogs.setToys("Flying Plate");
    }

    @Override
    public Dog getDog(){
        return this.dogs;
    }

}
