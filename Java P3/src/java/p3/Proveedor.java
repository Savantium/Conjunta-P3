
package java.p3;

/*
 *
 * @author Labs-DECC
 */
public class Proveedor {
    private String codigo;
    private String nombres;
    private String telefono;
    
    public Proveedor(String codigo, String nombres, String telefono){
        setCodigo(codigo);
        setNombres(nombres);
        setTelefono(telefono);
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
