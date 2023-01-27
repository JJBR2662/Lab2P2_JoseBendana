package lab2p2_josebendaña;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_JoseBendaña {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        ArrayList<Usuarios> usuarios = new ArrayList();
        ArrayList cosas = new ArrayList();
        int useractual = 0;
        int opcion;
        do{
            System.out.println("""
                               1- Registro de Inmueble/Solar
                               2- Manejo de Estados
                               3- Log In/Sign Up
                               4- Log out
                               5- Salir""");
            opcion = menu.nextInt();
            switch(opcion){
                case 1:
                    if (useractual==0) {
                        
                    }
                    break;
                case 2:
                    if (useractual==0) {
                        
                    }
                    break;
                case 3:
                    Scanner caso3 = new Scanner(System.in);
                    System.out.println("""
                                       1- Log in
                                       2- Sign up""");
                    int logsign = caso3.nextInt();
                    switch(logsign){
                        
                    }
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Saliendooo............");
                    break;
                default:
                    System.out.println("Opcion no valida, ingresela de nuevo");
                    break;
            }
        }while(opcion!=5);
        System.out.println("Se ha salido exitosamente :)");
    }
    
}
