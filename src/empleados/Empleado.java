/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 * 
 * @author jesus
 */

/**
 * <h2> Una clase para atribuir los métodos de empleado </h2>
 * @version 1.0, 04/03/2022
 * @since 04-03-2022
 */



//Clase Empleado
public class Empleado {
   
    private static double pagoPorHoraExtra; //atributo de clase
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private double tipoIRPF;
    private char casado;  //S ó N
    private int numeroHijos;
   
    //Constructor por defecto
    public Empleado() {
    }

    //Constructor con un parámetro
    /**
     * 
     * @param nif cadena de empleado
     */
    public Empleado(String nif) {
        this.nif = nif;
    }

    //Métodos get/set
    /**
     * 
     * @return el empleado casado
     */
    public char getCasado() {
        return casado;
    }
    /**
     * 
     * @param casado variable
     */

    public void setCasado(char casado) {
        this.casado = casado;
    }

    public int getHorasExtras() {
        return horasExtras;
    }
    /**
     * 
     * @param horasExtras 
     */

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    /**
     * 
     * @return variable Horas extras 
     */

    public String getNif() {
        return nif;
    }
    /**
     * 
     * @param nif 
     */

    public void setNif(String nif) {
        this.nif = nif;
    }
    /**
     * 
     * @return variable nif
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return variable nombre
     */

    public int getNumeroHijos() {
        return numeroHijos;
    }
    /**
     * 
     * @param numeroHijos 
     */

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    /**
     * 
     * @return variable numeros hijos
     */

    public double getSueldoBase() {
        return sueldoBase;
    }
    /**
     * 
     * @param sueldoBase 
     */

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    /**
     * 
     * @return variable sueldoBase 
     */

    public double getTipoIRPF() {
        return tipoIRPF;
    }
    /**
     * 
     * @param tipoIRPF 
     */

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }
    /**
     * 
     * @return variable tipoIRPF
     */

    //métodos get/set para el atributo static
    /**
     * 
     * @return métodos get set
     */
    public static double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }
    /**
     * 
     * @param pagoPorHoraExtra 
     */

    public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
    }
   /**
    * 
    * @return variable pagoPorHorasExtras
    */
   
    //calcular el importe de las horas extra
    public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }
    /**
     * 
     * @return CalcularElImportePorHorasExtra
     */
   
    //calcular el sueldo bruto
    public double calcularSueldoBruto(){
        return sueldoBase + calcularImporteHorasExtras();
    }
    /**
     * 
     * @return sueldoBruto
     */
   
    //calcular el importe de las retencion por IRPF
    public double calcularRetencionIrpf(){
        double tipo = tipoIRPF;
        if(casado == 's' || casado == 'S') {
            tipo = tipo - 2; //2 puntos menos si está casado
        }
        tipo = tipo - numeroHijos; //un punto menos por cada hijo                                                 
        if(tipo<0){
            tipo = 0;
        }
        return calcularSueldoBruto() * tipo / 100;
    }
   /**
    * 
    * @return retencionIRPF
    */
    //calcular el importe liquido a cobrar
    public double calcularSueldo(){
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }
    /**
     * 
     * @return importeACobrar
     */

    //mostrar los datos de un trabajador
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNif: ");
        sb.append(nif);
        sb.append("\nSueldo Base: ");
        sb.append(sueldoBase);
        sb.append("\nHoras Extras: ");
        sb.append(horasExtras);
        sb.append("\ntipo IRPF: ");
        sb.append(tipoIRPF);
        sb.append("\nCasado: ");
        sb.append(casado);
        sb.append("\nNúmero de Hijos: ");
        sb.append(numeroHijos);
        return  sb.toString();
    }
    /**
     * 
     * @return datosDeUnTrabajador
     */
}//Fin de la Clase Empleado