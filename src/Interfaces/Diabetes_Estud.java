/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author User
 */
public class Diabetes_Estud extends javax.swing.JFrame {

    /**
     * Creates new form Diabetes
     */
    public Diabetes_Estud() {
        initComponents();
        this.setLocationRelativeTo(null);
        transparente();
    }
    
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
       return retValue;
    }
    
    public void transparente(){
        Cerrar.setOpaque(false);
        Cerrar.setContentAreaFilled(false);
        Cerrar.setBorderPainted(false);
        Minimizar.setOpaque(false);
        Minimizar.setContentAreaFilled(false);
        Minimizar.setBorderPainted(false);
        Imagen.setOpaque(false);
        Imagen.setContentAreaFilled(false);
        Imagen.setBorderPainted(false);
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
        Imagen = new javax.swing.JButton();
        Salir = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        Perfil = new javax.swing.JLabel();
        Salud = new javax.swing.JLabel();
        Materias = new javax.swing.JLabel();
        Trabajos = new javax.swing.JLabel();
        Clase = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Minimizar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1050, 575));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(168, 201, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen.png"))); // NOI18N
        Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenActionPerformed(evt);
            }
        });
        jPanel1.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        Salir.setText("Cerrar sesión");
        Salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SalirMouseMoved(evt);
            }
        });
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        Inicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        Inicio.setText("Inicio");
        Inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InicioMouseMoved(evt);
            }
        });
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioMouseExited(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, -1));

        Perfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (1).png"))); // NOI18N
        Perfil.setText("Perfil");
        Perfil.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PerfilMouseMoved(evt);
            }
        });
        Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerfilMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PerfilMouseExited(evt);
            }
        });
        jPanel1.add(Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 140, -1));

        Salud.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/corazon.png"))); // NOI18N
        Salud.setText("Salud/Deporte");
        Salud.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SaludMouseMoved(evt);
            }
        });
        Salud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaludMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaludMouseExited(evt);
            }
        });
        jPanel1.add(Salud, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        Materias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Materias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/educacion.png"))); // NOI18N
        Materias.setText("Materias");
        Materias.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MateriasMouseMoved(evt);
            }
        });
        Materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MateriasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MateriasMouseExited(evt);
            }
        });
        jPanel1.add(Materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 40));

        Trabajos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Trabajos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiar.png"))); // NOI18N
        Trabajos.setText("Trabajos");
        Trabajos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TrabajosMouseMoved(evt);
            }
        });
        Trabajos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrabajosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TrabajosMouseExited(evt);
            }
        });
        jPanel1.add(Trabajos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 140, -1));

        Clase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/presentacion.png"))); // NOI18N
        Clase.setText("Hacer una entrega");
        Clase.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ClaseMouseMoved(evt);
            }
        });
        Clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClaseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClaseMouseExited(evt);
            }
        });
        jPanel1.add(Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 580));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar.png"))); // NOI18N
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        jPanel3.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 40));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel3.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 800, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(143, 170, 220));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Tal vez esta información te pueda interesar ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(125, 125, 125))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Sabías que...");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("DIABETES");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 40));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("<html>Una alimentación saludable y la actividad física también son importantes. Trabaje con su equipo de atención médica para crear un plan de cuidado de la diabetes que le funcione. Se tiene un plan de alimentación para la diabetes le ayuda a controlar sus niveles de glucosa en la sangre. Hacer actividad física moderada la mayoría de los días de la semana también ayuda a controlar su glucosa en la sangre.<html>");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 400, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enlace-de-tierra.png"))); // NOI18N
        jLabel1.setText("Click en el icono. ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enlace-de-tierra.png"))); // NOI18N
        jLabel2.setText("Click en el icono. ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enlace-de-tierra.png"))); // NOI18N
        jLabel3.setText("Click en el icono. ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enlace-de-tierra.png"))); // NOI18N
        jLabel4.setText("Click en el icono. ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("<html>Dicha enfermedad se es está convirtiendo en una epidemia mundial relacionada con el rápido aumento del sobrepeso, la obesidad y la inactividad física, para la OMS esto es muy preocupante por la contingencia del COVID-19 por la cual esta afrontando el mundo .<html>");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 480, 130));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("Estos links te pueden ser de buena ayuda:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 350, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen-diabetes.jpg"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 240, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 800, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenActionPerformed

    }//GEN-LAST:event_ImagenActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://www.cdc.gov/diabetes/spanish/basics/diabetes.html");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException ex){}
            }

        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://cuidadores.unir.net/informacion/enfermedades/sistema-endocrino/diabetes/1064-10-cosas-que-seguramente-no-sabias-sobre-la-diabetes");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException ex){}
            }

        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setState (Pag_Principal.ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://diabethelp.me/?gclid=Cj0KCQjw38-DBhDpARIsADJ3kjm7cpNlEC_GtdkGrG1cLN5k2gjiKUho1q0hwZw_LHxaQ3tO5gHFp2UaAj_LEALw_wcB");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException ex){}
            }

        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://www.clinicbarcelona.org/asistencia/enfermedades/diabetes/tratamiento");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException ex){}
            }

        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void SalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseMoved
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_SalirMouseMoved

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        this.setVisible(false);
        Final v= new Final();
        v.setVisible(true);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_SalirMouseExited

    private void InicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseMoved
        Inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_InicioMouseMoved

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        this.setVisible(false);
        Pag_Principal v= new Pag_Principal();
        v.setVisible(true);
    }//GEN-LAST:event_InicioMouseClicked

    private void InicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseExited
        Inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_InicioMouseExited

    private void PerfilMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseMoved
        Perfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_PerfilMouseMoved

    private void PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseClicked
        this.setVisible(false);
        Perfil v= new Perfil();
        v.setVisible(true);
    }//GEN-LAST:event_PerfilMouseClicked

    private void PerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseExited
        Perfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_PerfilMouseExited

    private void SaludMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaludMouseMoved
        Salud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_SaludMouseMoved

    private void SaludMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaludMouseClicked
      this.setVisible(false);
      Diabetes_Estud v = new Diabetes_Estud();
      v.setVisible(true);
    }//GEN-LAST:event_SaludMouseClicked

    private void SaludMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaludMouseExited
        Salud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_SaludMouseExited

    private void MateriasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseMoved
        Materias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_MateriasMouseMoved

    private void MateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseClicked
        this.setVisible(false);
        Materias v= new Materias();
        v.setVisible(true);
    }//GEN-LAST:event_MateriasMouseClicked

    private void MateriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseExited
        Materias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_MateriasMouseExited

    private void TrabajosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrabajosMouseMoved
        Trabajos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_TrabajosMouseMoved

    private void TrabajosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrabajosMouseClicked
        this.setVisible(false);
        Trabajos v= new Trabajos();
        v.setVisible(true);
    }//GEN-LAST:event_TrabajosMouseClicked

    private void TrabajosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrabajosMouseExited
        Trabajos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_TrabajosMouseExited

    private void ClaseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseMoved
        Clase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_ClaseMouseMoved

    private void ClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseClicked
        this.setVisible(false);
        Crea_Entrega v = new Crea_Entrega();
        v.setVisible(true);
    }//GEN-LAST:event_ClaseMouseClicked

    private void ClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseExited
        Clase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_ClaseMouseExited

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
            java.util.logging.Logger.getLogger(Diabetes_Estud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diabetes_Estud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diabetes_Estud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diabetes_Estud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diabetes_Estud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Clase;
    private javax.swing.JButton Imagen;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Materias;
    private javax.swing.JButton Minimizar;
    private javax.swing.JLabel Perfil;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel Salud;
    private javax.swing.JLabel Trabajos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
