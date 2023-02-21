package epsi.b3.dal;


import epsi.b3.bo.Article;
import epsi.b3.bo.Fournisseur;

import java.sql.SQLException;
import java.util.List;

public interface ArticleDAO {
    void insert(Article article) throws SQLException;

    List<Article> findAll() throws SQLException;

    void update(Article oldArticle, Article newArticle) throws SQLException;

    void delete(int articleId) throws SQLException;
}

