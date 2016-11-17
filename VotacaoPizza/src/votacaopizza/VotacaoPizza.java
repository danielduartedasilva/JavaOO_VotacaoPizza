package votacaopizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotacaoPizza {

    private static Scanner scan = new Scanner(System.in);

    private static List<Usuario> usuarios;
    private static List<Pizza> pizzas;
    private static List<Voto> votos;

    public static void main(String[] args) {

        VotacaoPizza.usuarios = new ArrayList<Usuario>();
        VotacaoPizza.pizzas = new ArrayList<Pizza>();
        VotacaoPizza.votos = new ArrayList<Voto>();

        gerarMassaDeTestes();

        efetuarVotacao();
        
        
    }

    private static void gerarMassaDeTestes() {

        for (int i = 1; i < 8; i++) {
            Usuario u = new Usuario();
            u.setCodigo(i);
            u.setNome("Usuario " + i);
            VotacaoPizza.usuarios.add(u);
        }

        Pizza p1 = new Pizza();
        p1.setSabor("Calabresa");
        VotacaoPizza.pizzas.add(p1);

        Pizza p2 = new Pizza();
        p2.setSabor("Portuguesa");
        VotacaoPizza.pizzas.add(p2);

        Pizza p3 = new Pizza();
        p3.setSabor("Quatro Queijos");
        VotacaoPizza.pizzas.add(p3);

    }

    private static void efetuarVotacao() {

        Usuario u = null;
        do {
            System.out.print("Favor digitar seu código: ");
            int codigoUsuario = scan.nextInt();
            scan.nextLine();

            u = buscarUsuarioPorCodigo(codigoUsuario);
        } while (u == null);
        
        System.out.println(" -- Iniciando a votação -- ");
        
        for(Pizza p : pizzas){
            System.out.println("Sabor: " + p.getSabor());
            System.out.println("Ditige a nota (1 a 5, sendo 1 detesto e 5 adoro)");
            int nota = scan.nextInt();
            scan.nextLine();
            
            Voto v = new Voto();
            v.setUsuario(u);
            v.setPizza(p);
            v.setNota(nota);
            
            votos.add(v);
        }

    }

    private static Usuario buscarUsuarioPorCodigo(int codigo) {

        for (Usuario usu : usuarios) {
            if (codigo == usu.getCodigo()) {
                return usu;
            }
        }

        return null;
    }

}
