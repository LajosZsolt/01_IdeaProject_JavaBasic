package hu.progmatic.polygoninterfaceTask11;

public class Square implements SquareInterface {

    public Square(){

    }

    @Override
    public int getArea(int side) {
        return side*side;
    }


}
