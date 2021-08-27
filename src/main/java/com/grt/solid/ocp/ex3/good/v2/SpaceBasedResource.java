package com.grt.solid.ocp.ex3.good.v2;

import java.util.ArrayList;
import java.util.List;

public class SpaceBasedResource implements  Resource{

    List<String> slots = new ArrayList<>();

    @Override
    public int findFree() {
        return 0;
    }

    @Override
    public void makeFree(int slot) {

    }

    @Override
    public void makeBusy(int slot) {

    }
}
