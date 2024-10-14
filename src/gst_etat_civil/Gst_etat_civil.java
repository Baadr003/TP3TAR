/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gst_etat_civil;

import ma.projet.util.HibernateUtil;

/**
 *
 * @author DELL
 */
public class Gst_etat_civil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HibernateUtil.getSessionFactory().openSession();
    }
    
}
