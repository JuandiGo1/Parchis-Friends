/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parchisandfriends;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import static parchisandfriends.Inicio.casillas;

/**
 *
 * @author ASUS TUF GAMING F15
 */
public class Tablero extends javax.swing.JFrame {

    static Clip clip;
    int numeroficha = 1;
    static ArrayList<Integer> valoresDados = new ArrayList<>();
    static String ruta = "src\\recursos\\";
    static ArrayList<Icon> dados = new ArrayList<>();
    static ArrayList<Icon> dadosp = new ArrayList<>(); //presionados
    static ArrayList<Jugador> Jugadores = new ArrayList<>();
    Icon uno = new javax.swing.ImageIcon(getClass().getResource("/images/dado1.png"));
    Icon dos = new javax.swing.ImageIcon(getClass().getResource("/images/dado2.png"));
    Icon tres = new javax.swing.ImageIcon(getClass().getResource("/images/dado3.png"));
    Icon cuatro = new javax.swing.ImageIcon(getClass().getResource("/images/dado4.png"));
    Icon cinco = new javax.swing.ImageIcon(getClass().getResource("/images/dado5.png"));
    Icon seis = new javax.swing.ImageIcon(getClass().getResource("/images/dado6.png"));

    Icon unop = new javax.swing.ImageIcon(getClass().getResource("/images/dado1p.png"));
    Icon dosp = new javax.swing.ImageIcon(getClass().getResource("/images/dado2p.png"));
    Icon tresp = new javax.swing.ImageIcon(getClass().getResource("/images/dado3p.png"));
    Icon cuatrop = new javax.swing.ImageIcon(getClass().getResource("/images/dado4p.png"));
    Icon cincop = new javax.swing.ImageIcon(getClass().getResource("/images/dado5p.png"));
    Icon seisp = new javax.swing.ImageIcon(getClass().getResource("/images/dado6p.png"));
    static int numero1, numero2, turno;

