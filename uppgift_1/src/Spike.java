public class Spike implements DogBuilder{
    private Dog dogs;
    public Spike (){
        this.dogs = new Dog();
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
    public void buildDogType() {
        this.dogs.setType("Bulldog");
    }

    @Override
    public void addToys() {
        this.dogs.setToys("Fake Bone");
        this.dogs.setToys("Ball");
        this.dogs.setToys("Pillows");
    }

    @Override
    public Dog getDog(){
        return this.dogs;
    }

}

