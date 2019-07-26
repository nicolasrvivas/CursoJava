public class Caja {

    int ancho;
    int alto;
    int profundo;

    Caja() {

    }

    Caja(int ancho, int alto, int profundo){

        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

  int calculoVolumen(){

      return ancho*alto*profundo;
  }

}


