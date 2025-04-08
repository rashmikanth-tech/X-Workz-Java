package casting;

public class FaceWashParentCast {
    public void cast(FaceWashParent obj) {
        System.out.println("Casting FaceWashParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof FaceWashParentDetails) {
            FaceWashParentDetails ref = (FaceWashParentDetails)obj;
            ref.extraMethod();
        }
    }
}
