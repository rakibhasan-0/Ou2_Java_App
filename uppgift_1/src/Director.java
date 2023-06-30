public class Director {
    private final DogBuilder dogBuilder;
    public Director(DogBuilder dogBuilder) {
        this.dogBuilder = dogBuilder;
    }
    public Dog getDog() {
        return dogBuilder.getDog();
    }
    public void createDogElements(){
        dogBuilder.buildDogAge();
        dogBuilder.buildDogName();
        dogBuilder.buildDogType();
        dogBuilder.addToys();
    }

}
