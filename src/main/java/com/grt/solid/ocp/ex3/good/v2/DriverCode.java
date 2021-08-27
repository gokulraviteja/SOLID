package com.grt.solid.ocp.ex3.good.v2;

public class DriverCode {


    public static void main(String[] args) {

        Resource spaceBasedResource = new SpaceBasedResource();

        ResourceAllocator.allocate(spaceBasedResource);

        ResourceAllocator.free(1,spaceBasedResource);


    }


}
