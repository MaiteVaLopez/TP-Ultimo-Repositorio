package com.company;

import com.company.InterfazGrafica.Ventana;
import com.company.Modelado_clases.*;
import com.company.Persistencia.DatosVuelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static com.company.Modelado_clases.Ciudad.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        Usuario user = new Usuario("Pedro", "Perez", 1234, 21);
        Date fecha = new Date();
        Avion bronce = new Bronze("avion1", 300, 100, 20, 500, Propulsion.A_REACCION);

        DatosVuelo datos = new DatosVuelo (user, fecha, MONTEVIDEO, BUENOS_AIRES, 2, bronce);

        int kms = datos.calcularKms();
        datos.setKmsRuta(kms);

        System.out.println(datos.getKmsRuta());

        ///Probando clases Usuario y DatosVuelo

        Date fecha=null;

        List<DatosVuelo>listado=new ArrayList<DatosVuelo>();

        DatosVuelo vuelo= new DatosVuelo(fecha,"asia","argentina",2,avion,1500);

        listado.add(vuelo);
        Usuario usuario=new Usuario("aye","marinoni",1,26,listado);

         System.out.println(usuario.toString());*/



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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>*/

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });

        /*
                Scanner scan=new Scanner(System.in);
                String  fechaIngresada=scan.nextLine();
                SimpleDateFormat formatoFecha=new Simple("aaaa/mm/dd");
*/
    }
}




