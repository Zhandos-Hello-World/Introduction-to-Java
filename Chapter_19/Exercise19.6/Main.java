/*
(Several types) Create an Association class that encapsulates two objects of different
types. Similar to Programming Exercise 19.5, create a Transition class that does the
same of Association class with three objects.
 */

public class Main {
    public static void main(String[]args){

    }
}
class Transition<E1 extends Comparable<E1>, E2 extends E1, E3 extends E1>{
    private E1 o1 = null;
    private E2 o2 = null;
    private E3 o3 = null;
    Transition(E1 o1, E2 o2, E3 o3){
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
