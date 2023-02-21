package epsi.b3.test;

import epsi.b3.bo.Fournisseur;
import epsi.b3.dal.FournisseurJDBCDAO;


import java.sql.SQLException;
import java.util.List;

public class TestFindAll {
    private final FournisseurJDBCDAO fournisseurJDBCDAO;
    public TestFindAll() {
        this.fournisseurJDBCDAO = new FournisseurJDBCDAO();
    }
    public List<Fournisseur> FindAll() throws SQLException {
        return this.fournisseurJDBCDAO.findAll();
    }
}