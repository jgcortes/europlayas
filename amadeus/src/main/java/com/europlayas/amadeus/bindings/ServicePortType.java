package com.europlayas.amadeus.bindings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-11-07T15:50:32.459+01:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://ws.amadeus.fr/air", name = "servicePortType")
@XmlSeeAlso({com.europlayas.amadeus.bindings.common.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ServicePortType {

    @WebMethod(action = "http://ws.amadeus.fr/air/book")
    @WebResult(name = "bookResponse", targetNamespace = "http://ws.amadeus.fr/air", partName = "bookResponse")
    public BookResponse book(
        @WebParam(partName = "bookRequest", name = "bookRequest", targetNamespace = "http://ws.amadeus.fr/air")
        BookRequest bookRequest
    ) throws UnsupportedPaymentCardTypeFault_Exception, PassengerPriceDiscrepancyFault_Exception, UnknownErrorFault_Exception, NoFareApplicableFault_Exception, PriceDiscrepancyFault_Exception, BookingFailureFault_Exception, TicketIssuanceFailureFault_Exception, DuplicateBookingFault_Exception, SegmentSellFailureFault_Exception, SupplierSideFault_Exception, InconsistentBookRequestFault_Exception;

    @WebMethod(action = "http://ws.amadeus.fr/air/getInfo")
    @WebResult(name = "getInfoResponse", targetNamespace = "http://ws.amadeus.fr/air", partName = "getInfoResponse")
    public GetInfoResponse getInfo(
        @WebParam(partName = "getInfoRequest", name = "getInfoRequest", targetNamespace = "http://ws.amadeus.fr/air")
        GetInfoRequest getInfoRequest
    ) throws UnknownErrorFault_Exception, InconsistentGetInfoRequestFault_Exception, NoFareApplicableFault_Exception, SupplierSideFault_Exception;

    @WebMethod(action = "http://ws.amadeus.fr/air/availabilitySearch")
    @WebResult(name = "availabilitySearchResponse", targetNamespace = "http://ws.amadeus.fr/air", partName = "availabilitySearchResponse")
    public AvailabilitySearchResponse availabilitySearch(
        @WebParam(partName = "availabilitySearchRequest", name = "availabilitySearchRequest", targetNamespace = "http://ws.amadeus.fr/air")
        AvailabilitySearchRequest availabilitySearchRequest
    ) throws InconsistentAvailabilitySearchRequestFault_Exception, UnknownErrorFault_Exception, SupplierSideFault_Exception;

    @WebMethod(action = "http://ws.amadeus.fr/air/lowFareSearch")
    @WebResult(name = "lowFareSearchResponse", targetNamespace = "http://ws.amadeus.fr/air", partName = "lowFareSearchResponse")
    public LowFareSearchResponse lowFareSearch(
        @WebParam(partName = "lowFareSearchRequest", name = "lowFareSearchRequest", targetNamespace = "http://ws.amadeus.fr/air")
        LowFareSearchRequest lowFareSearchRequest
    ) throws InconsistentLowFareSearchRequestFault_Exception, UnknownErrorFault_Exception, SupplierSideFault_Exception;

    @WebMethod(action = "http://ws.amadeus.fr/air/priceWithInfo")
    @WebResult(name = "priceWithInfoResponse", targetNamespace = "http://ws.amadeus.fr/air", partName = "priceWithInfoResponse")
    public PriceWithInfoResponse priceWithInfo(
        @WebParam(partName = "priceWithInfoRequest", name = "priceWithInfoRequest", targetNamespace = "http://ws.amadeus.fr/air")
        PriceWithInfoRequest priceWithInfoRequest
    ) throws UnsupportedPaymentCardTypeFault_Exception, InconsistentPriceWithInfoRequestFault_Exception, UnknownErrorFault_Exception, NoFareApplicableFault_Exception, SupplierSideFault_Exception;
}
