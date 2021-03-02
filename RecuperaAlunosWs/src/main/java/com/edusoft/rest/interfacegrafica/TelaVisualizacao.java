package com.edusoft.rest.interfacegrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.edusoft.rest.conWs.GeraGet;
import com.edusoft.rest.datasource.model.DTOaluno;
import com.edusoft.rest.datasource.model.DTOalunoDados;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class TelaVisualizacao extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtMedia;
	private JTextField txtFrequencia;
	private JTextField txtSituacao;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtTotalFaltas;
	private JLabel lblRetorno;
	List<DTOaluno> alunos;
	List<DTOalunoDados> alunosDados;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisualizacao frame = new TelaVisualizacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaVisualizacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(23, 31, 399, 540);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DADOS DOS ALUNOS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(51, 32, 296, 57);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(76, 100, 148, 30);
		panel.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setBorder(null);
		txtNome.setBackground(Color.LIGHT_GRAY);
		txtNome.setBounds(76, 127, 247, 30);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Media");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(76, 168, 148, 30);
		panel.add(lblNewLabel_1_1);
		
		txtMedia = new JTextField();
		txtMedia.setEditable(false);
		txtMedia.setBorder(null);
		txtMedia.setBackground(Color.LIGHT_GRAY);
		txtMedia.setColumns(10);
		txtMedia.setBounds(76, 195, 247, 30);
		panel.add(txtMedia);
		
		JLabel lblNewLabel_1_2 = new JLabel("Frequência");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(76, 237, 148, 30);
		panel.add(lblNewLabel_1_2);
		
		txtFrequencia = new JTextField();
		txtFrequencia.setEditable(false);
		txtFrequencia.setBorder(null);
		txtFrequencia.setBackground(Color.LIGHT_GRAY);
		txtFrequencia.setColumns(10);
		txtFrequencia.setBounds(76, 263, 247, 30);
		panel.add(txtFrequencia);
		
		JLabel lblNewLabel_1_3 = new JLabel("Situação");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(76, 304, 148, 30);
		panel.add(lblNewLabel_1_3);
		
		txtSituacao = new JTextField();
		txtSituacao.setEditable(false);
		txtSituacao.setBorder(null);
		txtSituacao.setBackground(Color.LIGHT_GRAY);
		txtSituacao.setColumns(10);
		txtSituacao.setBounds(76, 331, 247, 30);
		panel.add(txtSituacao);
		
		txtNota1 = new JTextField();
		txtNota1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota1.setEditable(false);
		txtNota1.setBorder(null);
		txtNota1.setBackground(Color.LIGHT_GRAY);
		txtNota1.setBounds(76, 411, 46, 30);
		panel.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Nota 1");
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(76, 383, 46, 30);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Nota 2");
		lblNewLabel_1_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1_1.setBounds(176, 383, 46, 30);
		panel.add(lblNewLabel_1_3_1_1);
		
		txtNota2 = new JTextField();
		txtNota2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota2.setEditable(false);
		txtNota2.setBorder(null);
		txtNota2.setBackground(Color.LIGHT_GRAY);
		txtNota2.setColumns(10);
		txtNota2.setBounds(176, 411, 46, 30);
		panel.add(txtNota2);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Nota 3");
		lblNewLabel_1_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1_2.setBounds(277, 383, 46, 30);
		panel.add(lblNewLabel_1_3_1_2);
		
		txtNota3 = new JTextField();
		txtNota3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNota3.setEditable(false);
		txtNota3.setBorder(null);
		txtNota3.setBackground(Color.LIGHT_GRAY);
		txtNota3.setColumns(10);
		txtNota3.setBounds(277, 411, 46, 30);
		panel.add(txtNota3);
		
		txtTotalFaltas = new JTextField();
		txtTotalFaltas.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalFaltas.setEditable(false);
		txtTotalFaltas.setBorder(null);
		txtTotalFaltas.setBackground(Color.LIGHT_GRAY);
		txtTotalFaltas.setBounds(156, 493, 86, 30);
		panel.add(txtTotalFaltas);
		txtTotalFaltas.setColumns(10);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Total de Faltas");
		lblNewLabel_1_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_3_1_1_1.setBounds(156, 463, 86, 30);
		panel.add(lblNewLabel_1_3_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("RECUPERA ALUNOS");
		lblNewLabel_2.setForeground(SystemColor.desktop);
		lblNewLabel_2.setFont(new Font("Georgia", Font.PLAIN, 40));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(411, 47, 469, 63);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TelaVisualizacao.class.getResource("/com/edusoft/rest/res/SchoolIcon.png")));
		lblNewLabel_3.setBounds(525, 83, 262, 289);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaInicial tela = new TelaInicial();
				tela.setVisible(true);
				TelaVisualizacao.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(Color.DARK_GRAY);
				lblRetorno.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(Color.LIGHT_GRAY);
				lblRetorno.setForeground(Color.BLACK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panel_1.setBackground(Color.DARK_GRAY);
				lblRetorno.setForeground(Color.WHITE);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.setBackground(Color.LIGHT_GRAY);
				lblRetorno.setForeground(Color.BLACK);
			}
		});
		panel_1.setBounds(731, 489, 129, 82);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblRetorno = new JLabel("Return");
		lblRetorno.setHorizontalAlignment(SwingConstants.CENTER);
		lblRetorno.setBounds(0, 0, 129, 82);
		panel_1.add(lblRetorno);
		
		JComboBox comboBox = new JComboBox();
		try {
			geraTodosAlunos(comboBox);
		}catch(Exception e) {
			e.printStackTrace();
		}
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				colocaItens(comboBox);
			}
		});
		comboBox.setBounds(451, 390, 429, 63);
		contentPane.add(comboBox);
		setLocationRelativeTo(null);
		
	}
	public void geraTodosAlunos(JComboBox comboBox) {
		GeraGet get = new GeraGet();
		String json;
		Gson g = new Gson();
		String URL = "http://localhost:8080/recuperaalunos/aluno/busca";	
		 alunos = new ArrayList<DTOaluno>();
		try {
			 json = get.sendGet(URL,"GET");
			 java.lang.reflect.Type alunoType = new TypeToken<List<DTOaluno>>() {
				}.getType();
			 alunos = g.fromJson(json,alunoType);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < alunos.size(); i++) {
			comboBox.addItem(alunos.get(i).getNome());
		}
		
		
		
		GeraGet get2 = new GeraGet();
		String json2;
		Gson g2 = new Gson();
		URL = "http://localhost:8080/recupera/alunodados/busca";
		alunosDados = new ArrayList<DTOalunoDados>();
		
		try {
			 json2 = get2.sendGet(URL,"GET");
			 java.lang.reflect.Type alunoDadosType = new TypeToken<List<DTOalunoDados>>() {
				}.getType();
			 alunosDados = g2.fromJson(json2,alunoDadosType);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		colocaItens(comboBox);
	}
	public void colocaItens(JComboBox comboBox) {
		int i = comboBox.getSelectedIndex();
		txtNome.setText(alunos.get(i).getNome());
		txtNota1.setText(String.valueOf(alunos.get(i).getNota1()));
		txtNota2.setText(String.valueOf(alunos.get(i).getNota2()));
		txtNota3.setText(String.valueOf(alunos.get(i).getNota3()));
		int totalFaltas = alunos.get(i).getFaltas1()+alunos.get(i).getFaltas2()+alunos.get(i).getFaltas3();
		txtTotalFaltas.setText(String.valueOf(totalFaltas));
		txtMedia.setText(String.valueOf(alunosDados.get(i).getMedia()));
		txtSituacao.setText(alunosDados.get(i).getSituacao());
		txtFrequencia.setText(String.valueOf(alunosDados.get(i).getFrequencia()+"%"));
		
		
	}
}
