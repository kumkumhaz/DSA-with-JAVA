package OOPs.Scope;

class Algebra {
    void demo(){
        int a = 10;
        System.out.println(a);
    }

    //System.out.println(b);

    {
        int b = 20;        
        System.out.println(b);
    }

    //  System.out.println(b);

    {
        int c = 30;        
        System.out.println(c);
    }
}
public class blockLevel{
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        obj.demo();
    }
}
    
