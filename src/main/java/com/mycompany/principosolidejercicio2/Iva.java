/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principosolidejercicio2;

/**
 *
 * @author johan
 */
public class Iva implements IvaCalculadora {
    @Override
    public float calculaIva(float importe) {
        // Supongamos que el IVA es fijo al 21%
        return importe * 0.21f;
    }
    
}
