package hu.progmatic.homework;

public class Task4_Steak {
    private String meatType;
    private Integer fryingTime;
    private String cookingMethod;
    private String spicing;
    private String marinating;

    public Task4_Steak(String meatType, Integer fryingTime, String cookingMethod, String spicing, String marinating) {
        this.meatType = meatType;
        this.fryingTime =fryingTime;
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

    public Integer getFryingTime() {
        return fryingTime;
    }

    public void setFryingTime(Integer fryingTime) {
        this.fryingTime = fryingTime;
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
        return "Task4_Steak{" +
                "meatType='" + meatType + '\'' +
                ", fryingTime=" + fryingTime +
                ", cookingMethod='" + cookingMethod + '\'' +
                ", spicing='" + spicing + '\'' +
                ", marinating='" + marinating + '\'' +
                '}';
    }




}
