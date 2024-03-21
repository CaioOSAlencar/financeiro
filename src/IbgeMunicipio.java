import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class IbgeMunicipio {
    private int id;
    private int codigo;
    private String nome;
    private IbgeEstados ibge_estado_id;
    private String cidade_correspondente;
    private int cep;

    // Construtor
    public IbgeMunicipio(int id, int codigo, String nome, IbgeEstados ibge_estado_id, String cidade_correspondente,
                         int cep){
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.ibge_estado_id = ibge_estado_id;
        this.cidade_correspondente = cidade_correspondente;
        this.cep = cep;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public IbgeEstados getIbge_estado_id() {
        return ibge_estado_id;
    }

    public void setIbge_estado_id(IbgeEstados ibge_estado_id) {
        this.ibge_estado_id = ibge_estado_id;
    }

    public String getCidade_correspondente() {
        return cidade_correspondente;
    }

    public void setCidade_correspondente(String cidade_correspondente) {
        this.cidade_correspondente = cidade_correspondente;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}