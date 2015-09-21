/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.StringTokenizer;
import javax.swing.JTextField;

/**
 *
 * @author JuanJo
 */
public class GestionTXT {
    
    public int verificarTxt (int cantidadFilas) throws IOException{
     
        FechaHora fecha = new FechaHora();
        String fechatxt = fecha.fechaActual(); 
        String ruta = "src/archivos/numSecuencia.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileReader fr = null;
        BufferedReader br = null;
        
        if(archivo.exists()) {
            int fechaPc=Integer.valueOf(fechatxt); // fecha del equipo convertida en integer
            int fechaDoc = 0; // fecha del documento
            int consecutivoTxt=0; // consecutivo del txt si existe
           
            
           try {
               // Apertura del fichero y creacion de BufferedReader para poder
               // hacer una lectura comoda (disponer del metodo readLine()).
               fr = new FileReader (archivo);
               br = new BufferedReader(fr);

               // Lectura del fichero
               String linea;
               
               while((linea=br.readLine())!=null){
                   
                    
                    StringTokenizer tokens = new StringTokenizer(linea, "-");
                    //System.out.print(tokens.nextToken());
                    while(tokens.hasMoreTokens())
                    {
                       fechaDoc=Integer.valueOf(tokens.nextToken());
                       consecutivoTxt=Integer.valueOf(tokens.nextToken());
                    }
                    
                    /// si es una fecha superior a la de hoy, reinicia el consecutivoTxt
                    if (fechaPc>fechaDoc) {
                        bw = new BufferedWriter(new FileWriter(archivo));
                        PrintWriter escribir = new PrintWriter(bw);//para crear el objeto que escribe en el archivo
                        escribir.println(fechatxt+"-"+cantidadFilas);//para escribir en el archivo
                        escribir.flush();
                        escribir.close();
                        bw.close();
                        return 1;

                    /// si es la fecha de hoy, continua el consecutivoTxt
                   }else{

                        bw = new BufferedWriter(new FileWriter(archivo));
                        PrintWriter escribir = new PrintWriter(bw);//para crear el objeto que escribe en el archivo
                        escribir.println(fechatxt+"-"+(consecutivoTxt+cantidadFilas));//para escribir en el archivo
                        escribir.flush();
                        escribir.close();
                        bw.close();
                        return (consecutivoTxt+1);
                   }
                 
                }
               
            }
            catch(Exception e){
               e.printStackTrace();
            }finally{
               // En el finally cerramos el fichero, para asegurarnos
               // que se cierra tanto si todo va bien como si salta 
               // una excepcion.
               try{                    
                  if( null != fr ){   
                     fr.close();     
                  }                  
               }catch (Exception e2){ 
                  e2.printStackTrace();
               }
            }
           
        } else {

            bw = new BufferedWriter(new FileWriter(archivo));
            PrintWriter escribir = new PrintWriter(bw);//para crear el objeto que escribe en el archivo
            escribir.println(fechatxt+"-"+cantidadFilas);//para escribir en el archivo
            escribir.flush();
            escribir.close();
            bw.close();
            
        }
        return 1;
    }
    
    public String cantidadRegistros () throws IOException{

        String ruta = "src/archivos/numSecuencia.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileReader fr = null;
        BufferedReader br = null;
        int fechaDoc =0;
        
        String cantidadRegistros = "0";
        
        if(archivo.exists()) {
            
           try {
               // Apertura del fichero y creacion de BufferedReader para poder
               // hacer una lectura comoda (disponer del metodo readLine()).
               fr = new FileReader (archivo);
               br = new BufferedReader(fr);

               // Lectura del fichero
               String linea;
               
               while((linea=br.readLine())!=null){
                          
                    StringTokenizer tokens = new StringTokenizer(linea, "-");
                    //System.out.print(tokens.nextToken());
                    while(tokens.hasMoreTokens())
                    {
                       fechaDoc=Integer.valueOf(tokens.nextToken());
                       cantidadRegistros=tokens.nextToken();
                    }
                 
                }
               
            }
            catch(Exception e){
               e.printStackTrace();
            }finally{
               // En el finally cerramos el fichero, para asegurarnos
               // que se cierra tanto si todo va bien como si salta 
               // una excepcion.
               try{                    
                  if( null != fr ){   
                     fr.close();     
                  }                  
               }catch (Exception e2){ 
                  e2.printStackTrace();
               }
            }
           
        } else {

            cantidadRegistros = "0";
            
        }
        return cantidadRegistros;
    }
    
