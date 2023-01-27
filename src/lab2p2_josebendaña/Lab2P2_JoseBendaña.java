package lab2p2_josebendaña;

import java.util.Scanner;

public class Lab2P2_JoseBendaña {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        ArrayList<Usuario> = new ArraList();
        int opcion = 0;
        do{
            System.out.println("""
                               1- Registro de Inmueble/Solar
                               2- Manejo de Estados
                               3- Log In/Sign Up
                               4- Salir""");
            opcion = menu.nextInt();
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Saliendooo............");
                    break;
                default:
                    System.out.println("Opcion no valida, ingresela de nuevo");
                    break;
            }
        }while(opcion!=4);
        System.out.println("Se ha salido exitosamente :)");
    }
    
}
