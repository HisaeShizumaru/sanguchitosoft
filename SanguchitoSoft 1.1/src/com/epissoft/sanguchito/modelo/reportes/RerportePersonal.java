/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epissoft.sanguchito.modelo.reportes;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author gigo
 */
public class RerportePersonal {
    Calendar calendario = Calendar.getInstance();
      String _dia=Integer.toString(calendario.get(Calendar.DATE));
      String _mes=Integer.toString(calendario.get(Calendar.MONTH));
      String _anio=Integer.toString(calendario.get(Calendar.YEAR));
      String _hora="_"+Integer.toString(calendario.get(Calendar.HOUR))+"_"+Integer.toString(calendario.get(Calendar.MINUTE))+"_"+Integer.toString(calendario.get(Calendar.SECOND));
      String fec=_anio+"-"+_mes+"-"+_dia+"-"+_hora;
    public void reportpersonal(String concepto_,String autor_,String nombre,String anio_,String mes_, String dia_,String tipo){
         // TODO code application logic here
        try {
          Class.forName("org.postgresql.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:postgresql://hard-plum.db.elephantsql.com:5432/hqwzxyfi", "hqwzxyfi", "MGnLXRQtfoVG_weLGP1iUAgCJO2j4Cp8");
        String ruta="Reporteasistencia.jasper";
       if( "1".equals(tipo))
        {
        ruta="Reporteasistencia.jasper";
        }
         if( "2".equals(tipo))
        {
        ruta="Reporteasistencia(barrashorizontales).jasper";
        }
          if( "3".equals(tipo))
        {
        ruta="Reporteaistenciaperiodoproductotorta.jasper";
        }
        JasperReport reporte = (JasperReport) JRLoader.loadObject(ruta);

        Map<String, String> parametros = new HashMap<String, String>();
        parametros.put("Concepto", concepto_);
        parametros.put("Autor", autor_);
        parametros.put("nombre", nombre);
        parametros.put("anio",anio_);
        parametros.put("mes", mes_);
        parametros.put("dia", dia_);
       
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, conexion);
       

        JRExporter exporter = new JRPdfExporter();
        
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        JasperViewer.viewReport(jasperPrint,false);
         exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("C:/REPORTES_/reporte"+fec+".pdf"));
        
