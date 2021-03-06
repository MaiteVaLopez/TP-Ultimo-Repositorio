package com.company.InterfazGrafica;

import com.company.Modelado_clases.Avion;
import com.company.Modelado_clases.Ciudad;
import com.company.Persistencia.DatosVuelo;
import com.company.Modelado_clases.Usuario;
import com.company.Persistencia.Archivo;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static com.company.Modelado_clases.Ciudad.*;


public class Ventana extends javax.swing.JFrame {
    ///////////////////////////////////////////////VARIABLES//////////////////////////////////////////////////////////////////////////////////////
    // Variables declaration
    private javax.swing.JLabel aeroTaxi;
    private javax.swing.JLabel aeroTaxi1;
    private javax.swing.JLabel aeroTaxi2;
    private javax.swing.JLabel aeroTaxi3;
    private javax.swing.JLabel aeroTaxi4;
    private javax.swing.JButton bAtrasPlistas;
    private javax.swing.JButton bContinuarPIngresarDNI;
    private javax.swing.JButton bListasPPrincipal;
    private javax.swing.JButton bUsuariosPprincipal;
    private javax.swing.JButton bAtrasPcancelarVuelo;
    private javax.swing.JButton bAtrasPingresarDNI;
    private javax.swing.JButton bAtrasPlistaUsuarios;
    private javax.swing.JButton bAtrasPlistaVuelos;
    private javax.swing.JButton bAtrasPlistaVuelosMostrados;
    private javax.swing.JButton bAtrasPreservarCancelarvuelo;
    private javax.swing.JButton bAtrasPreservarVuelo;
    private javax.swing.JButton bCalcularCostoPreservarVeulo;
    private javax.swing.JButton bCancelarPreservarCancelarVuelo;
    private javax.swing.JButton bCancelarVueloPcancelarVuelo;
    private javax.swing.JSpinner bCantidadAcompañantesPreservarVuelo;
    private javax.swing.JButton bConfirmarVueloPreservarVuelo;
    private javax.swing.JComboBox<Ciudad> bDestinoPreservarVuelo;
    private javax.swing.JSpinner bElegirFechaPreservarVuelo;
    private javax.swing.JTextField bEscribirAvionPreservarVuelo;
    private javax.swing.JSpinner bFechaPcancelarVuelo;
    private javax.swing.JSpinner bFechaPlistaVuelos;
    private javax.swing.JLabel bienvenidos;
    private javax.swing.JButton bListaVuelosPlistaVuelos;
    private javax.swing.JButton bListasUsuariosPlistas;
    private javax.swing.JButton bListasVuelosPlistas;
    private javax.swing.JComboBox<Ciudad> bOrigenPreservarVuelo;
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton bReservarPreservarCancelarVuelo;
    private javax.swing.JButton bVerAvionesPreservarVuelo;
    private javax.swing.JLabel confortExcelencia;
    private javax.swing.JLabel lAdminUsuariosPprincipal;
    private javax.swing.JLabel lDNIPIngresarDNI;
    private javax.swing.JLabel lVerListasPprincipal;
    private javax.swing.JLabel labelAeroTaxiPPrincipal;
    private javax.swing.JLabel labelAeroTaxiPPrincipal1;
    private javax.swing.JLabel labelAeroTaxiPRegistrarse1;
    private javax.swing.JLabel labelAeroTaxiPRegistrarse2;
    private javax.swing.JLabel labelAeroTaxiPRegistrarse8;
    private javax.swing.JLabel lAcompañantesPreservarVuelo;
    private javax.swing.JLabel lCostoTotalPreservarVuelo;
    private javax.swing.JLabel lDeseacancelarreservarPreservarcancelarVuelo;
    private javax.swing.JLabel lDestinoPreservarVuelo;
    private javax.swing.JLabel lEscribaAvionPreservarVuelo;
    private javax.swing.JLabel lFechaPcancelarVuelo;
    private javax.swing.JLabel lFechaPlistaVuelos;
    private javax.swing.JLabel lFechavueloPreservarVuelo;
    private javax.swing.JLabel lIngresefechaPcancelarVuelo;
    private javax.swing.JLabel lIngresefechaPlistaVuelos;
    private javax.swing.JLabel lListaPlistas;
    private javax.swing.JLabel lNombrePreservarCancelarVuelo;
    private javax.swing.JLabel lOrigenPreservarVuelo;
    private javax.swing.JLabel lRespeteMayusculasPreservarVuelo;
    private javax.swing.JLabel lSeleccionePlistas;
    private javax.swing.JLabel lUnaPlistas;
    private javax.swing.JLabel lUsuarioPreservarCancelarVuelo;
    private javax.swing.JFrame pCancelarVuelo;
    private javax.swing.JFrame pIngresarDNI;
    private javax.swing.JFrame pListaUsuarios;
    private javax.swing.JFrame pListaVuelosMostrados;
    private javax.swing.JFrame pListas;
    private javax.swing.JFrame pListasVuelos;
    private javax.swing.JFrame preservarcancelarvuelo;
    private javax.swing.JFrame pReservarVuelo;
    private javax.swing.JPanel panelAeroTaxi;
    private javax.swing.JPanel panelAeroTaxi1;
    private javax.swing.JPanel panelAeroTaxi2;
    private javax.swing.JPanel panelAeroTaxi3;
    private javax.swing.JPanel panelAeroTaxi4;
    private javax.swing.JPanel panelAeroTaxiPRegistrarse1;
    private javax.swing.JPanel panelAeroTaxiPRegistrarse2;
    private javax.swing.JPanel panelAeroTaxiPRegistrarse8;
    private javax.swing.JPanel panelAeroTaxiPantallaPrincipal;
    private javax.swing.JPanel panelAeroTaxiPantallaPrincipal1;
    private javax.swing.JPanel panelBienvenidos;
    private javax.swing.JPanel panelBotonesPRegistrarse1;
    private javax.swing.JPanel panelBotonesPRegistrarse2;
    private javax.swing.JPanel panelBotonesPRegistrarse7;
    private javax.swing.JPanel panelBotonesPantallaPrincipal;
    private javax.swing.JPanel panelBotonesPantallaPrincipal1;
    private javax.swing.JPanel panelComenzar;
    private javax.swing.JPanel panelComenzar1;
    private javax.swing.JPanel panelComenzar2;
    private javax.swing.JPanel panelComenzar3;
    private javax.swing.JPanel panelComenzar4;
    private javax.swing.JFrame pantallaPrincipal;
    private javax.swing.JTextField tIngresarDNIUsuarioText;
    private javax.swing.JTable tablaListaUsuariosPlistaUsuarios;
    private javax.swing.JTable tablaMostrarVuelos;
    private javax.swing.JTextArea textAreaAvionesDisponiblesPreservarVuelo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;


    ///////////////////VARIABLES DECLARADAS///////////////////
    DatosVuelo nuevoDato;

    ///Para poder acceder a la lectura y escritura de archivos
    Archivo archivo = new Archivo();

    ///Guardo la fecha del vuelo ingresada por pantalla
    Date fechaElegida;

    ///Guardo el numero acompañantes igresada por pantalla
    int nroAcompanantes;

    ///Como origen es una lista de las posibles ciudades se debe almacenar el indice elegido además de la ciudad
    int indiceListaOrigen;

    ///Guardo el origen elegido
    Ciudad origen;

    ///Como destino es una lista de las posibles ciudades se debe almacenar el indice elegido además de la ciudad
    int indiceListaDestino;

    ///Guardo el destino elegido
    Ciudad destino;

    ///Lista de Datos Vuelo
    ArrayList<DatosVuelo> listaDatosVuelo = new ArrayList<>();

    ///Lista Usuarios
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    ///Lista aviones
    ArrayList<Avion> listaAviones = new ArrayList<>();

    ///Lista de datos mejor avion y costo total del usurio
    ArrayList<DatosVuelo> listadeVuelosConfirmados = new ArrayList<>();

    ///Guardo el nuevo avion elegido
    Avion nuevoAvion;

    ///Guardo el usuario de la lista al que se está accediendo con DNI
    Usuario usuario;

    ///Guardo los NOMBRES SOLO de los aviones disponibles para la fecha elegida
    ArrayList<String> avionesDisponibles = new ArrayList<>();

    ///Calendario
    Calendar calendar = Calendar.getInstance();//Variable de Objeto Calendar


    ////////////////////////////////CONTRUCTOR/////////////////////////

    public Ventana() {
        initComponents();

    }

    //////////////////////////////////VARIABLES INICIALIZADAS/////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void initComponents() {

