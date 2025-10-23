/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.navegador;

/**
 *
 * @author User
 */
public class Navegador {

    public static void main(String[] args) {
        //Crear el Objeto
        Pagina pagina1 = new Pagina("wwww.hola.com");
        pagina1.nuevaPagina("www.orellana.com");
        pagina1.nuevaPagina("www.Loreto.com");
        pagina1.nuevaPagina("www.Sacha.com");
        System.out.println("Pagina Actual"+pagina1.getActual());
        pagina1.navegarAtras();
        System.out.println("Atras "+pagina1.getActual());
        pagina1.navegarAtras();
        System.out.println("Atras "+pagina1.getActual());
        pagina1.navegarAdelante();
        System.out.println("Adelante "+pagina1.getActual());
        
    }
}
