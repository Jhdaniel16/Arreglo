
package ordenamientoarreglos;


public class OrdenamientoArreglos {

    private static Estudiante[] arrayEstudiantes;


    public static void main(String[] args) {
        
        Estudiante [] arrayEstudiante = new Estudiante [5];
     arrayEstudiantes[0] = new Estudiante ("Daniel", "Aviles", "12543", 5, 5.0);
     arrayEstudiantes[1] = new Estudiante ("Felipe", "Perez", "84556", 4, 4.5);
     arrayEstudiantes[2] = new Estudiante ("Camilo", "Gutierrez", "92813", 3, 3.5);
     arrayEstudiantes[3] = new Estudiante ("Juan", "Cortes", "98123", 2, 3.4);
     arrayEstudiantes[4] = new Estudiante ("Jose", "Lopez", "8121523", 1, 2.0);
     arrayEstudiantes[5] = new Estudiante ("Julian", "Perdomo", "985123", 6, 3.0);
     
     int temp;
      for(int i=1;i < arrayEstudiante.length;i++){
            for (int j=0 ; j < arrayEstudiantes.length- 1; j++){
                if (arrayEstudiantes[j+1].getNota() < arrayEstudiantes[j].getNota()){
                    temp = arrayEstudiantes[j].getPuesto();
                    arrayEstudiantes[j].setPuesto (arrayEstudiantes[j+1].getPuesto());
                    arrayEstudiantes[j+1].setPuesto(temp);
                }
            }
      }
    }
    
}
