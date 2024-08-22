/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principosolidejercicio2;

import java.util.Date;

/**
 *
 * @author johan
 */
public class FacturaSinModificar {
    
public String codigo;
public Date fechaEmision;
public float importeFactura;
public float importeIVA;
public float importeDeduccion;
public float importeTotal;
public int porcentajeDeduccion;
// Método que calcula el total de la factura
public void calcularTotal() {
 // Calculamos la deducción
 Deduccion d=new Deduccion(); 
 importeDeduccion = d.calculaDeduccion(importeFactura, porcentajeDeduccion);
 Iva iva=new Iva();
 // Calculamos el IVA
 importeIVA = iva.calculaIva(importeFactura);
 // Calculamos el total
importeTotal = (importeFactura - importeDeduccion) + importeIVA;
}

  
}


