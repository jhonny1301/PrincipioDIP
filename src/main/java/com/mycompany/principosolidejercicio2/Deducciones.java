/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.principosolidejercicio2;

/**
 *
 * @author johan
 */
public class Deducciones implements Calculardeduccion{
    
   @Override
   public float calculaDeduccion(float importe, int porcentaje) {
        return importe * (porcentaje / 100.0f);
    }

}
