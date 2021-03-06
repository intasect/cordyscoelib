package com.cordys.coe.tools.orgmanager;

import com.cordys.coe.tools.orgmanager.log4j.AppenderMetadata;
import com.cordys.coe.tools.orgmanager.log4j.Log4JAppenderWrapper;
import com.cordys.coe.util.swing.MessageBoxUtil;

import java.util.ArrayList;

/**
 * This dialog is used to create a new appender.
 *
 * @author  pgussow
 */
public class NewAppenderDialog extends javax.swing.JDialog
{
    /**
     * Holds whether or not the OK button was clicked.
     */
    private boolean m_bOK;
    /**
     * Variables declaration - do not modify//GEN-BEGIN:variables.
     */
    private javax.swing.JComboBox<String> m_cbType;
    /**
     * DOCUMENTME.
     */
    private javax.swing.JTextField m_tName;

    /**
     * Creates new form NewAppenderDialog.
     *
     * @param  parent  The parent frame.
     * @param  modal   Whether or not the dialog is modal.
     */
    public NewAppenderDialog(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();

        setTitle("Please enter the details for the new appender");

        try
        {
            Log4JAppenderWrapper law = new Log4JAppenderWrapper();
            ArrayList<AppenderMetadata> al = law.getAppenderMetadata();

            for (AppenderMetadata am : al)
            {
                m_cbType.addItem(am.getName());
            }
        }
        catch (Exception e1)
        {
            MessageBoxUtil.showError("Error getting appender metadata", e1);
        }
    }

    /**
     * This method returns the class name for the new appender.
     *
     * @return  The class name for the new appender.
     */
    public String getAppenderClassName()
    {
        return (String) m_cbType.getSelectedItem();
    }

    /**
     * This method returns the name of the new appender.
     *
     * @return  The name of the new appender.
     */
    public String getAppenderName()
    {
        return m_tName.getText();
    }

    /**
     * This method returns whether or not the OK button was clicked.
     *
     * @return  true when the OK button was clicked.
     */
    public boolean isOK()
    {
        return m_bOK;
    }

