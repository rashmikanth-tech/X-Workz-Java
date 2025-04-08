package casting;

public class DeodorantParentDetails extends DeodorantParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in DeodorantParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in DeodorantParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in DeodorantParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in DeodorantParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in DeodorantParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in DeodorantParentDetails");
    }
}