        pantallaPrincipal = new JFrame();
        pIngresarDNI = new JFrame();
        panelAeroTaxiPantallaPrincipal = new JPanel();
        labelAeroTaxiPPrincipal = new JLabel();
        lDNIPIngresarDNI = new JLabel();
        panelBotonesPantallaPrincipal = new JPanel();
        bContinuarPIngresarDNI = new JButton();
        bAtrasPingresarDNI = new JButton();
        tIngresarDNIUsuarioText = new JTextField();
        preservarcancelarvuelo = new JFrame();
        panelBotonesPRegistrarse7 = new JPanel();
        bReservarPreservarCancelarVuelo = new JButton();
        bCancelarPreservarCancelarVuelo = new JButton();
        bAtrasPreservarCancelarvuelo = new JButton();
        lUsuarioPreservarCancelarVuelo = new JLabel();
        lNombrePreservarCancelarVuelo = new JLabel();
        lDeseacancelarreservarPreservarcancelarVuelo = new JLabel();
        panelAeroTaxiPRegistrarse8 = new JPanel();
        labelAeroTaxiPRegistrarse8 = new JLabel();
        pCancelarVuelo = new JFrame();
        panelAeroTaxi1 = new JPanel();
        aeroTaxi1 = new JLabel();
        panelComenzar1 = new JPanel();
        bAtrasPcancelarVuelo = new JButton();
        bCancelarVueloPcancelarVuelo = new JButton();
        lFechaPcancelarVuelo = new JLabel();
        bFechaPcancelarVuelo = new JSpinner();
        lIngresefechaPcancelarVuelo = new JLabel();
        pReservarVuelo = new JFrame();
        panelBotonesPRegistrarse1 = new JPanel();
        bConfirmarVueloPreservarVuelo = new JButton();
        bAtrasPreservarVuelo = new JButton();
        lFechavueloPreservarVuelo = new JLabel();
        bElegirFechaPreservarVuelo = new JSpinner();
        lOrigenPreservarVuelo = new JLabel();
        lCostoTotalPreservarVuelo = new JLabel();
        bOrigenPreservarVuelo = new JComboBox<>();
        lDestinoPreservarVuelo = new JLabel();
        bDestinoPreservarVuelo = new JComboBox<Ciudad>();
        lAcompañantesPreservarVuelo = new JLabel();
        bCantidadAcompañantesPreservarVuelo = new JSpinner();
        panelAeroTaxiPRegistrarse1 = new JPanel();
        labelAeroTaxiPRegistrarse1 = new JLabel();
        lEscribaAvionPreservarVuelo = new JLabel();
        bEscribirAvionPreservarVuelo = new JTextField();
        bVerAvionesPreservarVuelo = new JButton();
        jScrollPane2 = new JScrollPane();
        textAreaAvionesDisponiblesPreservarVuelo = new JTextArea();
        bCalcularCostoPreservarVeulo = new JButton();
        lRespeteMayusculasPreservarVuelo = new JLabel();
        pListas = new JFrame();
        panelAeroTaxi2 = new JPanel();
        aeroTaxi2 = new JLabel();
        panelComenzar2 = new JPanel();
        bListasVuelosPlistas = new JButton();
        bListasUsuariosPlistas = new JButton();
        bAtrasPlistas = new JButton();
        lSeleccionePlistas = new JLabel();
        lUnaPlistas = new JLabel();
        lListaPlistas = new JLabel();
        pListasVuelos = new JFrame();
        lFechaPlistaVuelos = new JLabel();
        bFechaPlistaVuelos = new JSpinner();
        lIngresefechaPlistaVuelos = new JLabel();
        panelAeroTaxi3 = new JPanel();
        aeroTaxi3 = new JLabel();
        panelComenzar3 = new JPanel();
        bAtrasPlistaVuelos = new JButton();
        bListaVuelosPlistaVuelos = new JButton();
        pListaUsuarios = new JFrame();
        panelBotonesPRegistrarse2 = new JPanel();
        bAtrasPlistaUsuarios = new JButton();
        panelAeroTaxiPRegistrarse2 = new JPanel();
        labelAeroTaxiPRegistrarse2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        tablaListaUsuariosPlistaUsuarios = new JTable();
        pantallaPrincipal = new JFrame();
        lAdminUsuariosPprincipal = new JLabel();
        panelBotonesPantallaPrincipal1 = new JPanel();
        panelAeroTaxiPantallaPrincipal1 = new JPanel();
        labelAeroTaxiPPrincipal1 = new JLabel();
        lVerListasPprincipal = new JLabel();
        bUsuariosPprincipal = new JButton();
        bListasPPrincipal = new JButton();
        pListaVuelosMostrados = new JFrame();
        panelAeroTaxi4 = new JPanel();
        aeroTaxi4 = new JLabel();
        panelComenzar4 = new JPanel();
        bAtrasPlistaVuelosMostrados = new JButton();
        jScrollPane3 = new JScrollPane();
        tablaMostrarVuelos = new JTable();
        panelBienvenidos = new JPanel();
        confortExcelencia = new JLabel();
        bienvenidos = new JLabel();
        panelAeroTaxi = new JPanel();
        aeroTaxi = new JLabel();
        panelComenzar = new JPanel();
        botonComenzar = new JButton();

        panelAeroTaxiPantallaPrincipal.setBackground(new Color(51, 153, 255));
        panelAeroTaxiPantallaPrincipal.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxiPantallaPrincipal.setForeground(new Color(0, 153, 204));

