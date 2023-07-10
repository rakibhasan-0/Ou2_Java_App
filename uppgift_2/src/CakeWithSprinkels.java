public class CakeWithSprinkels extends Cake{
    protected Cake cake;
    public CakeWithSprinkels (Cake cake){
        this.cake = cake;
    }
    @Override
    public String getDescription() {
        return "with sprinkels";
    }
    @Override
    public int getCost () {
        return 2;
    }

}
