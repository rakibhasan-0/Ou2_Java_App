public class IteratorPatternExample {
    public static void main(String[] args) {
        Names namesContainer = new Names();

        namesContainer.addName("Alice");
        namesContainer.addName("Bob");
        namesContainer.addName("Charlie");

        Iterator<Object> iterator = namesContainer.createIterator();

        while (iterator.hasNext()) {
            Object name = iterator.next();
            System.out.println(name);
        }
    }
}
