package hu.progmatic.oroklodes.DonutsTask8;

public class MarmaladeDonuts extends ClassicDonutsParent{
        int fruitContent;

    public MarmaladeDonuts(int fruitContent, String form, String size, String taste, String ingredients, String decoration) {
        super(form, size, taste, ingredients, decoration);
        this.fruitContent = fruitContent;
    }

    public MarmaladeDonuts(int fruitContent){
        super("Oval", "Medium", "Jam",
                "Classic", "Powdered sugar");
        this.fruitContent = fruitContent;
    }

    public int getFruitContent() {
        return fruitContent;
    }

    public void setFruitContent(int fruitContent) {
        this.fruitContent = fruitContent;
    }

    public void jamFillingPreparation() {
        System.out.println("This Donut is filled with jam");
    }


    @Override
    public String toString() {
        return "MarmaladeDonuts{" +
                "fruitContent=" + fruitContent + '\''+ '\''+
                //super.toString() + "\n" +
                ", " + super.getValues() + "\n" +
                //getValues() +   // elhagyható a super, mert az ős osztályból mindent
                                // megörököl ez az osztály
                '}';
    }


}
