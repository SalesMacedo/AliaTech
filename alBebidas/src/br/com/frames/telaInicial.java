/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frames;

/**
 *
 * @author Sales Macedo
 */
public class telaInicial extends javax.swing.JFrame {

    /**
     * Creates new form telaInicial
     */
    public telaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        menuItemCadUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemCadCliente = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItemCadProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuEditar = new javax.swing.JMenu();
        menuItemEditUsuario = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuItemEditCliente = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuItemEditProduto = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();
        menuItemBuscaCliente = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuItemBuscaProduto = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenu();
        menuItemExcluirUsuario = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        menuItemVendaRealizarVenda = new javax.swing.JMenuItem();
        menuItemVendaProcurarRegistroDeVenda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial");
        setBackground(new java.awt.Color(255, 255, 0));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/banner.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        menuCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuCadastrar.setText("Cadastrar");

        menuItemCadUsuario.setText("Usuário");
        menuCadastrar.add(menuItemCadUsuario);
        menuCadastrar.add(jSeparator2);

        menuItemCadCliente.setText("Cliente");
        menuItemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadClienteActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadCliente);
        menuCadastrar.add(jSeparator3);

        menuItemCadProduto.setText("Produto");
        menuItemCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadProdutoActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadProduto);
        menuCadastrar.add(jSeparator1);

        jMenuBar1.add(menuCadastrar);

        menuEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuEditar.setText("Editar");

        menuItemEditUsuario.setText("Usuário");
        menuEditar.add(menuItemEditUsuario);
        menuEditar.add(jSeparator4);

        menuItemEditCliente.setText("Cliente");
        menuEditar.add(menuItemEditCliente);
        menuEditar.add(jSeparator5);

        menuItemEditProduto.setText("Produto");
        menuEditar.add(menuItemEditProduto);

        jMenuBar1.add(menuEditar);

        menuBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuBuscar.setText("Buscar");

        menuItemBuscaCliente.setText("Cliente");
        menuItemBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscaClienteActionPerformed(evt);
            }
        });
        menuBuscar.add(menuItemBuscaCliente);
        menuBuscar.add(jSeparator6);

        menuItemBuscaProduto.setText("Produto");
        menuBuscar.add(menuItemBuscaProduto);

        jMenuBar1.add(menuBuscar);

        menuExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuExcluir.setText("Excluir");

        menuItemExcluirUsuario.setText("Usuário");
        menuExcluir.add(menuItemExcluirUsuario);

        jMenuBar1.add(menuExcluir);

        menuVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuVenda.setText("Venda");

        menuItemVendaRealizarVenda.setText("Realizar Venda");
        menuVenda.add(menuItemVendaRealizarVenda);

        menuItemVendaProcurarRegistroDeVenda.setText("Procurar Registro de Vendas");
        menuVenda.add(menuItemVendaProcurarRegistroDeVenda);

        jMenuBar1.add(menuVenda);

        menuSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuSair.setText("Sair");
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1412, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCadProdutoActionPerformed

    private void menuItemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCadClienteActionPerformed

    private void menuItemBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemBuscaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuExcluir;
    private javax.swing.JMenuItem menuItemBuscaCliente;
    private javax.swing.JMenuItem menuItemBuscaProduto;
    private javax.swing.JMenuItem menuItemCadCliente;
    private javax.swing.JMenuItem menuItemCadProduto;
    private javax.swing.JMenuItem menuItemCadUsuario;
    private javax.swing.JMenuItem menuItemEditCliente;
    private javax.swing.JMenuItem menuItemEditProduto;
    private javax.swing.JMenuItem menuItemEditUsuario;
    private javax.swing.JMenuItem menuItemExcluirUsuario;
    private javax.swing.JMenuItem menuItemVendaProcurarRegistroDeVenda;
    private javax.swing.JMenuItem menuItemVendaRealizarVenda;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVenda;
    // End of variables declaration//GEN-END:variables
}
