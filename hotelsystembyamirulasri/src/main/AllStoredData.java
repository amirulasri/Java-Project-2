package main;

import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import java.text.DecimalFormat;

/**
 *
 * @author amirul asri
 */
public class AllStoredData extends javax.swing.JFrame {

    RoomRental[] rentalArr = TestRoomRental.rentalArr;
    private static AllStoredData allstoreddataframeobject = null;
    DecimalFormat priceformatter = new DecimalFormat("#0.00");

    /**
     * Creates new form AllStoredData
     */
    public AllStoredData() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static AllStoredData getFrameObject() {
        if (allstoreddataframeobject == null) {
            allstoreddataframeobject = new AllStoredData();
        }
        return allstoreddataframeobject;
    }

    public void showAllData() {
        SimpleDateFormat newformat = new SimpleDateFormat("dd-MM-yyyy");
        String newstartdate = null;
        String newenddate = null;
        for (int i = 0; i < rentalArr.length; i++) {

            //DAYS DIFFERENT
            int days = 0;
            if ((rentalArr[i].getStartDate() != null) && (rentalArr[i].getEndDate() != null)) {
                days = rentalArr[i].CalculateDays(rentalArr[i].getStartDate(), rentalArr[i].getEndDate());
            }

            //CONVERT TO SIMPLEST FORMAT
            newstartdate = null;
            newenddate = null;
            if (rentalArr[i].getStartDate() != null) {
                newstartdate = newformat.format(rentalArr[i].getStartDate());
            }
            if (rentalArr[i].getEndDate() != null) {
                newenddate = newformat.format(rentalArr[i].getEndDate());
            }

            //GET PRICE
            double price = 0;
            String newprice = null;
            if ((rentalArr[i].getRoomType() != null) && (days != 0) && (rentalArr[i].getQuantityRoom() != 0)) {
                price = rentalArr[i].FindPrice(rentalArr[i].getQuantityRoom(), days, rentalArr[i].getRoomType());
                newprice = priceformatter.format(price);
            }

            //                                                  DATA, ROW, COLUMN
            datatablecustomer.setValueAt(rentalArr[i].getCustomerName(), i, 0);
            datatablecustomer.setValueAt(rentalArr[i].getContactNo(), i, 1);
            datatablecustomer.setValueAt(rentalArr[i].getRoomType(), i, 2);
            datatablecustomer.setValueAt(newstartdate, i, 3);
            datatablecustomer.setValueAt(newenddate, i, 4);
            if (rentalArr[i].getQuantityRoom() != 0) {
                datatablecustomer.setValueAt(rentalArr[i].getQuantityRoom(), i, 5);
            }
            if (days != 0) {
                datatablecustomer.setValueAt(days + " Days", i, 6);
            }
            if (price != 0) {
                datatablecustomer.setValueAt("RM " + newprice, i, 7);
            }
        }
        //CALCULATE HOW MANY ROOM ARE BOOKED
        int countstandard = 0;
        int countdeluxe = 0;
        int countsuperior = 0;

        try {
            //COUNT BY USING FOR LOOP
            for (int i = 0; i < rentalArr.length; i++) {
                if (rentalArr[i].getRoomType().equalsIgnoreCase("Standard")) {
                    countstandard = countstandard + rentalArr[i].getQuantityRoom();
                } else if (rentalArr[i].getRoomType().equalsIgnoreCase("Deluxe")) {
                    countdeluxe = countdeluxe + rentalArr[i].getQuantityRoom();
                } else if (rentalArr[i].getRoomType().equalsIgnoreCase("Superior")) {
                    countsuperior = countsuperior + rentalArr[i].getQuantityRoom();
                }
            }
        } catch (Exception e) {
            //NO LOG
        }
        countstandardui.setText("Standard: " + countstandard);
        countdeluxeui.setText("Deluxe: " + countdeluxe);
        countsuperiorui.setText("Superior: " + countsuperior);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        refreshbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datatablecustomer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        countstandardui = new javax.swing.JLabel();
        countdeluxeui = new javax.swing.JLabel();
        countsuperiorui = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Sri Kayangan - Amirul Asri - All Stored Data");

        jPanel1.setBackground(new java.awt.Color(180, 167, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("All Stored Data");

        refreshbutton.setBackground(new java.awt.Color(204, 255, 204));
        refreshbutton.setText("Refresh");
        refreshbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(refreshbutton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        datatablecustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Costomer Name", "Contact No", "Room Type", "Start Date", "End Date", "Quantity Room", "Days", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(datatablecustomer);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Total room booked by customer: ");

        countstandardui.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        countstandardui.setText("Standard:");

        countdeluxeui.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        countdeluxeui.setText("Deluxe:");

        countsuperiorui.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        countsuperiorui.setText("Superior");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(countstandardui)
                    .addComponent(countdeluxeui)
                    .addComponent(countsuperiorui))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(countstandardui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countdeluxeui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countsuperiorui)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshbuttonMouseClicked
        //REFRESH DATA
        for (int i = 0; i < rentalArr.length; i++) {
            datatablecustomer.setValueAt(null, i, 0);
            datatablecustomer.setValueAt(null, i, 1);
            datatablecustomer.setValueAt(null, i, 2);
            datatablecustomer.setValueAt(null, i, 3);
            datatablecustomer.setValueAt(null, i, 4);
            datatablecustomer.setValueAt(null, i, 5);
        }
        showAllData();
    }//GEN-LAST:event_refreshbuttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel countdeluxeui;
    private javax.swing.JLabel countstandardui;
    private javax.swing.JLabel countsuperiorui;
    private javax.swing.JTable datatablecustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshbutton;
    // End of variables declaration//GEN-END:variables
}
