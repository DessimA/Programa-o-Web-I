package br.com.ifce.repository;
 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Filme;
 
@Repository
public class FilmeRepositoryImpl implements FilmeRepository { 
  
 
    public void addFilme(Filme filme) {
    	Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();

		transacao = session.beginTransaction();
		
		session.save(filme);

		transacao.commit();
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Filme> getAllFilmes() {
 
    	Transaction transaction = null;
		List<Filme> filmes = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			
			filmes = session.createQuery("from Filme").list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return filmes;
    }
 
    @Override
    public void deleteFilme(Integer filmeId) {
    	Transaction transaction = null;
		Filme filme = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();

			filme = session.get(Filme.class, filmeId);
			session.delete(filme);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
 
    }
 
    public Filme getFilme(int filmeId) {
    	Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();

		transacao = session.beginTransaction();

		Filme filme = session.get(Filme.class, filmeId);

		transacao.commit();

		return filme;
    }
 
    
    public Filme updateFilme(Filme filme) {
    	Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();

		transacao = session.beginTransaction();

		session.saveOrUpdate(filme);

		transacao.commit();
		return filme;
    }
 
}