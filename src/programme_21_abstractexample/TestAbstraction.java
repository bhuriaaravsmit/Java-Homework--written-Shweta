package programme_21_abstractexample;

public class TestAbstraction {

    public static void main(String[] args) {
        //in a real scenario, object isprovided through method, e.g getShape()method
        Shape s=new Circle();
        s.draw();
    }
}
