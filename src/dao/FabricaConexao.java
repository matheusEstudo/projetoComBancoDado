package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {

    public static Connection abrirConexao() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager
                .getConnection("jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=America/Sao_Paulo&zeroDateTimeBehavior=convertToNull",
                        "root", "Senac2021");
    }
}
