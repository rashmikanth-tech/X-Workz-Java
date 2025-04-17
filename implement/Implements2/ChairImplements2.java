package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Chair;
import com.xworkz.implement.Interfaces.
Table;

public class ChairImplements2 implements Chair, Table {
    @Override
    public void behaviour() {
        System.out.println("running chair behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running chair identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running chair state in implements");
    }
}
