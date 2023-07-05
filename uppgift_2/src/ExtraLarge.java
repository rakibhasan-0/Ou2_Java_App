public class ExtraLarge extends Cake{

    protected Cake extraLarge;

    public ExtraLarge(Cake extraLarge){
        this.extraLarge = extraLarge;
    }

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "extra large";
    }
}
