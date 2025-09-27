
package com.mycompany.entrenamiento1;

import java.awt.HeadlessException;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class tienda extends javax.swing.JFrame {
    private final DefaultTableModel modeloTabla;

    private java.util.List<Compra> compras = new java.util.ArrayList<>();

    private java.util.Map<String, Integer> stock = new java.util.HashMap<>();
    private java.util.List<Producto> productos = new java.util.ArrayList<>();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(tienda.class.getName());

 
    public tienda() {
        initComponents();
    modeloTabla = (DefaultTableModel) mostrarTabla.getModel(); // usar el modelo que ya existe        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textNombre = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrarTabla = new javax.swing.JTable();
        textExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        textPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioActionPerformed(evt);
            }
        });

        jLabel1.setText("producto");

        jLabel2.setText("precio");

        jLabel3.setText("cant");

        jButton3.setText("precio max y min");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        mostrarTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "producto", "precio", "cantidades"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(mostrarTabla);

        textExit.setText("Salir");
        textExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textExit)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textExit)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void mostrarInventario() {
    modeloTabla.setRowCount(0); // Limpiar tabla
    
        productos.forEach((producto) -> {

            int cantidad = stock.getOrDefault(producto.getNombre(), 0);
            modeloTabla.addRow(new Object[]{
                producto.getNombre(),
                producto.getPrecio(),
                cantidad
            });

        });
}

    
    
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            String nombre = textNombre.getText().trim();

            if (nombre.isEmpty()) {
                showMessageDialog(this,
                        "No puede a ver campos vacios ");
                return;
            }

            double precio = Double.parseDouble(textPrecio.getText());
            int cantidad = Integer.parseInt(textCantidad.getText());

            if (precio <= 0 || cantidad <= 0 ) {

                showMessageDialog(this, "deben ser positivos");
                return;

            }

            if (stock.containsKey(nombre)) {
                showMessageDialog(this,
                        "El producto '" + nombre + "' ya existe.\nPor favor ingresa otro nombre.");
                return; // no seguimos con la inserción
            }

            Producto producto = new Producto(nombre, precio);
            productos.add(producto);
            stock.put(nombre, cantidad);

            textNombre.setText("");
            textPrecio.setText("");
            textCantidad.setText("");

            mostrarInventario();
            showMessageDialog(this, "Producto agregado con éxito.");

        } catch (NumberFormatException e) {
            showMessageDialog(this, "Error: precio o cantidad no válidos.");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = mostrarTabla.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "debes seleccionar algun producto");
            return;

        }
        
            String nombre = mostrarTabla.getValueAt(fila, 0).toString();
            String precioString = mostrarTabla.getValueAt(fila, 1).toString();
             int cantidadDisponible = stock.get(nombre);
       
        try {
            String input = showInputDialog(this, "ingresa la cantidad a comprar");
            if (input == null) {
                return;

            }

            int cantidadCompra = Integer.parseInt(input);
           double precio =Double.parseDouble(precioString);
           
           double total = precio*cantidadCompra;
           
            if (cantidadCompra > 0 && cantidadCompra <= cantidadDisponible) {
                
                int nuevaCantidad = cantidadDisponible - cantidadCompra;
                stock.put(nombre, nuevaCantidad);
                
                Compra compra =new Compra(nombre,cantidadCompra , precio,total);
                compras.add(compra);
                System.out.println(compras.toString());
                mostrarInventario();
                
                
                showMessageDialog(this, "**Compra exitosa ** \n"+nombre+"\n"+" Total a pagar :" + precio*cantidadCompra);
                
                
                
                

            } else {
                showMessageDialog(this, "Cantidad inválida o mayor al stock disponible.");
            }

        } catch (HeadlessException | NumberFormatException e) {
            showMessageDialog(this, "ocurrio un error inesperado");
        }

        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     

        Producto[] resultado = new Producto[2]; // índice 0 = máximo, 1 = mínimo

        productos.forEach(product -> {
            
                // Recorrer todos los productos para encontrar máximo y mínimo

            if (resultado[0] == null || product.getPrecio() > resultado[0].getPrecio()) {
                resultado[0] = product;

            }

            if (resultado[1] == null || product.getPrecio() < resultado[1].getPrecio()) {
                resultado[1] = product;

            }

        });
        
         if (resultado[0] != null && resultado[1] != null) {
                showMessageDialog(this,
                        "Precio máximo: " + resultado[0].getNombre() + " $" + resultado[0].getPrecio()
                        + "\nPrecio mínimo: " + resultado[1].getNombre() + " $" + resultado[1].getPrecio()
                );
            } else {
                showMessageDialog(this, "No hay productos en la lista");
            }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textExitActionPerformed
        if (compras.isEmpty()) {
            showMessageDialog(this, "No se realizaron compras.");
        } else {
            StringBuilder listaCompras = new StringBuilder("Compras realizadas:\n\n");

            compras.forEach((compra) -> {

                listaCompras.append("Producto: ").append(compra.getNombre())
                        .append(", Cantidad: ").append(compra.getCantidadCompra())
                        .append(", Precio Unitario: $").append( compra.getPrecio())
                        .append(", Total: $").append( compra.getTotal())
                        .append("\n");

            });

            showMessageDialog(this, listaCompras.toString());

        }

        System.exit(0); //
    }//GEN-LAST:event_textExitActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new tienda().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable mostrarTabla;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JButton textExit;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables


}
