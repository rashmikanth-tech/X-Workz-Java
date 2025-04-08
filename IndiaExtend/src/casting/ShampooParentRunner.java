package casting;

public class ShampooParentRunner {
    public static void main(String[] args) {

        ShampooParent obj1 = new ShampooParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        ShampooParent obj2 = new ShampooParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        ShampooParentDetails obj3 = new ShampooParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        ShampooParentCast caster = new ShampooParentCast();
        caster.cast(obj2);
    }
}
