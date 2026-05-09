class employee{
    int id ;
    String name;
    public void printdetails (){
        System.out.println("My id is " + id );
                System.out.println("My name is " + name );

    }
}

public class oopsa {
    public static void main(String[] args) {
        System.out.println("This Is The One ");
        employee harry = new employee();

        harry.id=12;
        harry.name = "harry";
        harry.printdetails();
    }
}
