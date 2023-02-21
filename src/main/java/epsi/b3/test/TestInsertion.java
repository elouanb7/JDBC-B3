package epsi.b3.test;

import epsi.b3.bo.Fournisseur;
import epsi.b3.dal.FournisseurJDBCDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsertion {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    public TestInsertion() {
        this.fournisseurJDBCDAO = new FournisseurJDBCDAO();
    }
    public void Insert(Fournisseur fournisseur) throws SQLException {
        this.fournisseurJDBCDAO.add(fournisseur);
    }
}