    public Tablero(int jugadores) {
        initComponents();
        dados.add(uno);
        dados.add(dos);
        dados.add(tres);
        dados.add(cuatro);
        dados.add(cinco);
        dados.add(seis);
        for (int i = 0; i < 8; i++) {
            valoresDados.add(0);
        }
        dadosp.add(unop);
        dadosp.add(dosp);
        dadosp.add(tresp);
        dadosp.add(cuatrop);
        dadosp.add(cincop);
        dadosp.add(seisp);
        for (int i = 1; i <= jugadores; i++) {
            Jugadores.add(new Jugador("Jugador " + i, i));
            System.out.println(i);

        }

        switch (jugadores) {
            case 2 -> {
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                m1.setVisible(false);
                m2.setVisible(false);
                m3.setVisible(false);
                m4.setVisible(false);
                P3.setVisible(false);
                P4.setVisible(false);
                Jugadores.get(0).casillaSalida = casillas.BuscarPorNumero(1);
                System.out.println(Jugadores.get(0).casillaSalida.numero);
                Jugadores.get(1).casillaSalida = casillas.BuscarPorNumero(52);
                System.out.println(Jugadores.get(1).casillaSalida.numero);
                organizar(1);
                organizar(2);
            }
            case 3 -> {
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                P4.setVisible(false);
                Jugadores.get(0).casillaSalida = casillas.BuscarPorNumero(1);
                Jugadores.get(1).casillaSalida = casillas.BuscarPorNumero(52);
                Jugadores.get(2).casillaSalida = casillas.BuscarPorNumero(35);
                organizar(1);
                organizar(2);
                organizar(3);
            }
            case 4 -> {
                Jugadores.get(0).casillaSalida = casillas.BuscarPorNumero(1);
                Jugadores.get(1).casillaSalida = casillas.BuscarPorNumero(52);
                Jugadores.get(2).casillaSalida = casillas.BuscarPorNumero(35);
                Jugadores.get(3).casillaSalida = casillas.BuscarPorNumero(18);
                organizar(1);
                organizar(2);
                organizar(3);
                organizar(4);
            }

        }

        turno = 1;
        actPaneles(turno);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pfondo = new javax.swing.JPanel();
        tab = new FondoTab();
        r1 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        r2 = new javax.swing.JButton();
        r4 = new javax.swing.JButton();
        r3 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        m4 = new javax.swing.JButton();
        v4 = new javax.swing.JButton();
        v3 = new javax.swing.JButton();
        v1 = new javax.swing.JButton();
        v2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        m2 = new javax.swing.JButton();
        P1 = new javax.swing.JPanel();
        dado1 = new javax.swing.JToggleButton();
        dado2 = new javax.swing.JToggleButton();
        foto1 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        LR = new javax.swing.JButton();
        fin1 = new javax.swing.JButton();
        P2 = new javax.swing.JPanel();
        dado3 = new javax.swing.JToggleButton();
        dado4 = new javax.swing.JToggleButton();
        foto2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        LA = new javax.swing.JButton();
        fin2 = new javax.swing.JButton();
        P3 = new javax.swing.JPanel();
        foto3 = new javax.swing.JLabel();
        dado5 = new javax.swing.JToggleButton();
        dado6 = new javax.swing.JToggleButton();
        name3 = new javax.swing.JLabel();
        LM = new javax.swing.JButton();
        fin3 = new javax.swing.JButton();
        P4 = new javax.swing.JPanel();
        foto4 = new javax.swing.JLabel();
        dado7 = new javax.swing.JToggleButton();
        dado8 = new javax.swing.JToggleButton();
        name5 = new javax.swing.JLabel();
        LV = new javax.swing.JButton();
        fin4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pfondo.setBackground(new java.awt.Color(127, 49, 49));

        r1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rojo1.png"))); // NOI18N
        r1.setBorderPainted(false);
        r1.setContentAreaFilled(false);
        r1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Azul1.png"))); // NOI18N
        a1.setBorderPainted(false);
        a1.setContentAreaFilled(false);
        a1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        r2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rojo1.png"))); // NOI18N
        r2.setBorderPainted(false);
        r2.setContentAreaFilled(false);
        r2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rojo1.png"))); // NOI18N
        r4.setBorderPainted(false);
        r4.setContentAreaFilled(false);
        r4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        r3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rojo1.png"))); // NOI18N
        r3.setBorderPainted(false);
        r3.setContentAreaFilled(false);
        r3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Azul1.png"))); // NOI18N
        a2.setBorderPainted(false);
        a2.setContentAreaFilled(false);
        a2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Azul1.png"))); // NOI18N
        a4.setBorderPainted(false);
        a4.setContentAreaFilled(false);
        a4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Azul1.png"))); // NOI18N
        a3.setBorderPainted(false);
        a3.setContentAreaFilled(false);
        a3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        m4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amarillo1.png"))); // NOI18N
        m4.setBorderPainted(false);
        m4.setContentAreaFilled(false);
        m4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });

        v4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Verde1.png"))); // NOI18N
        v4.setBorderPainted(false);
        v4.setContentAreaFilled(false);
        v4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v4ActionPerformed(evt);
            }
        });

        v3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Verde1.png"))); // NOI18N
        v3.setBorderPainted(false);
        v3.setContentAreaFilled(false);
        v3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v3ActionPerformed(evt);
            }
        });

        v1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Verde1.png"))); // NOI18N
        v1.setBorderPainted(false);
        v1.setContentAreaFilled(false);
        v1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v1ActionPerformed(evt);
            }
        });

        v2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Verde1.png"))); // NOI18N
        v2.setBorderPainted(false);
        v2.setContentAreaFilled(false);
        v2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v2ActionPerformed(evt);
            }
        });

        m3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amarillo1.png"))); // NOI18N
        m3.setBorderPainted(false);
        m3.setContentAreaFilled(false);
        m3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });

        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amarillo1.png"))); // NOI18N
        m1.setBorderPainted(false);
        m1.setContentAreaFilled(false);
        m1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Amarillo1.png"))); // NOI18N
        m2.setBorderPainted(false);
        m2.setContentAreaFilled(false);
        m2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a1)
                            .addComponent(a3)
                            .addComponent(r4)
                            .addComponent(r1))
                        .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a4)
                                    .addComponent(a2)))
                            .addGroup(tabLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r2)
                                    .addComponent(r3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(v1)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLayout.createSequentialGroup()
                        .addGap(192, 622, Short.MAX_VALUE)
                        .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLayout.createSequentialGroup()
                                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(m1)
                                    .addComponent(m3))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLayout.createSequentialGroup()
                                .addComponent(v3)
                                .addGap(26, 26, 26)))))
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(v2)
                    .addComponent(m4)
                    .addComponent(m2)
                    .addComponent(v4))
                .addGap(73, 73, 73))
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabLayout.createSequentialGroup()
                        .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a1)
                            .addComponent(a2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a3)
                            .addComponent(a4)))
                    .addGroup(tabLayout.createSequentialGroup()
                        .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(m2)
                            .addComponent(m1))
                        .addGap(18, 18, 18)
                        .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(m4)
                            .addComponent(m3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(v2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(v1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(r4)
                        .addComponent(r3))
                    .addComponent(v4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(v3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(69, 69, 69))
        );

        P1.setBackground(new java.awt.Color(255, 51, 51));

        dado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dado1.png"))); // NOI18N
        dado1.setContentAreaFilled(false);
        dado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado1ActionPerformed(evt);
            }
        });

        dado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dado1.png"))); // NOI18N
        dado2.setContentAreaFilled(false);
        dado2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado2ActionPerformed(evt);
            }
        });

        foto1.setBackground(new java.awt.Color(204, 204, 204));
        foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player1.png"))); // NOI18N

        name4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name4.setForeground(new java.awt.Color(255, 255, 255));
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4.setText("Jugador 1");

        LR.setBackground(new java.awt.Color(204, 0, 0));
        LR.setForeground(new java.awt.Color(255, 255, 255));
        LR.setText("LANZAR");
        LR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LRActionPerformed(evt);
            }
        });

        fin1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fin1.setText("FINALIZAR TURNO");
        fin1.setEnabled(false);
        fin1.setFocusCycleRoot(true);
        fin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(fin1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(LR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addComponent(fin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name4)))
                .addGap(18, 18, 18)
                .addComponent(LR))
        );

        P2.setBackground(new java.awt.Color(0, 102, 255));

        dado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dado2.png"))); // NOI18N
        dado3.setContentAreaFilled(false);
        dado3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado3ActionPerformed(evt);
            }
        });

        dado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dado2.png"))); // NOI18N
        dado4.setContentAreaFilled(false);
        dado4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado4ActionPerformed(evt);
            }
        });

        foto2.setBackground(new java.awt.Color(204, 204, 204));
        foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player2.png"))); // NOI18N

        name2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("Jugador 2");

        LA.setBackground(new java.awt.Color(0, 51, 204));
        LA.setForeground(new java.awt.Color(255, 255, 255));
        LA.setText("LANZAR");
        LA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAActionPerformed(evt);
            }
        });

        fin2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fin2.setText("FINALIZAR TURNO");
        fin2.setEnabled(false);
        fin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fin2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P2Layout.createSequentialGroup()
                        .addComponent(foto2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(fin2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P2Layout.createSequentialGroup()
                        .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addComponent(LA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P2Layout.createSequentialGroup()
                        .addComponent(fin2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name2)))
                .addGap(18, 18, 18)
                .addComponent(LA))
        );

        P3.setBackground(new java.awt.Color(255, 204, 0));

        foto3.setBackground(new java.awt.Color(204, 204, 204));
        foto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player3.png"))); // NOI18N

        dado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dado3.png"))); // NOI18N
        dado5.setContentAreaFilled(false);
        dado5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado5ActionPerformed(evt);
            }
        });

        dado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dado3.png"))); // NOI18N
        dado6.setContentAreaFilled(false);
        dado6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado6ActionPerformed(evt);
            }
        });

        name3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("Jugador 3");

        LM.setBackground(new java.awt.Color(255, 153, 0));
        LM.setForeground(new java.awt.Color(255, 255, 255));
        LM.setText("LANZAR");
        LM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LMActionPerformed(evt);
            }
        });

        fin3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fin3.setText("FINALIZAR TURNO");
        fin3.setEnabled(false);
        fin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fin3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P3Layout.createSequentialGroup()
                        .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(foto3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P3Layout.createSequentialGroup()
                        .addComponent(dado5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dado6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(fin3, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(LM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P3Layout.createSequentialGroup()
                        .addComponent(fin3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dado5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(LM))
        );

        P4.setBackground(new java.awt.Color(0, 204, 51));

        foto4.setBackground(new java.awt.Color(204, 204, 204));
        foto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player4.png"))); // NOI18N

        dado7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dado4.png"))); // NOI18N
        dado7.setContentAreaFilled(false);
        dado7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado7ActionPerformed(evt);
            }
        });

        dado8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dado4.png"))); // NOI18N
        dado8.setContentAreaFilled(false);
        dado8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado8ActionPerformed(evt);
            }
        });

        name5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name5.setForeground(new java.awt.Color(255, 255, 255));
        name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name5.setText("Jugador 4");

        LV.setBackground(new java.awt.Color(0, 153, 0));
        LV.setForeground(new java.awt.Color(255, 255, 255));
        LV.setText("LANZAR");
        LV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LVActionPerformed(evt);
            }
        });

        fin4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fin4.setText("FINALIZAR TURNO");
        fin4.setEnabled(false);
        fin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fin4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foto4, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addGroup(P4Layout.createSequentialGroup()
                        .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P4Layout.createSequentialGroup()
                        .addComponent(dado7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dado8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(fin4, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(LV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P4Layout.createSequentialGroup()
                .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P4Layout.createSequentialGroup()
                        .addComponent(fin4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dado7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(LV))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PARTIDA");

        info.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        info.setForeground(new java.awt.Color(255, 255, 255));
        info.setText("QUE EMPIECE EL JUEGO!");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jButton1.setText("VOLVER");

        jButton2.setText("?");

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.setToolTipText("CERRAR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(110, 110, 110)
                .addComponent(jButton3)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout PfondoLayout = new javax.swing.GroupLayout(Pfondo);
        Pfondo.setLayout(PfondoLayout);
        PfondoLayout.setHorizontalGroup(
            PfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PfondoLayout.createSequentialGroup()
                .addGroup(PfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PfondoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PfondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PfondoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PfondoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PfondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PfondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PfondoLayout.setVerticalGroup(
            PfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PfondoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PfondoLayout.createSequentialGroup()
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PfondoLayout.createSequentialGroup()
                        .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        getContentPane().add(Pfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //ubicar fichas en sus posiciones iniciales
    public final void organizar(int color) {
        switch (color) {
            case 1 -> {

                r1.setBounds(80, 556, 40, 40);
                r2.setBounds(180, 556, 40, 40);
                r3.setBounds(180, 656, 40, 40);
                r4.setBounds(80, 656, 40, 40);
                for (int i = 0; i < 4; i++) {
                    Jugadores.get(0).fichas.add(new ficha(Jugadores.get(0), 1, numeroficha, 0, 0));
                    numeroficha++;
                }
                Jugadores.get(0).fichas.get(0).setBoton(r1);
                Jugadores.get(0).fichas.get(1).setBoton(r2);
                Jugadores.get(0).fichas.get(2).setBoton(r3);
                Jugadores.get(0).fichas.get(3).setBoton(r4);
                System.out.println("organizo");
            }
            case 2 -> {

                a1.setBounds(80, 74, 40, 40);
                a2.setBounds(180, 74, 40, 40);
                a3.setBounds(180, 174, 40, 40);
                a4.setBounds(80, 174, 40, 40);
                for (int i = 0; i < 4; i++) {
                    Jugadores.get(1).fichas.add(new ficha(Jugadores.get(1), 1, numeroficha, 0, 0));
                    numeroficha++;
                }
                Jugadores.get(1).fichas.get(0).setBoton(a1);
                Jugadores.get(1).fichas.get(1).setBoton(a2);
                Jugadores.get(1).fichas.get(2).setBoton(a3);
                Jugadores.get(1).fichas.get(3).setBoton(a4);
            }
            case 3 -> {
                m1.setBounds(600, 74, 40, 40);
                m2.setBounds(700, 74, 40, 40);
                m3.setBounds(700, 174, 40, 40);
                m4.setBounds(600, 174, 40, 40);
                for (int i = 0; i < 4; i++) {
                    Jugadores.get(2).fichas.add(new ficha(Jugadores.get(2), 1, numeroficha, 0, 0));
                    numeroficha++;
                }
                Jugadores.get(2).fichas.get(0).setBoton(m1);
                Jugadores.get(2).fichas.get(1).setBoton(m2);
                Jugadores.get(2).fichas.get(2).setBoton(m3);
                Jugadores.get(2).fichas.get(3).setBoton(m4);
            }
            case 4 -> {
                v1.setBounds(600, 556, 40, 40);
                v2.setBounds(700, 556, 40, 40);
                v3.setBounds(700, 656, 40, 40);
                v4.setBounds(600, 656, 40, 40);
                for (int i = 0; i < 4; i++) {
                    Jugadores.get(3).fichas.add(new ficha(Jugadores.get(3), 1, numeroficha, 0, 0));
                    numeroficha++;
                }
                Jugadores.get(3).fichas.get(0).setBoton(v1);
                Jugadores.get(3).fichas.get(1).setBoton(v2);
                Jugadores.get(3).fichas.get(2).setBoton(v3);
                Jugadores.get(3).fichas.get(3).setBoton(v4);
            }

        }
        //1.rojo - 2.azul - 3.amarillo - 4.Verde
    }

    public void sonido(String archivo) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/recursos/dices.mp3")));
            clip.start();

        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("no se pudo");
        }

    }

    //Activar y desactivar paneles de los jugadores según el turno. MODO offline
    public void actPaneles(int turno) {
        switch (turno) {
            case 1:
                for (Component component : P1.getComponents()) {
                    component.setEnabled(true);
                }
                if (!Jugadores.get(0).pasar) {
                    fin1.setEnabled(false);
                }
                for (Component component : P2.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P3.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P4.getComponents()) {
                    component.setEnabled(false);
                }
                info.setText("Turno de " + Jugadores.get(0).nick);

                break;
            case 2:
                for (Component component : P1.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P2.getComponents()) {
                    component.setEnabled(true);
                }
                if (!Jugadores.get(1).pasar) {
                    fin2.setEnabled(false);
                }
                for (Component component : P3.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P4.getComponents()) {
                    component.setEnabled(false);
                }
                info.setText("Turno de " + Jugadores.get(1).nick);
                break;
            case 3:
                for (Component component : P1.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P2.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P3.getComponents()) {
                    component.setEnabled(true);
                }
                if (!Jugadores.get(2).pasar) {
                    fin3.setEnabled(false);
                }
                for (Component component : P4.getComponents()) {
                    component.setEnabled(false);
                }
                info.setText("Turno de " + Jugadores.get(2).nick);
                break;
            case 4:
                for (Component component : P1.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P2.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P3.getComponents()) {
                    component.setEnabled(false);
                }
                for (Component component : P4.getComponents()) {
                    component.setEnabled(true);
                }
                if (!Jugadores.get(3).pasar) {
                    fin4.setEnabled(false);
                }
                info.setText("Turno de " + Jugadores.get(3).nick);
                break;

        }
    }

    //aumentará o reseteará el turno dependiendo la cantidad de jugadores
    public void aumentarTurno() {
        switch (Jugadores.size()) {
            case 2:
                if (turno > 1) {
                    turno = 1;
                    break;
                }
                turno++;
                break;
            case 3:
                if (turno > 2) {
                    turno = 1;
                    break;
                }
                turno++;
                break;
            case 4:
                if (turno > 3) {
                    turno = 1;
                    break;
                }
                turno++;
                break;
        }
    }
    private void dado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado3ActionPerformed
        System.out.println(valoresDados.get(2));
    }//GEN-LAST:event_dado3ActionPerformed

    private void dado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado4ActionPerformed
        System.out.println(valoresDados.get(3));
    }//GEN-LAST:event_dado4ActionPerformed

    private void dado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado1ActionPerformed
        System.out.println(valoresDados.get(0));
    }//GEN-LAST:event_dado1ActionPerformed

    private void dado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado2ActionPerformed
        System.out.println(valoresDados.get(1));
    }//GEN-LAST:event_dado2ActionPerformed

    private void dado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado5ActionPerformed
        System.out.println(valoresDados.get(4));
    }//GEN-LAST:event_dado5ActionPerformed

    private void dado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado6ActionPerformed
        System.out.println(valoresDados.get(5));
    }//GEN-LAST:event_dado6ActionPerformed

    private void dado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado7ActionPerformed
        System.out.println(valoresDados.get(6));
    }//GEN-LAST:event_dado7ActionPerformed

    private void dado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado8ActionPerformed
        System.out.println(valoresDados.get(7));
    }//GEN-LAST:event_dado8ActionPerformed


    private void LAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAActionPerformed
        Dados dp2 = new Dados(dado3, dado4, 2, 3, fin2, LA, Jugadores.get(1));
        sonido("dices");
        dp2.start();

    }//GEN-LAST:event_LAActionPerformed

    private void LRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LRActionPerformed
        Dados dp1 = new Dados(dado1, dado2, 0, 1, fin1, LR, Jugadores.get(0));
        sonido("dices.mp3");
        dp1.start();

    }//GEN-LAST:event_LRActionPerformed

    private void LMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LMActionPerformed
        Dados dp3 = new Dados(dado5, dado6, 4, 5, fin3, LM, Jugadores.get(2));
        sonido("dices");
        dp3.start();

    }//GEN-LAST:event_LMActionPerformed

    private void LVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LVActionPerformed
        Dados dp4 = new Dados(dado7, dado8, 6, 7, fin4, LV, Jugadores.get(3));
        sonido("dices");
        dp4.start();
    }//GEN-LAST:event_LVActionPerformed

    private void v3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v3ActionPerformed

    private void v4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v4ActionPerformed

    private void v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v2ActionPerformed

    private void v1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2ActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m1ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m3ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m4ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        System.out.println("ficha azul");
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        System.out.println("ficha roja");
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void fin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fin2ActionPerformed

        aumentarTurno();
        actPaneles(turno);
    }//GEN-LAST:event_fin2ActionPerformed

    private void fin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fin1ActionPerformed
        aumentarTurno();
        actPaneles(turno);
    }//GEN-LAST:event_fin1ActionPerformed

    private void fin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fin3ActionPerformed
        aumentarTurno();
        actPaneles(turno);
    }//GEN-LAST:event_fin3ActionPerformed

    private void fin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fin4ActionPerformed
        aumentarTurno();
        actPaneles(turno);
    }//GEN-LAST:event_fin4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Tablero().setVisible(true);
            }
        });
    }

    class FondoTab extends JPanel {

        Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("parques.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LA;
    private javax.swing.JButton LM;
    private javax.swing.JButton LR;
    private javax.swing.JButton LV;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JPanel P4;
    private javax.swing.JPanel Pfondo;
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JToggleButton dado1;
    private javax.swing.JToggleButton dado2;
    private javax.swing.JToggleButton dado3;
    private javax.swing.JToggleButton dado4;
    private javax.swing.JToggleButton dado5;
    private javax.swing.JToggleButton dado6;
    private javax.swing.JToggleButton dado7;
    private javax.swing.JToggleButton dado8;
    private javax.swing.JButton fin1;
    private javax.swing.JButton fin2;
    private javax.swing.JButton fin3;
    private javax.swing.JButton fin4;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton m1;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JButton r1;
    private javax.swing.JButton r2;
    private javax.swing.JButton r3;
    private javax.swing.JButton r4;
    public javax.swing.JPanel tab;
    private javax.swing.JButton v1;
    private javax.swing.JButton v2;
    private javax.swing.JButton v3;
    private javax.swing.JButton v4;
    // End of variables declaration//GEN-END:variables
}
