
package co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.view;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.controller.ReportesController;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.PrimerInformeVo;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.SegundoInformeVo;
import co.edu.utp.misiontic2022.reto5c2.reto5_informes_ui_minvivienda.model.vo.TercerInformeVo;
import java.sql.SQLException;
import java.util.List;

public class InformesView extends javax.swing.JFrame {
    
    public static final ReportesController controller = new ReportesController();
    String texto = "";

    public InformesView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        informe1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        informe2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        informe3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TituloPrincial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        informe1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                informe1PropertyChange(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("ID_LIDER");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Primer_Apellido");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Ciudad_Residencia");

        javax.swing.GroupLayout informe1Layout = new javax.swing.GroupLayout(informe1);
        informe1.setLayout(informe1Layout);
        informe1Layout.setHorizontalGroup(
            informe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informe1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(92, 92, 92)
                .addComponent(jLabel5)
                .addGap(66, 66, 66))
            .addGroup(informe1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(8, 8, 8))
        );
        informe1Layout.setVerticalGroup(
            informe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informe1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(informe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Informe_1", informe1);
        informe1.getAccessibleContext().setAccessibleName("Informe_1");

        informe2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                informe2PropertyChange(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("ID_Proyecto");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Constructora");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setText("Num_Habitaciones");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("Ciudad");

        javax.swing.GroupLayout informe2Layout = new javax.swing.GroupLayout(informe2);
        informe2.setLayout(informe2Layout);
        informe2Layout.setHorizontalGroup(
            informe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informe2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(84, 84, 84)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(114, 114, 114)
                .addComponent(jLabel10)
                .addGap(68, 68, 68))
            .addGroup(informe2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        informe2Layout.setVerticalGroup(
            informe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informe2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(informe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Informe_2", informe2);
        informe2.getAccessibleContext().setAccessibleName("Informe_2");

        informe3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                informe3PropertyChange(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel11.setText("ID_Compra");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setText("Constructora");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel13.setText("Banco_Vinculado");

        javax.swing.GroupLayout informe3Layout = new javax.swing.GroupLayout(informe3);
        informe3.setLayout(informe3Layout);
        informe3Layout.setHorizontalGroup(
            informe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informe3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel11)
                .addGap(162, 162, 162)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informe3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        informe3Layout.setVerticalGroup(
            informe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informe3Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(informe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Informe_3", informe3);
        informe3.getAccessibleContext().setAccessibleName("Informe_3");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        TituloPrincial.setFont(new java.awt.Font("PT Sans Narrow", 1, 48)); // NOI18N
        TituloPrincial.setForeground(new java.awt.Color(255, 255, 255));
        TituloPrincial.setText("Bienvenido a su sistema de reportes.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(TituloPrincial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(TituloPrincial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Informe_1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void informe1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_informe1PropertyChange
        texto = "";
        jTextArea2.setText(texto);
        try {
            var informe1 = controller.listarInforme1();
            for(PrimerInformeVo informe:informe1 ){
                texto += "       ";
                texto += informe.getIdLider();
                texto += "\t";
                texto += "    ";
                texto += informe.getName();
                texto += "\t";
                texto += "    ";
                texto += informe.getPrimerApellido();
                texto += "\t";
                texto += "         ";
                texto += informe.getCiudadResidencia();
                texto += "\n";
            }
            jTextArea1.setText(texto);
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_informe1PropertyChange

    private void informe2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_informe2PropertyChange
        texto = "";
        jTextArea2.setText(texto);
        try {
            var informe2 = controller.listarInforme2();
            for(SegundoInformeVo informe:informe2 ){
                texto += "    ";
                texto += informe.getIdProyecto();
                texto += "\t";
                if(informe.getConstructora().length() < 8){
                    texto += informe.getConstructora();
                    texto += "\t";
                    texto += "\t";
                } else {
                    texto += informe.getConstructora();
                    texto += "\t";
                }
                texto += " ";
                texto += informe.getNumHabitaciones();
                texto += "           ";
                texto += informe.getCiudad();
                texto += "\n";
            }
            jTextArea2.setText(texto);
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_informe2PropertyChange

    private void informe3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_informe3PropertyChange
        texto = "";
        jTextArea3.setText(texto);
        try {
            var informe3 = controller.listarInforme3();
            for(TercerInformeVo informe:informe3 ){
                texto += " ";
                texto += informe.getIdCompra();
                texto += "\t";
                texto += "   ";
                if(informe.getConstructora().length() < 8){
                    texto += informe.getConstructora();
                    texto += "\t";
                    texto += "\t";
                } else {
                    texto += informe.getConstructora();
                    texto += "\t";
                }
                texto += " ";
                texto += informe.getBancoVinculado();
                texto += "\n";
            }
            jTextArea3.setText(texto);
        } catch (SQLException ex) {
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_informe3PropertyChange

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloPrincial;
    private javax.swing.JPanel informe1;
    private javax.swing.JPanel informe2;
    private javax.swing.JPanel informe3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
