

/*Java Programme to overload constructors*/
public class Programme25_ConstructorOverloading {

int id;
String name;
int age;

    Programme25_ConstructorOverloading (int i,String n)
    {
        id =i;
        name=n;

    }

//creating three arg constructor
    Programme25_ConstructorOverloading (int i, String n,int age)
    {
        int id;
        name =n;
        age =3;

    }

    public  void display() {
        System.out.println(id + " "+ name + " " + age);
    }


    public static void main(String[] args) {
        Programme25_ConstructorOverloading s1=new Programme25_ConstructorOverloading(111 , "Hitesh");

        Programme25_ConstructorOverloading s2 =new Programme25_ConstructorOverloading(222 , "nirav",40);
        s1.display();
        s2.display();
    }



}
