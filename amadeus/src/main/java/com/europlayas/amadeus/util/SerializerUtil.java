package com.europlayas.amadeus.util;

import com.europlayas.amadeus.bindings.BookRequest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


/**
 * Created by gcortes on 15/11/2016.
 */
public class SerializerUtil {

    private static JAXBContext JAXB_CONTEXT = null;

    public static String seralizeProviderReference( BookRequest bookRequest) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            if (JAXB_CONTEXT == null) {
                JAXB_CONTEXT = getJAXBContent();
            }
            JAXB_CONTEXT.createMarshaller().marshal( bookRequest, baos);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return   GzipUtil.compress( new String( baos.toByteArray(),"UTF-8"));

    }

    public static  BookRequest unSerializeProviderReference(String providerReference) throws Exception{
        BookRequest bookRequest = null;

        try{
            providerReference = GzipUtil.decompress(providerReference);
            ByteArrayInputStream bain = new ByteArrayInputStream(providerReference.getBytes());
            bookRequest = ( BookRequest)JAXB_CONTEXT.createUnmarshaller().unmarshal( bain);
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return bookRequest;
    }



    private static JAXBContext getJAXBContent() throws JAXBException {
        return JAXBContext.newInstance(com.europlayas.amadeus.bindings.ObjectFactory.class.getPackage().getName(),
                com.europlayas.amadeus.bindings.ObjectFactory.class.getClassLoader());

    }

}
