package lab2p2_josebendaña;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_JoseBendaña {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Usuarios admin = new Usuarios("admin", 0, "admin", "admin1234");
        ArrayList<Usuarios> usuarios = new ArrayList();
        ArrayList cosas = new ArrayList();
        int opcion;
        int usuarioactual=0;
        boolean actualidad=true;
        do{
            System.out.println("""
                               1- Registro de Inmueble/Solar
                               2- Manejo de Estados
                               3- Log In/Sign Up/Log out
                               4- Salir""");
            opcion = menu.nextInt();
            switch(opcion){
                case 1:
                    if (actualidad&&usuarioactual==0) {
                        
                    }
                    break;
                case 2:
                    if (actualidad&&usuarioactual==0) {
                        
                    }
                    break;
                case 3:
                    Scanner caso3 = new Scanner(System.in);
                    Scanner caso3orac = new Scanner(System.in);
                    int cualcaso3;
                    do{
                        System.out.println("""
                                           1- Log in
                                           2- Sign up
                                           3- Log out""");
                        cualcaso3 = caso3.nextInt();
                    }while(cualcaso3>0||cualcaso3<4);
                    switch(cualcaso3){
                        case 1:
                            boolean usuariocorrecto = false;
                            int queuser = 0;
                            if (actualidad) {
                                System.out.println("Lo siento no se puede hacer eso");
                            }else{
                                System.out.print("Ingrese su nombre de usuario: ");
                                String user = caso3orac.nextLine();
                                for (Usuarios a : usuarios) {
                                    if (user.equals(a.getUser())) {
                                        usuariocorrecto = true;
                                        queuser = usuarios.indexOf(a);
                                    }
                                }
                                if (usuariocorrecto==false) {
                                    System.out.println("Usuario incorrecto");
                                }else{
                                    System.out.println("Ingrese la clave");
                                    String clave = caso3orac.nextLine();
                                    if (usuarios.get(queuser).getClave().equals(clave)) {
                                        System.out.println("Se ha iniciado sesion correctamente");
                                        actualidad = true;
                                        usuarioactual = queuser;
                                    }
                                }
                            }
                            break;
                        case 2:
                            Scanner enteros = new Scanner(System.in);
                            Scanner nuevousuario = new Scanner(System.in);
                            if (actualidad) {
                                System.out.println("Lo siento no se puede hacer eso");
                            }else{
                                System.out.print("Ingrese su nombre: ");
                                String nombre = nuevousuario.nextLine();
                                System.out.print("Ingrese su edad: ");
                                int edad = enteros.nextInt();
                                System.out.print("Ingrese su username: ");
                                String user = nuevousuario.nextLine();
                                System.out.print("Ingrese su clave: ");
                                String clave = nuevousuario.nextLine();
                                usuarios.add(new Usuarios(nombre, edad, user, clave));
                                actualidad = true;
                                usuarioactual = usuarios.size();
                            }
                            break;
                        case 3:
                            if (actualidad==false) {
                                 System.out.println("Lo siento no se puede hacer eso");
                            }else{
                                actualidad=false;
                                System.out.println("Se ha cerrado sesion correctamente");
                            }
                            break;
                    }
                    
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
