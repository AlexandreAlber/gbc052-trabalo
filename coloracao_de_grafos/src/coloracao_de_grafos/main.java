package coloracao_de_grafos;
import java.text.SimpleDateFormat;
import java.util.Date;



public class main {
	  // Driver method
    public static void main(String args[])
    {
    	double inicio;
    	double fim;
    	
    	
    	
    	  Grafo g1 = new Grafo(8);
    	  g1.adiciona_aresta(0, 1);
    	  g1.adiciona_aresta(0, 6);
    	  g1.adiciona_aresta(0, 7);
    	  g1.adiciona_aresta(1, 2);
    	  g1.adiciona_aresta(1, 7);
    	  g1.adiciona_aresta(2, 3);
    	  g1.adiciona_aresta(2, 7);
    	  g1.adiciona_aresta(3, 4);
    	  g1.adiciona_aresta(3, 7);
    	  g1.adiciona_aresta(4, 5);
    	  g1.adiciona_aresta(4, 7);
    	  g1.adiciona_aresta(5, 6);
    	  g1.adiciona_aresta(5, 7);
    	  g1.adiciona_aresta(6, 7);
        System.out.println("Resultado para o grafo 1:");
        inicio = System.nanoTime();
        g1.colore_vertice();
        fim = System.nanoTime();
        double tempo = fim - inicio;
        double tempo_segundos=tempo/100000000;
        System.out.println("tempo em nanosegundos: " + tempo);
        System.out.println("tempo em segundos: " + tempo_segundos);
 
        
        System.out.println();
        Grafo g2 = new Grafo(6) ;
        g2.adiciona_aresta(0, 1);
        g2.adiciona_aresta(0, 3);
        g2.adiciona_aresta(0, 5);
        g2.adiciona_aresta(1, 2);
        g2.adiciona_aresta(1, 4);
        g2.adiciona_aresta(2, 3);
        g2.adiciona_aresta(2, 5);
        g2.adiciona_aresta(3, 4);
        g2.adiciona_aresta(4, 5);
        System.out.println("Resultado para o grafo 2:");
        inicio = System.nanoTime();
        g2.colore_vertice();
        fim = System.nanoTime();
        double tempo1 = fim - inicio;
        double tempo_segundos1=tempo1/100000000;
        System.out.println("tempo em nanosegundos: " + tempo1);
        System.out.println("tempo em segundos: " + tempo_segundos1);
        
        
        System.out.println();
        Grafo g3 = new Grafo(10);
        g3.adiciona_aresta(0, 1);
        g3.adiciona_aresta(0, 4);
        g3.adiciona_aresta(0, 5);
        g3.adiciona_aresta(1, 2);
        g3.adiciona_aresta(1, 6);
        g3.adiciona_aresta(2, 3);
        g3.adiciona_aresta(2, 7);
        g3.adiciona_aresta(3, 4);
        g3.adiciona_aresta(3, 8);
        g3.adiciona_aresta(4, 9);
        g3.adiciona_aresta(5, 7);
        g3.adiciona_aresta(5, 8);
        g3.adiciona_aresta(6, 8);
        g3.adiciona_aresta(6, 9);
        g3.adiciona_aresta(7, 9);
        System.out.println("Resultado para o grafo 3:");
        inicio = System.nanoTime();
        g3.colore_vertice();
        fim = System.nanoTime();
        double tempo2 = fim - inicio;
        double tempo_segundos2=tempo2/100000000;
        System.out.println("tempo em nanosegundos: " + tempo2);
        System.out.println("tempo em segundos: " + tempo_segundos2);
        
        
        System.out.println();
        
        Grafo g4 = new Grafo(12);
        g4.adiciona_aresta(0, 1);
        g4.adiciona_aresta(0, 6);
        g4.adiciona_aresta(0, 7);
        g4.adiciona_aresta(1, 2);
        g4.adiciona_aresta(1, 10);
        g4.adiciona_aresta(2, 3);
        g4.adiciona_aresta(2, 11);
        g4.adiciona_aresta(3, 4);
        g4.adiciona_aresta(3, 11);
        g4.adiciona_aresta(4, 5);
        g4.adiciona_aresta(4, 9);
        g4.adiciona_aresta(5, 6);
        g4.adiciona_aresta(5, 9);
        g4.adiciona_aresta(6, 7);
        g4.adiciona_aresta(7, 8);
        g4.adiciona_aresta(8, 9);
        g4.adiciona_aresta(8, 10);
        g4.adiciona_aresta(10, 11);
        System.out.println("Resultado para o grafo 4:");
        inicio = System.nanoTime();
        g4.colore_vertice();
        fim = System.nanoTime();
        double tempo3 = fim - inicio;
        double tempo_segundos3=tempo3/100000000;
        System.out.println("tempo em nanosegundos: " + tempo3);
        System.out.println("tempo em segundos : " + tempo_segundos3);
        
        
        System.out.println();
        Grafo g5 = new Grafo(6);
        g5.adiciona_aresta(0, 1);
        g5.adiciona_aresta(0, 4);
        g5.adiciona_aresta(1, 2);
        g5.adiciona_aresta(1, 4);
        g5.adiciona_aresta(2, 3);
        g5.adiciona_aresta(3, 4);
        g5.adiciona_aresta(3, 5);
        System.out.println("Resultado para o grafo 5:");
        inicio = System.nanoTime();
        g5.colore_vertice();
        fim = System.nanoTime();
        double tempo4 = fim - inicio;
        double tempo_segundos4=tempo4/100000000;
        System.out.println("tempo em nanosegundos: " + tempo4);
        System.out.println("tempo em segundos: " + tempo_segundos4);
        
      
}
}
