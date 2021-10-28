package proyecto;

import java.io.IOException;
import javax.swing.JOptionPane;

public class PROYECTO {
    public static void main(String[] args) throws IOException {
        metodos mt = new metodos();
        String scape;
        Object [] valoresSelecciona ={"Registrar Venta","Generar Comprobante","Salir"};
        do{
        
        Object seleccion = JOptionPane.showInputDialog(null,"Selecciona una opcion: ", "Menu",
                            JOptionPane.PLAIN_MESSAGE,null,valoresSelecciona,valoresSelecciona[0]);
        scape = seleccion.toString();
        
            if(scape.equals("Registrar Venta")){
                mt.ingresarProductos();
                //mt.cuentaCero();
                //mt.imprimeCuenta();
            }else if(scape.equals("Generar Comprobante")){
                mt.ImprimirDocumento();
            }
        }
        while(!scape.equals("Salir"));
    }
    
}