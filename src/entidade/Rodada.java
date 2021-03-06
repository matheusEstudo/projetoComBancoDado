package entidade;

public class Rodada {

    private Integer id;
    private Integer Numero_certo;
    private Integer tentativa;
    private Integer id_usuario;
    private String resultado;

    public Rodada() {
    }

    public Rodada(Integer Numero_certo, Integer tentativa, String resultado) {
        this.Numero_certo = Numero_certo;
        this.tentativa = tentativa;
        this.resultado= resultado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero_certo() {
        return Numero_certo;
    }

    public void setNumero_certo(Integer Numero_certo) {
        this.Numero_certo = Numero_certo;
    }

    public Integer getTentativa() {
        return tentativa;
    }

    public void setTentativa(Integer tentativa) {
        this.tentativa = tentativa;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    

}