        labelAeroTaxiPPrincipal.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        labelAeroTaxiPPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
        labelAeroTaxiPPrincipal.setText("A E R O T A X I   ");
        labelAeroTaxiPPrincipal.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxiPantallaPrincipalLayout = new GroupLayout(panelAeroTaxiPantallaPrincipal);
        panelAeroTaxiPantallaPrincipal.setLayout(PanelAeroTaxiPantallaPrincipalLayout);
        PanelAeroTaxiPantallaPrincipalLayout.setHorizontalGroup(
                PanelAeroTaxiPantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelAeroTaxiPPrincipal, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        PanelAeroTaxiPantallaPrincipalLayout.setVerticalGroup(
                PanelAeroTaxiPantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAeroTaxiPantallaPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelAeroTaxiPPrincipal)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        lDNIPIngresarDNI.setFont(new Font("Vivaldi", 1, 24)); // NOI18N
        lDNIPIngresarDNI.setHorizontalAlignment(SwingConstants.CENTER);
        lDNIPIngresarDNI.setText("Ingrese El DNI Del Usuario");

        panelBotonesPantallaPrincipal.setBackground(new Color(0, 153, 255));
        panelBotonesPantallaPrincipal.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelBotonesPantallaPrincipal.setForeground(new Color(0, 153, 153));

        bContinuarPIngresarDNI.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bContinuarPIngresarDNI.setText("Continuar");
        bContinuarPIngresarDNI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bContinuarPU(evt);
            }
        });

        bAtrasPingresarDNI.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bAtrasPingresarDNI.setText("Atras");
        bAtrasPingresarDNI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAtrasPU(evt);
            }
        });

        GroupLayout PanelBotonesPantallaPrincipalLayout = new GroupLayout(panelBotonesPantallaPrincipal);
        panelBotonesPantallaPrincipal.setLayout(PanelBotonesPantallaPrincipalLayout);
        PanelBotonesPantallaPrincipalLayout.setHorizontalGroup(
                PanelBotonesPantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelBotonesPantallaPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bAtrasPingresarDNI, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bContinuarPIngresarDNI)
                                .addContainerGap())
        );
        PanelBotonesPantallaPrincipalLayout.setVerticalGroup(
                PanelBotonesPantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBotonesPantallaPrincipalLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(PanelBotonesPantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bContinuarPIngresarDNI)
                                        .addComponent(bAtrasPingresarDNI))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tIngresarDNIUsuarioText.setFont(new Font("Vivaldi", 1, 24)); // NOI18N
        tIngresarDNIUsuarioText.setHorizontalAlignment(JTextField.CENTER);
        tIngresarDNIUsuarioText.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                TIngresarDNIUsuarioKeyTyped(evt);
            }
        });

        GroupLayout PIngresarDNILayout = new GroupLayout(pIngresarDNI.getContentPane());
        pIngresarDNI.getContentPane().setLayout(PIngresarDNILayout);
        PIngresarDNILayout.setHorizontalGroup(
                PIngresarDNILayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBotonesPantallaPrincipal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAeroTaxiPantallaPrincipal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PIngresarDNILayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PIngresarDNILayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lDNIPIngresarDNI, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PIngresarDNILayout.createSequentialGroup()
                                                .addComponent(tIngresarDNIUsuarioText)
                                                .addContainerGap())))
        );
        PIngresarDNILayout.setVerticalGroup(
                PIngresarDNILayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PIngresarDNILayout.createSequentialGroup()
                                .addComponent(panelAeroTaxiPantallaPrincipal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(lDNIPIngresarDNI)
                                .addGap(41, 41, 41)
                                .addComponent(tIngresarDNIUsuarioText, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                                .addComponent(panelBotonesPantallaPrincipal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        panelBotonesPRegistrarse7.setBackground(new Color(0, 153, 255));
        panelBotonesPRegistrarse7.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelBotonesPRegistrarse7.setForeground(new Color(0, 153, 153));

        bReservarPreservarCancelarVuelo.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bReservarPreservarCancelarVuelo.setText("Reservar Vuelo ");
        bReservarPreservarCancelarVuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bReservarVueloPRC(evt);
            }
        });

        bCancelarPreservarCancelarVuelo.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bCancelarPreservarCancelarVuelo.setText("Cancelar Vuelo");
        bCancelarPreservarCancelarVuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bCancelarVueloPRC(evt);
            }
        });

        bAtrasPreservarCancelarvuelo.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bAtrasPreservarCancelarvuelo.setText("Atras");
        bAtrasPreservarCancelarvuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAtrasPRC(evt);
            }
        });

        GroupLayout PanelBotonesPRegistrarse7Layout = new GroupLayout(panelBotonesPRegistrarse7);
        panelBotonesPRegistrarse7.setLayout(PanelBotonesPRegistrarse7Layout);
        PanelBotonesPRegistrarse7Layout.setHorizontalGroup(
                PanelBotonesPRegistrarse7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBotonesPRegistrarse7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bReservarPreservarCancelarVuelo)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bAtrasPreservarCancelarvuelo)
                                .addGap(38, 38, 38)
                                .addComponent(bCancelarPreservarCancelarVuelo, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        PanelBotonesPRegistrarse7Layout.setVerticalGroup(
                PanelBotonesPRegistrarse7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBotonesPRegistrarse7Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(PanelBotonesPRegistrarse7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bReservarPreservarCancelarVuelo)
                                        .addComponent(bCancelarPreservarCancelarVuelo)
                                        .addComponent(bAtrasPreservarCancelarvuelo))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lUsuarioPreservarCancelarVuelo.setFont(new Font("Vivaldi", 1, 24)); // NOI18N
        lUsuarioPreservarCancelarVuelo.setHorizontalAlignment(SwingConstants.CENTER);
        lUsuarioPreservarCancelarVuelo.setText("Usuario");

        lNombrePreservarCancelarVuelo.setFont(new Font("Vivaldi", 0, 24)); // NOI18N
        lNombrePreservarCancelarVuelo.setHorizontalAlignment(SwingConstants.CENTER);
        lNombrePreservarCancelarVuelo.setText("                                       ");

        lDeseacancelarreservarPreservarcancelarVuelo.setFont(new Font("Viner Hand ITC", 0, 18)); // NOI18N
        lDeseacancelarreservarPreservarcancelarVuelo.setHorizontalAlignment(SwingConstants.CENTER);
        lDeseacancelarreservarPreservarcancelarVuelo.setText("¿Desea Reservar un Viaje o Cancelarlo?");

        panelAeroTaxiPRegistrarse8.setBackground(new Color(51, 153, 255));
        panelAeroTaxiPRegistrarse8.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxiPRegistrarse8.setForeground(new Color(0, 153, 204));

        labelAeroTaxiPRegistrarse8.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        labelAeroTaxiPRegistrarse8.setHorizontalAlignment(SwingConstants.CENTER);
        labelAeroTaxiPRegistrarse8.setText("A E R O T A X I  ");
        labelAeroTaxiPRegistrarse8.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxiPRegistrarse8Layout = new GroupLayout(panelAeroTaxiPRegistrarse8);
        panelAeroTaxiPRegistrarse8.setLayout(PanelAeroTaxiPRegistrarse8Layout);
        PanelAeroTaxiPRegistrarse8Layout.setHorizontalGroup(
                PanelAeroTaxiPRegistrarse8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelAeroTaxiPRegistrarse8, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAeroTaxiPRegistrarse8Layout.setVerticalGroup(
                PanelAeroTaxiPRegistrarse8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAeroTaxiPRegistrarse8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelAeroTaxiPRegistrarse8)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        GroupLayout PReservarCancelarVueloLayout = new GroupLayout(preservarcancelarvuelo.getContentPane());
        preservarcancelarvuelo.getContentPane().setLayout(PReservarCancelarVueloLayout);
        PReservarCancelarVueloLayout.setHorizontalGroup(
                PReservarCancelarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelAeroTaxiPRegistrarse8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBotonesPRegistrarse7, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PReservarCancelarVueloLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lUsuarioPreservarCancelarVuelo, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lNombrePreservarCancelarVuelo, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(lDeseacancelarreservarPreservarcancelarVuelo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PReservarCancelarVueloLayout.setVerticalGroup(
                PReservarCancelarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PReservarCancelarVueloLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxiPRegistrarse8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addGroup(PReservarCancelarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lUsuarioPreservarCancelarVuelo, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                        .addComponent(lNombrePreservarCancelarVuelo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(lDeseacancelarreservarPreservarcancelarVuelo, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(panelBotonesPRegistrarse7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        panelAeroTaxi1.setBackground(new Color(51, 153, 255));
        panelAeroTaxi1.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxi1.setForeground(new Color(0, 153, 204));

        aeroTaxi1.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        aeroTaxi1.setHorizontalAlignment(SwingConstants.CENTER);
        aeroTaxi1.setText("A E R O T A X I ");
        aeroTaxi1.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxi1Layout = new GroupLayout(panelAeroTaxi1);
        panelAeroTaxi1.setLayout(PanelAeroTaxi1Layout);
        PanelAeroTaxi1Layout.setHorizontalGroup(
                PanelAeroTaxi1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(aeroTaxi1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAeroTaxi1Layout.setVerticalGroup(
                PanelAeroTaxi1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAeroTaxi1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(aeroTaxi1)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelComenzar1.setBackground(new Color(0, 153, 255));
        panelComenzar1.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelComenzar1.setForeground(new Color(0, 153, 153));

        bAtrasPcancelarVuelo.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bAtrasPcancelarVuelo.setText("Atras");
        bAtrasPcancelarVuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAtrasPCV(evt);
            }
        });

        bCancelarVueloPcancelarVuelo.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bCancelarVueloPcancelarVuelo.setText("Cancelar Vuelo");
        bCancelarVueloPcancelarVuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bCancelarVueloPCV(evt);
            }
        });

        GroupLayout PanelComenzar1Layout = new GroupLayout(panelComenzar1);
        panelComenzar1.setLayout(PanelComenzar1Layout);
        PanelComenzar1Layout.setHorizontalGroup(
                PanelComenzar1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelComenzar1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bAtrasPcancelarVuelo, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCancelarVueloPcancelarVuelo)
                                .addContainerGap())
        );
        PanelComenzar1Layout.setVerticalGroup(
                PanelComenzar1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelComenzar1Layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addGroup(PanelComenzar1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bAtrasPcancelarVuelo)
                                        .addComponent(bCancelarVueloPcancelarVuelo))
                                .addContainerGap())
        );

        lFechaPcancelarVuelo.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        lFechaPcancelarVuelo.setText("Fecha");


        //Obtenemos una fecha de inicio, será la fecha actual del sistema
        Date inicio = calendar.getTime();
        //Indicamos año hasta -1 del actual
        calendar.add(Calendar.YEAR, -1);
        //Guardamos la configuración en un DATE
        Date fechaAnterior = calendar.getTime();
        //Indicamos año hasta +2 del actual
        calendar.add(Calendar.YEAR, +2);
        //Guardamos la configuración en un DATE
        Date fechaPosterior = calendar.getTime();
        //Usamos el contructor de abajo para crear un modelo para el Spinner
        //SpinnerDateModel(Date value, Comparable start, Comparable end, int calendarField)
        //Utilizamos los datos que creamos más arriba
        //Para fecha utilizamos Calendar.YEAR y para hora Calendar.HOUR, el resto puede ser igual
        SpinnerModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);

        bFechaPcancelarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        bFechaPcancelarVuelo.setModel(fechaModel);
        bFechaPcancelarVuelo.setEditor(new JSpinner.DateEditor(bFechaPcancelarVuelo, "dd/MM/yyyy"));

        lIngresefechaPcancelarVuelo.setFont(new Font("Vladimir Script", 1, 24)); // NOI18N
        lIngresefechaPcancelarVuelo.setHorizontalAlignment(SwingConstants.CENTER);
        lIngresefechaPcancelarVuelo.setText("Ingrese La Fecha Del Vuelo A Cancelar ");

        GroupLayout PCancelarVueloLayout = new GroupLayout(pCancelarVuelo.getContentPane());
        pCancelarVuelo.getContentPane().setLayout(PCancelarVueloLayout);
        PCancelarVueloLayout.setHorizontalGroup(
                PCancelarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelAeroTaxi1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelComenzar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PCancelarVueloLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lIngresefechaPcancelarVuelo, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(45, Short.MAX_VALUE))
                        .addGroup(PCancelarVueloLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lFechaPcancelarVuelo, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bFechaPcancelarVuelo, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
        );
        PCancelarVueloLayout.setVerticalGroup(
                PCancelarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PCancelarVueloLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxi1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lIngresefechaPcancelarVuelo, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PCancelarVueloLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lFechaPcancelarVuelo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bFechaPcancelarVuelo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                                .addComponent(panelComenzar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        panelBotonesPRegistrarse1.setBackground(new Color(0, 153, 255));
        panelBotonesPRegistrarse1.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelBotonesPRegistrarse1.setForeground(new Color(0, 153, 153));

        bConfirmarVueloPreservarVuelo.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bConfirmarVueloPreservarVuelo.setText("Confirmar Vuelo");
        bConfirmarVueloPreservarVuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bConfirmarPRV(evt);
            }
        });

        bAtrasPreservarVuelo.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bAtrasPreservarVuelo.setText("Atras");
        bAtrasPreservarVuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAtrasPRV(evt);
            }
        });

        GroupLayout PanelBotonesPRegistrarse1Layout = new GroupLayout(panelBotonesPRegistrarse1);
        panelBotonesPRegistrarse1.setLayout(PanelBotonesPRegistrarse1Layout);
        PanelBotonesPRegistrarse1Layout.setHorizontalGroup(
                PanelBotonesPRegistrarse1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBotonesPRegistrarse1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bAtrasPreservarVuelo)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bConfirmarVueloPreservarVuelo)
                                .addContainerGap())
        );
        PanelBotonesPRegistrarse1Layout.setVerticalGroup(
                PanelBotonesPRegistrarse1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBotonesPRegistrarse1Layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addGroup(PanelBotonesPRegistrarse1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bConfirmarVueloPreservarVuelo)
                                        .addComponent(bAtrasPreservarVuelo))
                                .addContainerGap())
        );

        lFechavueloPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        lFechavueloPreservarVuelo.setText("Fecha del Vuelo ");


        //Indicamos el model para cada Spinner además del formato de fecha y hora según corresponda.

        bElegirFechaPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        bElegirFechaPreservarVuelo.setModel(fechaModel);
        bElegirFechaPreservarVuelo.setEditor(new JSpinner.DateEditor(bElegirFechaPreservarVuelo, "dd/MM/yyyy"));


        lOrigenPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        lOrigenPreservarVuelo.setText("Origen");

        lCostoTotalPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        lCostoTotalPreservarVuelo.setText("$");

        bOrigenPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        bOrigenPreservarVuelo.setModel(new DefaultComboBoxModel<Ciudad>(new Ciudad[] { BUENOS_AIRES, CORDOBA, MONTEVIDEO, SANTIAGO }));
        bOrigenPreservarVuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bOrigenPRV(evt);
            }
        });

        lDestinoPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        lDestinoPreservarVuelo.setText("Destino");

        bDestinoPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N

        lAcompañantesPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        lAcompañantesPreservarVuelo.setText("Acompañantes");

        bCantidadAcompañantesPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        bCantidadAcompañantesPreservarVuelo.setModel(new SpinnerNumberModel(0, 0, 19, 1));

        panelAeroTaxiPRegistrarse1.setBackground(new Color(51, 153, 255));
        panelAeroTaxiPRegistrarse1.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxiPRegistrarse1.setForeground(new Color(0, 153, 204));

        labelAeroTaxiPRegistrarse1.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        labelAeroTaxiPRegistrarse1.setHorizontalAlignment(SwingConstants.CENTER);
        labelAeroTaxiPRegistrarse1.setText("A E R O T A X I  ");
        labelAeroTaxiPRegistrarse1.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxiPRegistrarse1Layout = new GroupLayout(panelAeroTaxiPRegistrarse1);
        panelAeroTaxiPRegistrarse1.setLayout(PanelAeroTaxiPRegistrarse1Layout);
        PanelAeroTaxiPRegistrarse1Layout.setHorizontalGroup(
                PanelAeroTaxiPRegistrarse1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelAeroTaxiPRegistrarse1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAeroTaxiPRegistrarse1Layout.setVerticalGroup(
                PanelAeroTaxiPRegistrarse1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelAeroTaxiPRegistrarse1Layout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addComponent(labelAeroTaxiPRegistrarse1)
                                .addContainerGap())
        );

        lEscribaAvionPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        lEscribaAvionPreservarVuelo.setText("Escriba el Avion elegido");

        bVerAvionesPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        bVerAvionesPreservarVuelo.setText("Ver Aviones Disponibles");
        bVerAvionesPreservarVuelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bVerAvionesPRV(evt);
            }
        });

        textAreaAvionesDisponiblesPreservarVuelo.setColumns(20);
        textAreaAvionesDisponiblesPreservarVuelo.setRows(5);
        jScrollPane2.setViewportView(textAreaAvionesDisponiblesPreservarVuelo);

        bCalcularCostoPreservarVeulo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        bCalcularCostoPreservarVeulo.setText("Calcular Costo");
        bCalcularCostoPreservarVeulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bCalcularCostoPRV(evt);
            }
        });

        lRespeteMayusculasPreservarVuelo.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        lRespeteMayusculasPreservarVuelo.setText("Respete Las Mayusculas");

        GroupLayout PReservarVueloLayout = new GroupLayout(pReservarVuelo.getContentPane());
        pReservarVuelo.getContentPane().setLayout(PReservarVueloLayout);
        PReservarVueloLayout.setHorizontalGroup(
                PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PReservarVueloLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lFechavueloPreservarVuelo, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                .addComponent(lOrigenPreservarVuelo, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lDestinoPreservarVuelo, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lAcompañantesPreservarVuelo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(bVerAvionesPreservarVuelo, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bCalcularCostoPreservarVeulo, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lEscribaAvionPreservarVuelo, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bOrigenPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bElegirFechaPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bDestinoPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bCantidadAcompañantesPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bEscribirAvionPreservarVuelo, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lCostoTotalPreservarVuelo)
                                        .addComponent(lRespeteMayusculasPreservarVuelo, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(31, Short.MAX_VALUE))
                        .addComponent(panelAeroTaxiPRegistrarse1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBotonesPRegistrarse1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PReservarVueloLayout.setVerticalGroup(
                PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PReservarVueloLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxiPRegistrarse1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lFechavueloPreservarVuelo, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bElegirFechaPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lOrigenPreservarVuelo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bOrigenPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lDestinoPreservarVuelo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bDestinoPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lAcompañantesPreservarVuelo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bCantidadAcompañantesPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bVerAvionesPreservarVuelo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lRespeteMayusculasPreservarVuelo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bEscribirAvionPreservarVuelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lEscribaAvionPreservarVuelo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(PReservarVueloLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lCostoTotalPreservarVuelo)
                                        .addComponent(bCalcularCostoPreservarVeulo))
                                .addGap(21, 21, 21)
                                .addComponent(panelBotonesPRegistrarse1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        panelAeroTaxi2.setBackground(new Color(51, 153, 255));
        panelAeroTaxi2.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxi2.setForeground(new Color(0, 153, 204));

        aeroTaxi2.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        aeroTaxi2.setHorizontalAlignment(SwingConstants.CENTER);
        aeroTaxi2.setText("A E R O T A X I     ");
        aeroTaxi2.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxi2Layout = new GroupLayout(panelAeroTaxi2);
        panelAeroTaxi2.setLayout(PanelAeroTaxi2Layout);
        PanelAeroTaxi2Layout.setHorizontalGroup(
                PanelAeroTaxi2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(aeroTaxi2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        PanelAeroTaxi2Layout.setVerticalGroup(
                PanelAeroTaxi2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAeroTaxi2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(aeroTaxi2)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelComenzar2.setBackground(new Color(0, 153, 255));
        panelComenzar2.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelComenzar2.setForeground(new Color(0, 153, 153));

        bListasVuelosPlistas.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bListasVuelosPlistas.setText("Lista Vuelos");
        bListasVuelosPlistas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bListaVuelosPL(evt);
            }
        });

        bListasUsuariosPlistas.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bListasUsuariosPlistas.setText("Lista Usuarios");
        bListasUsuariosPlistas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bListaUsuariosPL(evt);
            }
        });

        bAtrasPlistas.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bAtrasPlistas.setText("Atras");
        bAtrasPlistas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAtrasPL(evt);
            }
        });

        GroupLayout PanelComenzar2Layout = new GroupLayout(panelComenzar2);
        panelComenzar2.setLayout(PanelComenzar2Layout);
        PanelComenzar2Layout.setHorizontalGroup(
                PanelComenzar2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelComenzar2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bListasVuelosPlistas, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bAtrasPlistas)
                                .addGap(38, 38, 38)
                                .addComponent(bListasUsuariosPlistas, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        PanelComenzar2Layout.setVerticalGroup(
                PanelComenzar2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelComenzar2Layout.createSequentialGroup()
                                .addGroup(PanelComenzar2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, PanelComenzar2Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bAtrasPlistas))
                                        .addGroup(PanelComenzar2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(PanelComenzar2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(bListasUsuariosPlistas, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                                        .addComponent(bListasVuelosPlistas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );

        lSeleccionePlistas.setFont(new Font("Vivaldi", 1, 36)); // NOI18N
        lSeleccionePlistas.setHorizontalAlignment(SwingConstants.CENTER);
        lSeleccionePlistas.setText("Seleccione");

        lUnaPlistas.setFont(new Font("Vivaldi", 1, 36)); // NOI18N
        lUnaPlistas.setHorizontalAlignment(SwingConstants.CENTER);
        lUnaPlistas.setText("una");

        lListaPlistas.setFont(new Font("Vivaldi", 1, 36)); // NOI18N
        lListaPlistas.setHorizontalAlignment(SwingConstants.CENTER);
        lListaPlistas.setText("Lista");

        GroupLayout PListasLayout = new GroupLayout(pListas.getContentPane());
        pListas.getContentPane().setLayout(PListasLayout);
        PListasLayout.setHorizontalGroup(
                PListasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelAeroTaxi2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelComenzar2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PListasLayout.createSequentialGroup()
                                .addGroup(PListasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(PListasLayout.createSequentialGroup()
                                                .addGroup(PListasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(PListasLayout.createSequentialGroup()
                                                                .addGap(115, 115, 115)
                                                                .addComponent(lUnaPlistas, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(PListasLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(lSeleccionePlistas, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, PListasLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lListaPlistas, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        PListasLayout.setVerticalGroup(
                PListasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PListasLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxi2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(lSeleccionePlistas)
                                .addGap(18, 18, 18)
                                .addComponent(lUnaPlistas)
                                .addGap(18, 18, 18)
                                .addComponent(lListaPlistas)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(panelComenzar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        lFechaPlistaVuelos.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        lFechaPlistaVuelos.setText("Fecha");



        bFechaPlistaVuelos.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        bFechaPlistaVuelos.setModel(fechaModel);
        bFechaPlistaVuelos.setEditor(new JSpinner.DateEditor(bElegirFechaPreservarVuelo, "dd/MM/yyyy"));

        lIngresefechaPlistaVuelos.setFont(new Font("Vladimir Script", 1, 24)); // NOI18N
        lIngresefechaPlistaVuelos.setHorizontalAlignment(SwingConstants.CENTER);
        lIngresefechaPlistaVuelos.setText("Ingrese La Fecha De Vuelos Que Desea Ver  ");

        panelAeroTaxi3.setBackground(new Color(51, 153, 255));
        panelAeroTaxi3.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxi3.setForeground(new Color(0, 153, 204));

        aeroTaxi3.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        aeroTaxi3.setHorizontalAlignment(SwingConstants.CENTER);
        aeroTaxi3.setText("A E R O T A X I ");
        aeroTaxi3.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxi3Layout = new GroupLayout(panelAeroTaxi3);
        panelAeroTaxi3.setLayout(PanelAeroTaxi3Layout);
        PanelAeroTaxi3Layout.setHorizontalGroup(
                PanelAeroTaxi3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(aeroTaxi3, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        PanelAeroTaxi3Layout.setVerticalGroup(
                PanelAeroTaxi3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelAeroTaxi3Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aeroTaxi3)
                                .addContainerGap())
        );

        panelComenzar3.setBackground(new Color(0, 153, 255));
        panelComenzar3.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelComenzar3.setForeground(new Color(0, 153, 153));

        bAtrasPlistaVuelos.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bAtrasPlistaVuelos.setText("Atras");
        bAtrasPlistaVuelos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAtrasPLV(evt);
            }
        });

        bListaVuelosPlistaVuelos.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bListaVuelosPlistaVuelos.setText("Lista de Vuelos");
        bListaVuelosPlistaVuelos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bListaVuelosPLV(evt);
            }
        });

        GroupLayout PanelComenzar3Layout = new GroupLayout(panelComenzar3);
        panelComenzar3.setLayout(PanelComenzar3Layout);
        PanelComenzar3Layout.setHorizontalGroup(
                PanelComenzar3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelComenzar3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bAtrasPlistaVuelos)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bListaVuelosPlistaVuelos)
                                .addContainerGap())
        );
        PanelComenzar3Layout.setVerticalGroup(
                PanelComenzar3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelComenzar3Layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addGroup(PanelComenzar3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bAtrasPlistaVuelos)
                                        .addComponent(bListaVuelosPlistaVuelos))
                                .addContainerGap())
        );

        GroupLayout PListasVuelosLayout = new GroupLayout(pListasVuelos.getContentPane());
        pListasVuelos.getContentPane().setLayout(PListasVuelosLayout);
        PListasVuelosLayout.setHorizontalGroup(
                PListasVuelosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelComenzar3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAeroTaxi3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PListasVuelosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lIngresefechaPlistaVuelos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, PListasVuelosLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lFechaPlistaVuelos, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bFechaPlistaVuelos, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
        );
        PListasVuelosLayout.setVerticalGroup(
                PListasVuelosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PListasVuelosLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxi3, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(lIngresefechaPlistaVuelos, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(PListasVuelosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bFechaPlistaVuelos, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lFechaPlistaVuelos, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                .addComponent(panelComenzar3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        panelBotonesPRegistrarse2.setBackground(new Color(0, 153, 255));
        panelBotonesPRegistrarse2.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelBotonesPRegistrarse2.setForeground(new Color(0, 153, 153));

        bAtrasPlistaUsuarios.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bAtrasPlistaUsuarios.setText("Atras");
        bAtrasPlistaUsuarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAtrasPLU(evt);
            }
        });

        GroupLayout PanelBotonesPRegistrarse2Layout = new GroupLayout(panelBotonesPRegistrarse2);
        panelBotonesPRegistrarse2.setLayout(PanelBotonesPRegistrarse2Layout);
        PanelBotonesPRegistrarse2Layout.setHorizontalGroup(
                PanelBotonesPRegistrarse2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBotonesPRegistrarse2Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(bAtrasPlistaUsuarios)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotonesPRegistrarse2Layout.setVerticalGroup(
                PanelBotonesPRegistrarse2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBotonesPRegistrarse2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bAtrasPlistaUsuarios)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAeroTaxiPRegistrarse2.setBackground(new Color(51, 153, 255));
        panelAeroTaxiPRegistrarse2.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxiPRegistrarse2.setForeground(new Color(0, 153, 204));

        labelAeroTaxiPRegistrarse2.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        labelAeroTaxiPRegistrarse2.setHorizontalAlignment(SwingConstants.CENTER);
        labelAeroTaxiPRegistrarse2.setText("A E R O T A X I  ");
        labelAeroTaxiPRegistrarse2.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxiPRegistrarse2Layout = new GroupLayout(panelAeroTaxiPRegistrarse2);
        panelAeroTaxiPRegistrarse2.setLayout(PanelAeroTaxiPRegistrarse2Layout);
        PanelAeroTaxiPRegistrarse2Layout.setHorizontalGroup(
                PanelAeroTaxiPRegistrarse2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelAeroTaxiPRegistrarse2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAeroTaxiPRegistrarse2Layout.setVerticalGroup(
                PanelAeroTaxiPRegistrarse2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAeroTaxiPRegistrarse2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelAeroTaxiPRegistrarse2)
                                .addContainerGap(13, Short.MAX_VALUE))
        );





        tablaListaUsuariosPlistaUsuarios.setFont(new Font("Verdana", 1, 14)); // NOI18N
        tablaListaUsuariosPlistaUsuarios.setModel(new DefaultTableModel(
                new Object [][] {



                },
                new String [] {
                        "Nombre", "Apellido", "DNI", "Edad", "Mejor Avion", "Costo Total"
                }
        ) {
            Class[] types = new Class [] {
                    String.class, String.class, Integer.class, Integer.class, String.class, Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });


        ///LINEA DE CODIGO PARA QUE NO SE PUEDA EDITAR LA TABLA CUANDO APARECE POR PANTALLA
        tablaListaUsuariosPlistaUsuarios.enableInputMethods(false);

        jScrollPane1.setViewportView(tablaListaUsuariosPlistaUsuarios);

        GroupLayout PListaUsuariosLayout = new GroupLayout(pListaUsuarios.getContentPane());
        pListaUsuarios.getContentPane().setLayout(PListaUsuariosLayout);
        PListaUsuariosLayout.setHorizontalGroup(
                PListaUsuariosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelAeroTaxiPRegistrarse2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PListaUsuariosLayout.createSequentialGroup()
                                .addGroup(PListaUsuariosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelBotonesPRegistrarse2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        PListaUsuariosLayout.setVerticalGroup(
                PListaUsuariosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PListaUsuariosLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxiPRegistrarse2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelBotonesPRegistrarse2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lAdminUsuariosPprincipal.setFont(new Font("Vivaldi", 1, 24)); // NOI18N
        lAdminUsuariosPprincipal.setHorizontalAlignment(SwingConstants.CENTER);
        lAdminUsuariosPprincipal.setText("Administrar Vuelos De  Usuario  ");

        panelBotonesPantallaPrincipal1.setBackground(new Color(0, 153, 255));
        panelBotonesPantallaPrincipal1.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelBotonesPantallaPrincipal1.setForeground(new Color(0, 153, 153));

        GroupLayout PanelBotonesPantallaPrincipal1Layout = new GroupLayout(panelBotonesPantallaPrincipal1);
        panelBotonesPantallaPrincipal1.setLayout(PanelBotonesPantallaPrincipal1Layout);
        PanelBotonesPantallaPrincipal1Layout.setHorizontalGroup(
                PanelBotonesPantallaPrincipal1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 490, Short.MAX_VALUE)
        );
        PanelBotonesPantallaPrincipal1Layout.setVerticalGroup(
                PanelBotonesPantallaPrincipal1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 58, Short.MAX_VALUE)
        );

        panelAeroTaxiPantallaPrincipal1.setBackground(new Color(51, 153, 255));
        panelAeroTaxiPantallaPrincipal1.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxiPantallaPrincipal1.setForeground(new Color(0, 153, 204));

        labelAeroTaxiPPrincipal1.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        labelAeroTaxiPPrincipal1.setHorizontalAlignment(SwingConstants.CENTER);
        labelAeroTaxiPPrincipal1.setText("A E R O T A X I   ");
        labelAeroTaxiPPrincipal1.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxiPantallaPrincipal1Layout = new GroupLayout(panelAeroTaxiPantallaPrincipal1);
        panelAeroTaxiPantallaPrincipal1.setLayout(PanelAeroTaxiPantallaPrincipal1Layout);
        PanelAeroTaxiPantallaPrincipal1Layout.setHorizontalGroup(
                PanelAeroTaxiPantallaPrincipal1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(labelAeroTaxiPPrincipal1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        PanelAeroTaxiPantallaPrincipal1Layout.setVerticalGroup(
                PanelAeroTaxiPantallaPrincipal1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAeroTaxiPantallaPrincipal1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelAeroTaxiPPrincipal1)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        lVerListasPprincipal.setFont(new Font("Vivaldi", 1, 24)); // NOI18N
        lVerListasPprincipal.setHorizontalAlignment(SwingConstants.CENTER);
        lVerListasPprincipal.setText("Ver Listas De Vuelos y Usuarios   ");

        bUsuariosPprincipal.setFont(new Font("Vivaldi", 1, 24)); // NOI18N
        bUsuariosPprincipal.setText("Usuarios");
        bUsuariosPprincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bUsuariosPP(evt);
            }
        });

        bListasPPrincipal.setFont(new Font("Vivaldi", 1, 24)); // NOI18N
        bListasPPrincipal.setText("Listas");
        bListasPPrincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bListasPP(evt);
            }
        });

        GroupLayout PantallaPrincipalLayout = new GroupLayout(pantallaPrincipal.getContentPane());
        pantallaPrincipal.getContentPane().setLayout(PantallaPrincipalLayout);
        PantallaPrincipalLayout.setHorizontalGroup(
                PantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBotonesPantallaPrincipal1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAeroTaxiPantallaPrincipal1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PantallaPrincipalLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(PantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(PantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lVerListasPprincipal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lAdminUsuariosPprincipal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(bListasPPrincipal, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bUsuariosPprincipal, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PantallaPrincipalLayout.setVerticalGroup(
                PantallaPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PantallaPrincipalLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxiPantallaPrincipal1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(lAdminUsuariosPprincipal)
                                .addGap(18, 18, 18)
                                .addComponent(bUsuariosPprincipal, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(lVerListasPprincipal)
                                .addGap(18, 18, 18)
                                .addComponent(bListasPPrincipal, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(panelBotonesPantallaPrincipal1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        panelAeroTaxi4.setBackground(new Color(51, 153, 255));
        panelAeroTaxi4.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxi4.setForeground(new Color(0, 153, 204));

        aeroTaxi4.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        aeroTaxi4.setHorizontalAlignment(SwingConstants.CENTER);
        aeroTaxi4.setText("A E R O T A X I ");
        aeroTaxi4.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxi4Layout = new GroupLayout(panelAeroTaxi4);
        panelAeroTaxi4.setLayout(PanelAeroTaxi4Layout);
        PanelAeroTaxi4Layout.setHorizontalGroup(
                PanelAeroTaxi4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(aeroTaxi4, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        PanelAeroTaxi4Layout.setVerticalGroup(
                PanelAeroTaxi4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelAeroTaxi4Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aeroTaxi4)
                                .addContainerGap())
        );

        panelComenzar4.setBackground(new Color(0, 153, 255));
        panelComenzar4.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelComenzar4.setForeground(new Color(0, 153, 153));

        bAtrasPlistaVuelosMostrados.setFont(new Font("Vivaldi", 1, 18)); // NOI18N
        bAtrasPlistaVuelosMostrados.setText("Atras");
        bAtrasPlistaVuelosMostrados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bAtrasPMLV(evt);
            }
        });

        GroupLayout PanelComenzar4Layout = new GroupLayout(panelComenzar4);
        panelComenzar4.setLayout(PanelComenzar4Layout);
        PanelComenzar4Layout.setHorizontalGroup(
                PanelComenzar4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelComenzar4Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bAtrasPlistaVuelosMostrados)
                                .addGap(206, 206, 206))
        );
        PanelComenzar4Layout.setVerticalGroup(
                PanelComenzar4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelComenzar4Layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addComponent(bAtrasPlistaVuelosMostrados)
                                .addContainerGap())
        );

        tablaMostrarVuelos.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Nombre(Usuario)", "Apellido", "Avion", "Origen", "Destino", "Pasajeros", "Costo", "Km"
                }
        ));


        ///No editar Tabla
        tablaMostrarVuelos.enableInputMethods(false);

        jScrollPane3.setViewportView(tablaMostrarVuelos);

        GroupLayout PListaVuelosMostradosLayout = new GroupLayout(pListaVuelosMostrados.getContentPane());
        pListaVuelosMostrados.getContentPane().setLayout(PListaVuelosMostradosLayout);
        PListaVuelosMostradosLayout.setHorizontalGroup(
                PListaVuelosMostradosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelComenzar4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelAeroTaxi4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PListaVuelosMostradosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3)
                                .addContainerGap())
        );
        PListaVuelosMostradosLayout.setVerticalGroup(
                PListaVuelosMostradosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PListaVuelosMostradosLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxi4, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelComenzar4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        panelBienvenidos.setBackground(new Color(255, 255, 204));
        panelBienvenidos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 153)));
        panelBienvenidos.setForeground(new Color(0, 153, 255));

        confortExcelencia.setFont(new Font("Vladimir Script", 1, 36)); // NOI18N
        confortExcelencia.setHorizontalAlignment(SwingConstants.CENTER);
        confortExcelencia.setText(" Confort y Excelencia");
        confortExcelencia.setToolTipText("");

        bienvenidos.setFont(new Font("Vivaldi", 1, 48)); // NOI18N
        bienvenidos.setHorizontalAlignment(SwingConstants.CENTER);
        bienvenidos.setText("Bienvenidos");
        bienvenidos.setHorizontalTextPosition(SwingConstants.CENTER);

        panelAeroTaxi.setBackground(new Color(51, 153, 255));
        panelAeroTaxi.setBorder(new LineBorder(new Color(0, 153, 255), 4, true));
        panelAeroTaxi.setForeground(new Color(0, 153, 204));

        aeroTaxi.setFont(new Font("Vivaldi", 3, 36)); // NOI18N
        aeroTaxi.setHorizontalAlignment(SwingConstants.CENTER);
        aeroTaxi.setText("A E R O T A X I ");
        aeroTaxi.setHorizontalTextPosition(SwingConstants.CENTER);

        GroupLayout PanelAeroTaxiLayout = new GroupLayout(panelAeroTaxi);
        panelAeroTaxi.setLayout(PanelAeroTaxiLayout);
        PanelAeroTaxiLayout.setHorizontalGroup(
                PanelAeroTaxiLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(aeroTaxi, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        PanelAeroTaxiLayout.setVerticalGroup(
                PanelAeroTaxiLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAeroTaxiLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(aeroTaxi)
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        panelComenzar.setBackground(new Color(0, 153, 255));
        panelComenzar.setBorder(BorderFactory.createLineBorder(new Color(51, 153, 255), 4));
        panelComenzar.setForeground(new Color(0, 153, 153));

        botonComenzar.setBackground(new Color(255, 255, 204));
        botonComenzar.setFont(new Font("Vladimir Script", 1, 36)); // NOI18N
        botonComenzar.setText("Comenzar");
        botonComenzar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bComenzarPI(evt);
            }
        });

        GroupLayout PanelComenzarLayout = new GroupLayout(panelComenzar);
        panelComenzar.setLayout(PanelComenzarLayout);
        PanelComenzarLayout.setHorizontalGroup(
                PanelComenzarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, PanelComenzarLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonComenzar, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
        );
        PanelComenzarLayout.setVerticalGroup(
                PanelComenzarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelComenzarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botonComenzar, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout PanelBienvenidosLayout = new GroupLayout(panelBienvenidos);
        panelBienvenidos.setLayout(PanelBienvenidosLayout);
        PanelBienvenidosLayout.setHorizontalGroup(
                PanelBienvenidosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelAeroTaxi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelComenzar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelBienvenidosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelBienvenidosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bienvenidos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(confortExcelencia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        PanelBienvenidosLayout.setVerticalGroup(
                PanelBienvenidosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBienvenidosLayout.createSequentialGroup()
                                .addComponent(panelAeroTaxi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(confortExcelencia)
                                .addGap(74, 74, 74)
                                .addComponent(bienvenidos, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(panelComenzar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBienvenidos, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panelBienvenidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    ////////////////////////////////////////////////////BOTONES POR PANTALLA///////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////PANTALLA INICIO (PI)//////////////////////////////////////////////////////////////////////

    private void bComenzarPI(java.awt.event.ActionEvent evt) {

        JFrame VentanaPPrincipal = pantallaPrincipal;
        dispose();///Para que no se vea la pantalla comenzar

        ////TAMAÑO Y NOMBRE DE LA VENTANA////////////////
        VentanaPPrincipal.setSize(560,660);
        VentanaPPrincipal.setTitle("Pantalla Principal");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        VentanaPPrincipal.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ////PARA QUE LA VENTANA SEA VISIBLE
        VentanaPPrincipal.setVisible(true);

        ///CARGO TODOS LOS ARCHIVOS////

        listaAviones = archivo.LeoUnArchivoAvion();


        listaDatosVuelo = archivo.leoUnArchivoDatosVuelo();

        if(listaDatosVuelo == null){
            listaDatosVuelo = new ArrayList<>();
        }

        listaUsuarios = archivo.leoUnArchivoUsuario();

    }

    //////////////////////////////////////////////////////PANTALLA PRINCIPAL (PP)/////////////////////////////////////////////////////////////////

    private void bUsuariosPP(ActionEvent evt) {

        ////SE DEJA DE MOSTRAR LA PANTALLA PRINCIPAL Y SE MUESTRA RESERVAR CANCELAR VUELOS
        JFrame ventanapprincipal = pantallaPrincipal;
        JFrame ventanaIngreseDNI = pIngresarDNI;

        ventanapprincipal.setVisible(false);
        ventanaIngreseDNI.setSize(560,660);
        ventanaIngreseDNI.setTitle("Ingresar Usuario");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaIngreseDNI.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaIngreseDNI.setVisible(true);
    }

    private void bListasPP(java.awt.event.ActionEvent evt) {
        JFrame ventanaPPrincipal = pantallaPrincipal;
        JFrame  ventanaListas= pListas;

        ventanaPPrincipal.setVisible(false);
        ventanaListas.setSize(560,660);
        ventanaListas.setTitle("Listas");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaListas.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaListas.setVisible(true);


    }

    //////////////////////////////////////////////////////////PANTALLA USUARIOS (PU)//////////////////////////////////////////////////////////////////////////////////

    private void bContinuarPU(java.awt.event.ActionEvent evt) {
        JFrame ventanaReservarCancelarVuelo = preservarcancelarvuelo;
        JFrame ventanaIngesarDNI = pIngresarDNI;

        ///Variable que guarda el DNI del usuario ingresado por pantalla
        int DNIIngresadoPantalla=0;
        String DNIPantalla;

        ///Se convierte en true si el DNI coincide con algun usuario de la lista
        boolean usuarioEncontrado = false;

        ///Al ingresar por pantalla entra un sTring hay q setearlo pues DNI de usuario es un int
        DNIPantalla= tIngresarDNIUsuarioText.getText();

        ///Validar DNI

        if(DNIPantalla.length()==0){

            JOptionPane.showMessageDialog(null,"Debe ingresar DNI");
        }
        else{

            DNIIngresadoPantalla= Integer.parseInt(DNIPantalla);

            ///Verifico que el usuario esté en la lista de registro
            ///Recorro la lista de usuarios buscando el que se ingreso por teclado

            for (Usuario usuarioListado: listaUsuarios) {

                ///Comparo DNI
                if (DNIIngresadoPantalla == usuarioListado.getDni()) {
                    //Si lo encuentra
                    usuarioEncontrado = true;
                    ///Para poder utilizar el usuario que ingreso con todos sus datos
                    usuario = usuarioListado;
                }

            }

            ///Si no lo encontro le pido que ingrese un DNI valido

            if (!usuarioEncontrado) {
                JOptionPane.showMessageDialog(null, "Dni incorrecto");

                ///Vuelve a la ventana DNI
                ventanaIngesarDNI.setVisible(true);
                ventanaIngesarDNI.setSize(560, 660);
                ventanaIngesarDNI.setTitle("Ingrese DNI");

                //este metodo devuelve el tamaño de la pantalla
                Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

                //para centrar la ventana lo hacemos con el siguiente calculo
                ventanaIngesarDNI.setLocation((pantalla.width) / 4, (pantalla.height) / 16);

            }
            else {
                ///Para que en la Pantalla Reservar Cancelar Vuelo aparzca el nombre del usuario
                lNombrePreservarCancelarVuelo.setText(usuario.getNombre());
                ventanaIngesarDNI.setVisible(false);
                ventanaReservarCancelarVuelo.setSize(560, 660);
                ventanaReservarCancelarVuelo.setTitle("Reservar o Cancelar");

                //este metodo devuelve el tamaño de la pantalla
                Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

                //para centrar la ventana lo hacemos con el siguiente calculo
                ventanaReservarCancelarVuelo.setLocation((pantalla.width) / 4, (pantalla.height) / 16);

                ventanaReservarCancelarVuelo.setVisible(true);


            }
        }

    }

    private void bAtrasPU (java.awt.event.ActionEvent evt) {

        JFrame ventanaPantallaPrincipal = pantallaPrincipal;
        JFrame ventanaPingresarDNI = pIngresarDNI;

        ventanaPingresarDNI.setVisible(false);
        ventanaPantallaPrincipal.setSize(560, 660);
        ventanaPantallaPrincipal.setTitle("Pantalla Principal");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaPantallaPrincipal.setLocation((pantalla.width) / 4, (pantalla.height) / 16);

        ventanaPantallaPrincipal.setVisible(true);
    }

    /////////////////////////////////////////////PANTALLA RESERVAR O CANCELAR (PRC)///////////////////////////////////////////////////////////////

    private void bReservarVueloPRC(java.awt.event.ActionEvent evt) {
        
        JFrame ventanaReservarVuelo = pReservarVuelo;
        JFrame ventanaReservarCancelarVuelo = preservarcancelarvuelo;

        ventanaReservarCancelarVuelo.setVisible(false);
        ventanaReservarVuelo.setSize(560,660);
        ventanaReservarVuelo.setTitle("Reservar Vuelo");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaReservarVuelo.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaReservarVuelo.setVisible(true);
    }

    private void bCancelarVueloPRC(java.awt.event.ActionEvent evt) {
        
        JFrame ventanaReservarCancelarVuelo = preservarcancelarvuelo;
        JFrame ventanaCancelarVuelo = pCancelarVuelo;

        ventanaReservarCancelarVuelo.setVisible(false);
        ventanaCancelarVuelo.setSize(560,660);
        ventanaCancelarVuelo.setTitle("Cancelar Vuelo");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaCancelarVuelo.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaCancelarVuelo.setVisible(true);
    }

    private void bAtrasPRC(java.awt.event.ActionEvent evt) {
        
        JFrame ventanaIngresarDNI = pIngresarDNI;
        
        JFrame ventanaReservarCancelarVuelo = preservarcancelarvuelo;

        ventanaReservarCancelarVuelo.setVisible(false);
        ventanaIngresarDNI.setSize(560,660);
        ventanaIngresarDNI.setTitle("Ingrese DNI");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaIngresarDNI.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaIngresarDNI.setVisible(true);
    }

    /////////////////////////////////////////PANTALLA CANCELAR VUELO (PCV)///////////////////////////////////////////////////////////////////////////////

    private void bCancelarVueloPCV(java.awt.event.ActionEvent evt) {

        JFrame ventanaReservarCancelarVuelo = preservarcancelarvuelo;

        JFrame ventanaCancelarVuelo = pCancelarVuelo;

        ///Booleno que ve si se borro la fecha
        boolean fechaBorrada= false;
        ///Guardo el dato de la listaDatosVuelo que coincida con la fecha y usuario a borrar y lo guardo

        DatosVuelo datoABorrar = null;

        ///Guardo la fecha de hoy
        java.util.Date fecha = new Date();

        ///Guardo la Fecha ingresada por pantalla para cancelar

        Date fechaCancelar = (Date)bFechaPcancelarVuelo.getValue();

        ///Comparo que la fecha a cancelar no sea la de hoy ni de dias pasados
        ///Si la fecha a cancelar  o igual a la fecha de hoy

        ArrayList<DatosVuelo> listaModificada= new ArrayList<>();

        if(fecha.hashCode()>=fechaCancelar.hashCode()){

            JOptionPane.showMessageDialog(null,"No se puede Cancelar un vuelo con menos de 24hs de anticipación o la fecha ingresada ya pasó"); }
        else {
            ///Si se ingresa una fecha que ya paso
            if (fecha.hashCode() > fechaCancelar.hashCode()) {

                JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida, Ya pasó");
            }
            ///Si la fecha es mayor a la de hoy se puede cancelar el vuelo
            else {
                if (listaDatosVuelo != null) {

                    for (DatosVuelo dato : listaDatosVuelo) {

                        if ((fechaCancelar.equals(dato.getFecha())) && (usuario.equals(dato.getUsuario()))) {

                            datoABorrar = dato;

                            fechaBorrada=true;
                        }

                    }

                    if(!fechaBorrada){
                        JOptionPane.showMessageDialog(null, "No es posible cancelar el vuelo pues no hay vuelos reservados en esa fecha");
                    }
                }
                else{
                        JOptionPane.showMessageDialog(null, "No es posible cancelar el vuelo pues la lista de vuelos es null");
                    }

            }
        }

        if(datoABorrar!=null){

            JOptionPane.showMessageDialog(null,"La Fecha Fue Cancelada Con Éxito");

            listaDatosVuelo.remove(datoABorrar);

            archivo.guardarListaVuelos(listaDatosVuelo);

        }
        ventanaCancelarVuelo.setVisible(false);
        ventanaReservarCancelarVuelo.setSize(560,660);
        ventanaReservarCancelarVuelo.setTitle("Reservar o Cancelar Vuelo");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaReservarCancelarVuelo.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaReservarCancelarVuelo.setVisible(true);
    }

    private void bAtrasPCV (java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFrame ventanaCancelarVuelo = pCancelarVuelo;
        JFrame ventanaReservarCancelarVuelo = preservarcancelarvuelo;

        ventanaReservarCancelarVuelo.setVisible(true);
        ventanaReservarCancelarVuelo.setSize(560,660);
        ventanaReservarCancelarVuelo.setTitle("Reserva o Cancela vuelo");
        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaReservarCancelarVuelo.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaCancelarVuelo.setVisible(false);
    }

    //////////////////////////////////////////////PANTALLA RESERVAR VUELO (PRV)///////////////////////////////////////////////////////////////////////////////

    private void bConfirmarPRV (java.awt.event.ActionEvent evt) {


        JFrame ventanaReservarVuelo = pReservarVuelo;
        JFrame ventanaPantallaPrincipal = pantallaPrincipal;

        ///Guardo el nuevo Dato
       /// DatosVuelo nuevoDatoVuelo= new DatosVuelo(usuario,fechaElegida,origen,destino,nroAcompañantes,nuevoAvion);


        if (nuevoDato!=null){

            ///Guardo el nuevo dato a la lista de datos vuelo

            ///Primero agrego el nuevo dato a la lista
            listaDatosVuelo.add(nuevoDato);

            ///Luego guardo la lista en el archivo
            archivo.guardarListaVuelos(listaDatosVuelo);

            JOptionPane.showMessageDialog(null,"Vuelo Reservado con éxito");
        }

        else
        {
            JOptionPane.showMessageDialog(null,"No se Ha podido reservar el vuelo");
        }
        ventanaPantallaPrincipal.setVisible(true);
        ventanaPantallaPrincipal.setSize(560,660);
        ventanaPantallaPrincipal.setTitle("Pantalla Principal");
        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaPantallaPrincipal.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaReservarVuelo.setVisible(false);

        borrarComponentes();

    }

    private void bAtrasPRV (java.awt.event.ActionEvent evt) {

        JFrame ventanaReservarCancelarVuelo = preservarcancelarvuelo;
        JFrame ventanaReservarVuelo = pReservarVuelo;

        ventanaReservarVuelo.setVisible(false);
        ventanaReservarCancelarVuelo.setSize(560,660);
        ventanaReservarCancelarVuelo.setTitle("Reservar o Cancelar Vuelo");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaReservarCancelarVuelo.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaReservarCancelarVuelo.setVisible(true);

    }

    private void bOrigenPRV (ActionEvent evt) {


        ///Guardo el indice de la ciudad elegida, lo uso debajo para tomar el valor de la ciudad elegida de la lista
        indiceListaOrigen= bOrigenPreservarVuelo.getSelectedIndex();

        ///Guardo el origen elegido
        origen = bOrigenPreservarVuelo.getItemAt(indiceListaOrigen);


        if(indiceListaOrigen==0) {


            bDestinoPreservarVuelo.setModel(new DefaultComboBoxModel<Ciudad>(new Ciudad[]{SANTIAGO, MONTEVIDEO,CORDOBA}));


        }
        else{
            if (indiceListaOrigen == 1) {

                bDestinoPreservarVuelo.setModel(new DefaultComboBoxModel<Ciudad>(new Ciudad[]{BUENOS_AIRES,SANTIAGO, MONTEVIDEO}));

            } else {

                if (indiceListaOrigen == 2) {

                    bDestinoPreservarVuelo.setModel(new DefaultComboBoxModel<Ciudad>(new Ciudad[]{BUENOS_AIRES,CORDOBA,SANTIAGO}));


                }

                else {

                    if(indiceListaOrigen == 3){

                        bDestinoPreservarVuelo.setModel(new DefaultComboBoxModel<Ciudad>(new Ciudad[]{BUENOS_AIRES,CORDOBA,MONTEVIDEO}));
                    }
                }
            }
        }

    }
    private void bVerAvionesPRV(ActionEvent evt) {

        ///Guardo el indice de la ciudad elegida
        indiceListaDestino= bDestinoPreservarVuelo.getSelectedIndex();

        ///Guardo el destino elegido
        destino=  bDestinoPreservarVuelo.getItemAt(indiceListaDestino);

        ///Fecha actual para ver si no se ingresa una fecha q ya paso
        java.util.Date fecha = new Date();

        ///Esto esta por si apreta el boton varias veces para que no se repitan los aviones
        avionesDisponibles= new ArrayList<>();

        ///Gurado la fecha ingresada por pantalla
        fechaElegida= (Date) bElegirFechaPreservarVuelo.getValue();

        ///Verifico si el usuario pidio un avion para ese dia
        boolean fechaOcupadaPorUsuario=false;

        ///Guardo el numero acompañantes igresada por pantalla
        nroAcompanantes =(int) bCantidadAcompañantesPreservarVuelo.getValue();

        nroAcompanantes++;///Para agregar al usuario en la cantidad maxima de pasajeros

        ///Si la fecha que ingreso es anterior a la fecha de hoy sale un mensaje diciendo el error
        if(fechaElegida.hashCode()>=fecha.hashCode()){


            ///Guardo los nombres de los aviones en lista disponible
            for (Avion avion : listaAviones) {

                avionesDisponibles.add(avion.getIdentificador());
            }


            ///Si la lista no esta vacia, hay reservas
            if(listaDatosVuelo !=null){

                ///Me fijo si el usuario ya reservo un avion para esa fecha
                for (DatosVuelo datosVuelo : listaDatosVuelo){

                    ///Me fijo si el usuario ya reservo un avion ese dia

                    if(datosVuelo.getFecha().equals(fechaElegida)) {

                        if (datosVuelo.getUsuario().equals(usuario) ) {
                            JOptionPane.showMessageDialog(null, "El usuario ya tiene reservado un avion para esa fecha, No es posible reservar otro");
                            ///Cambio el booleana true
                            fechaOcupadaPorUsuario=true;
                            ///Vacio la lista de aviones para mostrar
                            avionesDisponibles.clear();
                        }
                    }

                }

                if(!fechaOcupadaPorUsuario){

                    ///Me fijo si hay reservas de otros usuarios
                    for (DatosVuelo datosVuelos : listaDatosVuelo) {

                        if (fechaElegida.equals(datosVuelos.getFecha())) {
                            ///Borro de aviones disponibles ese nombre
                            avionesDisponibles.remove(datosVuelos.getAvion().getIdentificador());

                        }
                    }
                }


            }

            ///Si los aviones no se eliminaron todos porq ya habia pedido la fecha o la fecha estaba reservada
            if(avionesDisponibles!=null){

                for(Avion avion :listaAviones){

                    ///Verifica los aviones disponibles para la cantidad solicitada de acompañantes
                    if(nroAcompanantes >avion.getMaxPasajeros()){

                        ///Descarto el avion si no me alcanza la capaciddad de maxima de pasajeros

                        avionesDisponibles.remove(avion.getIdentificador());

                    }
                }
            }

            if(avionesDisponibles.size() == 0 && !fechaOcupadaPorUsuario){
                JOptionPane.showMessageDialog(null,"No hay aviones disponibles para la fecha elegida");
            }else{
                textAreaAvionesDisponiblesPreservarVuelo.setText(avionesDisponibles.toString());
            }

        }
        else{
            ///no permite reservar vuelos para el mismo dia
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Ingrese una fecha posterior a la fecha de hoy");
        }

    }

    private void bCalcularCostoPRV (java.awt.event.ActionEvent evt) {


        ///Si el texto no coincide con ningun avion del String
        boolean ingresoTextoCorrecto=false;

        ///Recorre la lista de aviones disponibles para ver que el nombre ingresado coinsida con algun avion disponible
        for (String nombreAviones : avionesDisponibles){

            if((nombreAviones.equals(bEscribirAvionPreservarVuelo.getText()))){

                ingresoTextoCorrecto=true;

            }
        }

        ///Si se ingreso un nombre de avion valido
        if(ingresoTextoCorrecto){

            ///Recorre la lista de aviones para guardar el avion seleccionado
            for (Avion avion : listaAviones){

                if(avion.getIdentificador().equals(bEscribirAvionPreservarVuelo.getText())){

                    nuevoAvion =avion;
                }
            }

            ///Genera un datos vuelo para guardar en el archivo
            nuevoDato = new DatosVuelo(usuario,fechaElegida,origen,destino, nroAcompanantes,nuevoAvion);
            int kilometros=nuevoDato.calcularKms();
            nuevoDato.setKmsRuta(kilometros);
            int costo=nuevoDato.calcularCostoVuelo();
            nuevoDato.setCostoDeVuelo(costo);
            ///System.out.println("mostrar kilometros y costo"+kilometros, " ",+costo);

            ///Mustra el costo total por pantalla
            lCostoTotalPreservarVuelo.setText(String.valueOf(nuevoDato.calcularCostoVuelo()));


        }

        ///Si puso un nombre incorrecto o un avion que no estaba disponible
        else{

            JOptionPane.showMessageDialog(null,"Avion ingresado incorrecto");


        }


    }

    //////////////////////////////////////////////PANTALLA LISTAS (PL) //////////////////////////////////////////////////////////////////////////

    private void bListaVuelosPL(java.awt.event.ActionEvent evt) {

        JFrame ventanaListasvuelos = pListasVuelos;
        JFrame ventanaListas = pListas;

        ventanaListas.setVisible(false);
        ventanaListasvuelos.setSize(560,660);
        ventanaListasvuelos.setTitle("Lista Vuelos");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaListasvuelos.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaListasvuelos.setVisible(true);
    }

    private void bListaUsuariosPL (java.awt.event.ActionEvent evt) {

        JFrame ventanaListaUsuario = pListaUsuarios;
        JFrame ventanaLista = pListas;

        ventanaLista.setVisible(false);
        ventanaListaUsuario.setSize(560,660);
        ventanaListaUsuario.setTitle("Lista Usuarios");


        DefaultTableModel model = (DefaultTableModel) tablaListaUsuariosPlistaUsuarios.getModel();

        ///Para borrar las listas
        while(model.getRowCount()>=1)
            {
            model.removeRow(0);
            }
        for (Usuario usuario : listaUsuarios) {


            listadeVuelosConfirmados=archivo.listarVuelosDeUsuario(usuario, listaDatosVuelo);
            model.addRow(new Object[]{usuario.getNombre(),usuario.getApellido(),usuario.getDni(), usuario.getEdad(), usuario.mejorAvion(listadeVuelosConfirmados),usuario.costoTotalDeVuelos(listadeVuelosConfirmados)});

        }

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaListaUsuario.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaListaUsuario.setVisible(true);
    }


    private void bAtrasPL(java.awt.event.ActionEvent evt) {

        JFrame ventanaPantallaPrincipal = pantallaPrincipal;
        JFrame ventanaListas = pListas;

        ventanaListas.setVisible(false);
        ventanaPantallaPrincipal.setSize(560,660);
        ventanaPantallaPrincipal.setTitle("Pantalla Principal");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaPantallaPrincipal.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaPantallaPrincipal.setVisible(true);

    }

///////////////////////////////////PANTALLA LISTA USUARIOS (PLU)/////////////////////////////////////////////////////////////////////

    private void bAtrasPLU(java.awt.event.ActionEvent evt) {

        JFrame jFrame11 = pListas;
        JFrame jFrame22 = pListaUsuarios;

        jFrame22.setVisible(false);
        jFrame11.setSize(560,660);
        jFrame11.setTitle("Listas");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        jFrame11.setLocation((pantalla.width )/4, (pantalla.height )/16);

        jFrame11.setVisible(true);
    }

    ////////////////////////////////////PANTALLA LISTAS VUELOS (PLV)///////////////////////////////////////////////////////////////////////////////////

    private void bListaVuelosPLV (java.awt.event.ActionEvent evt) {

        ///Guardo la fecha ingresada
        Date fechaIngresadaPantalla = (Date)bFechaPlistaVuelos.getValue();

        JFrame ventanaListasVuelosMostrados = pListaVuelosMostrados;
        JFrame ventanaListas = pListas;

        ventanaListas.setVisible(false);
        ventanaListasVuelosMostrados.setSize(560,660);
        ventanaListasVuelosMostrados.setTitle("Lista Vuelos");


        DefaultTableModel model = (DefaultTableModel) tablaMostrarVuelos.getModel();

        ///Para borrar las listas
        while(model.getRowCount()>=1)
        {
            model.removeRow(0);
        }

        listaDatosVuelo = archivo.leoUnArchivoDatosVuelo();
//        muestro la lista de  DatoVuelos para fecha ingresada por pantalla
        if(listaDatosVuelo !=null) {
            for (DatosVuelo dato : listaDatosVuelo) {

                if (fechaIngresadaPantalla.equals(dato.getFecha())) {

                    ///Carga la tabla
                    model.addRow(new Object[]{dato.getUsuario().getNombre(), dato.getUsuario().getApellido(), dato.getAvion().getIdentificador(), dato.getOrigen(), dato.getDestino(), dato.getCantidadPasajeros(), dato.getCostoDeVuelo(), dato.getKmsRuta()});

                }

            }
        }

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaListasVuelosMostrados.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaListasVuelosMostrados.setVisible(true);
    }

    private void bAtrasPLV(java.awt.event.ActionEvent evt) {
        JFrame ventanaListas = pListas;
        JFrame ventanaListasVuelos = pListasVuelos;

        ventanaListasVuelos.setVisible(false);
        ventanaListas.setSize(560,660);
        ventanaListas.setTitle("Listas");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaListas.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaListas.setVisible(true);
    }

////////////////////////////////////////PANTALLA MOSTRAR LISTA VUELOS (PMLV)//////////////////////////////////////////////////////////////////////////////
    private void bAtrasPMLV(java.awt.event.ActionEvent evt) {
        JFrame ventanaListaVuelosMostrados = pListaVuelosMostrados;
        JFrame ventanaListaVuelos = pListasVuelos;
        
        ventanaListaVuelosMostrados.setVisible(false);
        ventanaListaVuelos.setSize(560,660);
        ventanaListaVuelos.setTitle("Ingresar Usuario");

        //este metodo devuelve el tamaño de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        //para centrar la ventana lo hacemos con el siguiente calculo
        ventanaListaVuelos.setLocation((pantalla.width )/4, (pantalla.height )/16);

        ventanaListaVuelos.setVisible(true);

    }


    //////////////////////////////////////FUNCION PARA BORRAR LOS DATOS UNA VEZ QUE SE CONFIRMO EL VUELO EN RESERVAR VUELO/////////////////////////////
    private void borrarComponentes(){

        java.util.Date fecha = new Date();

        bOrigenPreservarVuelo.setSelectedIndex(-1);
        bDestinoPreservarVuelo.setSelectedIndex(-1);
        bElegirFechaPreservarVuelo.setValue(fecha);
        bCantidadAcompañantesPreservarVuelo.setValue(0);
        textAreaAvionesDisponiblesPreservarVuelo.setText("");
        bEscribirAvionPreservarVuelo.setText("");
        lCostoTotalPreservarVuelo.setText("$");



    }
/////////////////////////////////////CODIGO QUE VALIDA QUE SE INGRESEN SOLO NUMEROS EN EL DNI DEL USUARIO///////////////////////////////////////

    private void TIngresarDNIUsuarioKeyTyped(java.awt.event.KeyEvent evt) {
        ///Para no permitir ingresar letras NI CARACTERES NI EL ESPACIO EN BLANCO
        char validar = evt.getKeyChar();


        if (!Character.isDigit(validar) || validar == '.' || validar == ',') {

            getToolkit().beep();
            evt.consume();

        }

    }


}

