package lab2p2_josebendaña;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_JoseBendaña {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Usuarios admin = new Usuarios("admin", 0, "admin", "admin1234");
        ArrayList<Usuarios> usuarios = new ArrayList();
        usuarios.add(admin);
        ArrayList cosas = new ArrayList();
        int opcion;
        int usuarioactual = 0;
        boolean actualidad = true;
        do {
            System.out.println("usuarioactual: "+usuarioactual);
            System.out.println("actividad: "+actualidad);
            System.out.println("""
                               1- Registro de Inmueble/Solar
                               2- Manejo de Estados
                               3- Log In/Sign Up/Log out
                               4- Comprar Casas/Edificios/Solares
                               5- Salir""");
            opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    Scanner caso1 = new Scanner(System.in);
                    if (actualidad && usuarioactual == 0) {
                        int registro ;
                        do{
                            System.out.println("""
                                               1- Crear Casas/Edificios/Solares
                                               2- Listar Casas/Edificios/Solares
                                               3- Modificar Casas/Edificios/Solares
                                               4- Borrar Casas/Edificios/Solares
                                               """);
                            System.out.print("Ingrese la opcion: ");
                            registro = caso1.nextInt();
                        }while((registro>5)||(registro<1));
                        
                    }
                    break;
                case 2:
                    Scanner case2 = new Scanner(System.in);
                    Scanner case2orac = new Scanner(System.in);
                    if (actualidad && usuarioactual == 0) {
                        if (cosas.isEmpty()) {
                            System.out.println("No hay ni casas ni solares, ni edificios en la lista");
                        } else {
                            mostrarcosas(cosas);
                            int cual;
                            do {
                                System.out.print("Ingrese el numero del edificio, casa o solar: ");
                                cual = case2.nextInt();
                                if ((cual > cosas.size()) || (cual < 0)) {
                                    System.out.println("Opcion no valida, inserte una buena");
                                }
                            } while ((cual > cosas.size()) || (cual < 0));
                            System.out.println("Se ha elegido " + cosas.get(cual));
                            System.out.print("Ingrese el nuevo estado: ");
                            String estado = case2orac.nextLine();
                            if (cosas.get(cual) instanceof Casas) {
                                ((Casas) (cosas.get(cual))).setEstado(estado);
                                System.out.println("Se ha cambiado perfectamente");
                            } else if (cosas.get(cual) instanceof Solar) {
                                ((Solar) (cosas.get(cual))).setEstado(estado);
                                System.out.println("Se ha cambiado perfectamente");
                            } else if (cosas.get(cual) instanceof Edificios) {
                                ((Edificios) (cosas.get(cual))).setEstado(estado);
                                System.out.println("Se ha cambiado perfectamente");

                            }
                        }
                    }
                    break;
                case 3:
                    Scanner caso3 = new Scanner(System.in);
                    Scanner caso3orac = new Scanner(System.in);
                    int cualcaso3;
                    do {
                        System.out.println("""
                                           1- Log in
                                           2- Sign up
                                           3- Log out""");
                        cualcaso3 = caso3.nextInt();
                    } while (cualcaso3 < 0 || cualcaso3 > 4);
                    switch (cualcaso3) {
                        case 1:
                            boolean usuariocorrecto = false;
                            int queuser = 0;
                            if (actualidad) {
                                System.out.println("Lo siento no se puede hacer eso");
                            } else {
                                System.out.print("Ingrese su nombre de usuario: ");
                                String user = caso3orac.nextLine();
                                for (Usuarios a : usuarios) {
                                    if (user.equals(a.getUser())) {
                                        usuariocorrecto = true;
                                        queuser = usuarios.indexOf(a);
                                    }
                                }
                                if (usuariocorrecto == false) {
                                    System.out.println("Usuario incorrecto");
                                } else {
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
                            } else {
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
                            if (actualidad == false) {
                                System.out.println("Lo siento no se puede hacer eso");
                            } else {
                                actualidad = false;
                                usuarioactual=0;
                                System.out.println("Se ha cerrado sesion correctamente");
                            }
                            break;
                    }

                    break;

                case 4:
                    Scanner caso4 = new Scanner(System.in);
                    
                    
                    
                    boolean sera = false;
                    if ((usuarioactual!=0)&&(actualidad)) {
                        int comp;
                        do{
                            System.out.println("""
                                               1- Comprar casa
                                               2- Comprar Edificio
                                               3- Comprar solar
                                               """);
                            System.out.print("Ingrese que quiere comprar: ");
                            comp = caso4.nextInt();
                            if ((comp>3)||(comp<1)) {
                                System.out.println("Opcion no valida, ingrese una buena");
                            }
                        }while((comp>3)||(comp<1));
                        switch(comp){
                            case 1:
                                int quecasa;
                                ArrayList<Integer> quecasas = new ArrayList();
                                for (Object n : cosas) {
                                    if (n instanceof Casas){
                                        quecasas.add(cosas.indexOf(n));
                                        System.out.println(cosas.indexOf(n)+"- "+n+"\n");
                                    }
                                }
                                do{
                                    System.out.print("Ingrese que casa quiere comprar: ");
                                    quecasa = caso4.nextInt();
                                    for (int i = 0; i < quecasas.size(); i++) {
                                        if (quecasa==quecasas.get(i)) {
                                            sera = true;
                                        }
                                    }
                                    if (sera=false) {
                                        System.out.println("Opcion no valida, ingrese una buena");
                                    }
                                }while(sera=false);
                                ((Casas)(cosas.get(quecasa))).setOwner(usuarios.get(usuarioactual).getNombre());
                                break;
                            case 2:
                                ArrayList<Integer> quebuild = new ArrayList();
                                int queedi;
                                for (Object j : cosas) {
                                    if (j instanceof Edificios){
                                        quebuild.add(cosas.indexOf(j));
                                        System.out.println(cosas.indexOf(j)+"- "+j+"\n");
                                    }
                                }
                                do{
                                    System.out.print("Ingrese que edificio quiere comprar: ");
                                    queedi = caso4.nextInt();
                                    for (int i = 0; i < quebuild.size(); i++) {
                                        if (queedi==quebuild.get(i)) {
                                            sera = true;
                                        }
                                    }
                                    if (sera=false) {
                                        System.out.println("Opcion no valida, ingrese una buena");
                                    }
                                }while(sera=false);
                                ((Edificios)(cosas.get(queedi))).setOwner(usuarios.get(usuarioactual).getNombre());
                                break;
                            case 3:
                                ArrayList<Integer> quesolar = new ArrayList();
                                int cualsol;
                                for (Object h : cosas) {
                                    if (h instanceof Solar){
                                        quesolar.add(cosas.indexOf(h));
                                        System.out.println(cosas.indexOf(h)+"- "+h+"\n");
                                    }
                                }
                                do{
                                  System.out.print("Ingrese que edificio quiere comprar: ");
                                    cualsol = caso4.nextInt();
                                    for (int i = 0; i < quesolar.size(); i++) {
                                        if (cualsol==quesolar.get(i)) {
                                            sera = true;
                                        }
                                    }
                                    if (sera=false) {
                                        System.out.println("Opcion no valida, ingrese una buena");
                                    }  
                                }while(sera=false);
                                ((Solar)(cosas.get(cualsol))).setOwner(usuarios.get(usuarioactual).getNombre());
                                break;
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Saliendooo............");
                    break;
                    
                default:
                    System.out.println("Opcion no valida, ingresela de nuevo");
                    break;
            }
        } while (opcion != 5);
        System.out.println("Se ha salido exitosamente :)");
    }

    public static void mostrarcosas(ArrayList cosas) {
        for (Object f : cosas) {
            System.out.println(cosas.indexOf(f) + "- " + f + "\n");
        }
    }
}
