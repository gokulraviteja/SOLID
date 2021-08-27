package com.grt.solid.isp.ex4.bad;

import java.util.ArrayList;
import java.util.List;

public class DriverCode {


    static void workTime(List<Worker> workers){
        for(Worker worker : workers){
            worker.work();
        }
    }

    static void lunchTime(List<Worker> workers){
        for(Worker worker : workers){
            worker.eat();
        }
    }

    public static void main(String[] args) {

        Worker w1 = new Human();
        Worker w2 = new Human();
        Worker w3 = new Robot();

        List<Worker> workers = new ArrayList<>();

        workers.add(w1);
        workers.add(w2);
        workers.add(w3);

        workTime(workers);
        lunchTime(workers);


    }

}
