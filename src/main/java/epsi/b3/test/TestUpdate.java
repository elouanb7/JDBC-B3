package epsi.b3.test;

import epsi.b3.bo.Fournisseur;
import epsi.b3.dal.FournisseurJDBCDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    public TestUpdate() {
        this.fournisseurJDBCDAO = new FournisseurJDBCDAO();
    }
    public void Update(Fournisseur oldFournisseur, Fournisseur newFournisseur) throws SQLException {
        this.fournisseurJDBCDAO.update(oldFournisseur, newFournisseur);
    }
}