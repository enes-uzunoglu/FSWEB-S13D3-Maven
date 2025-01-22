package org.example;

public class Wall {
    private double width;
    private double height;

    public Wall(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width < 0 ? 0  : width;
    }

    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Wall bedroom = new Wall(5,4);
        System.out.println("area= " + bedroom.getArea());
        bedroom.setHeight(-1.5);
        System.out.println("width= " + bedroom.getWidth());
        System.out.println("height= " + bedroom.getHeight());
        System.out.println("area= " + bedroom.getArea());
    }
}
