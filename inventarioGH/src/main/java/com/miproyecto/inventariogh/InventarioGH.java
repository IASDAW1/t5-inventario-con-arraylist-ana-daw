
package com.miproyecto.inventariogh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ana Belen
 */
public class InventarioGH {

    public static void main(String[] args) {
        
       ArrayList<String> nombres= new ArrayList<>();

       ArrayList<Double> precios = new ArrayList<>();
        
       ArrayList<Integer> cantidades = new ArrayList<>();
        
        

        Scanner scanner = new Scanner(System.in);



        while (true) {

            System.out.println("\nMenú:");

            System.out.println("1. Agregar producto");

            System.out.println("2. Actualizar inventario");

            System.out.println("3. Buscar productos");
            
            System.out.println("4. Mostrar inventario actualizado");

            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");



            int opcion = scanner.nextInt();

            scanner.nextLine(); 



            switch (opcion) {

                case 1://en el primer caso se añade el producto y sus datos introducidos por el usuario

                    System.out.print("Ingrese el nombre del producto: ");

                    String nombre = scanner.nextLine();
                    
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();

                    System.out.print("Ingrese la cantidad en stock: ");
                    int cantidad = scanner.nextInt();
                    
                    
                    if (!nombres.contains(nombre)) {//condición, si no contiene ya el producto se añade en cada array lo que corresponda

                        nombres.add(nombre);
                        
                        precios.add(precio);
                        
                        cantidades.add(cantidad);


                        System.out.println("Producto añadido correctamente.");

                    } else {

                        System.out.println("Este producto ya está añadido anteriormente.");

                    }

                    break;

                case 2://en el segundo caso se actualiza un producto del inventario

                    System.out.println("Actualizar inventario:");
                    
                    System.out.print("Ingrese el producto a actualizar: ");//el usuario indica el producto a actualizar

                    String productoActualizar = scanner.nextLine();


                    int buscar = nombres.indexOf(productoActualizar);//se realiza la busqueda del producto introducido
                    

                            if (buscar!=-1) {//si encuentra el producto

                                System.out.println("Ingrese la nueva cantidad: ");

                                int nuevaCantidad=scanner.nextInt();//se ingresa la nueva cantidad

                                cantidades.set(buscar,nuevaCantidad);//y se actualiza

                            } else {

                                System.out.println("Producto no encontrado.");

                            }

                    break;

                 
                case 3://buscar un producto del inventario

                    System.out.println("Buscar producto:");
                    
                    System.out.print("Ingrese el producto a buscar: ");

                    String productoBuscar = scanner.nextLine();//el usuario introduce el producto a buscar


                    int buscar1 = nombres.indexOf(productoBuscar);//se realiza la búsqueda
                    

                            if (buscar1!=-1) {//si lo encuentra

                                System.out.println("Producto encontrado:  "+productoBuscar);//lo imprime por pantalla

                            } else {

                                System.out.println("Producto no encontrado.");

                            }

                    break;
                    
                case 4://imprimir la lista de inventario, con el for se recorre y va imprimiendo cada producto

                    System.out.println("Lista de Inventario:");

                    for (int i = 0; i < nombres.size(); i++) {

                        System.out.println("Nombre" + nombres.get(i) + "Precio: " + precios.get(i)+ "Cantidad en stock: "+cantidades.get(i) );
                    }


                    break;

                case 5://salir de programa

                    System.out.println("Saliendo del programa.");

                    scanner.close();

                    System.exit(0);
                    

                default://caso en que se introduza alguna otra opción que no reconozca nuestro programa

                    System.out.println("Opción inválida. Intente de nuevo.");

            }

        }
    }
}
