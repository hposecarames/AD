
package exemplo14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author oracle
 */
public class Exemplo14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws XMLStreamException, IOException {
        
        File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
        File f = new File(ruta, "autores.xml");
        XMLOutputFactory xof = XMLOutputFactory.newInstance();
        XMLStreamWriter xsw = null;
        xsw = xof.createXMLStreamWriter(new FileWriter(f));
        xsw.writeStartDocument("utf-8", "1.0");
        xsw.writeStartElement("autores");
        xsw.writeStartElement("autor");
        xsw.writeAttribute("codigo", "a1");
        xsw.writeStartElement("nome");
        xsw.writeCharacters("Alexandre Dumas");
        xsw.writeEndElement();
        xsw.writeStartElement("titulo");
        xsw.writeCharacters("El conde de montecristo");
        xsw.writeEndElement();
        xsw.writeStartElement("titulo");
        xsw.writeCharacters("Los miserables");
        xsw.writeEndElement();
        xsw.writeEndElement();
        xsw.writeStartElement("autor");
        xsw.writeAttribute("codigo", "a2");
        xsw.writeStartElement("nome");
        xsw.writeCharacters("Fiodor Dostoyevski");
        xsw.writeEndElement();
        xsw.writeStartElement("titulo");
        xsw.writeCharacters("El idiota");
        xsw.writeEndElement();
        xsw.writeStartElement("titulo");
        xsw.writeCharacters("Noches Blancas");
        xsw.writeEndElement();
        xsw.writeEndElement();
        xsw.writeEndElement();
        xsw.writeEndDocument();
        xsw.flush();
        xsw.close();
        System.out.println("Hecho");
        
        
    }
    
}
