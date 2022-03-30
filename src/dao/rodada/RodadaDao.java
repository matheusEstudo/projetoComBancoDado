package dao.rodada;

import entidade.Rodada;
import java.sql.SQLException;
import java.util.List;

public interface RodadaDao {

    void salvar(Rodada rodada) throws SQLException;

    List<Rodada> mostrar() throws SQLException;

}