        exporter.exportReport();
  
        } catch (Exception e) { 
            System.out.print(e.getMessage());
        }
   }
    ///
    public void reportpersonalsemana(String concepto_,String autor_,String nombre,String anio_,String mes_,String dia_min,String dia_max,String tipo){
        // TODO code application logic here
        try {
        Class.forName("org.postgresql.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:postgresql://hard-plum.db.elephantsql.com:5432/hqwzxyfi", "hqwzxyfi", "MGnLXRQtfoVG_weLGP1iUAgCJO2j4Cp8");
        String ruta="Reportesemanaasistencia.jasper";
       if( "1".equals(tipo))
        {
        ruta="Reportesemanaasistencia.jasper";
        }
         if( "2".equals(tipo))
        {
        ruta="Reporteasistencia(barrashorizontales).jasper";
        }
          if( "3".equals(tipo))
        {
        ruta="Reporteaistenciaperiodoproductotorta.jasper";
        }
        JasperReport reporte = (JasperReport) JRLoader.loadObject(ruta);

        Map<String, String> parametros = new HashMap<String, String>();
        parametros.put("Concepto", concepto_);
        parametros.put("Autor", autor_);
        parametros.put("nombre", nombre);
        parametros.put("anio",anio_);
        parametros.put("mes", mes_);
        parametros.put("dia_min", dia_min);
        parametros.put("dia_max", dia_max);
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, conexion);
       

        JRExporter exporter = new JRPdfExporter();
        
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        JasperViewer.viewReport(jasperPrint,false);
         exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("C:/REPORTES_/reporte"+fec+".pdf"));
        
        exporter.exportReport();
  
        } catch (Exception e) { 
            System.out.print(e.getMessage());
        }
   }
     ///
    public void reportpersonalmes(String concepto_,String autor_,String nombre,String anio_,String mes_,String tipo){
        // TODO code application logic here
        try {
          Class.forName("org.postgresql.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:postgresql://hard-plum.db.elephantsql.com:5432/hqwzxyfi", "hqwzxyfi", "MGnLXRQtfoVG_weLGP1iUAgCJO2j4Cp8");
        String ruta="Reportemesasistencia.jasper";
       if( "1".equals(tipo))
        {
        ruta="Reportemesasistencia.jasper";
        }
         if( "2".equals(tipo))
        {
        ruta="Reporteasistencia(barrashorizontales).jasper";
        }
          if( "3".equals(tipo))
        {
        ruta="Reporteaistenciaperiodoproductotorta.jasper";
        }
        JasperReport reporte = (JasperReport) JRLoader.loadObject(ruta);

        Map<String, String> parametros = new HashMap<String, String>();
        parametros.put("Concepto", concepto_);
        parametros.put("Autor", autor_);
        parametros.put("nombre", nombre);
        parametros.put("anio",anio_);
        parametros.put("mes", mes_);
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, conexion);
       

        JRExporter exporter = new JRPdfExporter();
        
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        JasperViewer.viewReport(jasperPrint,false);
         exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("C:/REPORTES_/reporte"+fec+".pdf"));
        
        exporter.exportReport();
  
        } catch (Exception e) { 
            System.out.print(e.getMessage());
        }
   }
    
    /////////////
      ///
    public void reportpersonalanio(String concepto_,String autor_,String nombre,String anio_,String tipo){
        // TODO code application logic here
        try {
          Class.forName("org.postgresql.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:postgresql://hard-plum.db.elephantsql.com:5432/hqwzxyfi", "hqwzxyfi", "MGnLXRQtfoVG_weLGP1iUAgCJO2j4Cp8");
        String ruta="Reporteanioasistencia.jasper";
       if( "1".equals(tipo))
        {
        ruta="Reporteanioasistencia.jasper";
        }
         if( "2".equals(tipo))
        {
        ruta="Reporteasistencia(barrashorizontales).jasper";
        }
          if( "3".equals(tipo))
        {
        ruta="Reporteaistenciaperiodoproductotorta.jasper";
        }
        JasperReport reporte = (JasperReport) JRLoader.loadObject(ruta);

        Map<String, String> parametros = new HashMap<String, String>();
        parametros.put("Concepto", concepto_);
        parametros.put("Autor", autor_);
        parametros.put("nombre", nombre);
        parametros.put("anio",anio_);
      
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, conexion);
       

        JRExporter exporter = new JRPdfExporter();
        
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        JasperViewer.viewReport(jasperPrint,false);
         exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("C:/REPORTES_/reporte"+fec+".pdf"));
        
        exporter.exportReport();
  
        } catch (Exception e) { 
            System.out.print(e.getMessage());
        }
   }
    /////////////
      ///
    public void reportpersonalperiodo(String concepto_,String autor_,String nombre,String fecha_inicio,String fecha_fin,String tipo){
        // TODO code application logic here
        try {
          Class.forName("org.postgresql.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:postgresql://hard-plum.db.elephantsql.com:5432/hqwzxyfi", "hqwzxyfi", "MGnLXRQtfoVG_weLGP1iUAgCJO2j4Cp8");
        String ruta="Reporteperiodoasistencia.jasper";
       if( "1".equals(tipo))
        {
        ruta="Reporteperiodoasistencia.jasper";
        }
         if( "2".equals(tipo))
        {
        ruta="Reporteasistencia(barrashorizontales).jasper";
        }
          if( "3".equals(tipo))
        {
        ruta="Reporteaistenciaperiodoproductotorta.jasper";
        }
        JasperReport reporte = (JasperReport) JRLoader.loadObject(ruta);

        Map<String, String> parametros = new HashMap<String, String>();
        parametros.put("Concepto", concepto_);
        parametros.put("Autor", autor_);
        parametros.put("nombre", nombre);
        parametros.put("fecha_inicio",fecha_inicio);
        parametros.put("fecha_fin",fecha_fin);
      
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, conexion);
       

        JRExporter exporter = new JRPdfExporter();
        
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        JasperViewer.viewReport(jasperPrint,false);
         exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("C:/REPORTES_/reporte"+fec+".pdf"));
        
        exporter.exportReport();
  
        } catch (Exception e) { 
            System.out.print(e.getMessage());
        }
   }
}