     public String escribirIP (String direccionIP) throws IOException{
     
        String ruta = "src/archivos/direccionIP.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileReader fr = null;
        BufferedReader br = null;
        
        if(archivo.exists()) {           
            
           try {
               // Apertura del fichero y creacion de BufferedReader para poder
               // hacer una lectura comoda (disponer del metodo readLine()).
               fr = new FileReader (archivo);
               br = new BufferedReader(fr);

               // Lectura del fichero
               String linea;
               
               while((linea=br.readLine())!=null){
                   
                    bw = new BufferedWriter(new FileWriter(archivo));
                    PrintWriter escribir = new PrintWriter(bw);//para crear el objeto que escribe en el archivo
                    escribir.println(direccionIP);//para escribir en el archivo
                    escribir.flush();
                    escribir.close();
                    bw.close();
                    
                 
                }
               
            }
            catch(Exception e){
               e.printStackTrace();
            }finally{
               // En el finally cerramos el fichero, para asegurarnos
               // que se cierra tanto si todo va bien como si salta 
               // una excepcion.
               try{                    
                  if( null != fr ){   
                     fr.close();     
                  }                  
               }catch (Exception e2){ 
                  e2.printStackTrace();
               }
            }
           
        } else {

            bw = new BufferedWriter(new FileWriter(archivo));
            PrintWriter escribir = new PrintWriter(bw);//para crear el objeto que escribe en el archivo
            escribir.println(direccionIP);//para escribir en el archivo
            escribir.flush();
            escribir.close();
            bw.close();
            
        }
        return direccionIP;
    }
     
     public void leerIP (JTextField direccionIP) throws IOException{
     
        String ruta = "src/archivos/direccionIP.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        FileReader fr = null;
        BufferedReader br = null;
        
        if(archivo.exists()) {           
            
           try {
               // Apertura del fichero y creacion de BufferedReader para poder
               // hacer una lectura comoda (disponer del metodo readLine()).
               fr = new FileReader (archivo);
               br = new BufferedReader(fr);

               // Lectura del fichero
               String linea;
               
               while((linea=br.readLine())!=null){

                    direccionIP.setText(linea);
              
                }
               
            }
            catch(Exception e){
               e.printStackTrace();
            }finally{
               // En el finally cerramos el fichero, para asegurarnos
               // que se cierra tanto si todo va bien como si salta 
               // una excepcion.
               try{                    
                  if( null != fr ){   
                     fr.close();     
                  }                  
               }catch (Exception e2){ 
                  e2.printStackTrace();
               }
            }
           
        } else {

            bw = new BufferedWriter(new FileWriter(archivo));
            PrintWriter escribir = new PrintWriter(bw);//para crear el objeto que escribe en el archivo
            escribir.println(direccionIP.getText());//para escribir en el archivo
            escribir.flush();
            escribir.close();
            bw.close();
            
        }

    }
      
    public String asignarIP () throws IOException{
     
        String ruta = "src/archivos/direccionIP.txt";
        File archivo = new File(ruta);
        FileReader fr = null;
        BufferedReader br = null;
        String linea = "";
        
        if(archivo.exists()) {           
            
           try {
               // Apertura del fichero y creacion de BufferedReader para poder
               // hacer una lectura comoda (disponer del metodo readLine()).
               fr = new FileReader (archivo);
               br = new BufferedReader(fr);

               // Lectura del fichero
              
               
               while((linea=br.readLine())!=null){

                    return linea;
              
                }
               
            }
            catch(Exception e){
               e.printStackTrace();
            }finally{
               // En el finally cerramos el fichero, para asegurarnos
               // que se cierra tanto si todo va bien como si salta 
               // una excepcion.
               try{                    
                  if( null != fr ){   
                     fr.close();     
                  }                  
               }catch (Exception e2){ 
                  e2.printStackTrace();
               }
            }
           
        } else {

            linea = InetAddress.getLocalHost().getHostAddress();
            
        }
        
        return linea;

    }
     
}
