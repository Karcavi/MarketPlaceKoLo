/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.konrad.marketkolo.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author IAN
 */
@Entity
public class FacturaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFactura;

    /**
     * Nombre del Danco para la tarjeta Debito
     */
    @Column(name = "nombre_Banco_Debito")
    private String nomBancoDebito;

    /**
     * Numero de cuenta para la tarjeta Debito
     */
    @Column(name = "numero_Cuenta_Debito")
    private int numeroCuentaDebito;
    /**
     * Fecha de la compra
     */
    @Column(name = "fecha_Compra")
    private String fechaCompra;
    /**
     * Precio total a pagar
     */
    @Column(name = "precio_Total")
    private int precioTotal;
    /**
     * Nombre de la Franquicia para la tarjeta Credito
     */
    @Column(name = "nombre_FranquiciaCredito")
    private String nomFranquiciaCredito;
    /**
     * Numero de la Tarjeta de Credito
     */
    @Column(name = "numero_Tarjeta_Credito")
    private int numTarjetaCredito;
    /**
     * Fecha de vencimiento para la tarjeta Credito
     */
    @Column(name = "fecha_Vencimiento_Credito")
    private String fechaVencimientoCredito;
    /**
     * Codigo clave para tarjeta Credito
     */
    @Column(name = "cod_Clave_Credito")
    private int codClaveCredito;
    /**
     * Direccion de envio del Cliente
     */
    @Column(name = "direccion_Envio")
    private String direccionEnvio;
    /**
     * Ciudad de envio del Cliente
     */
    @Column(name = "ciudad_Envio")
    private String ciudadEnvio;
    /**
     * Pais de envio del Cliente
     */
    @Column(name = "pais_Envio")
    private String paisEnvio;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Banco", nullable = false, referencedColumnName = "idBanco")
    /*Relacion muchos a uno con la tabla Banco*/
    private BancoEntity banco;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Franquicia", nullable = false, referencedColumnName = "idFranquicia")
    /*Relacion muchos a uno con la tabla Franquicia*/
    private FranquiciaEntity franquicia;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_TipoPago", nullable = false, referencedColumnName = "idTipoPago")
    /*Relacion muchos a uno con la tabla TipoPago*/
    private TipoPagoEntity tipoPago;

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public String getNomBancoDebito() {
        return nomBancoDebito;
    }

    public void setNomBancoDebito(String nomBancoDebito) {
        this.nomBancoDebito = nomBancoDebito;
    }

    public int getNumeroCuentaDebito() {
        return numeroCuentaDebito;
    }

    public void setNumeroCuentaDebito(int numeroCuentaDebito) {
        this.numeroCuentaDebito = numeroCuentaDebito;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getNomFranquiciaCredito() {
        return nomFranquiciaCredito;
    }

    public void setNomFranquiciaCredito(String nomFranquiciaCredito) {
        this.nomFranquiciaCredito = nomFranquiciaCredito;
    }

    public int getNumTarjetaCredito() {
        return numTarjetaCredito;
    }

    public void setNumTarjetaCredito(int numTarjetaCredito) {
        this.numTarjetaCredito = numTarjetaCredito;
    }

    public String getFechaVencimientoCredito() {
        return fechaVencimientoCredito;
    }

    public void setFechaVencimientoCredito(String fechaVencimientoCredito) {
        this.fechaVencimientoCredito = fechaVencimientoCredito;
    }

    public int getCodClaveCredito() {
        return codClaveCredito;
    }

    public void setCodClaveCredito(int codClaveCredito) {
        this.codClaveCredito = codClaveCredito;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getCiudadEnvio() {
        return ciudadEnvio;
    }

    public void setCiudadEnvio(String ciudadEnvio) {
        this.ciudadEnvio = ciudadEnvio;
    }

    public String getPaisEnvio() {
        return paisEnvio;
    }

    public void setPaisEnvio(String paisEnvio) {
        this.paisEnvio = paisEnvio;
    }

    public BancoEntity getBanco() {
        return banco;
    }

    public void setBanco(BancoEntity banco) {
        this.banco = banco;
    }

    public FranquiciaEntity getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(FranquiciaEntity franquicia) {
        this.franquicia = franquicia;
    }

    public TipoPagoEntity getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPagoEntity tipoPago) {
        this.tipoPago = tipoPago;
    }

}
