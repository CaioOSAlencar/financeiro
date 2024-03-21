import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;


public class ErpUnidadeMedida {
    private int id;
    private String nome;
    private String descricao;
    private  boolean ativo;
    private LocalDateTime data_lancamento;

    public ErpUnidadeMedida(int id, String nome, String descricao, boolean ativo, LocalDateTime data_lancamento){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ativo = ativo;
        this.data_lancamento = data_lancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public static boolean getAtivo() {
        return getAtivo();
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
