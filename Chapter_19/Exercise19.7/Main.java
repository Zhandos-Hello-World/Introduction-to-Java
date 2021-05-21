/*
(Sum of an association) Knowing that any object of type java.lang.Number can
be evaluated as a double with its doubleValue() method, write a method that
computes and returns the sum of the three numbers in an instance of Transition
as defined in Programming Exercise 19.6.
 */
public class Main {
    public static void main(String[]args){
        Transition<Integer, Integer, Integer> transition = new Transition<>(234, 23, 442);
        System.out.println(transition.getO1());
        System.out.println(transition.getO2());
        System.out.println(transition.getO3());
        System.out.println("Sum is: " + transition.sum());
    }
}
class Transition<E1 extends Number, E2 extends E1, E3 extends E1>{
    private E1 o1 = null;
    private E2 o2 = null;
    private E3 o3 = null;
    Transition(E1 o1, E2 o2, E3 o3){
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }
    public double getO1(){
        return o1.doubleValue();
    }
    public double getO2(){
        return o2.doubleValue();
    }
    public double getO3(){
        return o3.doubleValue();
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
    public double sum(){
        return getO1() + getO2() + getO3();
    }
}
