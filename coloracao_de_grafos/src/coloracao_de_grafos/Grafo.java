package coloracao_de_grafos;
	
	import java.io.*;
	import java.util.*;
	import java.util.LinkedList;
	 
	
	public class Grafo {
		
		
		
	    private int V;   //Número de vertices
	    private LinkedList<Integer> adj[]; //Lista de adjacencia
	    
	    
	    
	    /*Construtor que recebe o numero de vertices e cria uma lista de adjacencia
	     * com a quantidade de nodos de acordo com o tamanho dado, no caso v.
	     */
	    Grafo(int v)
	    {
	        V = v;
	        int i;
	        adj = new LinkedList[v];
	        for (i=0; i<v; i++)
	            adj[i] = new LinkedList();
	    }
	 
	    //Função para adicionar aresta no grafo
	    void adiciona_aresta(int v,int w)
	    {
	        adj[v].add(w);
	        adj[w].add(v);
	    }
	 
	    
	    void colore_vertice()
	    {
	    	
	    	//Vetor que armazena as cores utilizadas em cada vertice
	        int resultado[] = new int[V];
	 
	        // Inicializa todos os elementos do vetor "resultado" como -1, o que significa que os vértices
	        //não foram coloridos
	        for(int i=0; i<V; i++)
	        	resultado[i]=-1;
	 
	        // Atribui a primeira cor ao primeiro vertice
	        resultado[0]  = 0;
	 
	        /* Vetor que armazena as cores disponíveis, um valor "False" significa
	         que aquela cor já está atribuida a um vértice adjacente e não pode ser usada*/
	        boolean cor_disponivel[] = new boolean[V];
	         
	        //No início todas as cores estão disponíveis "True"
	        for(int i=0; i<V; i++)
	        	cor_disponivel[i] = true;
	 
	        //atribuindo cores aos V-1 vertices
	        //começamos no vertice 1 pois o 0 já foi atribuido uma cor
	        for (int u=1; u<V; u++)
	        {
	            /* percorre os vertices adjacentes ao vertice "u" caso haja algum adjacente a este que possua uma cor
	             * atribui FALSE a esta cor, faz isso para todos os adjacentes até o fim da lista */
	            Iterator<Integer> it = adj[u].iterator() ;
	            while (it.hasNext())
	            {
	            		int i = it.next();
	            		if (resultado[i] != -1)
	                    cor_disponivel[resultado[i]] = false;
	            }
	 
	            // Após percorrer os adjacentes ao vértice analisado, no caso "u", seleciona uma cor no vetor
	            //cor_disponivel
	            int cor;
	            for (cor=0; cor<V; cor++){
	                if (cor_disponivel[cor])
	                    break;
	            }
	            
	            //atribui a cor ao vértice que está sendo analisado
	            resultado[u] = cor; 
	 
	            // Após percorrer todos os vértices adjacentes ao vertice dado, atribui TRUE a todas as cores
	            // do vetor de cores disponíveis
	            for(int j=0; j<V; j++) {
	            	cor_disponivel[j]= true;
	            }
	        }
	 
	        // exibe o resultado
	        for (int k = 0; k<V; k++)
	            System.out.println("Vértice " + k + " ==>  Cor: " + resultado[k]);
	    }
	}
	 
	  
	


