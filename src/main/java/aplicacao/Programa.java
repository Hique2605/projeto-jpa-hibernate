package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //Configura conexão com o banco; cria EntityManager
		EntityManager em = emf.createEntityManager();	//	Executa operações de CRUD nas entidades JPA
			
			
								//ATIVIDADE AULA JPA
		
		
		/*LEMBRETES 
		 * http://localhost/phpmyadmin/index.php?route=/sql&pos=0&db=aulajpa&table=pessoa
		 * Rodar o aplicativo XAMP E INICAR O APACHE E O MYSQL 
		 */
		
		
		
		
		/*
					-------------CRIAR PESSOA NO BANCO---------------------
		//objetos ja foram criados e estao no banco
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Jorgino Salamanca", "Salamanca@gmail.com");
		Pessoa p3 = new Pessoa(null, "Walter White", "branco@gmail.com");
		
		//para salvar 
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		*/

		
		
		/*
			-------------DELETA PESSOA NO BANCO--------------------- 
		
		//cria pessoa para ser excluida = Pessoa p = new Pessoa(2, null , null);
		
		em.remove(p);
		//nao consegue, pq estancia esta destacada.
		//ele so remove se esta monitorado , objeto monitorado= obj acaboui de inserir ou buscou no banco de dados e nao fechou entity manager
		
		//para remover faca ->
		
		Pessoa p = em.find(Pessoa.class , 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		*/
		
		
		/*
		-------------BUSCA PESSOA POR ID NO BANCO---------------------
		//exp para buscar por id 
		Pessoa p = em.find(Pessoa.class , 2);
		System.out.println(p);
		
		
		
		/*					TESTE 05/05
		
		//teste para criar nova pessoa 
		//Pessoa p4 = new Pessoa(null, "AAAAA", "AAAAA@gmail.com");
		//em.getTransaction().begin();
		//em.persist(p4);
		//em.getTransaction().commit();
		
		//para apagar pessoa criada = aaaaa
		
		Pessoa p = em.find(Pessoa.class , 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		*/
		
		/*
		-------------UPDATE-- ATUALIZA PESSOA POR ID NO BANCO---------------------
		//Alterar os dados da pessoa
		Pessoa p = em.find(Pessoa.class , 2);		ATUALIZOU A PESSOA DE ID 2
        em.getTransaction().begin();
        p.setNome("Novo Nome");
        p.setEmail("novonome@email.com");
        em.getTransaction().commit();
		
		*/
		
		
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
