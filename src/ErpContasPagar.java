import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpContasPagar {
    private int id;
    private LocalDateTime data_emissao;
    private LocalDateTime data_vencimento;
    private LocalDateTime data_pgto;
    private double valor;
    private String status_pagamento;
    private String chave_nfe;
    private int responsavel_id;
    private ErpLctoHistorico erp_lcto_historico_id;
    private ErpDestinacaoRecurso erp_destinacao_recurso_id;
    private ErpFormaPagamento erp_forma_pagamento_id;
    private int conta_debito;
    private ErpPessoaFornecedor erp_pessoa_fornecedor_id;
    private boolean ativo;
    private boolean transferido_tesouraria;

    public ErpContasPagar (int id, LocalDateTime data_emissao, LocalDateTime data_vencimento, LocalDateTime data_pgto,
                           double valor, String status_pagamento, String chave_nfe, int responsavel_id, ErpLctoHistorico erp_lcto_historico_id,
                           ErpFormaPagamento erpFormaPagamento, int conta_debito, ErpPessoaFornecedor erp_pessoa_fornecedor_id, boolean ativo,
                           boolean transferido_tesouraria){
        this.id = id;
        this.data_emissao = data_emissao;
        this.data_vencimento = data_vencimento;
        this.data_pgto = data_pgto;
        this.valor = valor;
        this.status_pagamento = status_pagamento;
        this.chave_nfe = chave_nfe;
        this.responsavel_id = responsavel_id;
        this.erp_lcto_historico_id = erp_lcto_historico_id;
        this.erp_destinacao_recurso_id = erp_destinacao_recurso_id;
        this.erp_forma_pagamento_id = erpFormaPagamento;
        this.conta_debito = conta_debito;
        this.erp_pessoa_fornecedor_id = erp_pessoa_fornecedor_id;
        this.ativo = ativo;
        this.transferido_tesouraria = transferido_tesouraria;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getData_emissao() {
        return data_emissao;
    }
    public void setData_emissao(LocalDateTime data_emissao) {
        this.data_emissao = data_emissao;
    }

    public LocalDateTime getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(LocalDateTime data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public LocalDateTime getData_pgto() {
        return data_pgto;
    }

    public void setData_pgto(LocalDateTime data_pgto) {
        this.data_pgto = data_pgto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }

    public String getChave_nfe() {
        return chave_nfe;
    }

    public void setChave_nfe(String chave_nfe) {
        this.chave_nfe = chave_nfe;
    }

    public int getResponsavel_id() {
        return responsavel_id;
    }

    public void setResponsavel_id(int responsavel_id) {
        this.responsavel_id = responsavel_id;
    }

    public ErpLctoHistorico getErp_lcto_historico_id() {
        return erp_lcto_historico_id;
    }

    public void setErp_lcto_historico_id(ErpLctoHistorico erp_lcto_historico_id) {
        this.erp_lcto_historico_id = erp_lcto_historico_id;
    }

    public ErpDestinacaoRecurso getErp_destinacao_recurso_id() {
        return erp_destinacao_recurso_id;
    }

    public void setErp_destinacao_recurso_id(ErpDestinacaoRecurso erp_destinacao_recurso_id) {
        this.erp_destinacao_recurso_id = erp_destinacao_recurso_id;
    }

    public ErpFormaPagamento getErp_forma_pagamento_id() {
        return erp_forma_pagamento_id;
    }

    public void setErp_forma_pagamento_id(ErpFormaPagamento erp_forma_pagamento_id) {
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
    }

    public int getConta_debito() {
        return conta_debito;
    }

    public void setConta_debito(int conta_debito) {
        this.conta_debito = conta_debito;
    }

    public ErpPessoaFornecedor getErp_pessoa_fornecedor_id() {
        return erp_pessoa_fornecedor_id;
    }

    public void setErp_pessoa_fornecedor_id(ErpPessoaFornecedor erp_pessoa_fornecedor_id) {
        this.erp_pessoa_fornecedor_id = erp_pessoa_fornecedor_id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isTransferido_tesouraria() {
        return transferido_tesouraria;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setTransferido_tesouraria(boolean transferido_tesouraria) {
        this.transferido_tesouraria = transferido_tesouraria;
    }
}
