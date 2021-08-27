package com.grt.solid.lsp.ex2.bad;



class VectorT {
    void pushInd(){
        System.out.println("Pushing at ind");
    }
    void push(){
        System.out.println("Push at top");
    }
}

class StackT extends VectorT {
    @Override
    void pushInd() {
        System.out.println("Restricted");
    }
}


public class A {
    static void process(VectorT st ){
        st.pushInd();
    }
    public static void main(String[] args) {
            VectorT st = new VectorT();
            process(st);
    }
}
