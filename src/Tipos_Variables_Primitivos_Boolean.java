public class Tipos_Variables_Primitivos_Boolean {

    public static void main(String[] args) {


        // System.out.println(" Cantidad de Bits var tipo boolean  -->>  "+boolean.SIZE);
        // System.out.println(" Cantidad de Bytes var tipo boolean  -->>  "+boolean.BYTES);
        System.out.println(" Valor true en var tipo boolean  -->>  "+Boolean.TRUE);
        System.out.println(" Valor false en var tipo boolean  -->>  "+Boolean.FALSE);
        System.out.println("");

        boolean booleanVar = true;
        if (booleanVar)
            System.out.println(" La varaible contiene un valor verdadero");
        else
            System.out.println(" La varaible contiene un valor falo");

        System.out.println("");

        int edadVar = 23;
        boolean adulto = edadVar>=18;
        if (adulto)
            System.out.println(" Eres adulto, puedes pasar");
        else
            System.out.println(" No Eres adulto, no puedes pasar");


    }
}

