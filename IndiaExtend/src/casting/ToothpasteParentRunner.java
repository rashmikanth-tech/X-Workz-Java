package casting;

public class ToothpasteParentRunner {
    public static void main(String[] args) {

        ToothpasteParent obj1 = new ToothpasteParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        ToothpasteParent obj2 = new ToothpasteParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        ToothpasteParentDetails obj3 = new ToothpasteParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        ToothpasteParentCast caster = new ToothpasteParentCast();
        caster.cast(obj2);
    }
}
