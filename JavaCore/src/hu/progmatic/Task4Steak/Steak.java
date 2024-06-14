package hu.progmatic.Task4Steak;

public class Steak {

    private String meatType;
    private int cookingTime;
    private String cookingMethod;
    private String spicing;
    private String marinating;



    public Steak(String meatType, int cookingTime, String cookingMethod, String spicing, String marinating) {
        this.meatType = meatType;
        this.cookingTime = cookingTime;
        this.cookingMethod = cookingMethod;
        this.spicing = spicing;
        this.marinating = marinating;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getCookingMethod() {
        return cookingMethod;
    }

    public void setCookingMethod(String cookingMethod) {
        this.cookingMethod = cookingMethod;
    }

    public String getSpicing() {
        return spicing;
    }

    public void setSpicing(String spicing) {
        this.spicing = spicing;
    }

    public String getMarinating() {
        return marinating;
    }

    public void setMarinating(String marinating) {
        this.marinating = marinating;
    }


    @Override
    public String toString() {
        return "Steak{" +
                "meatType='" + meatType + '\'' +
                ", cookingTime=" + cookingTime +
                ", cookingMethod='" + cookingMethod + '\'' +
                ", spicing='" + spicing + '\'' +
                ", marinating='" + marinating + '\'' +
                '}';
    }
}
