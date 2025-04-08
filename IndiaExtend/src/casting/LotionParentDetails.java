package casting;

public class LotionParentDetails extends LotionParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in LotionParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in LotionParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in LotionParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in LotionParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in LotionParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in LotionParentDetails");
    }
}
