package votacaopizza;

import java.util.ArrayList;
import java.util.List;


public class VotacaoPizza {

    private static List<Usuario> usuarios;
    private static List<Pizza> pizzas;
    private static List<Voto> votos;

    public static void main(String[] args) {
        
        VotacaoPizza.usuarios = new ArrayList<Usuario>();
        VotacaoPizza.pizzas = new ArrayList<Pizza>();
        VotacaoPizza.votos = new ArrayList<Voto>();
                
        gerarMassaDeTestes();
        
        
        
    }

    private static void gerarMassaDeTestes() {
        
        for (int i = 0; i < 7; i++) {
            Usuario u = new Usuario();
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
    
}
