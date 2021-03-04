/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mustafa
 */
public class puanTablosu extends javax.swing.JFrame {
    
    private int aKasadakiAltin;
    private int aHarcananAltin;
    private int aToplamAdim;
    private int aToplananAltin;

    private int bKasadakiAltin;
    private int bHarcananAltin;
    private int bToplamAdim;
    private int bToplananAltin;

    private int cKasadakiAltin;
    private int cHarcananAltin;
    private int cToplamAdim;
    private int cToplananAltin;

    private int dKasadakiAltin;
    private int dHarcananAltin;
    private int dToplamAdim;
    private int dToplananAltin;

    
    public puanTablosu(OyuncuA x,OyuncuB y,OyuncuC z,OyuncuD t){
        this.aKasadakiAltin= x.getKasadakiAltin();
        this.aHarcananAltin= x.getHarcananAltin();
        this.aToplamAdim= x.getAdimSayisi();
        this.aToplananAltin = x.getToplananAltin();

        this.bKasadakiAltin= y.getKasadakiAltin();
        this.bHarcananAltin= y.getHarcananAltin();
        this.bToplamAdim= y.getAdimSayisi();
        this.bToplananAltin = y.getToplananAltin();

        this.cKasadakiAltin= z.getKasadakiAltin();
        this.cHarcananAltin= z.getHarcananAltin();
        this.cToplamAdim= z.getAdimSayisi();
        this.cToplananAltin = z.getToplananAltin();

        this.dKasadakiAltin= t.getKasadakiAltin();
        this.dHarcananAltin= t.getHarcananAltin();
        this.dToplamAdim= t.getAdimSayisi();
        this.dToplananAltin = t.getToplananAltin();
        
        initComponents();


    }
    
    
    public puanTablosu() {
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

        kazananOyuncununAdiLabel = new javax.swing.JLabel();
        cPanel = new javax.swing.JPanel();
        cToplamAdimSayisi = new javax.swing.JLabel();
        cHarcananAltinMiktari = new javax.swing.JLabel();
        cKasadakiAltinMiktari = new javax.swing.JLabel();
        cToplananAltinMiktari = new javax.swing.JLabel();
        cIcon3 = new javax.swing.JLabel();
        c2Label = new javax.swing.JLabel();
        c1Label = new javax.swing.JLabel();
        c3Label = new javax.swing.JLabel();
        c4Label = new javax.swing.JLabel();
        aPanel1 = new javax.swing.JPanel();
        aToplamAdimSayisi = new javax.swing.JLabel();
        aHarcananAltinMiktari = new javax.swing.JLabel();
        aKasadakiAltinMiktari = new javax.swing.JLabel();
        aToplananAltinMiktari = new javax.swing.JLabel();
        aIcon1 = new javax.swing.JLabel();
        a1Label = new javax.swing.JLabel();
        a3Label = new javax.swing.JLabel();
        a2Label = new javax.swing.JLabel();
        a4Label = new javax.swing.JLabel();
        bPanel1 = new javax.swing.JPanel();
        bToplamAdimSayisi1 = new javax.swing.JLabel();
        bHarcananAltinMiktari1 = new javax.swing.JLabel();
        bKasadakiAltinMiktari1 = new javax.swing.JLabel();
        bToplananAltinMiktari1 = new javax.swing.JLabel();
        bIcon = new javax.swing.JLabel();
        b2Label = new javax.swing.JLabel();
        b1Label = new javax.swing.JLabel();
        b3Label = new javax.swing.JLabel();
        b4Label = new javax.swing.JLabel();
        dPanel1 = new javax.swing.JPanel();
        dToplamAdimSayisi1 = new javax.swing.JLabel();
        dHarcananAltinMiktari1 = new javax.swing.JLabel();
        dKasadakiAltinMiktari1 = new javax.swing.JLabel();
        dToplananAltinMiktari1 = new javax.swing.JLabel();
        dIcon2 = new javax.swing.JLabel();
        d2Label = new javax.swing.JLabel();
        d1Label = new javax.swing.JLabel();
        d4Label = new javax.swing.JLabel();
        d3Label = new javax.swing.JLabel();
        renkPanel = new javax.swing.JPanel();
        sonucGorButon = new javax.swing.JButton();
        kazananLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(920, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        kazananOyuncununAdiLabel.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        kazananOyuncununAdiLabel.setForeground(new java.awt.Color(0, 102, 255));
        kazananOyuncununAdiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kazananOyuncununAdiLabel.setText("PLAYER ");
        getContentPane().add(kazananOyuncununAdiLabel);
        kazananOyuncununAdiLabel.setBounds(0, 68, 960, 70);

        cPanel.setBackground(new java.awt.Color(0, 255, 255));

        cToplamAdimSayisi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cToplamAdimSayisi.setText("Toplam Adım Sayısı :");

        cHarcananAltinMiktari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cHarcananAltinMiktari.setText("Harcanan Altın Miktarı :");

        cKasadakiAltinMiktari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cKasadakiAltinMiktari.setText("Kasadaki Altın Miktarı :");

        cToplananAltinMiktari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cToplananAltinMiktari.setText("Toplanan Altın Miktarı :");

        cIcon3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cIcon3.setText("C");

        c2Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        c1Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        c3Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        c4Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout cPanelLayout = new javax.swing.GroupLayout(cPanel);
        cPanel.setLayout(cPanelLayout);
        cPanelLayout.setHorizontalGroup(
            cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cHarcananAltinMiktari)
                    .addComponent(cToplananAltinMiktari)
                    .addComponent(cToplamAdimSayisi)
                    .addComponent(cKasadakiAltinMiktari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        cPanelLayout.setVerticalGroup(
            cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addComponent(cIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(cPanelLayout.createSequentialGroup()
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cPanelLayout.createSequentialGroup()
                                .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cKasadakiAltinMiktari)
                                    .addComponent(c1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cHarcananAltinMiktari, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(c2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(cToplamAdimSayisi))
                            .addGroup(cPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(c3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(cPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cToplananAltinMiktari)
                            .addComponent(c4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(cPanel);
        cPanel.setBounds(460, 350, 424, 160);

        aPanel1.setBackground(new java.awt.Color(0, 255, 255));

        aToplamAdimSayisi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aToplamAdimSayisi.setText("Toplam Adım Sayısı :");

        aHarcananAltinMiktari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aHarcananAltinMiktari.setText("Harcanan Altın Miktarı :");

        aKasadakiAltinMiktari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aKasadakiAltinMiktari.setText("Kasadaki Altın Miktarı :");

        aToplananAltinMiktari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aToplananAltinMiktari.setText("Toplanan Altın Miktarı :");

        aIcon1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        aIcon1.setText("A");

        a1Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        a3Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        a2Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        a4Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout aPanel1Layout = new javax.swing.GroupLayout(aPanel1);
        aPanel1.setLayout(aPanel1Layout);
        aPanel1Layout.setHorizontalGroup(
            aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(aIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aToplamAdimSayisi)
                    .addGroup(aPanel1Layout.createSequentialGroup()
                        .addGroup(aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aKasadakiAltinMiktari)
                            .addComponent(aHarcananAltinMiktari)
                            .addComponent(aToplananAltinMiktari))
                        .addGap(38, 38, 38)
                        .addGroup(aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        aPanel1Layout.setVerticalGroup(
            aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aPanel1Layout.createSequentialGroup()
                        .addComponent(aIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(aPanel1Layout.createSequentialGroup()
                        .addGroup(aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aKasadakiAltinMiktari)
                            .addComponent(a1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aHarcananAltinMiktari, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(a2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aToplamAdimSayisi)
                            .addComponent(a3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(aPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aToplananAltinMiktari)
                            .addComponent(a4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(aPanel1);
        aPanel1.setBounds(20, 160, 424, 160);

        bPanel1.setBackground(new java.awt.Color(0, 255, 255));

        bToplamAdimSayisi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bToplamAdimSayisi1.setText("Toplam Adım Sayısı :");

        bHarcananAltinMiktari1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bHarcananAltinMiktari1.setText("Harcanan Altın Miktarı :");

        bKasadakiAltinMiktari1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bKasadakiAltinMiktari1.setText("Kasadaki Altın Miktarı :");

        bToplananAltinMiktari1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bToplananAltinMiktari1.setText("Toplanan Altın Miktarı :");

        bIcon.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        bIcon.setText("B");

        b2Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        b1Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        b3Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        b4Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout bPanel1Layout = new javax.swing.GroupLayout(bPanel1);
        bPanel1.setLayout(bPanel1Layout);
        bPanel1Layout.setHorizontalGroup(
            bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bIcon)
                .addGroup(bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bToplananAltinMiktari1)
                            .addComponent(bToplamAdimSayisi1)
                            .addComponent(bKasadakiAltinMiktari1)))
                    .addGroup(bPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bHarcananAltinMiktari1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        bPanel1Layout.setVerticalGroup(
            bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bPanel1Layout.createSequentialGroup()
                        .addComponent(bIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(bPanel1Layout.createSequentialGroup()
                        .addGroup(bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bKasadakiAltinMiktari1)
                            .addComponent(b1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(b2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bHarcananAltinMiktari1)
                                .addGap(18, 18, 18)))
                        .addGroup(bPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bPanel1Layout.createSequentialGroup()
                                .addComponent(bToplamAdimSayisi1)
                                .addGap(21, 21, 21)
                                .addComponent(bToplananAltinMiktari1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bPanel1Layout.createSequentialGroup()
                                .addComponent(b3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        getContentPane().add(bPanel1);
        bPanel1.setBounds(460, 160, 424, 160);

        dPanel1.setBackground(new java.awt.Color(0, 255, 255));

        dToplamAdimSayisi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dToplamAdimSayisi1.setText("Toplam Adım Sayısı :");

        dHarcananAltinMiktari1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dHarcananAltinMiktari1.setText("Harcanan Altın Miktarı :");

        dKasadakiAltinMiktari1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dKasadakiAltinMiktari1.setText("Kasadaki Altın Miktarı :");

        dToplananAltinMiktari1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dToplananAltinMiktari1.setText("Toplanan Altın Miktarı :");

        dIcon2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dIcon2.setText("D");

        d2Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        d1Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        d4Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        d3Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout dPanel1Layout = new javax.swing.GroupLayout(dPanel1);
        dPanel1.setLayout(dPanel1Layout);
        dPanel1Layout.setHorizontalGroup(
            dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dHarcananAltinMiktari1)
                    .addComponent(dToplananAltinMiktari1)
                    .addComponent(dToplamAdimSayisi1)
                    .addComponent(dKasadakiAltinMiktari1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        dPanel1Layout.setVerticalGroup(
            dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dPanel1Layout.createSequentialGroup()
                        .addComponent(dIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(dPanel1Layout.createSequentialGroup()
                        .addGroup(dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dKasadakiAltinMiktari1)
                            .addComponent(d1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dHarcananAltinMiktari1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dToplamAdimSayisi1)
                            .addComponent(d3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(dPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dToplananAltinMiktari1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d4Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(dPanel1);
        dPanel1.setBounds(20, 350, 424, 160);

        renkPanel.setBackground(new java.awt.Color(255, 153, 153));

        sonucGorButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sonucGorButon.setText("Sonuçları Gör");
        sonucGorButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sonucGorButonMouseClicked(evt);
            }
        });

        kazananLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        kazananLabel.setForeground(new java.awt.Color(0, 255, 102));
        kazananLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kazananLabel.setText("KAZANAN OYUNCU");

        javax.swing.GroupLayout renkPanelLayout = new javax.swing.GroupLayout(renkPanel);
        renkPanel.setLayout(renkPanelLayout);
        renkPanelLayout.setHorizontalGroup(
            renkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(renkPanelLayout.createSequentialGroup()
                .addGroup(renkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(renkPanelLayout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(sonucGorButon))
                    .addGroup(renkPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kazananLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        renkPanelLayout.setVerticalGroup(
            renkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, renkPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(kazananLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
                .addComponent(sonucGorButon)
                .addGap(37, 37, 37))
        );

        getContentPane().add(renkPanel);
        renkPanel.setBounds(-10, -10, 990, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sonucGorButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sonucGorButonMouseClicked
       a1Label.setText(String.valueOf(aKasadakiAltin));
       b1Label.setText(String.valueOf(bKasadakiAltin));
       c1Label.setText(String.valueOf(cKasadakiAltin));
       d1Label.setText(String.valueOf(dKasadakiAltin));
       
       a2Label.setText(String.valueOf(aHarcananAltin));
       b2Label.setText(String.valueOf(bHarcananAltin));
       c2Label.setText(String.valueOf(cHarcananAltin));
       d2Label.setText(String.valueOf(dHarcananAltin));
       
       a3Label.setText(String.valueOf(aToplamAdim));
       b3Label.setText(String.valueOf(bToplamAdim));
       c3Label.setText(String.valueOf(cToplamAdim));
       d3Label.setText(String.valueOf(dToplamAdim));
       
       a4Label.setText(String.valueOf(aToplananAltin));
       b4Label.setText(String.valueOf(bToplananAltin));
       c4Label.setText(String.valueOf(cToplananAltin));
       d4Label.setText(String.valueOf(dToplananAltin));
       

       
       int[] kasa = {aKasadakiAltin,bKasadakiAltin,cKasadakiAltin,dKasadakiAltin};
       int enb = kasa[0];
       int indis=0;
       for(int i=1 ; i<4 ; i++){
           if(kasa[i]>enb){
               enb = kasa[i];
               indis = i;
           }    
       }
       if(indis==0){kazananOyuncununAdiLabel.setText("Oyuncu A");
           System.out.println("Oyuncu A kazandı!");
       } 
       if(indis==1){kazananOyuncununAdiLabel.setText("Oyuncu B");
            System.out.println("Oyuncu B kazandı!");
       } 
       if(indis==2){kazananOyuncununAdiLabel.setText("Oyuncu C");
            System.out.println("Oyuncu C kazandı!");
       } 
       if(indis==3){kazananOyuncununAdiLabel.setText("Oyuncu D");
            System.out.println("Oyuncu D kazandı!");
       } 
       
        
    }//GEN-LAST:event_sonucGorButonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       /*aKasadakiAltinText1.setText(String.valueOf(aKasadakiAltin));
       bKasadakiAltinText1.setText(String.valueOf(bKasadakiAltin));
       cKasadakiAltinText.setText(String.valueOf(cKasadakiAltin));
       dKasadakiAltinText1.setText(String.valueOf(dKasadakiAltin));*/
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
            java.util.logging.Logger.getLogger(puanTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puanTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puanTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puanTablosu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new puanTablosu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1Label;
    private javax.swing.JLabel a2Label;
    private javax.swing.JLabel a3Label;
    private javax.swing.JLabel a4Label;
    private javax.swing.JLabel aHarcananAltinMiktari;
    private javax.swing.JLabel aIcon1;
    private javax.swing.JLabel aKasadakiAltinMiktari;
    private javax.swing.JPanel aPanel1;
    private javax.swing.JLabel aToplamAdimSayisi;
    private javax.swing.JLabel aToplananAltinMiktari;
    private javax.swing.JLabel b1Label;
    private javax.swing.JLabel b2Label;
    private javax.swing.JLabel b3Label;
    private javax.swing.JLabel b4Label;
    private javax.swing.JLabel bHarcananAltinMiktari1;
    private javax.swing.JLabel bIcon;
    private javax.swing.JLabel bKasadakiAltinMiktari1;
    private javax.swing.JPanel bPanel1;
    private javax.swing.JLabel bToplamAdimSayisi1;
    private javax.swing.JLabel bToplananAltinMiktari1;
    private javax.swing.JLabel c1Label;
    private javax.swing.JLabel c2Label;
    private javax.swing.JLabel c3Label;
    private javax.swing.JLabel c4Label;
    private javax.swing.JLabel cHarcananAltinMiktari;
    private javax.swing.JLabel cIcon3;
    private javax.swing.JLabel cKasadakiAltinMiktari;
    private javax.swing.JPanel cPanel;
    private javax.swing.JLabel cToplamAdimSayisi;
    private javax.swing.JLabel cToplananAltinMiktari;
    private javax.swing.JLabel d1Label;
    private javax.swing.JLabel d2Label;
    private javax.swing.JLabel d3Label;
    private javax.swing.JLabel d4Label;
    private javax.swing.JLabel dHarcananAltinMiktari1;
    private javax.swing.JLabel dIcon2;
    private javax.swing.JLabel dKasadakiAltinMiktari1;
    private javax.swing.JPanel dPanel1;
    private javax.swing.JLabel dToplamAdimSayisi1;
    private javax.swing.JLabel dToplananAltinMiktari1;
    private javax.swing.JLabel kazananLabel;
    private javax.swing.JLabel kazananOyuncununAdiLabel;
    private javax.swing.JPanel renkPanel;
    private javax.swing.JButton sonucGorButon;
    // End of variables declaration//GEN-END:variables
}