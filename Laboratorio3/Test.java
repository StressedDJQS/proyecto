public class Test {
    public static void main (String[] args){
        Alumno alumno = new Alumno("Pepito", 10);
        Alumno alumno2 = new Alumno("Juanito", 12);
        System.out.println("Edad \t Nombre\n"+alumno.getEdad()+"\t"+alumno.getNombre()+"\n"+alumno2.getEdad()+"\t"+alumno2.getNombre());
    }
}
