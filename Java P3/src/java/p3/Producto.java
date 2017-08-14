/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.p3;

 
public class Producto {
    
    private String codigo;
    private String nombres;
    private String cantidad;
    private String precio;
    private String codigoproveedor;
 
    public Producto(String codigo, String nombres, String cantidad, String precio,String codigoproveedor) {
        setCodigo(codigo);
        setNombres(nombres);
        setCantidad(cantidad);
        setPrecio(precio);
        setCodigoproveedor(codigoproveedor);
    }
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the codigoproveedor
     */
    public String getCodigoproveedor() {
        return codigoproveedor;
    }

    /**
     * @param codigoproveedor the codigoproveedor to set
     */
    public void setCodigoproveedor(String codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }
 
}
    
 
  