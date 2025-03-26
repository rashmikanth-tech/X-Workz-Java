package Inner;

public class IDCardRecord {
    public void  idCardDetail(IDCard [] idCard){
        if (idCard != null){
            for (IDCard idCards : idCard){
                System.out.println("Id card Meterial : "+idCards.getMaterial());
                System.out.println("Id card Color : "+idCards.getColors());
                System.out.println("Id card Weight : "+idCards.getWeight());
            }
        }
    }
    public void addIdcard(){
        IDCard [] idCard = new IDCard[1];
        idCard[0]= new IDCard();
        idCard[0].setMaterial("Plastic");
        idCard[0].setColors("Blue");
        idCard[0].setWeight(70.6);

        idCardDetail(idCard);
    }
}
