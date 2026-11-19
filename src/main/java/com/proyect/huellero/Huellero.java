/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyect.huellero;
import javax.swing.SwingUtilities;

/**
 *
 * @author luceforte
 */
public class Huellero {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
        Vistas.Iniciar_Sesion ventana = new Vistas.Iniciar_Sesion();
        ventana.setVisible(true);
        });
        
        System.out.println("Hello World!");
    }
}
