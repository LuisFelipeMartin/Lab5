package pkg2023.pkg2.informe.pkg05.csv;
import java.awt.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class Jfreechart extends javax.swing.JFrame
{
    String a = null;
    String[] as={"Regional","Nivel","Programa","Total","Estrato","Ano","Periodo"};
    int opc = 0,opc1;
    TableRowSorter trs;
    int mar=0, coc=0,lsd=0, ext=0, pop=0, c2b=0, tab=0, alc=0;
    
    public Jfreechart() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LisMenu = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BotMenu = new javax.swing.JButton();
        TexImportacion = new javax.swing.JTextField();
        BotImportacion1 = new javax.swing.JButton();
        TexFiltrar = new javax.swing.JTextField();
        LisFiltrar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Grafica media fea : 0");

        LisMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Grafico de \"pie\"", "Grafico de barras", "Grafico XY", "Grafico de tiempo" }));
        LisMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisMenuActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane2.setEnabled(false);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setEnabled(false);
        jScrollPane2.setViewportView(Tabla);

        BotMenu.setText("Crear Grafico");
        BotMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotMenuActionPerformed(evt);
            }
        });

        TexImportacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TexImportacion.setText("Ingrese el nombre del archivo CSV");
        TexImportacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexImportacionActionPerformed(evt);
            }
        });

        BotImportacion1.setText("Importar Archivo");
        BotImportacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotImportacion1ActionPerformed(evt);
            }
        });

        TexFiltrar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TexFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexFiltrarActionPerformed(evt);
            }
        });
        TexFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TexFiltrarKeyTyped(evt);
            }
        });

        LisFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LisFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(447, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(446, 446, 446))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LisMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TexImportacion, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotImportacion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TexFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LisFiltrar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexImportacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotImportacion1))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LisFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LisMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotMenu))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotImportacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotImportacion1ActionPerformed
        a=TexImportacion.getText();
        DefaultTableModel modelo = (DefaultTableModel)Tabla.getModel();
         modelo.setRowCount(0);
        Importacion(a,modelo);
        TexImportacion.setText("");
        
        
    }//GEN-LAST:event_BotImportacion1ActionPerformed

    private void TexImportacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexImportacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexImportacionActionPerformed

    private void BotMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotMenuActionPerformed
        
        prueba(); //Necesito llevar esto a publico 
        Graficos(opc,opc1);
        opc=0;
        
       
    }//GEN-LAST:event_BotMenuActionPerformed

    private void LisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisMenuActionPerformed
        if(LisMenu.getSelectedItem()=="Grafico de \"pie\"")
        {
            
            opc=1;
        }
        else
        {
            if(LisMenu.getSelectedItem()=="Grafico de barras")
            {
                opc=2;
            }
            else
            {
                if(LisMenu.getSelectedItem()=="Grafico XY")
                {
                    opc=3;
                }
                else
                {
                    if(LisMenu.getSelectedItem()=="Grafico de tiempo")
                    {
                        opc=4;
                    }
                }
            }
        }
    }//GEN-LAST:event_LisMenuActionPerformed

    private void TexFiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexFiltrarKeyTyped
        TexFiltrar.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent ke)
            {
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+TexFiltrar.getText(),opc1));
               
            }
        });
        Tabla.setRowSorter(trs);
    }//GEN-LAST:event_TexFiltrarKeyTyped

    private void LisFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LisFiltrarActionPerformed
        for(int i=0;i<LisFiltrar.getItemCount();i++)
        {
            if(LisFiltrar.getSelectedItem()==LisFiltrar.getItemAt(i))
            {
                opc1=i++;
                System.out.println(opc1);
            }
        }
    }//GEN-LAST:event_LisFiltrarActionPerformed

    private void TexFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexFiltrarActionPerformed
//METODO MAIN
    
    public static void main(String args[]) 
    { 
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Jfreechart().setVisible(true);
            }
        });
    }
//IMPORTACION DE ARCHIVOS CSV
    public void Importacion(String a,DefaultTableModel modelo)
    {
        File archivo = new File(a+".csv");
        try 
        {
            BufferedReader Lector = new BufferedReader (new FileReader(archivo));
            String PrimeraLinea = Lector.readLine().trim();
            String[] NombreColumnas = PrimeraLinea.split(",");
            modelo.setColumnIdentifiers(NombreColumnas);
            Object[] Linea = Lector.lines().toArray();
            for(int i=0;i<Linea.length;i++)
            {
               String Lineas = Linea[i].toString().trim();
               String[] filaDatos = Lineas.split(",");
               modelo.addRow(filaDatos);
            }
            for(int i=0;i<NombreColumnas.length;i++)
            {
                LisFiltrar.addItem(NombreColumnas[i]);
            }
        }
        catch (Exception ex) 
        {
            Logger.getLogger(Jfreechart.class.getName()).log(Level.SEVERE, null, ex);
        }  
        trs = new TableRowSorter(modelo);        
    }    
    
