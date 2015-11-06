
package com.epissoft.sanguchito.vista.almacencategoria;

import com.epissoft.sanguchito.persistencia.CategoriaProductoAlmacen;
import com.epissoft.sanguchito.vista.Sanguchito;
import com.epissoft.sanguchito.vista.almacen.ListaProductoAlmacen;

public class ListaOpcionesCategoriaAlmacen extends javax.swing.JInternalFrame {
    private CategoriaProductoAlmacen categoria;
    public ListaOpcionesCategoriaAlmacen(CategoriaProductoAlmacen cat) {
        initComponents();
        categoria=cat;
        nomCategoria.setText(categoria.getCatProdAlmDes());
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

        setPreferredSize(new java.awt.Dimension(260, 310));

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
        bListarProd.setText("Lista de productos");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bListarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bModificarCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(0, 74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bListarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarProdActionPerformed
        Sanguchito.sanguchito.removeAll();
        ListaProductoAlmacen opcion=new ListaProductoAlmacen(categoria);
        Sanguchito.sanguchito.add(opcion);
        try{
            opcion.setMaximum(true);
        }catch(Exception e){
            
        }
        opcion.show();
    }//GEN-LAST:event_bListarProdActionPerformed

    private void bModificarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarCatActionPerformed
        Sanguchito.sanguchito.removeAll();
        ActualizarCategoriaAlmacen opcion=new ActualizarCategoriaAlmacen(categoria);
        Sanguchito.sanguchito.add(opcion);
        try{
            opcion.setMaximum(true);
        }catch(Exception e){
            
        }
        opcion.show();
    }//GEN-LAST:event_bModificarCatActionPerformed

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_bCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bListarProd;
    private javax.swing.JButton bModificarCat;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomCategoria;
    // End of variables declaration//GEN-END:variables

}