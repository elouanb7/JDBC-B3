package epsi.b3.test;

import epsi.b3.bo.Article;
import epsi.b3.bo.Fournisseur;
import epsi.b3.dal.ArticleJDBCDAO;
import epsi.b3.dal.FournisseurJDBCDAO;

import java.sql.SQLException;
import java.util.List;

public class TestJdbcArticles {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    private final ArticleJDBCDAO articleJDBCDAO;

    public TestJdbcArticles(FournisseurJDBCDAO fournisseurJDBCDAO, ArticleJDBCDAO articleJDBCDAO) {
        this.fournisseurJDBCDAO = fournisseurJDBCDAO;
        this.articleJDBCDAO = articleJDBCDAO;
    }

    public void insert() throws SQLException {
        // inserts
        Fournisseur fournisseur = new Fournisseur("La Maison de la Peinture");
        this.fournisseurJDBCDAO.add(fournisseur);
        fournisseur = this.fournisseurJDBCDAO.findAll().get(0);

        Article article1 = new Article("Peinture blanche 1L", 12.50, fournisseur);
        Article article2 = new Article("Peinture rouge mate 1L", 15.50, fournisseur);
        Article article3 = new Article("Peinture noire laquée 1L", 17.80, fournisseur);
        Article article4 = new Article("Peinture bleue mate 1L", 15.50, fournisseur);
        this.articleJDBCDAO.insert(article1);
        this.articleJDBCDAO.insert(article2);
        this.articleJDBCDAO.insert(article3);
        this.articleJDBCDAO.insert(article4);

        //updates
        for (Article temp : this.articleJDBCDAO.findAll()) {
            this.articleJDBCDAO.update(temp , new Article(temp.getnom(), temp.getprix()*0.75, temp.getFournisseur()));
        }

        //show all
        for (Article temp : this.articleJDBCDAO.findAll()) {
            System.out.printf("%s; %f; %s%n", temp.getnom(), temp.getprix(), temp.getFournisseur().getNom());
        }

        // moyenne prix
        System.out.println(this.articleJDBCDAO.getMoyenne());

        // delete
        for (Article temp : this.articleJDBCDAO.findAll()) {
            articleJDBCDAO.delete(temp.getId());
        }
        for (Fournisseur temp : this.fournisseurJDBCDAO.findAll()) {
            fournisseurJDBCDAO.deleteById(temp.getId());
        }


    }
}
