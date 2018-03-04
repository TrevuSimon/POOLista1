package poo.exercicios.lista1;

public class Exer11 {
    public static void main(String[] args){
        for (int i=1;i<1000;i++) {
            if(((i%3)==0)&&((i%2)==0)){
                System.out.println(i+" é par e multiplo de 3");
            }
        }
    }
}
