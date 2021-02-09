public class Doctor {
    int id;
    String name;
    String speciality;

    /**
     * Aquí estamos visualizando el método constructor
     * Simepre se ejecutará al llamar este método
     */
    Doctor(){
        System.out.println("Contruyendo el objeto Doctor");
    }//Fin visualización método constructor Doctor

    /**
     * Esto es para tener otra forma de construir el objeto, esta comentado en main
     * @param name
     */
    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }//Fin segunda visualización método constructor Doctor

    //Comportamientos
    /**
     * Método para imprimir el nombre del doctor
     */
    public void showName(){
        System.out.println(name);
    }//Fin método para imprimir el nombre del doctor



}//Fin clase
