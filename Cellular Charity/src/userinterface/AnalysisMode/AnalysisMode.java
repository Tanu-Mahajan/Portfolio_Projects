/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AnalysisMode;

import Business.EcoSystem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class AnalysisMode extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisMode
     */
    private JPanel container;
    private EcoSystem business;
    public AnalysisMode(JPanel container, EcoSystem business) {
        initComponents();
        this.container = container;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab6 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        piePanel = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnResultQuestion2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnResultQuestion3 = new javax.swing.JButton();
        comboBoxCity = new javax.swing.JComboBox<>();
        displayPanel3 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane5 = new javax.swing.JSplitPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnResultQuestion4 = new javax.swing.JButton();
        displayPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnResultQuestion6 = new javax.swing.JButton();
        displayPanelno6 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 51, 204));

        tab6.setBackground(new java.awt.Color(51, 153, 255));
        tab6.setToolTipText("");
        tab6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setLayout(new java.awt.BorderLayout());

        piePanel.setLayout(new java.awt.BorderLayout());

        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setForeground(new java.awt.Color(51, 0, 51));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Analyze amount of laptop donated across cities");

        btnResultQuestion2.setBackground(new java.awt.Color(204, 255, 204));
        btnResultQuestion2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResultQuestion2.setForeground(new java.awt.Color(51, 0, 51));
        btnResultQuestion2.setText("View Result");
        btnResultQuestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultQuestion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(btnResultQuestion2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnResultQuestion2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane3.setTopComponent(jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());
        jSplitPane3.setRightComponent(jPanel10);

        piePanel.add(jSplitPane3, java.awt.BorderLayout.CENTER);

        jPanel2.add(piePanel, java.awt.BorderLayout.CENTER);

        tab6.addTab("First  Question", jPanel2);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jSplitPane4.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setForeground(new java.awt.Color(51, 0, 51));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Store comparison that donated laptops across different cities");

        btnResultQuestion3.setBackground(new java.awt.Color(204, 255, 204));
        btnResultQuestion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResultQuestion3.setForeground(new java.awt.Color(51, 0, 51));
        btnResultQuestion3.setText("View Result");
        btnResultQuestion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultQuestion3ActionPerformed(evt);
            }
        });

        comboBoxCity.setBackground(new java.awt.Color(204, 255, 204));
        comboBoxCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBoxCity.setForeground(new java.awt.Color(51, 0, 51));
        comboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Cambridge", "Worchester" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResultQuestion3)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnResultQuestion3)
                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane4.setTopComponent(jPanel11);

        displayPanel3.setBackground(new java.awt.Color(153, 255, 255));
        displayPanel3.setLayout(new java.awt.BorderLayout());
        jSplitPane4.setRightComponent(displayPanel3);

        jPanel1.add(jSplitPane4, java.awt.BorderLayout.CENTER);

        tab6.addTab("Second Question", jPanel1);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jSplitPane5.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));
        jPanel13.setForeground(new java.awt.Color(51, 0, 51));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Comparison of donation received from Individual vs Universities vs Companies");

        btnResultQuestion4.setBackground(new java.awt.Color(204, 255, 204));
        btnResultQuestion4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnResultQuestion4.setForeground(new java.awt.Color(51, 0, 51));
        btnResultQuestion4.setText("View Result");
        btnResultQuestion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultQuestion4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(btnResultQuestion4)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResultQuestion4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane5.setTopComponent(jPanel13);

        displayPanel4.setBackground(new java.awt.Color(153, 255, 255));
        displayPanel4.setLayout(new java.awt.BorderLayout());
        jSplitPane5.setRightComponent(displayPanel4);

        jPanel3.add(jSplitPane5, java.awt.BorderLayout.CENTER);

        tab6.addTab("Third Question", jPanel3);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Analyze ratio of laptop donated to needy people and laptop sent for recycle");

        btnResultQuestion6.setBackground(new java.awt.Color(204, 255, 204));
        btnResultQuestion6.setForeground(new java.awt.Color(51, 0, 51));
        btnResultQuestion6.setText("View Result");
        btnResultQuestion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultQuestion6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResultQuestion6)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnResultQuestion6))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel6);

        displayPanelno6.setBackground(new java.awt.Color(204, 204, 255));
        displayPanelno6.setForeground(new java.awt.Color(51, 0, 51));
        displayPanelno6.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(displayPanelno6);

        jPanel5.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        tab6.addTab("Fourth Question", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab6)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab6)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultQuestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultQuestion2ActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieData = new DefaultPieDataset();
        pieData.setValue("Boston", business.getDonation("Boston"));
        pieData.setValue("Cambridge", business.getDonation("Cambridge"));
        pieData.setValue("Worchester", business.getDonation("Worchester"));
       // pieData.setValue("Four", new Integer(40));
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieData, true, true, true);
        PiePlot p = (PiePlot)chart.getPlot();
        ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setVisible(true);
        piePanel.removeAll();
        piePanel.add(chartpanel, BorderLayout.CENTER);
        piePanel.validate();
    }//GEN-LAST:event_btnResultQuestion2ActionPerformed

    private void btnResultQuestion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultQuestion3ActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        String city=(String)comboBoxCity.getSelectedItem();
         HashMap<String, Integer> hmap=business.giveAcrossStores(city);//from combobox
         Set set = hmap.entrySet();
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         barChartData.setValue((Integer) mentry.getValue(), "Donation Amount", String.valueOf(mentry.getKey()));
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }
        JFreeChart barChart = ChartFactory.createBarChart("Laptop Donation", "Store-wise", "Donation Amount", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barP = new ChartPanel(barChart);
        barP.setVisible(true);
        displayPanel3.removeAll();
        displayPanel3.add(barP, BorderLayout.CENTER);
        displayPanel3.validate();
    }//GEN-LAST:event_btnResultQuestion3ActionPerformed

    private void btnResultQuestion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultQuestion4ActionPerformed
      //  business.donorTypeDonation(TOOL_TIP_TEXT_KEY)
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(business.donorTypeDonation("Individual"), "Donation Amount", "Individual");
        barChartData.setValue(business.donorTypeDonation("University"), "Donation Amount", "University");
        barChartData.setValue(business.donorTypeDonation("Company"), "Donation Amount", "Company");
        JFreeChart barChart = ChartFactory.createBarChart("Laptop Donation", "Donor-Type", "Donation Amount", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barP = new ChartPanel(barChart);
        barP.setVisible(true);
        displayPanel4.removeAll();
        displayPanel4.add(barP, BorderLayout.CENTER);
        displayPanel4.validate();
    }//GEN-LAST:event_btnResultQuestion4ActionPerformed

    private void btnResultQuestion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultQuestion6ActionPerformed
        DefaultPieDataset pieData = new DefaultPieDataset();
        pieData.setValue("Laptop Given Away", business.calculatePercentGiveAway());
        pieData.setValue("Laptop Decomposed", business.calculatePercentDecomposition());
       
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieData, true, true, true);
        PiePlot p = (PiePlot)chart.getPlot();
        ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setVisible(true);
        displayPanelno6.removeAll();
        displayPanelno6.add(chartpanel, BorderLayout.CENTER);
        displayPanelno6.validate();
    }//GEN-LAST:event_btnResultQuestion6ActionPerformed

                                   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResultQuestion2;
    private javax.swing.JButton btnResultQuestion3;
    private javax.swing.JButton btnResultQuestion4;
    private javax.swing.JButton btnResultQuestion6;
    private javax.swing.JComboBox<String> comboBoxCity;
    private javax.swing.JPanel displayPanel3;
    private javax.swing.JPanel displayPanel4;
    private javax.swing.JPanel displayPanelno6;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JPanel piePanel;
    private javax.swing.JTabbedPane tab6;
    // End of variables declaration//GEN-END:variables
}
