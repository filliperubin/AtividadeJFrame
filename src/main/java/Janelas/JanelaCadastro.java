/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

import Objetos.Fornecedor;
import Objetos.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Fillipe
 */
public class JanelaCadastro extends javax.swing.JFrame {

    Fornecedor forn = new Fornecedor();
    Produto prod = new Produto();

    public JanelaCadastro() {
        initComponents();

    }

    public JanelaCadastro(Fornecedor forn, Produto prod) {
        initComponents();
        this.forn = forn;
        this.prod = prod;
   
       
        jLRazaoSocial.setText(forn.getRazaoSocial());
        jLCnpj.setText(forn.getCnpj());
        jLRepresentante.setText(forn.getRepresentante());
        jLEndereco.setText(forn.getEndereco());
        jLTelefone.setText(forn.getTelefone());

        jLNome.setText(prod.getNome());
        jLDescricao.setText(prod.getDescricao());
        jLValorUnit.setText(String.valueOf(prod.getValorUnit()));
        jLQuantidade.setText(String.valueOf(prod.getQuantidade()));
        jLValorTotal.setText(String.valueOf(prod.getValorTotal()));
        jLFornecedor.setText(prod.getFornecedor());

    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLRazaoSocial = new javax.swing.JLabel();
        jLCnpj = new javax.swing.JLabel();
        jLRepresentante = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jLValorUnit = new javax.swing.JLabel();
        jLQuantidade = new javax.swing.JLabel();
        jLValorTotal = new javax.swing.JLabel();
        jLFornecedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulário de Cadastro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Fornecedor"));

        jLRazaoSocial.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLRazaoSocial.setText("jLabel2");

        jLCnpj.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLCnpj.setText("jLabel3");

        jLRepresentante.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLRepresentante.setText("jLabel4");

        jLEndereco.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLEndereco.setText("jLabel5");

        jLTelefone.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLTelefone.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLRazaoSocial)
                    .addComponent(jLCnpj)
                    .addComponent(jLRepresentante)
                    .addComponent(jLEndereco)
                    .addComponent(jLTelefone))
                .addGap(0, 129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLRazaoSocial)
                .addGap(18, 18, 18)
                .addComponent(jLCnpj)
                .addGap(18, 18, 18)
                .addComponent(jLRepresentante)
                .addGap(18, 18, 18)
                .addComponent(jLEndereco)
                .addGap(18, 18, 18)
                .addComponent(jLTelefone)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Informações do Produto"));

        jLNome.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLNome.setText("jLabel7");

        jLDescricao.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLDescricao.setText("jLabel8");

        jLValorUnit.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLValorUnit.setText("jLabel9");

        jLQuantidade.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLQuantidade.setText("jLabel10");

        jLValorTotal.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLValorTotal.setText("jLabel11");

        jLFornecedor.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLFornecedor.setText("jLabel12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNome)
                    .addComponent(jLDescricao)
                    .addComponent(jLValorUnit)
                    .addComponent(jLQuantidade)
                    .addComponent(jLValorTotal)
                    .addComponent(jLFornecedor))
                .addGap(0, 143, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNome)
                .addGap(18, 18, 18)
                .addComponent(jLDescricao)
                .addGap(18, 18, 18)
                .addComponent(jLValorUnit)
                .addGap(18, 18, 18)
                .addComponent(jLQuantidade)
                .addGap(18, 18, 18)
                .addComponent(jLValorTotal)
                .addGap(18, 18, 18)
                .addComponent(jLFornecedor)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCnpj;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLRazaoSocial;
    private javax.swing.JLabel jLRepresentante;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLValorTotal;
    private javax.swing.JLabel jLValorUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
