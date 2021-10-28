package proyecto;
import java.io.*;
import javax.swing.JOptionPane;


public class metodos {
    File archivo;
    FileReader fr;
    BufferedReader br;
    FileWriter archivoSalida = null;
    PrintWriter pw=null;
    String linea;
    String productos="";
    FileWriter fw;
    BufferedWriter bw;
    String aux="";
    String Out="";
    double Suma=0;
        double ResultadoTotal=0;
        double iva;
    
  
    
    public void ingresarProductos() throws IOException{
        int cantidad;
        String producto;
        double cantidadP;
        double resultado;
        int cc = 0;
        
        int count=1;
        
        double pu;
        do{
          
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Productos deseas Ingresar"));
            while(cantidad>0){
            producto = JOptionPane.showInputDialog("Producto");
            cantidadP = Double.parseDouble(JOptionPane.showInputDialog("Cantidad"));
            pu = Double.parseDouble(JOptionPane.showInputDialog("Precio Unitario"));
            resultado = cantidadP*pu;
            aux = producto+"\n"+"Cantidad: "+cantidadP+", PU: "+pu+", Costo: "+ resultado+"\n"+aux;
            Suma+=resultado;
            cc+=cantidadP;
            cantidad--;
            count++;
            }
            
            iva = Suma*.16;
            ResultadoTotal = Suma+iva;
            double efec = Double.parseDouble(JOptionPane.showInputDialog("Se debe: "+ ResultadoTotal+"\nCantida a pagar"));
            double residuo = efec-ResultadoTotal;
            aux = aux+"\n"+"Catidad: "+cc+"\n"+"SubTotal: "+Suma+"\n"+"IVA: "+iva+"\n"+"Total: "
                   +ResultadoTotal+"\n"+"Efectivo: "+efec+"\nCambio: "+residuo;
        
            JOptionPane.showMessageDialog(null,aux);
        }
        while(cantidad!=0);
        
       
     }
    public void ImprimirDocumento() throws IOException{
        try{
        archivoSalida = new FileWriter("C:\\Users\\Dell\\Documents\\Luis TecNM\\Semestre 2\\POO\\reporte.txt");
        pw = new PrintWriter(archivoSalida);
        pw.write(aux);
         pw.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
     
     }
        
    
    }
    
