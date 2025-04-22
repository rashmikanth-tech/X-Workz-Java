package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.ConnectTothing;
import com.xworkz.interfacee.internal.Connector;

public class ConnecterUse {

   public Connector connector;

   public ConnecterUse(Connector connector){
       this.connector=connector;

   }
   public void DisplayAll(){
       if(connector != null) {
           this.connector.Display();
       }
       else {
           System.err.println("Assign value for null");
       }

       }

   }

