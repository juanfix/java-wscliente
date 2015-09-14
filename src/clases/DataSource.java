/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clientews.DatosSalidaCursoCia;
import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author JuanJo
 */
public class DataSource implements JRDataSource{
    
    private List<DatosSalidaCursoCia> listaCursos = new ArrayList<DatosSalidaCursoCia>();
    private int indiceCursoActual = -1;
  
    @Override
    public boolean next() throws JRException {
       return ++indiceCursoActual < listaCursos.size();
    }
  
    public void addCursoSalida(DatosSalidaCursoCia cursoCIA){

        this.listaCursos.add(cursoCIA);

    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
       Object valor = null;
       
       System.out.println ("Name del jrf: "+jrf.getName());
       
        if ("cod_respuesta".equals(jrf.getName())){

            valor = listaCursos.get(indiceCursoActual).getCodigoRespuesta();

        }
        else if ("mensaje_respuesta".equals(jrf.getName())){

            valor = listaCursos.get(indiceCursoActual).getMensajeRespuesta();
            System.out.println ("valor mensaje respuesta:  "+listaCursos.get(indiceCursoActual).getHoraTransaccion());
        }
        else if ("num_autorizacion".equals(jrf.getName())){

            valor = listaCursos.get(indiceCursoActual).getNumAutorizacion();

        }
        else if ("num_secuencia".equals(jrf.getName())){
            valor = listaCursos.get(indiceCursoActual).getNumeroSecuencia();
        }
        
        System.out.println ("valor "+valor);
        
        return valor;
    }
    
}
