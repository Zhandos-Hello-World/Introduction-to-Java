
/*
(Inheritance between generic classes) Create a Triplet class that encapsulates
three objects of the same data type in a given instance of Triplet.
 */
public class Main {
    public static void main(String[]args){

    }
}
class Triplet<E1 extends Object, E2 extends Object, E3 extends Object>{
    private E1 o1 = null;
    private E2 o2 = null;
    private E3 o3 = null;
    Triplet(E1 o1, E2 o2, E3 o3){
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }
    public E1 getO1(){
        return o1;
    }
    public E2 getO2(){
        return o2;
    }
    public E3 getO3(){
        return o3;
    }

    public void setO1(E1 o1) {
        this.o1 = o1;
    }

    public void setO2(E2 o2) {
        this.o2 = o2;
    }

    public void setO3(E3 o3) {
        this.o3 = o3;
    }
}
