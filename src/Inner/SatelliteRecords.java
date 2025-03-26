package Inner;

import static Inner.SatelliteType.COMMUNICATION;

public class SatelliteRecords {
        public void setteliteDetail(Satellite [] satellite){
            if (satellite != null){
                for ( Satellite satellites : satellite){
                    //System.out.println("Settelite Type : "+satellites.getType());
                    System.out.println("Settelite Cost : "+satellites.getCost());
                    System.out.println("Settelite Weight : "+satellites.getWeight());
                    System.out.println("Settelite Load Capacity : "+satellites.getLoadCapacity());

                }

            }
            else {
                System.out.println("No satellite records found.");
            }

        }
        public void addDetails(){
            Satellite [] satellites = new Satellite[1];
            satellites[0] = new Satellite();
            satellites[0].setType(COMMUNICATION);
            satellites[0].setWeight(20000);
            satellites[0].setCost(100000000);
            satellites[0].setLoadCapacity(200000000);




            setteliteDetail(satellites);
        }
    }

