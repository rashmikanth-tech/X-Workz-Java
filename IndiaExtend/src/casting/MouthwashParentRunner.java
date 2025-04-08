package casting;

public class MouthwashParentRunner {
    public static void main(String[] args) {

        MouthwashParent obj1 = new MouthwashParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        MouthwashParent obj2 = new MouthwashParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        MouthwashParentDetails obj3 = new MouthwashParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        MouthwashParentCast caster = new MouthwashParentCast();
        caster.cast(obj2);
    }
}
