import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {

    private Integer id;
    private String tipo;
    private Date dataDeEntrada;
    private String localDeCompra;
    private String marca;
    private String caracteristicas;
    private Tamanho tamanho;
    private Cor cor;
    private Float valorEtiqueta;
    private Float valorPago;
    private Float valorLucro;
    private Float precoSugerido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getLocalDeCompra() {
        return localDeCompra;
    }

    public void setLocalDeCompra(String localDeCompra) {
        this.localDeCompra = localDeCompra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public Float getValorEtiqueta() {
        return valorEtiqueta;
    }

    public void setValorEtiqueta(Float valorEtiqueta) {
        this.valorEtiqueta = valorEtiqueta;
    }

    public Float getValorLucro() {
        return valorLucro;
    }

    public void setValorLucro(Float valorLucro) {
        this.valorLucro = valorLucro;
    }

    public Float getPrecoSugerido() {
        return precoSugerido;
    }

    public void setPrecoSugerido(Float precoSugerido) {
        this.precoSugerido = precoSugerido;
    }

    public Tamanho getTamanho() { return tamanho; }

    public void setTamanho(Tamanho tamanho) { this.tamanho = tamanho; }

    @Override
    public String toString() {
        return  "id = " + id + " - " +
                "tipo = " + tipo + " - " +
                "dataDeEntrada = " + dataDeEntrada + " - " +
                "localDeCompra = " + localDeCompra + " - " +
                "marca = " + marca + " - " +
                "caracteristicas = " + caracteristicas + " - " +
                "tamanho = " + tamanho + " - " +
                "cor = " + cor +  " - " +
                "valorEtiqueta = " + valorEtiqueta + " - " +
                "cor = " + cor + " - " +
                "valorPago = " + valorPago + " - " +
                "valorLucro = " + valorLucro + " - " +
                "precoSugerido = " + precoSugerido;
    }
}