//CREACION DE GRAFICOS
    
    
    
    public void prueba()
    {
        File archivo = new File( a +".csv");
        String[] vector;
        String Linea;
        String dato, prueba; 
        dato= TexFiltrar.getText(); 
        

        try {
            Scanner entrada = new Scanner(archivo);
            FileWriter fw = new FileWriter("nuevo_archivo.csv"); // Nombre del archivo donde se guardarán los datos

            System.out.println(dato);
            while (entrada.hasNext()) {
                Linea = entrada.nextLine();
                vector = Linea.split(",");
                prueba= vector[opc1]; 
                
                if(vector[opc1].equals(dato)){
                  
                     fw.write(Linea);
                     fw.write("\n");
                }
                
//                fw.write(vector[4] + "," + vector[5] + "\n"); // Guardar los valores del vector 1 y 2 en el archivo
//                System.out.println(vector[4] + "   " + vector[5]);
            }

            fw.close(); // Cerrar el FileWriter después de terminar de escribir en el archivo

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jfreechart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jfreechart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    public static void Graficos(int opc,int opc1)
    {
//        prueba(); 
        
        switch(opc)
        {
            
        case 1: // GRAFICO DE PIE
            
            DefaultPieDataset Pie = new DefaultPieDataset();
            LinkedList listal = new LinkedList();
            File archivo = new File("nuevo_archivo.csv");
            String[] vector;
            String[] Ordenamiento = new String[3];

            String Linea;                

            String edad;

            try {
                Scanner entrada = new Scanner(archivo);

                while (entrada.hasNext()) {
                    Linea = entrada.nextLine();
                    vector = Linea.split(",");
                    edad = vector[1];

                    listal.add(edad);

                }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Jfreechart.class.getName()).log(Level.SEVERE, null, ex);
                }

                Map<String, Integer> contador = new HashMap<>();

                for (Object numero : listal) {
                    contador.put((String) numero, contador.getOrDefault(numero,0) + 1);  
                }

                java.util.List<Map.Entry<String, Integer>> listaContador = new ArrayList<>(contador.entrySet());
                listaContador.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));  

                for (int i = 0; i < 14 && i < listaContador.size(); i++) {
                    Map.Entry<String, Integer> entry = listaContador.get(i);   
                    System.out.println((i+1) + "  :  " + entry.getKey() + " - Aparece " + entry.getValue() + " veces");
                    
                  Pie.setValue(entry.getKey()+ " ( " +entry.getValue()+" )" , (entry.getValue()));
                  
                }     
                //parte a mostrar
                for (int i = 0; i < 2 && i < listaContador.size(); i++) {
                    Map.Entry<String, Integer> entry = listaContador.get(i);   
                    
                    Ordenamiento[i] = "Posición " + ( i + 1)  + ": " + entry.getKey() + " - " + entry.getValue();
                }
                
           
       
            JFreeChart chart0 = ChartFactory.createPieChart("Consumo SPA Medellin",Pie,true,true,false);
            try 
            {
                JOptionPane.showMessageDialog(null, "Los casos ordenados de mayor a menor son: \n" + "1: "+Ordenamiento[0] + "\n2:" + Ordenamiento[1]);
                ChartUtilities.saveChartAsJPEG(new File("graficagenero.jpg"), chart0, 500, 300);
//                ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\annna\\OneDrive\\Documentos\\Universidad\\Tercer Semestre\\Programacion\\2023  - 2 + Informe 05 + CSV.Prueba1\\Grafica1.jpg"), chart0, 500, 300);
            }catch (IOException e)
              
            {
                System.out.println("Problemas creando el archivo :0");
            }
            
           String fileName = "graficagenero.jpg";
           ImageIcon icono = new ImageIcon(fileName);
           JOptionPane.showMessageDialog(null, "", "Muestra de grafica ", JOptionPane.INFORMATION_MESSAGE, icono);
           
        break;
        
        case 2: // GRAFICO DE BARRAS
            
            System.out.println("Ingrese a grafica de barras");
            DefaultCategoryDataset Barras = new DefaultCategoryDataset();
            
              int mar=0, coc=0,lsd=0, ext=0, pop=0, c2b=0, tab=0, alc=0;
        
               File archivo2 = new File("nuevo_archivo.csv");
               String[] vectora;
               String prob;
               String linea; 
      
        try {
            
            Scanner entrada = new Scanner(archivo2);
        
            
            while (entrada.hasNext()) {
                linea = entrada.nextLine(); // Corregir el nombre de la variable Linea a linea
                vectora = linea.split(",");
               
                prob = vectora[2]; 
                if (prob.equals("Si")) { // Utilizar el método equals() para comparar cadenas
                    mar++; 
                }
                
                 prob = vectora[3]; 
                if (prob.equals("Si")) { // Utilizar el método equals() para comparar cadenas
                    coc++; 
                }

                 prob = vectora[4]; 
                if (prob.equals("Si")) { // Utilizar el método equals() para comparar cadenas
                    lsd++; 
                }
              
                 prob = vectora[5]; 
                if (prob.equals("Si")) { // Utilizar el método equals() para comparar cadenas
                    ext++; 
                }
                
                 prob = vectora[6]; 
                if (prob.equals("Si")) { // Utilizar el método equals() para comparar cadenas
                    pop++; 
                }
                
                 prob = vectora[7]; 
                if (prob.equals("Si")) { // Utilizar el método equals() para comparar cadenas
                    c2b++; 
                }
                
                 prob = vectora[8]; 
                if (prob.equals("Si")) { // Utilizar el método equals() para comparar cadenas
                    tab++; 
                }
                
                 prob = vectora[9]; 
                if (prob.equals("Si")) { // Utilizar el método equals() para comparar cadenas
                    alc++; 
                }
                
                System.out.println(mar+ " " +coc +" " +lsd + " ");
            }    

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jfreechart.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
            
            Barras.setValue(mar, "Profit", "Marihuana");
            Barras.setValue(coc, "Profit", "Cocaina");
            Barras.setValue(lsd, "Profit", "LSD");
            Barras.setValue(ext, "Profit", "Extasis");
            Barras.setValue( pop, "Profit", "Popper");
            Barras.setValue( c2b, "Profit", "2CB");
            Barras.setValue( tab, "Profit", "Tabaco");
            Barras.setValue(  alc, "Profit", "Alcohol");
            
            
            JFreeChart chart2 = ChartFactory.createBarChart("Consumo SPA Medellin","SPA", "Cantidad de consumo", Barras, PlotOrientation.VERTICAL,false, true, false);
            try 
            {
                int[] casos = {mar, coc, lsd, ext, pop, c2b, tab, alc};
        
                // Ordenamiento de burbuja
                for (int i = 0; i < casos.length - 1; i++) {
                    for (int j = 0; j < casos.length - i - 1; j++) {
                        if (casos[j] < casos[j + 1]) {
                            int temp = casos[j];
                            casos[j] = casos[j + 1];
                            casos[j + 1] = temp;
                        }
                    }
                }

                JOptionPane.showMessageDialog(null, "Los casos ordenados de mayor a menor son: \n" + "1: "+casos[0] + "\n2:" + casos[1] + "\n3:" + casos[2]);
                
               ChartUtilities.saveChartAsJPEG(new File("Grafica2.jpg"), chart2, 500, 300);
//                  ChartUtilities.saveChartAsJPEG(new File("chart2.jpg"), chart2, 500, 300);
            } catch (IOException e) 
            {
                System.out.println("Problemas creando el archivo :0");
            }
            
            String nombre = "grafica2.jpg";
            ImageIcon icono1 = new ImageIcon(nombre);
            JOptionPane.showMessageDialog(null, "", "Muestra de grafica ", JOptionPane.INFORMATION_MESSAGE, icono1);
        break;
        
//         case 3: // GRAFICO DE XY 
//            
//            XYSeries XY = new XYSeries("XYGraph");
//            XY.add(1, 1);
//            XY.add(1, 2);
//            XY.add(2, 1);
//            XY.add(3, 9);
//            XY.add(4, 10);
//            XYSeriesCollection dataset = new XYSeriesCollection();
//            dataset.addSeries(XY);
//            JFreeChart chart1 = ChartFactory.createXYLineChart(
//            "Hola","eje x","eje y",dataset,PlotOrientation.VERTICAL,true,true,false);
//            try 
//            {
//                ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\USUARIO\\Desktop\\ArchivosCSV1.jpg"), chart1, 500, 300);
//            } catch (IOException e) 
//            {
//                System.out.println("Problemas creando el archivo :0");
//            }
//             System.out.println("grafica de barras xy");
//             
//        break;
        
//        case 4: // GRAFICO DE TIEMPO
//            TimeSeries Tiempo = new TimeSeries("Population", Day.class);
//            Tiempo.add(new Day(10, 1, 2004), 100);
//            Tiempo.add(new Day(10, 2, 2004), 150);
//            Tiempo.add(new Day(10, 3, 2004), 250);
//            Tiempo.add(new Day(10, 4, 2004), 275);
//            Tiempo.add(new Day(10, 5, 2004), 325);
//            Tiempo.add(new Day(10, 6, 2004), 425);
//            TimeSeriesCollection dataset1 = new TimeSeriesCollection();
//            dataset1.addSeries(Tiempo);
//            JFreeChart chart3 = ChartFactory.createTimeSeriesChart("Population of CSC408 Town","Date","Population",dataset1,true,true, false);
//            try 
//            {
//                ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\USUARIO\\Desktop\\ArchivosCSV3.jpg"), chart3, 500, 300);
//            } catch (IOException e) 
//            {
//                System.out.println("Problemas creando el archivo :0");
//            }
//        break;
        default:
            System.out.println("Elige una opcion");
        break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotImportacion1;
    private javax.swing.JButton BotMenu;
    private javax.swing.JComboBox<String> LisFiltrar;
    private javax.swing.JComboBox<String> LisMenu;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TexFiltrar;
    private javax.swing.JTextField TexImportacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
