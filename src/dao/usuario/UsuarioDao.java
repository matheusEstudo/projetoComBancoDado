package dao.usuario;

import entidade.Usuario;
import java.sql.SQLException;
import java.util.List;

public interface UsuarioDao {

    void salvar(Usuario usuario) throws SQLException;

    void alterar(Usuario usuario) throws SQLException;

    void excluir(int id) throws SQLException;

    Usuario pesquisarPorId(int id) throws SQLException;

    Usuario pesquisarPorLoginSenha(String login, String senha) throws SQLException;

    List<Usuario> pesquisarPorNome(String nome) throws SQLException;

}
