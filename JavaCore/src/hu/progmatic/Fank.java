package hu.progmatic;

public class Fank {
    private String form;
    private Integer size;
    private String taste;
    private String mainIngredient;
    private String decoration;

    public Fank(String form, Integer size, String taste, String mainIngredient, String decoration) {
        this.form = form;
        this.size = size;
        this.taste = taste;
        this.mainIngredient = mainIngredient;
        this.decoration = decoration;
    }

    public String getForm() {
        return form;
    }

    public Integer getSize() {
        return size;
    }

    public String getTaste() {
        return taste;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    @Override
    public String toString() {
        return "Fank{" +
                "form='" + form + '\'' +
                ", size='" + size + '\'' +
                ", taste='" + taste + '\'' +
                ", mainIngredient='" + mainIngredient + '\'' +
                ", decoration='" + decoration + '\'' +
                '}';
    }
}
