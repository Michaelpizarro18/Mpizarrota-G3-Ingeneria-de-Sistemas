package pe.edu.ucv.BD.Model;

public class E_Venta {
    
    int idVenta;
    int fecha;
    int idProveedor;

    public E_Venta(int idVenta, int idProveedor) {
        this.idVenta = idVenta;
        this.idProveedor = idProveedor;
    }
    
    public void GuardarVentaBD(){
        
    }
}
