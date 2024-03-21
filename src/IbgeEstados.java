import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class IbgeEstados {
    private int id;
    private int codigouf;
    private String name;
    private String uf;
    private IbgeRegiao ibge_regiao_id;

    // Construtor
    public IbgeEstados() {}

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigouf() {
        return codigouf;
    }

    public void setCodigouf(int codigouf) {
        this.codigouf = codigouf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public IbgeRegiao getIbge_regiao_id() {
        return ibge_regiao_id;
    }

    public void setIbge_regiao_id(IbgeRegiao ibge_regiao_id) {
        this.ibge_regiao_id = ibge_regiao_id;
    }
}