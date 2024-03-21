import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class ErpLctoTesourariaItens {
    private int id;
    private ErpLctoTesouraria erp_lcto_tesouraria_id;
    private double valor;
    private  SystemUnit system_unit_id;
    private LocalDateTime carimbo;

    public ErpLctoTesourariaItens(int id, ErpLctoTesouraria erp_lcto_tesouraria_id, double valor, SystemUnit system_unit_id, LocalDateTime carimbo) {
        this.id = id;
        this.erp_lcto_tesouraria_id = erp_lcto_tesouraria_id;
        this.valor = valor;
        this.system_unit_id = system_unit_id;
        this.carimbo = carimbo;
    }

    public int getId() {
        return id;
    }

    public ErpLctoTesouraria getErp_lcto_tesouraria_id() {
        return erp_lcto_tesouraria_id;
    }

    public double getValor() {
        return valor;
    }

    public SystemUnit getSystem_unit_id() {
        return system_unit_id;
    }

    public LocalDateTime getCarimbo() {
        return carimbo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setErp_lcto_tesouraria_id(ErpLctoTesouraria erp_lcto_tesouraria_id) {
        this.erp_lcto_tesouraria_id = erp_lcto_tesouraria_id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setSystem_unit_id(SystemUnit system_unit_id) {
        this.system_unit_id = system_unit_id;
    }

    public void setCarimbo(LocalDateTime carimbo) {
        this.carimbo = carimbo;
    }
}
