package hu.progmatic.oroklodes.DonutsTask8;

public class ChocolateDonuts extends ClassicDonutsParent{

        private boolean isContentCocoa;

    public ChocolateDonuts(boolean isContentCocoa, String form, String size, String taste, String ingredients, String decoration){
       super(form,size,taste,ingredients,decoration);
       this.isContentCocoa = isContentCocoa;
    }

    public boolean isContentCocoa() {
        return isContentCocoa;
    }

    public void getContentCocoa() {
        System.out.println("This Donuts has high cocoa content!");
    }

    public void chocolateFillingPreparation() {
        System.out.println("This Donut is filled with cholcolate");
    }

    @Override
    public String toString() {
        return "ChocolateDonuts{" +
                "isContentCocoa=" + isContentCocoa +
                "form= " + getForm() + " " +
                "size= " + getSize() + " " +
                "taste= " + getTaste() + " " +
                "ingredients= " + getIngredients() + " "  +
                "decoration= " + getDecoration() + " "  +
                '}';
    }
}
