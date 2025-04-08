package casting;

public class ShavingCreamParentRunner {
    public static void main(String[] args) {

        ShavingCreamParent obj1 = new ShavingCreamParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        ShavingCreamParent obj2 = new ShavingCreamParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        ShavingCreamParentDetails obj3 = new ShavingCreamParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        ShavingCreamParentCast caster = new ShavingCreamParentCast();
        caster.cast(obj2);
    }
}
