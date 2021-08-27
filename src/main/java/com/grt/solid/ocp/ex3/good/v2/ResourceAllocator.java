package com.grt.solid.ocp.ex3.good.v2;

public class ResourceAllocator {


    static int allocate( Resource resource ){
        int slot = resource.findFree();
        resource.makeBusy(slot);
        return slot;
    }

    static void free(int slot , Resource resource){
        resource.makeFree(slot);
    }


}
