package epsi.b3.test;

import epsi.b3.bo.Fournisseur;
import epsi.b3.dal.FournisseurJDBCDAO;

import java.sql.SQLException;

public class TestDelete {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    public TestDelete() {
        this.fournisseurJDBCDAO = new FournisseurJDBCDAO();
    }
    public void Delete(int fournisseurId) throws SQLException {
        this.fournisseurJDBCDAO.deleteById(fournisseurId);
    }
}