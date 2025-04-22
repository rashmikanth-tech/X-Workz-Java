package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Face;

public class Human {
    private  Face face;
    
    public Human(Face face){
        this.face=face;
        System.out.println("Face Has A eyes");
        
    }
    public void Parts(){
        if(this.face != null){
            this.face.Eyes();
        }
        else {
            System.out.println("add a Value to Face");
            
        }
    }
}
