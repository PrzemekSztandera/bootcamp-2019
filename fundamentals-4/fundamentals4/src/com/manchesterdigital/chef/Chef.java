package com.manchesterdigital.chef;

import com.manchesterdigital.BakingExample;

public class Chef extends BakingExample {
    public static void main(String[] args) {
        BakingExample bakingExample = new BakingExample();
        Chef chef = new Chef();
//        bakingExample.decorate();
        chef.decorate();
    }
}
