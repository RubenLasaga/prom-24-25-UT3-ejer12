public class Comparador {

    public Comparador(){

    }

    public void mayorDeTres(int a, int b, int c){
        System.out.println("Se va a realizar la comparacion, los numeros son A ("+a+"), B ("+b+") y C ("+c+").");
        System.out.println("-----");
        if (a > b && a > c){
            System.out.println("El numero mayor es A: "+a);
        } else if(b > a && b > c){
            System.out.println("EL numero mayor es B: "+b);
        } else {
            System.out.println("El numero mayor es C: "+c);
        }
    }
}
