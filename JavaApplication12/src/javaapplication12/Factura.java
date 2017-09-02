
package javaapplication12;

public class Factura {
    protected int idFactura,idtarjeta,tipoTarjeta,precioTotal;
    protected String fechaCompra,productoCompra;

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setIdtarjeta(int idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public void setTipoTarjeta(int tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setProductoCompra(String productoCompra) {
        this.productoCompra = productoCompra;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public int getIdtarjeta() {
        return idtarjeta;
    }

    public int getTipoTarjeta() {
        return tipoTarjeta;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getProductoCompra() {
        return productoCompra;
    }
    
}
