
package dao.rodada;

import dao.FabricaConexao;
import entidade.Rodada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class RodadaImplDao implements RodadaDao{
    
    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;
    private Rodada rodada;

    @Override
    public void salvar(Rodada rodada) throws SQLException {
         String sql = "INSERT INTO jogadas(numeroCerto, tentativa, id_usuario)"
                + " VALUES(?, ?, ?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            preparaSql.setInt(1, rodada.getNumero_certo());
            preparaSql.setInt(2, rodada.getTentativa());
            preparaSql.setInt(3, rodada.getId_usuario());
            preparaSql.executeUpdate();
            resultado = preparaSql.getGeneratedKeys();
            resultado.next();
            rodada.setId(resultado.getInt(1));
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Erro ao salvar rodada ");
        } finally {
            conexao.close();
            preparaSql.close();
            resultado.close();
        }
    }

    @Override
    public List<Rodada> mostrar() throws SQLException {
        String consulta = "SELECT * FROM jogadas";
        List<Rodada> rodadas = new ArrayList<>();
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(consulta);
            resultado = preparaSql.executeQuery();
            while (resultado.next()) {
                rodada = new Rodada();
                rodada.setId(resultado.getInt("id"));
                rodada.setNumero_certo(resultado.getInt("numeroCerto"));
                rodada.setTentativa(resultado.getInt("tentativa"));
                rodada.setId_usuario(resultado.getInt("id_usuario"));
                
                rodadas.add(rodada);
            }

        } catch (Exception e) {
            System.out.println("Erro ao mostrar "
                    + e.getMessage());
        } finally {
            conexao.close();
            preparaSql.close();
            resultado.close();
        }
        return rodadas;
    }
    
}
