
public class Loader
{
    public static void main(String[] args)
    {
        System.out.println("Cat count: " + Cat.getCount());
        Cat cat = new Cat(5000);
        System.out.println("Cat count: " + Cat.getCount());
        Cat fuck = new Cat();
        System.out.println("Cat count: " + Cat.getCount());
        cat.feed(100.0);
        cat.feed(15.0);
        cat.shit();
        cat.shit();
        System.out.println("Cat count: " + Cat.getCount());
        while (1000 <= fuck.getWeight())
            fuck.shit();
        System.out.println(fuck.getStatus());
        System.out.println("Cat count: " + Cat.getCount());

        System.out.println("Set enterFood: " + cat.getEatenFood());


    }
}