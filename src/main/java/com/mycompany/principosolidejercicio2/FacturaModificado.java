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
public class FacturaModificado {
     public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;
    
    private Calculardeduccion deduccionCalculator;
    private IvaCalculadora ivaCalculator;

    // Constructor que recibe instancias de las implementaciones concretas de las dependencias
    public FacturaModificado(Calculardeduccion calculardeduccion, IvaCalculadora ivaCalculator) {
        this.deduccionCalculator = deduccionCalculator;
        this.ivaCalculator = ivaCalculator;
    }

    // Método que calcula el total de la factura utilizando las dependencias proporcionadas
    public void calcularTotal() {
        // Calculamos la deducción utilizando el DeduccionCalculator
        importeDeduccion = deduccionCalculator.calculaDeduccion(importeFactura, porcentajeDeduccion);
        // Calculamos el IVA utilizando el IvaCalculator
        importeIVA = ivaCalculator.calculaIva(importeFactura);
        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
