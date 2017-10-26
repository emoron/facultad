class Personas{
  String nombres=null;
  String apellidos=null;
  String correo=null;
  String tel=null;

  Personas(String linea){
    String Temporal[]=linea.split(",");
    this.nombres=Temporal[1];
    this.apellidos=Temporal[2];
    this.correo=Temporal[3];
    this.tel=Temporal[6];

    }
    public void Imprimir(){
      System.out.println(this.nombres + this.apellidos + this.correo + this.tel);
      }

}
