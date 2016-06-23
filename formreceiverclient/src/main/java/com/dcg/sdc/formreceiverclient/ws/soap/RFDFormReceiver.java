package com.dcg.sdc.formreceiverclient.ws.soap;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * This class implements the "Form Receiver" web services defined in RFD
 * @author Matthew
 */
@WebService(serviceName = "RFDFormReceiver_Service", portName = "RFDFormReceiver_Port_Soap12", endpointInterface = "ihe.iti.rfd._2007.RFDFormReceiverPortType", targetNamespace = "urn:ihe:iti:rfd:2007", wsdlLocation = "WEB-INF/wsdl/RFDFormReceiver.wsdl")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class RFDFormReceiver {

    public ihe.iti.rfd._2007.SubmitFormResponseType rfdFormReceiverSubmitForm(ihe.iti.rfd._2007.AnyXMLContentType body) {
        ihe.iti.rfd._2007.ObjectFactory rdfObjectFactory = new ihe.iti.rfd._2007.ObjectFactory();
        ihe.iti.rfd._2007.SubmitFormResponseType submitFormResponse = rdfObjectFactory.createSubmitFormResponseType();
        submitFormResponse.setResponseCode("sucess");
        return submitFormResponse;
    }

}
