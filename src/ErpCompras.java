import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpCompras {
    private int id;
    private String membro_requisicao;
    private SystemUsers membro_comprador_system_users;
    private ErpFormaPagamento erp_forma_pagamento_id;
    private ErpDestinacaoRecurso erp_destinacao_recurso_id;
    private ErpCotacao erp_cotacao_id;
    private double valor_total;
    private LocalDateTime data_compra;
    private ErpStatusCompra erp_status_compra_id;
    private boolean active;
    private LocalDateTime data_lancamento;


    public ErpCompras(int id, String membro_requisicao, SystemUsers membro_comprador_system_users,
                      ErpFormaPagamento erp_forma_pagamento_id, ErpDestinacaoRecurso erp_destinacao_recurso_id,
                      ErpCotacao erp_cotacao_id, double valor_toral, LocalDateTime data_compra,
                      ErpStatusCompra erp_status_compra_id, boolean active, LocalDateTime data_lancamento) {
        this.id = id;
        this.membro_requisicao = membro_requisicao;
        this.membro_comprador_system_users = membro_comprador_system_users;
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
        this.erp_destinacao_recurso_id = erp_destinacao_recurso_id;
        this.erp_cotacao_id = erp_cotacao_id;
        this.valor_total = valor_toral;
        this.data_compra = data_compra;
        this.erp_status_compra_id = erp_status_compra_id;
        this.active = active;
        this.data_lancamento = data_lancamento;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMembroRequisicao() {
        return membro_requisicao;
    }

    public void setMembroRequisicao(String membroRequisicao) {
        this.membro_requisicao = membroRequisicao;
    }

    public SystemUsers getMembroCompradorSystemUsers() {
        return membro_comprador_system_users;
    }

    public void setMembroCompradorSystemUsers(SystemUsers membro_Comprador_System_Users) {
        this.membro_comprador_system_users = membro_Comprador_System_Users;
    }

    public ErpFormaPagamento getErpFormaPagamento() {
        return erp_forma_pagamento_id;
    }

    public void setErpFormaPagamento(ErpFormaPagamento erp_forma_pagamento_id) {
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
    }

    public ErpDestinacaoRecurso getErpDestinacaoRecurso() {
        return erp_destinacao_recurso_id;
    }

    public void setErpDestinacaoRecurso(ErpDestinacaoRecurso erp_destinacao_recurso_id) {
        this.erp_destinacao_recurso_id = erp_destinacao_recurso_id;
    }

    public ErpCotacao getErpCotacao() {
        return erp_cotacao_id;
    }

    public void setErpCotacao(ErpCotacao erp_cotacao_id) {
        this.erp_cotacao_id = erp_cotacao_id;
    }

    public double getValorTotal() {
        return valor_total;
    }

    public void setValorTotal(double valor_Total) {
        this.valor_total = valor_Total;
    }

    public LocalDateTime getDataCompra() {
        return data_compra;
    }

    public void setDataCompra(LocalDateTime data_Compra) {
        this.data_compra = data_Compra;
    }

    public ErpStatusCompra getErpStatusCompra() {
        return erp_status_compra_id;
    }

    public void setErpStatusCompra(ErpStatusCompra erpStatusCompra) {
        this.erp_status_compra_id = erpStatusCompra;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getDataLancamento() {
        return data_lancamento;
    }

    public void setDataLancamento(LocalDateTime dataLancamento) {
        this.data_lancamento = dataLancamento;
    }
}