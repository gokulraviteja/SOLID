package com.grt.solid.isp.ex4.good;

import com.grt.solid.isp.ex4.bad.Worker;

import java.util.ArrayList;
import java.util.List;

public class Driver {




    static void workTime(List<IWork> workers){
        for(IWork worker : workers){
            worker.Work();
        }
    }

    static void lunchTime(List<IEater> eaters){
        for(IEater eater : eaters){
            eater.eat();
        }
    }

    public static void main(String[] args) {


        Human h1 = new Human();
        Human h2 = new Human();

        Robot r1 = new Robot();
        Robot r2 = new Robot();


        List<IEater> eaters = new ArrayList<>();
        eaters.add(h1);
        eaters.add(h2);

        List<IWork> workers = new ArrayList<>();
        workers.add(h1);
        workers.add(h2);
        workers.add(r1);
        workers.add(r2);


        workTime(workers);

        lunchTime(eaters);





    }



}
