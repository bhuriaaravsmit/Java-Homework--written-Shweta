
/*

        * 1. Write a class with the name Floor. The class needs two fields (instance variables)
        * with name width and length of type double.
        * The class needs to have one constructor with parameters width and length of type double
        * and it needs to initialize the fields.
        * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the
        * length parameter is less than 0 it needs to set the length field value to 0.
        * Write the following methods (instance methods):
        * Method named getArea without any parameters, it needs to return the calculated area (width * length).
        */
        package programme_17_carpet_cost_calculator;

public class Floor {

    double Width;
    double length;

    public Floor(double Width, double length) {
        if (Width < 0){
            this.Width = 0;}
        else {
            this.Width = 0;
        }

        if (length < 0){
            this.length = 0;}
        else{
            this.length = 0;}

    }


    public double getArea()
    {
        return this.Width * this.length;
    }
}
