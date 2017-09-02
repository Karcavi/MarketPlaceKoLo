
package javaapplication12;

public class CarritoCompra {
    protected int idCompra,idCliente;
    protected String producto,cantidadProducto,fechaCarrito;

    public int getIdCompra() {
        return idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getProducto() {
        return producto;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public String getFechaCarrito() {
        return fechaCarrito;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setFechaCarrito(String fechaCarrito) {
        this.fechaCarrito = fechaCarrito;
    }
    
}
