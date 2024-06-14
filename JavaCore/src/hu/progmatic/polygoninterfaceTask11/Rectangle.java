package hu.progmatic.polygoninterfaceTask11;

public class Rectangle implements Polygoninterface {

    public Rectangle(){
    }

    @Override
    public int getArea(int side1, int side2) {


        return side1*side2;



    }


}
