import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpComprasItens {
    private int id;
    private double valor;
    private ErpProdutos erp_produtos_id;
    private double qtd;
    private ErpCompras erp_compras_id;
    private LocalDateTime data_lancamento;

    public ErpComprasItens(int id, double valor, ErpProdutos erp_produtos_id, double qtd,
                           ErpCompras erp_compras_id, LocalDateTime data_lancamento){
        this.id = id;
        this.valor = valor;
        this.erp_produtos_id = erp_produtos_id;
        this.qtd = qtd;
        this.erp_compras_id = erp_compras_id;
        this.data_lancamento = data_lancamento;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public ErpProdutos getErp_produtos_id(){
        return erp_produtos_id;
    }
    public void setErp_produtos_id(ErpProdutos erp_produtos_id){
        this.erp_produtos_id = erp_produtos_id;
    }
    public double getQtd(){
        return qtd;
    }
    public void setQtd(double qtd){
        this.qtd = qtd;
    }
    public ErpCompras getErp_compras_id(){
        return erp_compras_id;
    }
    public void setErp_compras_id(ErpCompras erp_compras_id){
        this.erp_compras_id = erp_compras_id;
    }
    public LocalDateTime getData_lancamento(){
        return data_lancamento;
    }
    public void setData_lancamento(LocalDateTime data_lancamento){
        this.data_lancamento = data_lancamento;
    }
}
