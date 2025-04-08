package casting;

public class MouthwashParentCast {
    public void cast(MouthwashParent obj) {
        System.out.println("Casting MouthwashParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof MouthwashParentDetails) {
            MouthwashParentDetails ref = (MouthwashParentDetails)obj;
            ref.extraMethod();
        }
    }
}
