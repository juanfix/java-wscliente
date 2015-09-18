/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clientews.CursoComparendo;
import clientews.DatosEntradaCursoCia;
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
    private List<DatosEntradaCursoCia> otrosDatosCursoCIA = new ArrayList<DatosEntradaCursoCia>();
    private List<CursoComparendo> otrosDatosCursoComparendo = new ArrayList<CursoComparendo>();
    private int indiceCursoActual = -1;
  
    @Override
    public boolean next() throws JRException {
       return ++indiceCursoActual < listaCursos.size();
    }
  
    public void addCursoSalida(DatosSalidaCursoCia cursoCIA, DatosEntradaCursoCia otrosDatosCursoCIA, CursoComparendo otrosDatosCursoComparendo){

        this.listaCursos.add(cursoCIA);
        this.otrosDatosCursoCIA.add(otrosDatosCursoCIA);
        this.otrosDatosCursoComparendo.add(otrosDatosCursoComparendo);
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
       Object valor = null;
       
        if ("cod_respuesta".equals(jrf.getName())){
            valor = listaCursos.get(indiceCursoActual).getCodigoRespuesta();
        }
        else if ("mensaje_respuesta".equals(jrf.getName())){
            valor = listaCursos.get(indiceCursoActual).getMensajeRespuesta();
        }
        else if ("num_autorizacion".equals(jrf.getName())){
            valor = listaCursos.get(indiceCursoActual).getNumAutorizacion();
        }
        else if ("id_infractor".equals(jrf.getName())){
            valor = otrosDatosCursoCIA.get(indiceCursoActual).getIdentificacionInfractor();
        }
        else if ("num_comparendo".equals(jrf.getName())){
            valor = otrosDatosCursoComparendo.get(indiceCursoActual).getNumeroComparendo();
        }
        else if ("num_certificado".equals(jrf.getName())){
             valor = otrosDatosCursoComparendo.get(indiceCursoActual).getNumeroCertificado();
        }
        return valor;
    }
    
}
