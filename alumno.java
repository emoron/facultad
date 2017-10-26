package institucioneducativa;

import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class alumno {
    static int numeroAlumnos=0;
    String nombre;
    int matricula, creditos, anioIngreso, anioEgreso,anioDeNacimiento, materiasCursadas;
    double promedio, sumaCalificaciones;

//CONSTRUCTOR
    alumno(){
        numeroAlumnos++;
        this.matricula=generaMatricula();
        this.creditos=0;
        this.promedio=0;
        this.materiasCursadas=0;
        this.sumaCalificaciones=0;//AQUI SUMO LAS CALIFICACIONES DE LAS MATERIAS CURSADAS
    }
//CONSTRUCTOR
    alumno(String nombre, int anioDeNacimiento){
        numeroAlumnos++;
        this.matricula=generaMatricula();
        this.creditos=0;
        this.promedio=0;
        this.nombre=nombre;
        this.materiasCursadas=0;
        this.anioDeNacimiento=anioDeNacimiento;
        this.sumaCalificaciones=0;//AQUI SUMO LAS CALIFICACIONES DE LAS MATERIAS CURSADAS
    }
//METODO PARA GENERAR MATRICULA
    private int generaMatricula(){

        return (int)(Math.random()*1000000);

    }
//METODO PARA CAMBIAR NOMBRE
    private void cambiarNombre(String nombre){
        this.nombre=nombre;
    }
//METODO DAME-MATRICULA
    public int dameMatricula(){
        return this.matricula;
    }
    public double damePromedio(){
        return this.sumaCalificaciones/this.materiasCursadas;
    }
    public int dameTotalAlumnos(){
        return numeroAlumnos;
    }

    public void importar(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      alumno[] arreglo=new alumno[37];
      try {
           archivo = new File ("personas.csv");
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           String linea;
           int i=0;
           while((linea=br.readLine())!=null){

             arreglo[i]=new alumno(linea);
             i++;
           }
        }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           try{
              if( null != fr ){
                 fr.close();
              }
           }catch (Exception e2){
              e2.printStackTrace();
           }
        }
        for(int i=0;i<37;i++){
          arreglo[i].Imprimir();
        }
    }
}//Fin de la clase
