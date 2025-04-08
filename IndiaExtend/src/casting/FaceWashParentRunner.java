package casting;

public class FaceWashParentRunner {
    public static void main(String[] args) {

        FaceWashParent obj1 = new FaceWashParent();
        obj1.category();
        obj1.keyIngredient();
        obj1.benefits();
        obj1.usage();
        obj1.brands();
        System.out.println("----------------------");

        FaceWashParent obj2 = new FaceWashParentDetails();
        obj2.category();
        obj2.keyIngredient();
        obj2.benefits();
        obj2.usage();
        obj2.brands();
        System.out.println("----------------------");

        FaceWashParentDetails obj3 = new FaceWashParentDetails();
        obj3.category();
        obj3.keyIngredient();
        obj3.benefits();
        obj3.usage();
        obj3.brands();
        obj3.extraMethod();
        System.out.println("----------------------");

        FaceWashParentCast caster = new FaceWashParentCast();
        caster.cast(obj2);
    }
}
