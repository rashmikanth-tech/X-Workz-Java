package com.xworkz.internal;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router(58, 39, 4);
        System.out.println(router);

        Router router1 = new Router(58, 39, 4);
        int ref = router1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
