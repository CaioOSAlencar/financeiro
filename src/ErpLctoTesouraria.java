import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpLctoTesouraria {
    private int id;
    private LocalDateTime data_pgto;
    private ErpFormaPagamento erp_forma_pagamento_id;
    private  ErpLctoHistorico erp_lcto_historico_id;
    private int conta_debito;
    private int conta_credito;
    private double valor;
    private LocalDateTime carimbo;
    private boolean ativo;
    private int responsavel_id;
    private ErpContasPagar erp_contas_pagar_id;
    private ErpContasReceber erp_contas_receber_id;

    public ErpLctoTesouraria(int id, LocalDateTime data_pgto, ErpFormaPagamento erp_forma_pagamento_id, ErpLctoHistorico erp_lcto_historico_id, int conta_debito, int conta_credito, double valor, LocalDateTime carimbo, boolean ativo, int responsavel_id, ErpContasPagar erp_contas_pagar_id, ErpContasReceber erp_contas_receber_id) {
        this.id = id;
        this.data_pgto = data_pgto;
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
        this.erp_lcto_historico_id = erp_lcto_historico_id;
        this.conta_debito = conta_debito;
        this.conta_credito = conta_credito;
        this.valor = valor;
        this.carimbo = carimbo;
        this.ativo = ativo;
        this.responsavel_id = responsavel_id;
        this.erp_contas_pagar_id = erp_contas_pagar_id;
        this.erp_contas_receber_id = erp_contas_receber_id;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData_pgto() {
        return data_pgto;
    }

    public ErpFormaPagamento getErp_forma_pagamento_id() {
        return erp_forma_pagamento_id;
    }

    public ErpLctoHistorico getErp_lcto_historico_id() {
        return erp_lcto_historico_id;
    }

    public int getConta_debito() {
        return conta_debito;
    }

    public int getConta_credito() {
        return conta_credito;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getCarimbo() {
        return carimbo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public int getResponsavel_id() {
        return responsavel_id;
    }

    public ErpContasPagar getErp_contas_pagar_id() {
        return erp_contas_pagar_id;
    }

    public ErpContasReceber getErp_contas_receber_id() {
        return erp_contas_receber_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData_pgto(LocalDateTime data_pgto) {
        this.data_pgto = data_pgto;
    }

    public void setErp_forma_pagamento_id(ErpFormaPagamento erp_forma_pagamento_id) {
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
    }

    public void setErp_lcto_historico_id(ErpLctoHistorico erp_lcto_historico_id) {
        this.erp_lcto_historico_id = erp_lcto_historico_id;
    }

    public void setConta_debito(int conta_debito) {
        this.conta_debito = conta_debito;
    }

    public void setConta_credito(int conta_credito) {
        this.conta_credito = conta_credito;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCarimbo(LocalDateTime carimbo) {
        this.carimbo = carimbo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setResponsavel_id(int responsavel_id) {
        this.responsavel_id = responsavel_id;
    }

    public void setErp_contas_pagar_id(ErpContasPagar erp_contas_pagar_id) {
        this.erp_contas_pagar_id = erp_contas_pagar_id;
    }

    public void setErp_contas_receber_id(ErpContasReceber erp_contas_receber_id) {
        this.erp_contas_receber_id = erp_contas_receber_id;
    }
}
