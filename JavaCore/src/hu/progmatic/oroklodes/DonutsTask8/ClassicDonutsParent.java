package hu.progmatic.oroklodes.DonutsTask8;

/**
 * Készítsétek el az alábbi, együtt elkészített diagramon láthatszó osztályhierarchiát.
 * A metódusokat is tartalmazzák az osztályok, de elég akár egy System.out.println()
 * utasítást megvalósítaniuk, amely kiírja a konzolra hogy éppen mi az adott tevékenység.
 * Pl.: ízélmény() metódus kiírja, hogy “Ez a klasszikus fánk nagyon finom.”.
 */
public class ClassicDonutsParent {
    private String form;
    private String size;
    private String taste;
    private String ingredients;
    private String decoration;

    public ClassicDonutsParent(String form, String size, String taste, String ingredients, String decoration) {
        this.form = form;
        this.size = size;
        this.taste = taste;
        this.ingredients = ingredients;
        this.decoration = decoration;
    }

    public void runningOut() {
        System.out.println("This fantastic Donuts always running out of stok!");
    }

    public void tasteExperience() {
        System.out.println("This Donuts has the best taste experience!");
    }

    public void risingDough() {
        System.out.println("This Donuts rising dough well!");
    }

    public void nutritious() {
        System.out.println("This Donuts not nutritious at all, just sugar and fat!");
    }

    public void fattenUp() {
        System.out.println("The Donut fattering!");
    }

    public String getForm() {
        return form;
    }

    public String getSize() {
        return size;
    }

    public String getTaste() {
        return taste;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public String getValues() {
        return "form= " + form +
                ", size= " + size +
                ", taste= " + taste +
                ", ingredients= " + ingredients +
                ", decoration=" + decoration;
    }

    @Override
    public String toString() {
        return "ClassicDonutsParent{" +
                "form='" + form + '\'' +
                ", size='" + size + '\'' +
                ", taste='" + taste + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", decoration='" + decoration + '\'' +
                '}';
    }
}
