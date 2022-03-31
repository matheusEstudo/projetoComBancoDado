package dao.usuario;

import dao.FabricaConexao;
import dao.usuario.UsuarioDao;
import entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDao {

    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;
    private Usuario usurio = null;

    @Override
    public void salvar(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario(nome, usuario, senha)"
                + " VALUES(?, ?, ?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            preparaSql.setString(1, usuario.getNome());
            preparaSql.setString(2, usuario.getUsuario());
            preparaSql.setString(3, usuario.getSenha());
            preparaSql.executeUpdate();
            resultado = preparaSql.getGeneratedKeys();
            resultado.next();
            usuario.setId(resultado.getInt(1));
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Erro ao salvar usuário ");
        } finally {
            conexao.close();
            preparaSql.close();
            resultado.close();
        }
    }

    @Override
    public void alterar(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET nome = ?, login = ?, "
                + "senha = ? WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, usuario.getNome());
            preparaSql.setString(2, usuario.getUsuario());
            preparaSql.setString(3, usuario.getSenha());
            preparaSql.setInt(4, usuario.getId());
            preparaSql.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage()
                    + "Erro ao alterar usuario ");
        } finally {
            conexao.close();
            preparaSql.close();
        }
    }

    @Override
    public void excluir(int id) throws SQLException {
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao
                    .prepareStatement("DELETE FROM usuario WHERE id = ?");
            preparaSql.setInt(1, id);
            preparaSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao excluir usuario "
                    + e.getMessage());
        } finally {
            conexao.close();
            preparaSql.close();
        }
    }

    @Override
    public Usuario pesquisarPorId(int id) throws SQLException {
        String consulta = "SELECT * FROM usuario WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(consulta);
            preparaSql.setInt(1, id);
            resultado = preparaSql.executeQuery();
            if (resultado.next()) {
                usurio = new Usuario();
                usurio.setId(resultado.getInt("id"));
                usurio.setNome(resultado.getString("nome"));
                usurio.setUsuario(resultado.getString("usuario"));
                usurio.setSenha(resultado.getString("senha"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar por id "
                    + e.getMessage());
        }
        return usurio;
    }

    @Override
    public List<Usuario> pesquisarPorNome(String nome) throws SQLException {
        String consulta = "SELECT * FROM cliente WHERE nome LIKE ?";
        List<Usuario> usuarios = new ArrayList<>();
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(consulta);
            preparaSql.setString(1, "%" + nome + "%");
            resultado = preparaSql.executeQuery();
            while (resultado.next()) {
                usurio = new Usuario();
                usurio.setId(resultado.getInt("id"));
                usurio.setNome(resultado.getString("nome"));
                usurio.setUsuario(resultado.getString("usuario"));
                usurio.setSenha(resultado.getString("senha"));
                usuarios.add(usurio);
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar por nome "
                    + e.getMessage());
        } finally {
            conexao.close();
            preparaSql.close();
            resultado.close();
        }
        return usuarios;
    }

    @Override
    public Usuario pesquisarPorLoginSenha(String login, String senha) throws SQLException {
        String consulta = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(consulta);
            preparaSql.setString(1, login);
            preparaSql.setString(2, senha);
            resultado = preparaSql.executeQuery();
            if (resultado.next()) {
                usurio = new Usuario();
                usurio.setId(resultado.getInt("id"));
                usurio.setNome(resultado.getString("nome"));
                usurio.setUsuario(resultado.getString("usuario"));
                usurio.setSenha(resultado.getString("senha"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar por id "
                    + e.getMessage());
        }
        return usurio;
    }

    @Override
    public void altDataAcesso(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET dataAcesso = now() WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setInt(1, usuario.getId());
            preparaSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao tentar alterar o usuario no banco" + e.getMessage());
        } finally {
            conexao.close();
            preparaSql.close();
        }
    }

}
