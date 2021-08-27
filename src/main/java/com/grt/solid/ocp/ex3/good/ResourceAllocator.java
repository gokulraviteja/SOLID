package com.grt.solid.ocp.ex3.good;

abstract class ResourceAllocator {

     int allocate(){
        int slot = findFree();
        makeBusy(slot);
        return slot;
    }
     void free(int slot){
        makeFree(slot);
    }

     abstract void makeBusy(int slot);
     abstract void makeFree(int slot);
     abstract int findFree();

}




//abstract class Strategy(){
//
//     getbeststudnet()
//
//    strategyRelated(student){
//
//    }
//}
//
//
//class Strategy1 extends Strategy{
//     overide
//    getbeststudnet(Student student){
//         strategyRelated(student);
//    }
//}
//
//
//class Strategy2 extends Strategy{
//    overide
//    getbeststudnet(Student student){
//        strategyRelated(student);
//    }
//}