import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpPlanoContas {
    private int id;
    private  String conta;
    private  String descricao;
    private boolean ativo;
    private LocalDateTime data_lancamento;
    private  String tipo_conta;
    private int nivel_herarquico;
    private LocalDateTime data_inicio;
    private double saldo_inicio;

    public ErpPlanoContas(int id, String conta, String descricao, boolean ativo, LocalDateTime data_lancamento, String tipo_conta, int nivel_herarquico, LocalDateTime data_inicio, double saldo_inicio) {
        this.id = id;
        this.conta = conta;
        this.descricao = descricao;
        this.ativo = ativo;
        this.data_lancamento = data_lancamento;
        this.tipo_conta = tipo_conta;
        this.nivel_herarquico = nivel_herarquico;
        this.data_inicio = data_inicio;
        this.saldo_inicio = saldo_inicio;
    }

    public int getId() {
        return id;
    }

    public String getConta() {
        return conta;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public int getNivel_herarquico() {
        return nivel_herarquico;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public double getSaldo_inicio() {
        return saldo_inicio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public void setNivel_herarquico(int nivel_herarquico) {
        this.nivel_herarquico = nivel_herarquico;
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public void setSaldo_inicio(double saldo_inicio) {
        this.saldo_inicio = saldo_inicio;
    }
}
