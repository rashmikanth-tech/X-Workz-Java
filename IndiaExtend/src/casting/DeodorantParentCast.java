package casting;

public class DeodorantParentCast {
    public void cast(DeodorantParent obj) {
        System.out.println("Casting DeodorantParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof DeodorantParentDetails) {
            DeodorantParentDetails ref = (DeodorantParentDetails)obj;
            ref.extraMethod();
        }
    }
}
