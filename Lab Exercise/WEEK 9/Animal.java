
//Parent class
public class Animal
{
    public void eat(String str)
    {
        System.out.println("Eating for grass");
    }
    
    //main method
    public static void mian(String [] args)
    {
        Animal a = new Animal();
        Cat b = new Cat();
        Dog c = new Dog();
        Goat d = new Goat();
        a.eat("grass");
        b.eat("milk");
        c.eat("bread");
        d.eat("grass");
    }
}
