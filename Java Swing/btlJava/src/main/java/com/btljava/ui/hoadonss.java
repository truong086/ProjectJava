/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.ui;

import com.btljava.controller.HoaDonController;
import com.btljava.controller.SanPhamController;
import com.btljava.dao.impl.hoadonDao;
import com.btljava.dao.impl.sanphamDao;
import com.btljava.helper.DataValidor;
import com.btljava.helper.MessageDialog;
import com.btljava.helper.ShereData;
import com.btljava.model.hoadon;
import com.btljava.model.sanpham;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class hoadonss extends javax.swing.JDialog {
    private fromMain mains;
    private DefaultTableModel model;
    int ids = 0;
    
    private HoaDonController dao = new HoaDonController();
    private SanPhamController daos = new SanPhamController();
    /**
     * Creates new form hoadonss
     */
    public hoadonss(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        
    }
    
     private void phanquyen(){
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("2")){
            deletes.hide();
        }
        if(phanquyen.equals("3")){
            add.hide();
            edits.hide();
            deletes.hide();
            
        }
    }
     private void timkiem(){
        try{
//            hoadonDao dao = new hoadonDao();
            List<hoadon> list = dao.timkiem(timkiems.getText());
            model.setRowCount(0);
            
            for(hoadon hd : list){
                model.addRow(new Object[] {
                    hd.getId(), hd.getMabenhnhan(), hd.getNgayra(), hd.getPhuongphapdieutri(), 
                    hd.getMieuta(), hd.getThuoc_id(), hd.getSoluong(), hd.getTongtienthuoc(), hd.getTongtien(), hd.getNgaytao()
                });
            }
            
            model.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }
    
    private void inittable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[] {
            "ID", "Mã bệnh nhân", "Ngày ra", "Phương pháp điều trị", "Miêu tả", "Mã thuốc", "Số lượng", "Tổng tiền thuốc", "Tổng tiền", "Ngày tạo"
        });
        
        tblTable.setModel(model);
    }
    
    private void loadDataTable(){
        try{
//            hoadonDao dao = new hoadonDao();
            List<hoadon> list = dao.findAll();
            model.setRowCount(0);
            for(hoadon hd : list){
                model.addRow(new Object[] {
                    hd.getId(), hd.getMabenhnhan(), hd.getNgayra(), hd.getPhuongphapdieutri(), 
                    hd.getMieuta(), hd.getThuoc_id(), hd.getSoluong(), hd.getTongtienthuoc(), hd.getTongtien(), hd.getNgaytao()
                });
            }
            model.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }
    
    private void khachhang(){
        String phanquyen = String.valueOf(ShereData.dangnhap.getTentaikhoan());
        try{
//            hoadonDao dao = new hoadonDao();
            List<hoadon> list = dao.khachhang(phanquyen);
            model.setRowCount(0);
            for(hoadon hd : list){
                model.addRow(new Object[] {
                    hd.getId(), hd.getMabenhnhan(), hd.getNgayra(), hd.getPhuongphapdieutri(), 
                    hd.getMieuta(), hd.getThuoc_id(), hd.getSoluong(), hd.getTongtienthuoc(), hd.getTongtien(), hd.getNgaytao()
                });
            }
            model.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        soluongs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tongtienthuocs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tongtiens = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ngaytaos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        timkiems = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mabenhnhans = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        ngayras = new javax.swing.JTextField();
        edits = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ppdieutris = new javax.swing.JTextField();
        deletes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mieutas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        thuocids = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quyen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        soluongs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                soluongsFocusLost(evt);
            }
        });
        soluongs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                soluongsKeyReleased(evt);
            }
        });

        jLabel5.setText("Mã thuốc");

        jLabel6.setText("Số lượng");

        jLabel7.setText("Tổng tiền thuốc");

        jLabel8.setText("Tổng tiền");

        timkiems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiemsKeyReleased(evt);
            }
        });

        jLabel9.setText("Ngày tạo");

        jLabel10.setText("Tìm kiếm");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edits.setText("Edit");
        edits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã bệnh nhân");

        deletes.setText("Delete");
        deletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesActionPerformed(evt);
            }
        });

        jLabel2.setText("Ngày ra");

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        jLabel3.setText("PP Điều trị");

        thuocids.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                thuocidsKeyReleased(evt);
            }
        });

        jLabel4.setText("Miêu tả");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setText("Hóa đơn");

        quyen.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(edits, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(deletes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timkiems, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quyen))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(thuocids, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ngayras, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ppdieutris, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mieutas, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(mabenhnhans, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(soluongs, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tongtiens, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tongtienthuocs, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ngaytaos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(quyen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(timkiems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(mabenhnhans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soluongs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(tongtienthuocs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(tongtiens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ppdieutris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(ngaytaos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mieutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(thuocids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edits, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(deletes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soluongsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_soluongsFocusLost
        // TODO add your handling code here:

        int thuocid = 0;
        int soluong = 0;
        int giathuoc = 0;
        //int tongtienthuoc = Integer.parseInt(tongtienthuocs.getText());
        int tong = 0;

        if(thuocids.getText().chars().allMatch(Character :: isDigit) && soluongs.getText().chars().allMatch(Character :: isDigit) && tongtienthuocs.getText().chars().allMatch(Character :: isDigit)){
            thuocid = Integer.parseInt(thuocids.getText());
            soluong = Integer.parseInt(soluongs.getText());
            //tongtienthuoc = Integer.parseInt(tongtienthuocs.getText());
        }

        try{
//            sanphamDao dao = new sanphamDao();
            sanpham sp = daos.findby(thuocid);
            if(sp != null){
                giathuoc = sp.getGiaban(); // Lấy ra giá thuốc ở bảng "sản phẩm"
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
        //        if(thuocid == 1){
            //            thuocid = 20000;
            //        }else{
            //            MessageDialog.showMessageError(mains, "Thuốc không tồn tại", "Lỗi");
            //            return;
            //        }

        tong = giathuoc * soluong;
        //String tongs = String.format("%.2d",tong);
        String tongs = String.valueOf(tong);
        tongtienthuocs.setText(tongs);
    }//GEN-LAST:event_soluongsFocusLost

    private void soluongsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soluongsKeyReleased
        // TODO add your handling code here:

        int thuocid = 0;
        int soluong = 0;
        int giathuoc = 0;
        //int tongtienthuoc = Integer.parseInt(tongtienthuocs.getText());
        int tong = 0;

        if(thuocids.getText().chars().allMatch(Character :: isDigit) && soluongs.getText().chars().allMatch(Character :: isDigit) && tongtienthuocs.getText().chars().allMatch(Character :: isDigit)){
            thuocid = Integer.parseInt(thuocids.getText());
            soluong = Integer.parseInt(soluongs.getText());
            //tongtienthuoc = Integer.parseInt(tongtienthuocs.getText());
        }

        try{
//            sanphamDao dao = new sanphamDao();
            sanpham sp = daos.findby(thuocid);
            if(sp != null){
                giathuoc = sp.getGiaban(); // Lấy ra giá thuốc ở bảng "sản phẩm"
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
        //        if(thuocid == 1){
            //            thuocid = 20000;
            //        }else{
            //            MessageDialog.showMessageError(mains, "Thuốc không tồn tại", "Lỗi");
            //            return;
            //        }

        tong = giathuoc * soluong;
        //String tongs = String.format("%.2d",tong);
        String tongs = String.valueOf(tong);
        tongtienthuocs.setText(tongs);

    }//GEN-LAST:event_soluongsKeyReleased

    private void timkiemsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemsKeyReleased
        // TODO add your handling code here:

        String value = timkiems.getText();
        if(value.equals("")){
            loadDataTable();
        }else{
            timkiem();
        }
    }//GEN-LAST:event_timkiemsKeyReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

        StringBuilder sb = new StringBuilder();

        DataValidor.kiemtra(mabenhnhans, sb, "Mã bệnh nhân không được để trống");
        DataValidor.kiemtra(ngayras, sb, "Ngày ra không được để trống");
        DataValidor.kiemtra(ppdieutris, sb, "Phương pháp điều trị không được để trống");
        DataValidor.kiemtra(mieutas, sb, "Miêu tả không được để trống");
        DataValidor.kiemtra(thuocids, sb, "Mã thuốc không được để trống");
        DataValidor.kiemtra(soluongs, sb, "Số lượng không được để trống");
        DataValidor.kiemtra(tongtienthuocs, sb, "Tổng tiền thuốc không được để trống");
        DataValidor.kiemtra(tongtiens, sb, "Tổng tiền không được để trống");
        DataValidor.kiemtra(ngaytaos, sb, "Ngày tạo không được để trống");

        if(sb.length() > 0){
            MessageDialog.showMessageError(mains, sb.toString(), "Lỗi");
            return;
        }
        int mabenhnhan = 0;
        int thuocid = 0;
        int soluong = 0;
        int tienthuoc = 0;
        int tongtien = 0;
        if(mabenhnhans.getText().chars().allMatch(Character :: isDigit) && thuocids.getText().chars().allMatch(Character :: isDigit)
            && soluongs.getText().chars().allMatch(Character :: isDigit) && tongtienthuocs.getText().chars().allMatch(Character :: isDigit)
            && tongtiens.getText().chars().allMatch(Character :: isDigit)){
            mabenhnhan = Integer.parseInt(mabenhnhans.getText());
            thuocid = Integer.parseInt(thuocids.getText());
            soluong = Integer.parseInt(soluongs.getText());
            tienthuoc = Integer.parseInt(tongtienthuocs.getText());
            tongtien = Integer.parseInt(tongtiens.getText());
        }else{
            MessageDialog.showMessageError(mains, "Mã bệnh nhân, mã thuốc, số lượng, tiền thuốc, tổng tiền phải là số", "Lỗi");
        }

        try{
            hoadon hd = new hoadon();
            hd.setMabenhnhan(mabenhnhan);
            hd.setNgayra(ngayras.getText());
            hd.setPhuongphapdieutri(ppdieutris.getText());
            hd.setMieuta(mieutas.getText());
            hd.setThuoc_id(thuocid);
            hd.setSoluong(soluong);
            hd.setTongtienthuoc(tienthuoc);
            hd.setTongtien(tongtien);
            hd.setNgaytao(ngaytaos.getText());
//            hoadonDao dao = new hoadonDao();
            if(dao.insert(hd)){
                MessageDialog.showMessageDialog(mains, "Thêm dữ liệu thành công", "Thông báo");
                loadDataTable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }

    }//GEN-LAST:event_addActionPerformed

    private void editsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsActionPerformed
        // TODO add your handling code here:

        StringBuilder sb = new StringBuilder();

        DataValidor.kiemtra(mabenhnhans, sb, "Mã bệnh nhân không được để trống");
        DataValidor.kiemtra(ngayras, sb, "Ngày ra không được để trống");
        DataValidor.kiemtra(ppdieutris, sb, "Phương pháp điều trị không được để trống");
        DataValidor.kiemtra(mieutas, sb, "Miêu tả không được để trống");
        DataValidor.kiemtra(thuocids, sb, "Mã thuốc không được để trống");
        DataValidor.kiemtra(soluongs, sb, "Số lượng không được để trống");
        DataValidor.kiemtra(tongtienthuocs, sb, "Tổng tiền thuốc không được để trống");
        DataValidor.kiemtra(tongtiens, sb, "Tổng tiền không được để trống");
        DataValidor.kiemtra(ngaytaos, sb, "Ngày tạo không được để trống");

        if(sb.length() > 0){
            MessageDialog.showMessageError(mains, sb.toString(), "Lỗi");
            return;
        }
        int mabenhnhan = 0;
        int thuocid = 0;
        int soluong = 0;
        int tienthuoc = 0;
        int tongtien = 0;
        if(mabenhnhans.getText().chars().allMatch(Character :: isDigit) && thuocids.getText().chars().allMatch(Character :: isDigit)
            && soluongs.getText().chars().allMatch(Character :: isDigit) && tongtienthuocs.getText().chars().allMatch(Character :: isDigit)
            && tongtiens.getText().chars().allMatch(Character :: isDigit)){
            mabenhnhan = Integer.parseInt(mabenhnhans.getText());
            thuocid = Integer.parseInt(thuocids.getText());
            soluong = Integer.parseInt(soluongs.getText());
            tienthuoc = Integer.parseInt(tongtienthuocs.getText());
            tongtien = Integer.parseInt(tongtiens.getText());
        }else{
            MessageDialog.showMessageError(mains, "Mã bệnh nhân, mã thuốc, số lượng, tiền thuốc, tổng tiền phải là số", "Lỗi");
        }

        try{
            hoadon hd = new hoadon();
            hd.setId(ids);
            hd.setMabenhnhan(mabenhnhan);
            hd.setNgayra(ngayras.getText());
            hd.setPhuongphapdieutri(ppdieutris.getText());
            hd.setMieuta(mieutas.getText());
            hd.setThuoc_id(thuocid);
            hd.setSoluong(soluong);
            hd.setTongtienthuoc(tienthuoc);
            hd.setTongtien(tongtien);
            hd.setNgaytao(ngaytaos.getText());
//            hoadonDao dao = new hoadonDao();
            if(dao.update(hd)){
                MessageDialog.showMessageDialog(mains, "Thêm dữ liệu thành công", "Thông báo");
                loadDataTable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Lỗi");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_editsActionPerformed

    private void deletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesActionPerformed
        // TODO add your handling code here:

        if(MessageDialog.showConfirmDialog(mains, "bạn chắc chắn muốn xóa bản ghi này không?", "Thông báo") == JOptionPane.NO_OPTION){
            return;
        }

        try{
//            hoadonDao dao = new hoadonDao();
            String id = String.valueOf(ids);
            if(dao.delete(id)){
                MessageDialog.showMessageDialog(mains, "Xóa thành công", "Thông báo");
                loadDataTable();
            }else{
                MessageDialog.showMessageError(mains, "Đã có lỗi xảy ra", "Thông báo");
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_deletesActionPerformed

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:

        try{
            int row = tblTable.getSelectedRow();
            if(row >= 0){
                ids = (int) tblTable.getValueAt(row, 0);
//                hoadonDao dao = new hoadonDao();
                hoadon list = dao.findbyid(ids);
                String mabenhnhan = String.valueOf(list.getMabenhnhan());
                String thuocid = String.valueOf(list.getThuoc_id());
                String soluong = String.valueOf(list.getSoluong());
                String tienthuoc = String.valueOf(list.getTongtienthuoc());
                String tongtien = String.valueOf(list.getTongtien());
                if(list != null){
                    mabenhnhans.setText(mabenhnhan);
                    ngayras.setText(list.getNgayra());
                    ppdieutris.setText(list.getPhuongphapdieutri());
                    mieutas.setText(list.getMieuta());
                    thuocids.setText(thuocid);
                    soluongs.setText(soluong);
                    tongtienthuocs.setText(tienthuoc);
                    tongtiens.setText(tongtien);
                    ngaytaos.setText(list.getNgaytao());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            MessageDialog.showMessageError(mains, e.getMessage(), "lỗi");
        }
    }//GEN-LAST:event_tblTableMouseClicked

    private void thuocidsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thuocidsKeyReleased
        // TODO add your handling code here:
        soluongsKeyReleased(evt);
    }//GEN-LAST:event_thuocidsKeyReleased

    private void checkLogin(){
        int phanquyen = ShereData.dangnhapss.getPhanquyen();
        if(phanquyen == 1){
            quyen.setForeground(Color.red);
            quyen.setText("Admin");
        }
        if(phanquyen == 2){
            quyen.setForeground(Color.red);
            quyen.setText("Quản lý");
        }
        if(phanquyen == 3){
            quyen.setForeground(Color.red);
            quyen.setText("Bệnh nhân");
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        inittable();
        
        
        
        String phanquyen = String.valueOf(ShereData.dangnhap.getPhanquyen());
        if(phanquyen.equals("3")){
            khachhang();
        }else{
            loadDataTable();
        }
        
        phanquyen();
        checkLogin();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(hoadonss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hoadonss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hoadonss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hoadonss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hoadonss dialog = new hoadonss(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton deletes;
    private javax.swing.JButton edits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mabenhnhans;
    private javax.swing.JTextField mieutas;
    private javax.swing.JTextField ngayras;
    private javax.swing.JTextField ngaytaos;
    private javax.swing.JTextField ppdieutris;
    private javax.swing.JButton quyen;
    private javax.swing.JTextField soluongs;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField thuocids;
    private javax.swing.JTextField timkiems;
    private javax.swing.JTextField tongtiens;
    private javax.swing.JTextField tongtienthuocs;
    // End of variables declaration//GEN-END:variables
}