package ucsal.br;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Disciplina> disciplinas = new HashMap<String, Disciplina>();
    private static HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();

    public static void main(String[] args) {
        // Criando alguns usuários
    	usuarios.put("alexandre", new Usuario("alexandre", "12345"));
        usuarios.put("gabriel", new Usuario("gabriel", "12345"));
        usuarios.put("ravi", new Usuario("ravi", "12345"));
        
        Scanner scanner = new Scanner(System.in);
        // Autenticação do usuário
        Usuario usuarioAtual = null;
        while (usuarioAtual == null) {
            System.out.print("Digite o seu nome de usuário: ");
            String username = scanner.nextLine();  
            System.out.print("Digite a sua senha: ");
            String password = scanner.nextLine();  
            Usuario usuario = usuarios.get(username);
            if (usuario != null && usuario.verificaSenha(password)) {
                usuarioAtual = usuario;
            } else {
                System.out.println("Nome de usuário ou senha inválidos. Tente novamente.");
            }
        }

       
        SalaDeAula sala11 = new SalaDeAula("Sala 105");
        Disciplina bd = new Disciplina("Banco de Dados", "14:00 - 16:00", sala11 );
        disciplinas.put(bd.getNome().toLowerCase(), bd);
    	
        SalaDeAula sala10 = new SalaDeAula("Sala 205");
        Disciplina ia = new Disciplina("Inteligencia Artificial", "16:00 - 18:00", sala10 );
        disciplinas.put(ia.getNome().toLowerCase(), ia);
    	
        SalaDeAula sala9 = new SalaDeAula("Sala 305");
        Disciplina web = new Disciplina("Desenvolvimento Web", "10:00 - 12:00", sala9);
        disciplinas.put(web.getNome().toLowerCase(), web);
    	
        SalaDeAula sala8 = new SalaDeAula("Sala 405");
        Disciplina redes = new Disciplina("Redes de Computadores", "09:00 - 11:00", sala8);
        disciplinas.put(redes.getNome().toLowerCase(), redes);
    	
        SalaDeAula sala7 = new SalaDeAula("Sala 505");
        Disciplina segInfo = new Disciplina("Seguranca da Informacao", "11:00 - 13:00", sala7);
        disciplinas.put(segInfo.getNome().toLowerCase(), segInfo);
    	
        SalaDeAula sala6 = new SalaDeAula("Sala 605");
        Disciplina testeSoft = new Disciplina("Teste de Software", "13:00 - 15:00", sala6);
        disciplinas.put(testeSoft.getNome().toLowerCase(), testeSoft);

        SalaDeAula sala5 = new SalaDeAula("Sala 202");
        Disciplina so = new Disciplina("Sistemas Operacionais", "11:00 - 13:00", sala5);
        disciplinas.put(so.getNome().toLowerCase(), so);

        SalaDeAula sala4 = new SalaDeAula("Sala 202");
        Disciplina lpa = new Disciplina("Logica de Programacao", "11:00 - 13:00", sala4);
        disciplinas.put(lpa.getNome().toLowerCase(), lpa);

        SalaDeAula sala3 = new SalaDeAula("Sala 402");
        Disciplina egnreque = new Disciplina("Engenhraria de Requisitos", "11:00 - 13:00", sala3);
        disciplinas.put(egnreque.getNome().toLowerCase(), egnreque);

        SalaDeAula sala1 = new SalaDeAula("Sala 101");
        Disciplina pw = new Disciplina("Pw", "09:00 - 11:00", sala1);
        disciplinas.put(pw.getNome().toLowerCase(), pw);

        SalaDeAula sala2 = new SalaDeAula("Sala 202");
        Disciplina poo = new Disciplina("Poo", "11:00 - 13:00", sala2);
        disciplinas.put(poo.getNome().toLowerCase(), poo);

        // Pede ao usuário para escolher uma disciplina
        System.out.println("Por favor, escolha uma disciplina: pw, poo, engenhraria de requisitos, logica de programacao...");
        String disciplinaEscolhida = scanner.nextLine().toLowerCase();
        Disciplina disciplina = disciplinas.get(disciplinaEscolhida);
        if (disciplina != null) {
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Horário: " + disciplina.getHorario());
            System.out.println("Sala de Aula: " + disciplina.getSala().getNome());
       
        } else {
            System.out.println("Desculpe, não foi encontrada a disciplina " + disciplinaEscolhida);
        }
        System.out.println(disciplinas.keySet());
        scanner.close();
    }
}
