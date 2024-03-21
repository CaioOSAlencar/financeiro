import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpCotacao {
    private int id;
    private String finalidade;
    private ErpPessoaFornecedor erp_pessoa_fornecedor_id;
    private  LocalDateTime vencimento_proposta;
    private double valor_total;
    private  boolean ativo;

    public ErpCotacao(int id, String finalidade, ErpCotacao erpCotacao,
                      LocalDateTime vencimento_proposta, double valor_total, boolean ativo){
    this.id = id;
    this.finalidade = finalidade;
    this.erp_pessoa_fornecedor_id = erp_pessoa_fornecedor_id;
    this.vencimento_proposta = vencimento_proposta;
    this.valor_total = valor_total;
    this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public ErpPessoaFornecedor getErp_pessoa_fornecedor_id() {
        return erp_pessoa_fornecedor_id;
    }

    public LocalDateTime getVencimento_proposta() {
        return vencimento_proposta;
    }

    public double getValor_total() {
        return valor_total;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public void setErp_pessoa_fornecedor_id(ErpPessoaFornecedor erp_pessoa_fornecedor_id) {
        this.erp_pessoa_fornecedor_id = erp_pessoa_fornecedor_id;
    }

    public void setVencimento_proposta(LocalDateTime vencimento_proposta) {
        this.vencimento_proposta = vencimento_proposta;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
