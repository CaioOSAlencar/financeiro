import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpFormaPagamento {
    private int id;
    private String nome;
    private String descricao;
    private boolean ativo;
    private LocalDateTime data_lancamento;

    public ErpFormaPagamento(int id, String nome, String descricao, boolean ativo, LocalDateTime data_lancamento) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ativo = ativo;
        this.data_lancamento = data_lancamento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
