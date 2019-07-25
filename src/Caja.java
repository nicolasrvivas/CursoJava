public class Aritmetica3 {

    int a;
    int b;

    Aritmetica3() {

    }

    Aritmetica3(int a, int b){

        this.a = a;
        this.b = b;
    }

  int sumar(){
        System.out.println("a = " + a);
      System.out.println("b = " + b);
      return a+b;
  }

    int restar(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return a-b;
    }

    int multiplicar(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return a*b;
    }

     int dividir(){
         System.out.println("a = " + a);
         System.out.println("b = " + b);
        return a/b;
    }
}


