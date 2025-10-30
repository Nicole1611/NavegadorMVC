/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navegador.Pagina;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ControladorPagina {
    private VPagina vistaPagina;
    private Pagina pagina;

    public ControladorPagina(VPagina vistaPagina, Pagina pagina) {
        this.vistaPagina = vistaPagina;
        this.pagina = pagina;
        vistaPagina.setControlador(this);
        actualizarVista();
    }

    public void procesoControladorPagina() {
        String actual = vistaPagina.getpaginatxt();
        if (actual.isEmpty()) {
            JOptionPane.showMessageDialog(vistaPagina, "Ingrese una página válida");
        } else {
            pagina.nuevaPagina(actual);
            vistaPagina.limpiarCampoTexto();
            actualizarVista();
        }
    }

    public void navegarAtras() {
    if (pagina.navegarAtras()) {
        // Si se pudo navegar atrás, simplemente actualiza la vista
        actualizarVista();
    } else {
        // Si no hay más páginas atrás, muestra el mensaje
        JOptionPane.showMessageDialog(vistaPagina, "No hay más páginas atrás");
        actualizarVista();
    }
}


    public void navegarAdelante() {
    if (pagina.navegarAdelante()) {
        // Si se pudo avanzar, simplemente actualiza la vista
        actualizarVista();
    } else {
        // Si no hay más páginas adelante, muestra el mensaje
        JOptionPane.showMessageDialog(vistaPagina, "No hay más páginas adelante");
        actualizarVista();
    }
}


    private void actualizarVista() {
        vistaPagina.setPaginaActual(pagina.getActual());
    }
}
