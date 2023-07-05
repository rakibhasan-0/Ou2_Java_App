public class DecorationWithText extends Cake{
    String desiredText;
    Cake cake;

    public DecorationWithText(String desiredText, Cake cake) {
        this.desiredText = desiredText;
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return "with text: "+ desiredText;
    }

    @Override
    public int getCost(){
        return + 1;
    }

}
