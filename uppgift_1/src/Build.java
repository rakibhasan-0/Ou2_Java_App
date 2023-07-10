public class Build {
    public static void main(String[] args){

        DogBuilder builder = new Spike();
        Director director = new Director(builder);

        director.createDogElements();
        Dog dog = director.getDog();

        System.out.println("dog name ::"+ dog.getName());
        System.out.println("dog age ::" + dog.getAge());
        System.out.println("dog type ::"+ dog.getType());

        for(String toy : dog.getToys()){
            System.out.println(toy);
        }

    }
}