    /**
     * DOCUMENTME.
     *
     * @param  evt  DOCUMENTME
     */
    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) //GEN-FIRST:event_bCancelActionPerformed
    {
        m_bOK = false;
        setVisible(false);
    } //GEN-LAST:event_bCancelActionPerformed

    /**
     * DOCUMENTME.
     *
     * @param  evt  DOCUMENTME
     */
    private void bOKActionPerformed(java.awt.event.ActionEvent evt) //GEN-FIRST:event_bOKActionPerformed
    {
        if ((m_tName.getText() == null) || (m_tName.getText().length() == 0))
        {
            MessageBoxUtil.showError("The name must be filled.");
            m_tName.requestFocus();
        }
        else if ((m_cbType.getSelectedItem() == null) ||
                     (((String) m_cbType.getSelectedItem()).length() == 0))
        {
            MessageBoxUtil.showError("The appender type  must be filled.");
            m_cbType.requestFocus();
        }
        else
        {
            m_bOK = true;
            setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    private void initComponents()
    {
        javax.swing.JButton bOK = new javax.swing.JButton();
        javax.swing.JButton bCancel = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        m_cbType = new javax.swing.JComboBox<String>();
        m_tName = new javax.swing.JTextField();

        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bOK.setText("OK");
        bOK.setPreferredSize(new java.awt.Dimension(75, 23));
        bOK.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    bOKActionPerformed(evt);
                }
            });

        bCancel.setText("Cancel");
        bCancel.setPreferredSize(new java.awt.Dimension(75, 23));
        bCancel.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    bCancelActionPerformed(evt);
                }
            });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Appender type:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                  .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                    .createParallelGroup(javax
                                                                                                         .swing
                                                                                                         .GroupLayout
                                                                                                         .Alignment.LEADING)
                                                                                    .addGroup(layout
                                                                                              .createSequentialGroup()
                                                                                              .addContainerGap()
                                                                                              .addGroup(layout
                                                                                                        .createParallelGroup(javax
                                                                                                                             .swing
                                                                                                                             .GroupLayout
                                                                                                                             .Alignment.LEADING,
                                                                                                                             false)
                                                                                                        .addComponent(jLabel2,
                                                                                                                      javax
                                                                                                                      .swing
                                                                                                                      .GroupLayout.DEFAULT_SIZE,
                                                                                                                      javax
                                                                                                                      .swing
                                                                                                                      .GroupLayout.DEFAULT_SIZE,
                                                                                                                      Short.MAX_VALUE)
                                                                                                        .addComponent(jLabel1,
                                                                                                                      javax
                                                                                                                      .swing
                                                                                                                      .GroupLayout.DEFAULT_SIZE,
                                                                                                                      javax
                                                                                                                      .swing
                                                                                                                      .GroupLayout.DEFAULT_SIZE,
                                                                                                                      Short.MAX_VALUE))
                                                                                              .addPreferredGap(javax
                                                                                                               .swing
                                                                                                               .LayoutStyle
                                                                                                               .ComponentPlacement.RELATED)
                                                                                              .addGroup(layout
                                                                                                        .createParallelGroup(javax
                                                                                                                             .swing
                                                                                                                             .GroupLayout
                                                                                                                             .Alignment.LEADING)
                                                                                                        .addComponent(m_tName,
                                                                                                                      javax
                                                                                                                      .swing
                                                                                                                      .GroupLayout.DEFAULT_SIZE,
                                                                                                                      300,
                                                                                                                      Short.MAX_VALUE)
                                                                                                        .addComponent(m_cbType,
                                                                                                                      0,
                                                                                                                      300,
                                                                                                                      Short.MAX_VALUE)))
                                                                                    .addGroup(layout
                                                                                              .createSequentialGroup()
                                                                                              .addGap(120,
                                                                                                      120,
                                                                                                      120)
                                                                                              .addComponent(bOK,
                                                                                                            javax
                                                                                                            .swing
                                                                                                            .GroupLayout.PREFERRED_SIZE,
                                                                                                            javax
                                                                                                            .swing
                                                                                                            .GroupLayout.DEFAULT_SIZE,
                                                                                                            javax
                                                                                                            .swing
                                                                                                            .GroupLayout.PREFERRED_SIZE)
                                                                                              .addPreferredGap(javax
                                                                                                               .swing
                                                                                                               .LayoutStyle
                                                                                                               .ComponentPlacement.RELATED)
                                                                                              .addComponent(bCancel,
                                                                                                            javax
                                                                                                            .swing
                                                                                                            .GroupLayout.PREFERRED_SIZE,
                                                                                                            javax
                                                                                                            .swing
                                                                                                            .GroupLayout.DEFAULT_SIZE,
                                                                                                            javax
                                                                                                            .swing
                                                                                                            .GroupLayout.PREFERRED_SIZE)))
                                            .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                                                                                    .createParallelGroup(javax
                                                                                                                         .swing
                                                                                                                         .GroupLayout
                                                                                                                         .Alignment.BASELINE)
                                                                                                    .addComponent(jLabel1)
                                                                                                    .addComponent(m_cbType,
                                                                                                                  javax
                                                                                                                  .swing
                                                                                                                  .GroupLayout.PREFERRED_SIZE,
                                                                                                                  javax
                                                                                                                  .swing
                                                                                                                  .GroupLayout.DEFAULT_SIZE,
                                                                                                                  javax
                                                                                                                  .swing
                                                                                                                  .GroupLayout.PREFERRED_SIZE))
                                          .addPreferredGap(javax.swing.LayoutStyle
                                                           .ComponentPlacement.RELATED).addGroup(layout
                                                                                                 .createParallelGroup(javax
                                                                                                                      .swing
                                                                                                                      .GroupLayout
                                                                                                                      .Alignment.BASELINE)
                                                                                                 .addComponent(m_tName,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.PREFERRED_SIZE,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.DEFAULT_SIZE,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.PREFERRED_SIZE)
                                                                                                 .addComponent(jLabel2))
                                          .addPreferredGap(javax.swing.LayoutStyle
                                                           .ComponentPlacement.RELATED).addGroup(layout
                                                                                                 .createParallelGroup(javax
                                                                                                                      .swing
                                                                                                                      .GroupLayout
                                                                                                                      .Alignment.BASELINE)
                                                                                                 .addComponent(bCancel,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.PREFERRED_SIZE,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.DEFAULT_SIZE,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.PREFERRED_SIZE)
                                                                                                 .addComponent(bOK,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.PREFERRED_SIZE,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.DEFAULT_SIZE,
                                                                                                               javax
                                                                                                               .swing
                                                                                                               .GroupLayout.PREFERRED_SIZE))
                                          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                           Short.MAX_VALUE)));

        pack();
    } // </editor-fold>//GEN-END:initComponents
}
