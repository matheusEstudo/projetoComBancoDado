package util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeradorUtil {

//Crie um método que receba por parâmetro a quantidade de numeros para 
//gerar aleatória de 0 à 9 e retorne esses números em tipo String.
    public static String gerarNumero(int quantidade) {
        String numero = "";
        for (int i = 0; i < quantidade; i++) {
            numero += (int) (Math.random() * 10);
        }
        return numero;
    }

// criar um método que devolva um valor de CNPJ 99.999.999/9999-99 
    public static String gerarFormatarCnpj() {
        String cnpj = gerarNumero(14);

        return cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "."
                + cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-"
                + cnpj.substring(12);
    }

//Criar um método que retorne um cpf qualquer (não validado) cpf 999.999.999-99 
    public static String gerarFormatarCpf() {
        String cpf = gerarNumero(11);

        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
                + cpf.substring(6, 9) + "-" + cpf.substring(9);

    }

//Criar um metodo que solicite a quantidade de digitos para senha alfanumérica 
//e devolva a senha em tipo String
    public static String gerarSenha(int quantidade) {
        String[] altaNumerico = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b",
            "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String senha = "";

        for (int i = 0; i < quantidade; i++) {
            senha += altaNumerico[(int) (Math.random() * altaNumerico.length)];
        }
        return senha;
    }

//criar um método que devolva um valor telefone fixo. Começar com (48)3XXX-XXXX
    public static String gerarTelefone() {
        String numero = "483";
        numero += gerarNumero(7);
        return "(" + numero.substring(0, 2) + ")" + numero.substring(2, 6) + "-"
                + numero.substring(6);
    }

//criar um método que devolva um valor telefone celular. Começar com (48)9XXXX-XXXX
    public static String gerarCelular() {
        String numero = "489";
        numero += gerarNumero(8);
        return "(" + numero.substring(0, 2) + ")" + numero.substring(2, 7) + "-"
                + numero.substring(7);
    }

//criar um método que devolva um valor do CEP usando máscara (99999-999)
    public static String gerarCep() {
        String cep = "";
        cep += gerarNumero(8);
        return cep.substring(0, 6) + "-" + cep.substring(6);
    }

//criar um método que devolva um valor para nome (Vamos criar um vetor com 
//alguns nomes)
    public static String gerarNome() {
        List<String> listaNome = Arrays.asList("matheus", "jonathas", "vitor",
                "nataly", "luiza", "maria", "silvio",
                "joão", "vinicius", "heloisa", "livia",
                "luciana", "carlos", "carla", "mário");
        Collections.shuffle(listaNome);

        return listaNome.get(0);
    }

//criar um método que devolva um valor para login (Sugestão: chamar o método 
//gerarNome, deixar a primeira letra em minúscula e depois no final adicionar 
//com "@".
    public static String gerarEmail() {
        List<String> emails = Arrays.asList("@gmail.com", "@hotmail.com.br",
                "@hotmail.com", "@outlook.com.br", "@outlook.com");
        Collections.sort(emails);

        return gerarNome().toLowerCase() + emails.get(0);
    }
    
//criar um método private que devolva um valor para sobre (Vamos criar um 
//vetor com alguns sobrenome)
    public static String gerarSobrenome() {
        List<String> listaSobrenome = Arrays.asList("batista", "silva", "rosa",
                "pereira", "butka", "costa", "ferri",
                "souza", "oliveira");
        Collections.shuffle(listaSobrenome);

        return listaSobrenome.get(0);
    }
    
// criar um método que devolva um valor para cidade (Vamos criar um vetor com 
//algumas cidades) 
    public static String gerarCidade() {
        List<String> listaCidades = Arrays.asList("palhoça", "são jose", "barreiros",
                "são paulo", "rio de janeiro", "maceió", "natal",
                "osasco", "joinville");
        Collections.shuffle(listaCidades);

        return listaCidades.get(0);
    }
//criar um método que devolva um valor para bairro (Vamos criar um vetor com 
//algumas bairros)
    public static String gerarBairro() {
        List<String> listaBairros = Arrays.asList("Centro Histórico",
                "Ponta de Baixo", "Distrito Industrial", "Picadas do Sul", 
                "Flor de Nápolis","São Luiz", "Roçado", "Potecas", "Serraria");
        Collections.shuffle(listaBairros);

        return listaBairros.get(0);
    }
    
//criar um método que devolva um valor para uf (Vamos criar um vetor 
//com algumas UFs)
    public static String gerarUf() {
        List<String> listaUfs = Arrays.asList("RO",
                "AM", "SC", "TO", 
                "CE","PB", "MT", "GO", "MS");
        Collections.shuffle(listaUfs);

        return listaUfs.get(0);
    }
    

    public static void main(String[] args) {
        System.out.println(gerarUf());

    }

}
