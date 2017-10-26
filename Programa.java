
import java.io.*;
class Programa{
  public static void main(String[] args){
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    Personas[] arreglo=new Personas[37];
    try {
         archivo = new File ("personas.csv");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         String linea;
         int i=0;
         while((linea=br.readLine())!=null){

           arreglo[i]=new Personas(linea);
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
}
