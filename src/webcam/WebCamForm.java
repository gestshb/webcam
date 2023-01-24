package webcam;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WebCamForm extends javax.swing.JFrame {

    /**
     * Creates new form wabCamForm
     */
    public WebCamForm() {
        initComponents();
        String[] webcamNames = new String[webcams.size()];
        for (int i = 0; i < webcams.size(); i++) {
            webcamNames[i] = webcams.get(i).getName();
        }
        webcamsItems.setModel(new javax.swing.DefaultComboBoxModel(webcamNames));
        for (Webcam w : webcams) {
            w.setViewSize(size);
            WebcamPanel panel = new WebcamPanel(w, size, false);
            panel.setSize(size);
            panel.setMirrored(true);

            panels.add(panel);
        }
        jPanel1.setLayout(new GridBagLayout());
        for (WebcamPanel p : panels) {
            jPanel1.add(p);

        }

        //set size
        if (webcams.size() > 1) {
            setSize(665 * webcams.size(), 650);
        }
        //this will center our app
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageUtils1 = new com.github.sarxos.webcam.util.ImageUtils();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        play = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        save = new javax.swing.JButton();
        webcamsItems = new javax.swing.JComboBox();
        load = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        play.setText("play");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        stop.setText("stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        save.setText("save Image");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        webcamsItems.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        load.setLabel("Load Image ");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(webcamsItems, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stop)
                    .addComponent(save)
                    .addComponent(webcamsItems, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load)
                    .addComponent(play))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = fc.showOpenDialog(WebCamForm.this);
        File dir = fc.getSelectedFile();
        //File file = new File(dir.toString()+"snapshot"+ hashCode()+webcamsItems.getSelectedItem());
        Webcam webcam = webcams.get(webcamsItems.getSelectedIndex());
        try {
            ImageIO.write(webcam.getImage(), "JPG", dir);
        } catch (IOException ex) {
            Logger.getLogger(WebCamForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_saveActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed

        exe.execute(new Runnable() {
            @Override
            public void run() {

                panels.get(webcamsItems.getSelectedIndex()).start();

            }
        });
    }//GEN-LAST:event_playActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed

        exe.execute(new Runnable() {
            @Override
            public void run() {

                panels.get(webcamsItems.getSelectedIndex()).stop();

            }
        });
    }//GEN-LAST:event_stopActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        BufferedImage img;
        try {
            final JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int returnVal = fc.showOpenDialog(WebCamForm.this);
            File dir = fc.getSelectedFile();
            img = ImageIO.read(dir);
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException ex) {
            Logger.getLogger(WebCamForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_loadActionPerformed

    private Dimension size = WebcamResolution.VGA.getSize();
    private List<Webcam> webcams = Webcam.getWebcams();
    private List<WebcamPanel> panels = new ArrayList<>();
    private Executor exe = Executors.newSingleThreadExecutor();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.sarxos.webcam.util.ImageUtils imageUtils1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton load;
    private javax.swing.JButton play;
    private javax.swing.JButton save;
    private javax.swing.JButton stop;
    private javax.swing.JComboBox webcamsItems;
    // End of variables declaration//GEN-END:variables
}
