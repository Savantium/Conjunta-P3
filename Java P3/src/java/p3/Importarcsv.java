/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.p3;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 
 
public class Importarcsv {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
     
        List<Producto> usuarios = new ArrayList<>();
        CsvReader usuarios_import = new CsvReader("test/usuarios_import.csv");
        usuarios_import.readHeaders();
        while (usuarios_import.readRecord())
        {
            String codigo = usuarios_import.get(0);
            String nombres = usuarios_import.get(1);
            String cantidad = usuarios_import.get(2);
            String precio = usuarios_import.get(3);
            String codigoproveedor = usuarios_import.get(4);
            
            usuarios.add(new Producto(codigo, nombres, cantidad, precio, codigoproveedor));    
        }
        usuarios_import.close();
        usuarios.forEach((us) -> {
            System.out.println(us.getCodigo() + "  " + us.getNombres() + " "
                    + us.getCantidad() + "  " + us.getPrecio()+ "  "+us.getCodigoproveedor());
        });
    }
}

