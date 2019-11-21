/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclos;

import java.util.Scanner;

/**
 *
 * @author reroes
 * Elaborar un programa en lenguaje Java, que permita ingresar los valores de productos vendidos a un clinte, en un supermecado.

Los productos serán ingresados, hasta que el usuario lo decida.

Ejemplificar con los siguiente datos:

Información que necesita ingresar durante la ejecución del programa:
- Ingresar el nombre del cliente.
- Para cada artículo se debe ingresar:
	- Nombre del artículo.
	- Cantidad de artículos.
	- Precio unitario de cada artículo.
- Se debe generar el siguiente reporte


Factura

- Articulo
Nombre: Computadora
Cantidad: 10
Precio Unitario: 1000
Precio Total 10000
- Articulo
Nombre: Celular
Cantidad: 8
Precio Unitario: 230
Precio Total 1840
 */
public class EjemploUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreCliente = "";
        String nombreArticulo = "";
        int cantidadProductos = 0;
        double precioProducto = 0;
        double precioFinalProducto = 0;
        String cadenaFinal = "";
        boolean bandera = true;
        String decision = "";
       
        System.out.println("Ingrese el nombre del cliente");
        nombreCliente = entrada.nextLine();
        cadenaFinal = String.format("%s%s\n", cadenaFinal, "Factura");
        cadenaFinal = String.format("%s%s\n", cadenaFinal, nombreCliente);
        
        while(bandera){
            System.out.println("Ingrese nombre artículo");
            nombreArticulo = entrada.nextLine();
            System.out.println("Ingrese cantidad de articulos");
            cantidadProductos = entrada.nextInt();
            System.out.println("Ingrese precio unitario del producto");
            precioProducto = entrada.nextDouble();
            
            precioFinalProducto = cantidadProductos * precioProducto;
            cadenaFinal = String.format("%s- Articulo\nNombre: %s\nCantidad: "
                    + "%d\nPrecio unitario: %.2f\nPrecio total producto: %.2f\n", 
                    cadenaFinal, nombreArticulo, cantidadProductos, 
                    precioProducto, precioFinalProducto);
            
            System.out.println("Desea ingresar más clientes?. Ingrese (n) para "
                    + "salir.");
            entrada.nextLine(); // regreso a pedir una variable tipo cadena
                                // limpiar el buffer
            decision = entrada.nextLine();
            if(decision.equals("n")){
                bandera = false;
            }
            
        }
        System.out.printf("%s", cadenaFinal);
    }
}
