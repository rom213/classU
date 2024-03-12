package sena;

public class AtributosMetodos {

    String nombre = "Roland Deschain";
    short edad = 16;
    int poblacion = 1_200_000;
    long enterLargo = 200_045_320;

    char vocal = 'a';
    float altura = 1_500.253f;

    double distancia = 194_000_200_230.0000494;
    boolean esNoche = false;

    // Constructor de la clase
    public AtributosMetodos() {
        mostrarVariables();
        operaciones();
    }

    // Método para mostrar las variables
    void mostrarVariables() {
        System.out.println("nombre:  " + nombre);
        System.out.println("edad:  " + edad);
        System.out.println("poblacion:  " + poblacion);
        System.out.println("enter Largo:  " + enterLargo);
        System.out.println("vocal:  " + vocal);
        System.out.println("altura:  " + altura);
        System.out.println("distancia:  " + distancia);
        System.out.println("es de noche:  " + esNoche);
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        System.out.println("//////////////////// ejercicio 3.2 and 3.3 //////////////////////////////");
        AtributosMetodos objeto = new AtributosMetodos();
        EstratoEmpleado pedida = new EstratoEmpleado();
        EstratoEstudiante getInf = new EstratoEstudiante();
        TareaHoroscopo horoscopo= new TareaHoroscopo();
        ActividadCiclos whileciclo = new ActividadCiclos();
        ActividadDeEvaluacion evalua=new ActividadDeEvaluacion();

        System.out.println("////////////////////ejercicio 3.4 3.5//////////////////////////////");
        pedida.ejecutar_estrato();
        System.out.println("////////////////////ejercicio 3.6 y 3.6//////////////////////////////");
        getInf.mostrarEstudianteTres();
        horoscopo.mostrarMensaje();
        System.out.println("//////////////////// ejercicio 3.7 //////////////////////////////");
        whileciclo.ciclo_mientras();
        whileciclo.comienzaPorSt();
        System.out.println("//////////////////// ejercicio 3.8 ,3.9, 3.10 //////////////////////////////");
        System.out.println("toLowerCase()");
        System.out.println("tan(double a)");
        System.out.println("sort(T[] a)");
            System.out.println("evaluacion 4.1 4.2 4.3 4.4");
        evalua.ejecute();
        
        
    }

    void dividirDosNumero() {
        float numero = 23f;
        float numero2 = 2f;

        System.out.println("la resta es: " + (numero / numero2));
    }

    void multiplicarDosNumeros(int cant, int precio) {
        System.out.println("la muntiplicacion es: " + (cant * precio));
    }

    int restarDosNumeros(int cotiza, int presupuesto) {
        return (cotiza - presupuesto);
    }

    double sumarDosNumeros(double poblacion, double dato) {
        return (poblacion + dato);
    }

    void mostrarSumaYResta() {
        int resta = restarDosNumeros(50, 23);
        double suma = sumarDosNumeros(89.29, 233.02);
        System.out.println("la resta es: " + resta);
        System.out.println("la suma es: " + suma);
    }

    void operaciones() {
        mostrarSumaYResta();
        dividirDosNumero();
        multiplicarDosNumeros(2, 3);
    }

}
