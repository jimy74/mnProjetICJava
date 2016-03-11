
/**
 * Module 633.1-Programmation / Contrôle continu du 11.01.2014
 *
 * Fenêtre principale de l'application
 *
 * @author Patrick RIbeiro - N° du poste: HEG???
 */
package org.mm.test;


import java.util.*;
import java.awt.List;
import java.text.DecimalFormat;

public class MainFrm extends java.awt.Frame {

    private static final String ARTICLES = "Articles.txt"; /* Nom du fichier de données */

    private static final ArrayList listeArticles = new ArrayList();
    private static final ArrayList listeCommandes = new ArrayList();
    private DecimalFormat format = new DecimalFormat("#,##0.00");

    /**
     * Constructeur - Initialisation des composants de la fenêtre
     */
    public MainFrm() {
        initComponents();
        chargerArticle();
    } // MainFrm

    public void chargerArticle() {
        String articles[];

        articles = FileStr.read(ARTICLES);
        lireDonne(articles, listeArticles);
    }

    public void lireDonne(String[] listeVoulu, ArrayList listGen) {
        for (int i = 0; i < listeVoulu.length; i++) {
            String info[] = listeVoulu[i].split(";");
            listGen.add(new Article(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2])));
        }

        majArticle();
    }

    public void majArticle() {
        lstArticles.removeAll();
        for (int i = 0; i < listeArticles.size(); i++) {
            lstArticles.add(listeArticles.get(i).toString());

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label4 = new java.awt.Label();
        lstArticles = new java.awt.List();
        btnAjouterCommande = new java.awt.Button();
        label6 = new java.awt.Label();
        lstCommandes = new java.awt.List();
        btnSupprimerCommande = new java.awt.Button();
        label7 = new java.awt.Label();
        tfTotalCommande = new java.awt.TextField();
        lblMonnaie = new java.awt.Label();
        label8 = new java.awt.Label();
        tfNbArticles = new java.awt.TextField();
        label2 = new java.awt.Label();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label4.setText("Articles");

        lstArticles.setMultipleMode(true);
        lstArticles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listGenitemStateChanged(evt);
            }
        });

        btnAjouterCommande.setLabel("Ajouter à la commande");
        btnAjouterCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterCommandeActionPerformed(evt);
            }
        });

        label6.setText("Commande");

        lstCommandes.setMultipleMode(true);
        lstCommandes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listGenitemStateChanged(evt);
            }
        });

        btnSupprimerCommande.setEnabled(false);
        btnSupprimerCommande.setLabel("Retirer de la commande");
        btnSupprimerCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerCommandeActionPerformed(evt);
            }
        });

        label7.setText("TOTAL COMMANDE");

        tfTotalCommande.setEditable(false);

        lblMonnaie.setText("monnaie");

        label8.setText("NOMBRE ARTICLES");

        tfNbArticles.setEditable(false);

        label2.setText("articles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfTotalCommande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMonnaie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNbArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lstArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAjouterCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSupprimerCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lstCommandes, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lstArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lstCommandes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSupprimerCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAjouterCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfTotalCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMonnaie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNbArticles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Fin de l'application */
  private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
      System.exit(0);
  }//GEN-LAST:event_exitForm

    private void btnAjouterCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterCommandeActionPerformed
        
        int[] sel = lstArticles.getSelectedIndexes();
        
        for (int k = 0; k < sel.length; k++) {
            Article art = (Article) listeArticles.get(sel[k]);
            Commande com = new Commande(art, 1);
            int indCom = listeCommandes.indexOf(com);
            if (indCom == -1) {
                insert(com, listeCommandes, lstCommandes);
                
            } else {
                com = (Commande) listeCommandes.get(indCom);
                com.incQte(1);
                lstCommandes.replaceItem(com.toString(), indCom);
            }
            lstArticles.deselect(sel[k]);
        }
        calculeResultats();
        majList();
    }//GEN-LAST:event_btnAjouterCommandeActionPerformed

     public void majList()
     {
     if (lstCommandes.getItemCount()==0)
        {
        btnSupprimerCommande.setEnabled(false);
        }
        else
        {
        btnSupprimerCommande.setEnabled(true);
        }
     }
    private void btnSupprimerCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerCommandeActionPerformed
        // TODO add your handling code here:
        supprimerSelect();
        majList();
    }//GEN-LAST:event_btnSupprimerCommandeActionPerformed

    private void listGenitemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listGenitemStateChanged
        // TODO add your handling code here:
        if (lstArticles.getSelectedIndexes().length>0)
        {
        btnSupprimerCommande.setEnabled(false);
        }
        else 
        {
            btnSupprimerCommande.setEnabled(true);
        }
    }//GEN-LAST:event_listGenitemStateChanged
    private void calculeResultats () {
    double s = 0;
    int nb = 0;
    for (int k = 0; k < listeCommandes.size(); k++) {
      Commande com = (Commande)listeCommandes.get(k);
      s += com.getArticle().getPrix() * com.getQte();
      nb += com.getQte();
    }
    tfTotalCommande.setText(format.format(s));
    tfNbArticles.setText(Integer.toString(nb));
  }

    public void insert(Comparable comp, ArrayList mod, List lst) {
        int pos = 0;
        while ((pos < mod.size()) && (((Comparable) mod.get(pos)).compareTo(comp) <= 0)) {
            pos++;
        }
        mod.add(pos, comp);
        lst.add(comp.toString(), pos);
    }
    public void supprimerSelect()
    {
        int sel[] = lstCommandes.getSelectedIndexes();
        for (int i = 0; i < sel.length; i++) {
            lstCommandes.remove(sel[i]);listeCommandes.remove(sel[i]);
           
        }
        calculeResultats();
            
            
    
    }
    /**
     * Méthode principale de l'application
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrm().setVisible(true);
            }
        });
    } // main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAjouterCommande;
    private java.awt.Button btnSupprimerCommande;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label lblMonnaie;
    private java.awt.List lstArticles;
    private java.awt.List lstCommandes;
    private java.awt.TextField tfNbArticles;
    private java.awt.TextField tfTotalCommande;
    // End of variables declaration//GEN-END:variables

} // MainFrm
