/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.pojo.Actor;
import model.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author Kasun Gamage
 */
public class ActorController {

    public static void bindDataToTable(JTable tbl, String searchKey) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query q = session.createQuery("from Actor where first_name='" + searchKey + "'");
        List<Actor> actors = q.list();

        DefaultTableModel mdl = (DefaultTableModel) tbl.getModel();
        mdl.setRowCount(0);
        //Iterator can be used as an alternative
        for (Actor actor : actors) {
            mdl.addRow(new Object[]{actor.getId(), actor.getFirstName(), actor.getLastName()});
        }
        tbl.setModel(mdl);
        session.close();
    }
}
