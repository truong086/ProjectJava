/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btljava.ui;

import com.btljava.helper.MessageDialog;
import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class guiemail extends javax.swing.JPanel {

    /**
     * Creates new form guiemail
     */
    public guiemail() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noidungs = new javax.swing.JTextArea();
        matkhaus = new javax.swing.JPasswordField();
        taikhoans = new javax.swing.JTextField();
        tieudes = new javax.swing.JTextField();
        tos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        chiases = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        files = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Tài khoản");

        jLabel2.setText("Mật khẩu");

        jLabel3.setText("To");

        jLabel4.setText("Tiêu đề");

        jLabel5.setText("Nội dung");

        noidungs.setColumns(20);
        noidungs.setRows(5);
        jScrollPane1.setViewportView(noidungs);

        jLabel6.setText("Chia sẻ");

        jButton1.setText("file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("file");

        jButton2.setText("sed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(taikhoans))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(matkhaus, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(94, 94, 94)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(files))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(tos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(chiases, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tieudes, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(taikhoans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matkhaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(chiases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tieudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(files, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(326, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    String duongdan = "";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<String> list = new ArrayList<String>();
        list.add("vantruong0862002@gmail.com");
        list.add("ksvj005@gmail.com");
        
        for(int i = 0; i < list.size(); i++){
            
        
            try{
                    Properties p = new Properties(); // Sử dụng hàm "Properties" để mở cổng server gmail
                    p.put("mail.smtp.auth", "true");
                    p.put("mail.smtp.starttls.enable", "true"); // Đây là chế độ bảo mật
                    p.put("mail.smtp.host", "smtp.gmail.com"); // "smtp.gmail.com" đây là phương thức gửi của email, nếu muốn đổi sang gửi yahoo hay bất ký thứ khác thì đổi phần "gmail" thành ứng dụng muốn đổi
                    p.put("mail.smtp.port", 587); // "587" nghĩa là địa chỉ của server

                    // Lấy ra thông tin tài khoản mật khẩu của người gửi 
                    String taikhoan = taikhoans.getText();
                    String pass = matkhaus.getText();

                    // Viết 1 hàm để chứng thực tài khoản, mật khẩu của người gửi, và lưu trữ phiên mà người dùng gửi và sessition chuyền vào tài khoản người dùng và mật khẩu
                    Session s = Session.getInstance(p,
                            new javax.mail.Authenticator() {
                                protected PasswordAuthentication getPasswordAuthentication(){
                                    return new PasswordAuthentication(taikhoan, pass);
                                }
                            });

                    String from = taikhoans.getText(); // Lấy ra được tài khoản người gửi
                    //String to = tos.getText(); // Lấy ra được tài khoản người nhận
                    String to = list.get(i).toString(); // Gửi email cho nhiều người
                    String tieude = tieudes.getText(); // Lấy ra được tiêu đề
                    String noidung = noidungs.getText(); // Lấy ra được nội dung
                    String chiase = chiases.getText(); // Lấy ra được tài khoản của người được chia sẻ nội dung


                    Message msg = new MimeMessage(s);// Sử dụng hàm "Message" để chuyền vào thông tin tài khoản của người gửi, "s" là thông tin tài khoản người gửi được lưu vào trong "Sessition"
                    // Bắt đầu gán các thuộc tình vào để gửi mail
                    msg.setFrom(new InternetAddress(from)); // Gán tài khoản người gửi
                    msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to)); // gán tài khoản người nhận
                    msg.addRecipients(Message.RecipientType.CC, InternetAddress.parse(chiase)); // Gán tài khoản người được chia sẻ

                    // Gửi kèm nội dung body
                    MimeBodyPart contentpart = new MimeBodyPart();
                    contentpart.setContent(noidung, "text/html; charset=utf8"); // Gửi đi tiếng việt
                    msg.setSubject(tieude); // Gửi đi tiêu để
                    msg.setText(noidung); // Gửi đi nội dung

                    // Khởi tạo 1 biến "MimeBodyPart" để gửi được file đính kèm
                    MimeBodyPart filePart = new MimeBodyPart();

                    File file = new File(duongdan); // Khởi tạo 1 biến "file" và chuyền vào đường dẫn
                    FileDataSource fds = new FileDataSource(file); // Khởi tạo 1 biến "FileDataSource" để sử lý file chuyền vào
                    filePart.setDataHandler(new DataHandler(fds));
                    filePart.setFileName(file.getName()); // Lấy ra tên đường dẫn của file


                    MimeMultipart mimemutun = new MimeMultipart();
                    mimemutun.addBodyPart(contentpart); // Add thêm phần body để gửi
                    mimemutun.addBodyPart(filePart); // Add thêm phần file đính kèm để gửi

                    msg.setContent(mimemutun);


                    Transport.send(msg); // Bắt đầu gửi

                    // Hiển thị thông báo
                    JOptionPane.showMessageDialog(null, "Gửi email thành công", "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);


            }catch(Exception e){
                e.printStackTrace();
                MessageDialog.showMessageError(this, e.getMessage(), "Lỗi");
            }
        }
        
        
        
        
        
        
        /*
        
            ArrayList<String> arrlist = new ArrayList<String>(); 
        arrlist.add("vantruong0862002@gmail.com"); // Add email vào trong "ArrayList<>"
        
        for(int i = 0; i <= arrlist.size(); i++){ // Sử dụng vòng lặp "for" để duyệt qua các email nằm trong "ArrayList<>", sử dụng hàm "size()" để duyệt vào các mảng trong "ArrayList<>"
            
            try{
                // Mở cổng của server gmail ra để gửi mail
                Properties p = new Properties(); // Sử dụng hàm "Properties" để mở cổng server gmail
                p.put("mail.smtp.auth", "true");
                p.put("mail.smtp.starttls.enable", "true"); // Đây là chế độ bảo mật
                p.put("mail.smtp.host", "smtp.gmail.com"); // "smtp.gmail.com" đây là phương thức gửi của email, nếu muốn đổi sang gửi yahoo hay bất ký thứ khác thì đổi phần "gmail" thành ứng dụng muốn đổi
                p.put("mail.smtp.port", 587); // "587" nghĩa là địa chỉ của server

                // Lấy ra thông tin tài khoản và mật khẩu của người dùng
                String accountName = txtUser.getText();
                String accountPassword = txtPassword.getText();

                // Viết 1 hàm để chứng thực tài khoản, mật khẩu của người gửi, và lưu trữ phiên mà người dùng gửi và sessition chuyền vào tài khoản người dùng và mật khẩu
                Session s = Session.getInstance(p, 
                        new javax.mail.Authenticator(){
                            protected PasswordAuthentication getPasswordAuthentication(){
                                return new PasswordAuthentication(accountName, accountPassword);
                            }
                        });

                String from = txtUser.getText(); // Lấy ra được tài khoản người gửi
                // Đây là "To" gửi cho 1 người
                //String To = txtTo.getText(); // Lấy ra được tài khoản người nhận
                
                // Đây là "To" gửi cho nhiều người
                String To = arrlist.get(i).toString();
                String subject = txtSubjeck.getText(); // Lấy ra được tiêu đề
                String body = txtMessage.getText(); // Lấy ra được nội dung
                String cc = txtcc.getText(); // Lấy ra được tài khoản của người được chia sẻ nội dung

                Message msg = new MimeMessage(s); // Sử dụng hàm "Message" để chuyền vào thông tin tài khoản của người gửi, "s" là thông tin tài khoản người gửi được lưu vào trong "Sessition"
                // Bắt đầu gán các thuộc tình vào để gửi mail
                msg.setFrom(new InternetAddress(from)); // Gán tài khoản người gửi

                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To)); // gán tài khoản người nhận
                msg.addRecipients(Message.RecipientType.CC, InternetAddress.parse(cc)); // Gán tài khoản người được chia sẻ

                // Gửi kèm nội dung body
                MimeBodyPart contentPart = new MimeBodyPart();
                contentPart.setContent(body, "text/html; charset=utf8"); // Gửi đi tiếng việt
                msg.setSubject(subject); // Gửi đi tiêu để
                msg.setText(body); // Gửi đi nội dung


                // Khởi tạo 1 biến "MimeBodyPart" để gửi được file đính kèm
                MimeBodyPart filepart = new MimeBodyPart();

                File file = new File(duongdan); // Khởi tạo 1 biến "file" và chuyền vào đường dẫn

                FileDataSource fds = new FileDataSource(file); // Khởi tạo 1 biến "FileDataSource" để sử lý file chuyền vào
                filepart.setDataHandler(new DataHandler(fds));
                filepart.setFileName(file.getName()); // Lấy ra tên đường dẫn của file

                MimeMultipart multipart = new MimeMultipart();

                multipart.addBodyPart(contentPart); // Add thêm phần body để gửi
                multipart.addBodyPart(filepart); // Add thêm phần file đính kèm để gửi

                msg.setContent(multipart);

                Transport.send(msg); // Bắt đầu gửi

                // Hiển thị thông báo
                JOptionPane.showMessageDialog(null, "Gửi Email thành công", "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            }catch(Exception e){
                Logger.getLogger(GuiEmail.class.getName()).log(Level.SEVERE, null, e); // Gửi thông báo lỗi từ server
            }
        }
        */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser f = new JFileChooser("C:\\"); // Khi người dùng ấn vào mở file thì sẽ chuyền đường dẫn file mặc định vào
        f.setDialogTitle("Mở file");
        f.showOpenDialog(null);
        File ftend = f.getSelectedFile(); // Khai báo 1 biến file để lấy ra được tên của file
        duongdan = ftend.getAbsolutePath();// Lấy ra được đường dẫn đến file
        files.setText(duongdan); // Chuyền tên file vào ô text
        /*
            JFileChooser f = new JFileChooser("C:\\"); // Khi người dùng ấn vào mở file thì sẽ chuyền đường dẫn file mặc định vào
        f.setDialogTitle("Mở file");
        f.showOpenDialog(null);
        File ftenfile = f.getSelectedFile(); // Khai báo 1 biến file để lấy ra được tên của file
        duongdan = ftenfile.getAbsolutePath(); // // Lấy ra được đường dẫn đến file
        txtduongdan.setText(duongdan); // Chuyền tên file vào ô text
        */
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chiases;
    private javax.swing.JTextField files;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField matkhaus;
    private javax.swing.JTextArea noidungs;
    private javax.swing.JTextField taikhoans;
    private javax.swing.JTextField tieudes;
    private javax.swing.JTextField tos;
    // End of variables declaration//GEN-END:variables
}
