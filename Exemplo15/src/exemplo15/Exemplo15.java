package exemplo15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 *
 * @author oracle
 */
public class Exemplo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        
        File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
        File f = new File(ruta, "autores.xml");
        XMLInputFactory xif = XMLInputFactory.newInstance();
        XMLStreamReader xsr = xif.createXMLStreamReader(new FileInputStream(f));
        System.out.println(xsr.getEncoding() + " " + xsr.getVersion());
        while(xsr.hasNext()){
            xsr.next();
            
            if(xsr.getEventType()==XMLStreamReader.START_ELEMENT){
                System.out.println(xsr.getLocalName());
                if (xsr.getAttributeValue(0)!=null){
                    System.out.println(xsr.getAttributeValue(0));
                }
                }
            
                if(xsr.getEventType()==XMLStreamReader.CHARACTERS){
                    System.out.println(xsr.getText());
                }
            }
        }
        
        
}

    

