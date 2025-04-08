package casting;

public class FaceWashParentDetails extends FaceWashParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in FaceWashParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in FaceWashParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in FaceWashParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in FaceWashParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in FaceWashParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FaceWashParentDetails");
    }
}
