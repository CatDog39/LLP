
package dia_semana;
import java.util.Scanner;


public class DIA_SEMANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ObjLector = new Scanner(System.in);
        int ndia;
        System.out.println("DIGITE UN NUMERO ENTRE 1 Y 7: ");
        ndia = ObjLector.nextInt();
        if(ndia == 1)
        {
            System.out.println("LUNES");
        }
        else
        {
            if(ndia == 2)
            {
                System.out.println("MARTES");
            }
            else
            {
                if(ndia == 3)
                {
                    System.out.println("MIERCOLES");
                }
                else
                {
                    if(ndia == 4)
                    {
                        System.out.println("JUEVES");
                    }
                    else
                    {
                        if(ndia == 5)
                        {
                            System.out.println("VIERNES");
                        }
                        else
                        {
                            if(ndia == 6)
                            {
                                System.out.println("SABADO");
                            }
                            else
                            {
                                if(ndia == 7)
                                {
                                    System.out.println("DOMINGO");
                                }
                                else
                                {
                                    System.out.println("ERROr, ESTA MAL! NI VOLVIENDO A NACER SIRVES JAJAJA8");
                                }
                            }
                        }
                    }
                }
                                
            }
            
        }
        
        
        
        
    }
    
}
