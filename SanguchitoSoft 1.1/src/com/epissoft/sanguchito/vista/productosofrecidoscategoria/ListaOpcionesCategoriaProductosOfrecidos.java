
package com.epissoft.sanguchito.vista.productosofrecidoscategoria;

import com.epissoft.sanguchito.persistencia.CategoriaProducto;
import com.epissoft.sanguchito.vista.Sanguchito;

import com.epissoft.sanguchito.vista.productosofrecidos.ListaProductosOfrecidos;

public class ListaOpcionesCategoriaProductosOfrecidos extends javax.swing.JInternalFrame {
    private CategoriaProducto categoria;
    public ListaOpcionesCategoriaProductosOfrecidos(CategoriaProducto cat) {
        initComponents();
        categoria=cat;
        nomCategoria.setText(categoria.getCatProdDes());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nomCategoria = new javax.swing.JLabel();
        bCerrar = new javax.swing.JButton();
        bListarProd = new javax.swing.JButton();
        bModificarCat = new javax.swing.JButton();
        bInhabilitarCat = new javax.swing.JButton();
        bCatExtras = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(260, 380));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        nomCategoria.setBackground(new java.awt.Color(0, 0, 102));
        nomCategoria.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        nomCategoria.setForeground(new java.awt.Color(255, 255, 255));
        nomCategoria.setText("   OPCIONES");

        bCerrar.setBackground(new java.awt.Color(0, 51, 102));
        bCerrar.setForeground(new java.awt.Color(255, 255, 255));
        bCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close2.png"))); // NOI18N
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nomCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bListarProd.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        bListarProd.setText("Listar productos");
        bListarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarProdActionPerformed(evt);
            }
        });

        bModificarCat.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        bModificarCat.setText("Actualizar categoria");
        bModificarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarCatActionPerformed(evt);
            }
        });

        bInhabilitarCat.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        bInhabilitarCat.setText("Inhabilitar categoria");
        bInhabilitarCat.setActionCommand("Inhabilinar categoría");
        bInhabilitarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInhabilitarCatActionPerformed(evt);
            }
        });

        bCatExtras.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        bCatExtras.setText("<html><center><p>Ver categoria de extras</p><p>asignadas</p></center></html>");
        bCatExtras.setActionCommand("Inhabilinar categoría");
        bCatExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCatExtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bListarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bModificarCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInhabilitarCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCatExtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bListarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bModificarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bInhabilitarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCatExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bListarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarProdActionPerformed
        Sanguchito.sanguchito.removeAll();
        ListaProductosOfrecidos prodOfrecidos=new ListaProductosOfrecidos(categoria);
        Sanguchito.sanguchito.add(prodOfrecidos);
        try{
            prodOfrecidos.setMaximum(true);
        }catch(Exception e){
            
        }
        prodOfrecidos.show();
    }//GEN-LAST:event_bListarProdActionPerformed

    private void bModificarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarCatActionPerformed
        Sanguchito.sanguchito.removeAll();
        ActualizarCategoriaProductoOfrecido productosOfrecidos=new ActualizarCategoriaProductoOfrecido(categoria);
        Sanguchito.sanguchito.add(productosOfrecidos);
        try{
            productosOfrecidos.setMaximum(true);
        }catch(Exception e){
            
        }
        productosOfrecidos.show();
    }//GEN-LAST:event_bModificarCatActionPerformed

    private void bInhabilitarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInhabilitarCatActionPerformed
        
        InhabilitarCatProdOfre lista=new InhabilitarCatProdOfre(categoria);
        lista.setLocation(Sanguchito.sanguchito.getWidth()/2-lista.getWidth()/2,Sanguchito.sanguchito.getHeight()/2-lista.getHeight()/2);
        Sanguchito.sanguchito.add(lista, new Integer( 10 ));
        lista.show();
        dispose();
    }//GEN-LAST:event_bInhabilitarCatActionPerformed

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_bCerrarActionPerformed

    private void bCatExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCatExtrasActionPerformed
        Sanguchito.sanguchito.removeAll();
        AgregarCategoriaExtraACategoriaProducto inhabilitar=new AgregarCategoriaExtraACategoriaProducto(categoria);
        Sanguchito.sanguchito.add(inhabilitar);
        try{
            inhabilitar.setMaximum(true);
        }catch(Exception e){
            
        }
        inhabilitar.show();
    }//GEN-LAST:event_bCatExtrasActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCatExtras;
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bInhabilitarCat;
    private javax.swing.JButton bListarProd;
    private javax.swing.JButton bModificarCat;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomCategoria;
    // End of variables declaration//GEN-END:variables

}