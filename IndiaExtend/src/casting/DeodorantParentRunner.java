package casting;

public class DeodorantParentRunner {
    public static void main(String[] args) {

        DeodorantParent obj1 = new DeodorantParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        DeodorantParent obj2 = new DeodorantParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        DeodorantParentDetails obj3 = new DeodorantParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        DeodorantParentCast caster = new DeodorantParentCast();
        caster.cast(obj2);
    }
}
