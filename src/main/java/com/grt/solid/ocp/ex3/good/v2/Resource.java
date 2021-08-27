package com.grt.solid.ocp.ex3.good.v2;

public interface Resource {


    int findFree();

    void makeFree(int slot);

    void makeBusy(int slot);


}
