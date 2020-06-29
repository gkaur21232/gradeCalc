package edu.csus.csc131.gradeCalculator;

//view & controller
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField; 
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class gradeUI extends JFrame  {

	//the model
private calculate calc;

	public JPanel contentPane;
	public JTextField ptsMid;
	public JTextField ptsFinal;
	public JLabel lblAtten;
	public JTextField ptsAtten;
	public JButton btnCalculateGrade;
	public JButton btnPtsAssign;
	public JButton btnPtsTeam;
	public static JTextField finalGrade;
	public JTextField totalPtsAssign;
	public JTextField totalPtsProject;
	public JButton btnClear;
	
	

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					gradeUI frame = new gradeUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
		
	

	
	/**
	 * Create the frame.
	 */
	public gradeUI() {
		calc = new calculate();
		setTitle("Grade Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 327);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 66, 0, 4, 64, 24, 30, 0, 0, 16, 0};
		gbl_contentPane.rowHeights = new int[]{20, 38, 38, 38, 38, 40, 35, -11, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblAtten = new JLabel("Attendance");
		GridBagConstraints gbc_lblAtten = new GridBagConstraints();
		gbc_lblAtten.anchor = GridBagConstraints.EAST;
		gbc_lblAtten.insets = new Insets(0, 0, 5, 5);
		gbc_lblAtten.gridx = 0;
		gbc_lblAtten.gridy = 1;
		contentPane.add(lblAtten, gbc_lblAtten);
		
		ptsAtten = new JTextField();
		GridBagConstraints gbc_ptsAtten = new GridBagConstraints();
		gbc_ptsAtten.gridwidth = 2;
		gbc_ptsAtten.insets = new Insets(0, 0, 5, 5);
		gbc_ptsAtten.fill = GridBagConstraints.BOTH;
		gbc_ptsAtten.gridx = 1;
		gbc_ptsAtten.gridy = 1;
		contentPane.add(ptsAtten, gbc_ptsAtten);
		ptsAtten.setColumns(10);

		JLabel lblMidterm = new JLabel("Midterm");
		GridBagConstraints gbc_lblMidterm = new GridBagConstraints();
		gbc_lblMidterm.insets = new Insets(0, 0, 5, 5);
		gbc_lblMidterm.gridx = 0;
		gbc_lblMidterm.gridy = 2;
		contentPane.add(lblMidterm, gbc_lblMidterm);
		
		ptsMid = new JTextField();
		GridBagConstraints gbc_ptsMid = new GridBagConstraints();
		gbc_ptsMid.gridwidth = 2;
		gbc_ptsMid.insets = new Insets(0, 0, 5, 5);
		gbc_ptsMid.fill = GridBagConstraints.BOTH;
		gbc_ptsMid.gridx = 1;
		gbc_ptsMid.gridy = 2;
		contentPane.add(ptsMid, gbc_ptsMid);
		ptsMid.setColumns(10);
		

		
		JLabel lblFinal = new JLabel("Final");
		GridBagConstraints gbc_lblFinal = new GridBagConstraints();
		gbc_lblFinal.insets = new Insets(0, 0, 5, 5);
		gbc_lblFinal.gridx = 0;
		gbc_lblFinal.gridy = 3;
		contentPane.add(lblFinal, gbc_lblFinal);
		
		ptsFinal = new JTextField();
		GridBagConstraints gbc_ptsFinal = new GridBagConstraints();
		gbc_ptsFinal.gridwidth = 2;
		gbc_ptsFinal.insets = new Insets(0, 0, 5, 5);
		gbc_ptsFinal.fill = GridBagConstraints.BOTH;
		gbc_ptsFinal.gridx = 1;
		gbc_ptsFinal.gridy = 3;
		contentPane.add(ptsFinal, gbc_ptsFinal);
		ptsFinal.setColumns(10);


		
		JLabel lblAssignments = new JLabel("Assignments");
		GridBagConstraints gbc_lblAssignments = new GridBagConstraints();
		gbc_lblAssignments.anchor = GridBagConstraints.EAST;
		gbc_lblAssignments.insets = new Insets(0, 0, 5, 5);
		gbc_lblAssignments.gridx = 0;
		gbc_lblAssignments.gridy = 4;
		contentPane.add(lblAssignments, gbc_lblAssignments);
		
		btnPtsAssign = new JButton("Enter");
		btnPtsAssign.addActionListener(new AssPointsListener() {				
			
		});
		
		GridBagConstraints gbc_btnPtsAssign = new GridBagConstraints();
		gbc_btnPtsAssign.gridwidth = 4;
		gbc_btnPtsAssign.insets = new Insets(0, 0, 5, 5);
		gbc_btnPtsAssign.gridx = 1;
		gbc_btnPtsAssign.gridy = 4;
		contentPane.add(btnPtsAssign, gbc_btnPtsAssign);
		
		totalPtsAssign = new JTextField();
		GridBagConstraints gbc_totalPtsAssign = new GridBagConstraints();
		gbc_totalPtsAssign.gridwidth = 2;
		gbc_totalPtsAssign.insets = new Insets(0, 0, 5, 5);
		gbc_totalPtsAssign.fill = GridBagConstraints.BOTH;
		gbc_totalPtsAssign.gridx = 6;
		gbc_totalPtsAssign.gridy = 4;
		contentPane.add(totalPtsAssign, gbc_totalPtsAssign);
		totalPtsAssign.setColumns(10);
		
		JLabel lblTeamProjects = new JLabel("Team Projects");
		GridBagConstraints gbc_lblTeamProjects = new GridBagConstraints();
		gbc_lblTeamProjects.anchor = GridBagConstraints.EAST;
		gbc_lblTeamProjects.insets = new Insets(0, 0, 5, 5);
		gbc_lblTeamProjects.gridx = 0;
		gbc_lblTeamProjects.gridy = 5;
		contentPane.add(lblTeamProjects, gbc_lblTeamProjects);
		
		btnPtsTeam = new JButton("Enter ");
		btnPtsTeam.addActionListener(new TeamPointsListener() {
		});
		
		GridBagConstraints gbc_btnPtsTeam = new GridBagConstraints();
		gbc_btnPtsTeam.gridwidth = 4;
		gbc_btnPtsTeam.insets = new Insets(0, 0, 5, 5);
		gbc_btnPtsTeam.gridx = 1;
		gbc_btnPtsTeam.gridy = 5;
		contentPane.add(btnPtsTeam, gbc_btnPtsTeam);
		
		btnCalculateGrade = new JButton("Calc ");
		btnCalculateGrade.addActionListener(new CalcListener() {			
		});
		
		totalPtsProject = new JTextField();
		GridBagConstraints gbc_totalPtsProject = new GridBagConstraints();
		gbc_totalPtsProject.gridwidth = 2;
		gbc_totalPtsProject.insets = new Insets(0, 0, 5, 5);
		gbc_totalPtsProject.fill = GridBagConstraints.BOTH;
		gbc_totalPtsProject.gridx = 6;
		gbc_totalPtsProject.gridy = 5;
		contentPane.add(totalPtsProject, gbc_totalPtsProject);
		totalPtsProject.setColumns(10);
		
		GridBagConstraints gbc_btnCalculateGrade = new GridBagConstraints();
		gbc_btnCalculateGrade.gridwidth = 2;
		gbc_btnCalculateGrade.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalculateGrade.gridx = 6;
		gbc_btnCalculateGrade.gridy = 6;
		contentPane.add(btnCalculateGrade, gbc_btnCalculateGrade);
		
		finalGrade = new JTextField();
		GridBagConstraints gbc_finalGrade = new GridBagConstraints();
		gbc_finalGrade.fill = GridBagConstraints.BOTH;
		gbc_finalGrade.insets = new Insets(0, 0, 5, 5);
		gbc_finalGrade.gridx = 8;
		gbc_finalGrade.gridy = 6;
		contentPane.add(finalGrade, gbc_finalGrade);
		finalGrade.setColumns(10);
		
		btnClear = new JButton("CLEAR");
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 0, 5);
		gbc_btnClear.gridx = 8;
		gbc_btnClear.gridy = 7;
		contentPane.add(btnClear, gbc_btnClear);
		btnClear.addActionListener(new ClearListener() {});
	}
	
	
	
	
	//Calculate grade button	    
			class CalcListener implements ActionListener{
				public void actionPerformed(ActionEvent e) {  
					double n1, n2, n3, n4, n5; //numerators for the 5 categories
					double d1, d2, d3, d4, d5; //denominators 
					double nt1 = 0, nt2 = 0, nt3 = 0, nt4 = 0, nt5 = 0; //numerator total
					double dt1 = 0, dt2 = 0, dt3 = 0, dt4 = 0, dt5 = 0; //denominator total
					
					//finds numerator and denominator for attendance
					int dd1 = ptsAtten.getText().indexOf('/');
					String p1 = ptsAtten.getText();
					n1 = Double.parseDouble(p1.substring(0, dd1));
					d1 = Double.parseDouble(p1.substring(dd1 + 1));
					nt1 += n1;				
					dt1 += d1;
					
					//finds numerator and denominator for midterm
					int dd2 = ptsMid.getText().indexOf('/');
					String p2 = ptsMid.getText();
					n2 = Double.parseDouble(p2.substring(0, dd2));
					d2 = Double.parseDouble(p2.substring(dd2 + 1));
					nt2 += n2;				
					dt2 += d2;
					
					//finds numerator and denominator for final
					int dd3 = ptsFinal.getText().indexOf('/');
					String p3 = ptsFinal.getText();
					n3 = Double.parseDouble(p3.substring(0, dd3));
					d3 = Double.parseDouble(p3.substring(dd3 + 1));
					nt3 += n3;				
					dt3 += d3;
					
					//finds numerator and denominator for Assignments
					int dd4 = totalPtsAssign.getText().indexOf('/');
					String p4 = totalPtsAssign.getText();
					n4 = Double.parseDouble(p4.substring(0, dd4));
					d4 = Double.parseDouble(p4.substring(dd4 + 1));
					nt4 += n4;				
					dt4 += d4;
					
					//finds numerator and denominator for Team Projects
					int dd5 = totalPtsProject.getText().indexOf('/');
					String p5 = totalPtsProject.getText();
					n5 = Double.parseDouble(p5.substring(0, dd5));
					d5 = Double.parseDouble(p5.substring(dd5 + 1));
					nt5 += n5;				
					dt5 += d5;
					
				
					
					double g = calc.calculateGrade(nt1, dt1, nt2, dt2, nt3, dt3, nt4, dt4, nt5, dt5);
					

					 finalGrade.setText("" + g + "%");
				}				
			}
			
			
			/** 
			 *  @author Gurnit
			 *Action event for Clear Button
			 */
				class ClearListener implements ActionListener{
					public void actionPerformed(ActionEvent e) {
						ptsAtten.setText("");
						ptsMid.setText("");
						ptsFinal.setText("");					
						finalGrade.setText("");
						totalPtsAssign.setText("");
						totalPtsProject.setText("");
						
						
					}
				}
				
			/**
			 * 
			 * pops up dialog box for students to enter points for Team Projects
			 *  UPDATE: finished pop up  dialog , need to add weights to categories 
			 *
			 */
			
			class AssPointsListener implements ActionListener{
				public void actionPerformed(ActionEvent e) {  
					
					JTextField num = new JTextField();
					Object[] assNum = {
							"Number of Assignments: ", num
					};
					int selection = JOptionPane.showConfirmDialog(null, assNum, "Enter Number of Assignments: ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
					int number = Integer.parseInt(num.getText());
					double numerator = 0;
					double denominator = 0;
					double ntotal =0;
					double dtotal = 0;
					double[]fractionsNum = new double [10];
					double[]fractionsDen = new double[10];
					int j = 0;
					if(selection == JOptionPane.OK_OPTION)
					{
						for(int i = 1 ; i <= number; i++) {					
						JTextField n = new JTextField();
						Object[] points = {"Enter Points for assignment " + i + ": ", n };					
						int input = JOptionPane.showConfirmDialog(null, points, "Enter Number of Assignments: ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
						int divide = n.getText().indexOf('/');
						String p = n.getText();
						numerator = Double.parseDouble(p.substring(0, divide));
						denominator = Double.parseDouble(p.substring(divide + 1));
								
						fractionsNum[j] = numerator;
						fractionsDen[j] = denominator;
						j++;						
								
						
						ntotal += numerator;				
						dtotal += denominator;					
						
					} 				
						double numMin = 0;
						double denMin = 0;
						double min = fractionsNum[0]/fractionsDen[0];
						for(int i = 1; i<10; i++){						
							
							if(fractionsNum[i]/fractionsDen[i] < min)
							{
								min = (fractionsNum[i]/fractionsDen[i]);
								numMin = fractionsNum[i];
								denMin = fractionsDen[i];							
							}
						}
						
						ntotal -= numMin;
						dtotal -= denMin;
						System.out.println(ntotal + " / " + dtotal);
						System.out.println("Lowest Assignment dropped: " + numMin + "/" + denMin);
						
						totalPtsAssign.setText( ntotal + "/" + dtotal); 				
				}
			}
		}
			
			class TeamPointsListener implements ActionListener{
				public void actionPerformed(ActionEvent e) {  
					
					JTextField num = new JTextField();
					Object[] assNum = {
							"Number of Team Projects: ", num
					};
					int selection = JOptionPane.showConfirmDialog(null, assNum, "Enter Number of Team Projects: ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
					double number = Integer.parseInt(num.getText());
					double numerator = 0;
					double denominator = 0;
					double ntotal =0;
					double dtotal = 0;
					if(selection == JOptionPane.OK_OPTION)
					{
						for(int i = 1 ; i <= number; i++) {					
						JTextField n = new JTextField();
						Object[] points = {"Enter Points for project " + i + ": ", n };					
						int input = JOptionPane.showConfirmDialog(null, points, "Enter Number of Projects: ",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
						int divide = n.getText().indexOf('/');
						String p = n.getText();
						numerator = Double.parseDouble(p.substring(0, divide));
						denominator = Double.parseDouble(p.substring(divide + 1));
						ntotal += numerator;				
						dtotal += denominator;
					} 
						totalPtsProject.setText( ntotal + "/" + dtotal); 				
				}
			}
		}		

}

