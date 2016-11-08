
package com.europlayas.amadeus.bindings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.europlayas.amadeus.bindings package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InconsistentGetInfoRequestFault_QNAME = new QName("http://ws.amadeus.fr/air", "inconsistentGetInfoRequestFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.europlayas.amadeus.bindings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookRequest }
     * 
     */
    public BookRequest createBookRequest() {
        return new BookRequest();
    }

    /**
     * Create an instance of {@link LowFareSearchResponse }
     * 
     */
    public LowFareSearchResponse createLowFareSearchResponse() {
        return new LowFareSearchResponse();
    }

    /**
     * Create an instance of {@link InconsistentLowFareSearchRequestFault }
     * 
     */
    public InconsistentLowFareSearchRequestFault createInconsistentLowFareSearchRequestFault() {
        return new InconsistentLowFareSearchRequestFault();
    }

    /**
     * Create an instance of {@link GetInfoResponse }
     * 
     */
    public GetInfoResponse createGetInfoResponse() {
        return new GetInfoResponse();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponse }
     * 
     */
    public PriceWithInfoResponse createPriceWithInfoResponse() {
        return new PriceWithInfoResponse();
    }

    /**
     * Create an instance of {@link LowFareSearchRequest }
     * 
     */
    public LowFareSearchRequest createLowFareSearchRequest() {
        return new LowFareSearchRequest();
    }

    /**
     * Create an instance of {@link PriceWithInfoRequest }
     * 
     */
    public PriceWithInfoRequest createPriceWithInfoRequest() {
        return new PriceWithInfoRequest();
    }

    /**
     * Create an instance of {@link AvailabilitySearchRequest }
     * 
     */
    public AvailabilitySearchRequest createAvailabilitySearchRequest() {
        return new AvailabilitySearchRequest();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponse }
     * 
     */
    public AvailabilitySearchResponse createAvailabilitySearchResponse() {
        return new AvailabilitySearchResponse();
    }

    /**
     * Create an instance of {@link InconsistentAvailabilitySearchRequestFault }
     * 
     */
    public InconsistentAvailabilitySearchRequestFault createInconsistentAvailabilitySearchRequestFault() {
        return new InconsistentAvailabilitySearchRequestFault();
    }

    /**
     * Create an instance of {@link BookResponse }
     * 
     */
    public BookResponse createBookResponse() {
        return new BookResponse();
    }

    /**
     * Create an instance of {@link SegmentSellFailureFault }
     * 
     */
    public SegmentSellFailureFault createSegmentSellFailureFault() {
        return new SegmentSellFailureFault();
    }

    /**
     * Create an instance of {@link PassengerPriceDiscrepancyFault }
     * 
     */
    public PassengerPriceDiscrepancyFault createPassengerPriceDiscrepancyFault() {
        return new PassengerPriceDiscrepancyFault();
    }

    /**
     * Create an instance of {@link PriceDiscrepancyFault }
     * 
     */
    public PriceDiscrepancyFault createPriceDiscrepancyFault() {
        return new PriceDiscrepancyFault();
    }

    /**
     * Create an instance of {@link ErrorAfterBookingWhileDisplayingTSTWarning }
     * 
     */
    public ErrorAfterBookingWhileDisplayingTSTWarning createErrorAfterBookingWhileDisplayingTSTWarning() {
        return new ErrorAfterBookingWhileDisplayingTSTWarning();
    }

    /**
     * Create an instance of {@link UnconfirmedBookingWarning }
     * 
     */
    public UnconfirmedBookingWarning createUnconfirmedBookingWarning() {
        return new UnconfirmedBookingWarning();
    }

    /**
     * Create an instance of {@link UnconfirmedBookingWarning.UnconfirmedSegments }
     * 
     */
    public UnconfirmedBookingWarning.UnconfirmedSegments createUnconfirmedBookingWarningUnconfirmedSegments() {
        return new UnconfirmedBookingWarning.UnconfirmedSegments();
    }

    /**
     * Create an instance of {@link InconsistentPassenger }
     * 
     */
    public InconsistentPassenger createInconsistentPassenger() {
        return new InconsistentPassenger();
    }

    /**
     * Create an instance of {@link DetailedSegment }
     * 
     */
    public DetailedSegment createDetailedSegment() {
        return new DetailedSegment();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponseDetailedSegment }
     * 
     */
    public AvailabilitySearchResponseDetailedSegment createAvailabilitySearchResponseDetailedSegment() {
        return new AvailabilitySearchResponseDetailedSegment();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponseDetailedItinerary }
     * 
     */
    public AvailabilitySearchResponseDetailedItinerary createAvailabilitySearchResponseDetailedItinerary() {
        return new AvailabilitySearchResponseDetailedItinerary();
    }

    /**
     * Create an instance of {@link LowFareSearchTravelClassRestrictions }
     * 
     */
    public LowFareSearchTravelClassRestrictions createLowFareSearchTravelClassRestrictions() {
        return new LowFareSearchTravelClassRestrictions();
    }

    /**
     * Create an instance of {@link LuggageFee }
     * 
     */
    public LuggageFee createLuggageFee() {
        return new LuggageFee();
    }

    /**
     * Create an instance of {@link OptionDiscardedSearchWarning }
     * 
     */
    public OptionDiscardedSearchWarning createOptionDiscardedSearchWarning() {
        return new OptionDiscardedSearchWarning();
    }

    /**
     * Create an instance of {@link InconsistentRemark }
     * 
     */
    public InconsistentRemark createInconsistentRemark() {
        return new InconsistentRemark();
    }

    /**
     * Create an instance of {@link Passport }
     * 
     */
    public Passport createPassport() {
        return new Passport();
    }

    /**
     * Create an instance of {@link AirAmadeusQueue }
     * 
     */
    public AirAmadeusQueue createAirAmadeusQueue() {
        return new AirAmadeusQueue();
    }

    /**
     * Create an instance of {@link InconsistentSegmentDetail }
     * 
     */
    public InconsistentSegmentDetail createInconsistentSegmentDetail() {
        return new InconsistentSegmentDetail();
    }

    /**
     * Create an instance of {@link AdditionalServicesInconsistency }
     * 
     */
    public AdditionalServicesInconsistency createAdditionalServicesInconsistency() {
        return new AdditionalServicesInconsistency();
    }

    /**
     * Create an instance of {@link DateTimeRange }
     * 
     */
    public DateTimeRange createDateTimeRange() {
        return new DateTimeRange();
    }

    /**
     * Create an instance of {@link LuggageAllowance }
     * 
     */
    public LuggageAllowance createLuggageAllowance() {
        return new LuggageAllowance();
    }

    /**
     * Create an instance of {@link TaxList }
     * 
     */
    public TaxList createTaxList() {
        return new TaxList();
    }

    /**
     * Create an instance of {@link AirRecord }
     * 
     */
    public AirRecord createAirRecord() {
        return new AirRecord();
    }

    /**
     * Create an instance of {@link SeatedPassengerAdditionalServices }
     * 
     */
    public SeatedPassengerAdditionalServices createSeatedPassengerAdditionalServices() {
        return new SeatedPassengerAdditionalServices();
    }

    /**
     * Create an instance of {@link Redress }
     * 
     */
    public Redress createRedress() {
        return new Redress();
    }

    /**
     * Create an instance of {@link DetailedItinerary }
     * 
     */
    public DetailedItinerary createDetailedItinerary() {
        return new DetailedItinerary();
    }

    /**
     * Create an instance of {@link AdditionalRecordDataInconsistency }
     * 
     */
    public AdditionalRecordDataInconsistency createAdditionalRecordDataInconsistency() {
        return new AdditionalRecordDataInconsistency();
    }

    /**
     * Create an instance of {@link PassengersInconsistency }
     * 
     */
    public PassengersInconsistency createPassengersInconsistency() {
        return new PassengersInconsistency();
    }

    /**
     * Create an instance of {@link NamedPassengersInconsistency }
     * 
     */
    public NamedPassengersInconsistency createNamedPassengersInconsistency() {
        return new NamedPassengersInconsistency();
    }

    /**
     * Create an instance of {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency }
     * 
     */
    public NamedPassengersInconsistency.AccommodationPreferenceInconsistency createNamedPassengersInconsistencyAccommodationPreferenceInconsistency() {
        return new NamedPassengersInconsistency.AccommodationPreferenceInconsistency();
    }

    /**
     * Create an instance of {@link BookPricingInconsistency }
     * 
     */
    public BookPricingInconsistency createBookPricingInconsistency() {
        return new BookPricingInconsistency();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency }
     * 
     */
    public InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency createInconsistentAvailabilitySearchRequestFaultConnectionInconsistency() {
        return new InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponse.OriginDestinations }
     * 
     */
    public AvailabilitySearchResponse.OriginDestinations createAvailabilitySearchResponseOriginDestinations() {
        return new AvailabilitySearchResponse.OriginDestinations();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponse.OriginDestinations.OriginDestination }
     * 
     */
    public AvailabilitySearchResponse.OriginDestinations.OriginDestination createAvailabilitySearchResponseOriginDestinationsOriginDestination() {
        return new AvailabilitySearchResponse.OriginDestinations.OriginDestination();
    }

    /**
     * Create an instance of {@link TravelPreferences }
     * 
     */
    public TravelPreferences createTravelPreferences() {
        return new TravelPreferences();
    }

    /**
     * Create an instance of {@link AvailabilitySearchRequest.Journey }
     * 
     */
    public AvailabilitySearchRequest.Journey createAvailabilitySearchRequestJourney() {
        return new AvailabilitySearchRequest.Journey();
    }

    /**
     * Create an instance of {@link AvailabilitySearchRequest.Journey.OriginDestinations }
     * 
     */
    public AvailabilitySearchRequest.Journey.OriginDestinations createAvailabilitySearchRequestJourneyOriginDestinations() {
        return new AvailabilitySearchRequest.Journey.OriginDestinations();
    }

    /**
     * Create an instance of {@link AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination }
     * 
     */
    public AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination createAvailabilitySearchRequestJourneyOriginDestinationsOriginDestination() {
        return new AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination();
    }

    /**
     * Create an instance of {@link LowFareSearchRequest.SearchPreferences }
     * 
     */
    public LowFareSearchRequest.SearchPreferences createLowFareSearchRequestSearchPreferences() {
        return new LowFareSearchRequest.SearchPreferences();
    }

    /**
     * Create an instance of {@link LowFareSearchTravelPreferences }
     * 
     */
    public LowFareSearchTravelPreferences createLowFareSearchTravelPreferences() {
        return new LowFareSearchTravelPreferences();
    }

    /**
     * Create an instance of {@link LowFareSearchRequest.Journey }
     * 
     */
    public LowFareSearchRequest.Journey createLowFareSearchRequestJourney() {
        return new LowFareSearchRequest.Journey();
    }

    /**
     * Create an instance of {@link GetInfoResponse.FareRules }
     * 
     */
    public GetInfoResponse.FareRules createGetInfoResponseFareRules() {
        return new GetInfoResponse.FareRules();
    }

    /**
     * Create an instance of {@link com.europlayas.amadeus.bindings.TicketingRequirements }
     * 
     */
    public com.europlayas.amadeus.bindings.TicketingRequirements createTicketingRequirements() {
        return new com.europlayas.amadeus.bindings.TicketingRequirements();
    }

    /**
     * Create an instance of {@link BookingRequirements }
     * 
     */
    public BookingRequirements createBookingRequirements() {
        return new BookingRequirements();
    }

    /**
     * Create an instance of {@link BookingRequirements.Passengers }
     * 
     */
    public BookingRequirements.Passengers createBookingRequirementsPassengers() {
        return new BookingRequirements.Passengers();
    }

    /**
     * Create an instance of {@link BookingRequirements.Passengers.Passenger }
     * 
     */
    public BookingRequirements.Passengers.Passenger createBookingRequirementsPassengersPassenger() {
        return new BookingRequirements.Passengers.Passenger();
    }

    /**
     * Create an instance of {@link DetailedJourney }
     * 
     */
    public DetailedJourney createDetailedJourney() {
        return new DetailedJourney();
    }

    /**
     * Create an instance of {@link LowFareSearchResponse.OriginDestinations }
     * 
     */
    public LowFareSearchResponse.OriginDestinations createLowFareSearchResponseOriginDestinations() {
        return new LowFareSearchResponse.OriginDestinations();
    }

    /**
     * Create an instance of {@link LowFareSearchResponse.OriginDestinations.OriginDestination }
     * 
     */
    public LowFareSearchResponse.OriginDestinations.OriginDestination createLowFareSearchResponseOriginDestinationsOriginDestination() {
        return new LowFareSearchResponse.OriginDestinations.OriginDestination();
    }

    /**
     * Create an instance of {@link BookRequest.AmadeusRecordQueuing }
     * 
     */
    public BookRequest.AmadeusRecordQueuing createBookRequestAmadeusRecordQueuing() {
        return new BookRequest.AmadeusRecordQueuing();
    }

    /**
     * Create an instance of {@link AdditionalRecordData }
     * 
     */
    public AdditionalRecordData createAdditionalRecordData() {
        return new AdditionalRecordData();
    }

    /**
     * Create an instance of {@link com.europlayas.amadeus.bindings.Journey }
     * 
     */
    public com.europlayas.amadeus.bindings.Journey createJourney() {
        return new com.europlayas.amadeus.bindings.Journey();
    }

    /**
     * Create an instance of {@link UnknownErrorFault }
     * 
     */
    public UnknownErrorFault createUnknownErrorFault() {
        return new UnknownErrorFault();
    }

    /**
     * Create an instance of {@link ItineraryIdList }
     * 
     */
    public ItineraryIdList createItineraryIdList() {
        return new ItineraryIdList();
    }

    /**
     * Create an instance of {@link NoFareApplicableFault }
     * 
     */
    public NoFareApplicableFault createNoFareApplicableFault() {
        return new NoFareApplicableFault();
    }

    /**
     * Create an instance of {@link UnsupportedPaymentCardTypeFault }
     * 
     */
    public UnsupportedPaymentCardTypeFault createUnsupportedPaymentCardTypeFault() {
        return new UnsupportedPaymentCardTypeFault();
    }

    /**
     * Create an instance of {@link SupplierSideFault }
     * 
     */
    public SupplierSideFault createSupplierSideFault() {
        return new SupplierSideFault();
    }

    /**
     * Create an instance of {@link BookRequestPricing }
     * 
     */
    public BookRequestPricing createBookRequestPricing() {
        return new BookRequestPricing();
    }

    /**
     * Create an instance of {@link BookRequest.Passengers }
     * 
     */
    public BookRequest.Passengers createBookRequestPassengers() {
        return new BookRequest.Passengers();
    }

    /**
     * Create an instance of {@link LowFareSearchResponse.Recommendations }
     * 
     */
    public LowFareSearchResponse.Recommendations createLowFareSearchResponseRecommendations() {
        return new LowFareSearchResponse.Recommendations();
    }

    /**
     * Create an instance of {@link LowFareSearchResponse.Warnings }
     * 
     */
    public LowFareSearchResponse.Warnings createLowFareSearchResponseWarnings() {
        return new LowFareSearchResponse.Warnings();
    }

    /**
     * Create an instance of {@link LowFareSearchFault }
     * 
     */
    public LowFareSearchFault createLowFareSearchFault() {
        return new LowFareSearchFault();
    }

    /**
     * Create an instance of {@link OriginDestinationIdList }
     * 
     */
    public OriginDestinationIdList createOriginDestinationIdList() {
        return new OriginDestinationIdList();
    }

    /**
     * Create an instance of {@link PricingInconsistency }
     * 
     */
    public PricingInconsistency createPricingInconsistency() {
        return new PricingInconsistency();
    }

    /**
     * Create an instance of {@link ProviderInconsistency }
     * 
     */
    public ProviderInconsistency createProviderInconsistency() {
        return new ProviderInconsistency();
    }

    /**
     * Create an instance of {@link SearchOptionInconsistency }
     * 
     */
    public SearchOptionInconsistency createSearchOptionInconsistency() {
        return new SearchOptionInconsistency();
    }

    /**
     * Create an instance of {@link InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency }
     * 
     */
    public InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency createInconsistentLowFareSearchRequestFaultTicketingRequirementsInconsistency() {
        return new InconsistentLowFareSearchRequestFault.TicketingRequirementsInconsistency();
    }

    /**
     * Create an instance of {@link OriginDestinationInconsistency }
     * 
     */
    public OriginDestinationInconsistency createOriginDestinationInconsistency() {
        return new OriginDestinationInconsistency();
    }

    /**
     * Create an instance of {@link GetInfoResponse.Warnings }
     * 
     */
    public GetInfoResponse.Warnings createGetInfoResponseWarnings() {
        return new GetInfoResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetInfoResponse.LuggageFees }
     * 
     */
    public GetInfoResponse.LuggageFees createGetInfoResponseLuggageFees() {
        return new GetInfoResponse.LuggageFees();
    }

    /**
     * Create an instance of {@link GetInfoResponse.PaymentCardFees }
     * 
     */
    public GetInfoResponse.PaymentCardFees createGetInfoResponsePaymentCardFees() {
        return new GetInfoResponse.PaymentCardFees();
    }

    /**
     * Create an instance of {@link LuggageAllowances }
     * 
     */
    public LuggageAllowances createLuggageAllowances() {
        return new LuggageAllowances();
    }

    /**
     * Create an instance of {@link InconsistentGetInfoRequestFault }
     * 
     */
    public InconsistentGetInfoRequestFault createInconsistentGetInfoRequestFault() {
        return new InconsistentGetInfoRequestFault();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponsePricing }
     * 
     */
    public PriceWithInfoResponsePricing createPriceWithInfoResponsePricing() {
        return new PriceWithInfoResponsePricing();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponse.Warnings }
     * 
     */
    public PriceWithInfoResponse.Warnings createPriceWithInfoResponseWarnings() {
        return new PriceWithInfoResponse.Warnings();
    }

    /**
     * Create an instance of {@link InconsistentPriceWithInfoRequestFault }
     * 
     */
    public InconsistentPriceWithInfoRequestFault createInconsistentPriceWithInfoRequestFault() {
        return new InconsistentPriceWithInfoRequestFault();
    }

    /**
     * Create an instance of {@link SegmentList }
     * 
     */
    public SegmentList createSegmentList() {
        return new SegmentList();
    }

    /**
     * Create an instance of {@link ItineraryInconsistency }
     * 
     */
    public ItineraryInconsistency createItineraryInconsistency() {
        return new ItineraryInconsistency();
    }

    /**
     * Create an instance of {@link FareTypeInconsistency }
     * 
     */
    public FareTypeInconsistency createFareTypeInconsistency() {
        return new FareTypeInconsistency();
    }

    /**
     * Create an instance of {@link PriceWithInfoPricingInconsistency }
     * 
     */
    public PriceWithInfoPricingInconsistency createPriceWithInfoPricingInconsistency() {
        return new PriceWithInfoPricingInconsistency();
    }

    /**
     * Create an instance of {@link SeatedPassengerList }
     * 
     */
    public SeatedPassengerList createSeatedPassengerList() {
        return new SeatedPassengerList();
    }

    /**
     * Create an instance of {@link SearchPricingMode }
     * 
     */
    public SearchPricingMode createSearchPricingMode() {
        return new SearchPricingMode();
    }

    /**
     * Create an instance of {@link LowFareSearchRequest.TicketingRequirements }
     * 
     */
    public LowFareSearchRequest.TicketingRequirements createLowFareSearchRequestTicketingRequirements() {
        return new LowFareSearchRequest.TicketingRequirements();
    }

    /**
     * Create an instance of {@link SeatedPassengerWithServicesList }
     * 
     */
    public SeatedPassengerWithServicesList createSeatedPassengerWithServicesList() {
        return new SeatedPassengerWithServicesList();
    }

    /**
     * Create an instance of {@link PriceWithInfoPricingMode }
     * 
     */
    public PriceWithInfoPricingMode createPriceWithInfoPricingMode() {
        return new PriceWithInfoPricingMode();
    }

    /**
     * Create an instance of {@link PriceWithInfoRequest.Payment }
     * 
     */
    public PriceWithInfoRequest.Payment createPriceWithInfoRequestPayment() {
        return new PriceWithInfoRequest.Payment();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponse.Warnings }
     * 
     */
    public AvailabilitySearchResponse.Warnings createAvailabilitySearchResponseWarnings() {
        return new AvailabilitySearchResponse.Warnings();
    }

    /**
     * Create an instance of {@link SearchPassengersInconsistency }
     * 
     */
    public SearchPassengersInconsistency createSearchPassengersInconsistency() {
        return new SearchPassengersInconsistency();
    }

    /**
     * Create an instance of {@link GetInfoRequest }
     * 
     */
    public GetInfoRequest createGetInfoRequest() {
        return new GetInfoRequest();
    }

    /**
     * Create an instance of {@link GetInfoPricingMode }
     * 
     */
    public GetInfoPricingMode createGetInfoPricingMode() {
        return new GetInfoPricingMode();
    }

    /**
     * Create an instance of {@link BookResponse.Warnings }
     * 
     */
    public BookResponse.Warnings createBookResponseWarnings() {
        return new BookResponse.Warnings();
    }

    /**
     * Create an instance of {@link BookingFailureFault }
     * 
     */
    public BookingFailureFault createBookingFailureFault() {
        return new BookingFailureFault();
    }

    /**
     * Create an instance of {@link BookFault }
     * 
     */
    public BookFault createBookFault() {
        return new BookFault();
    }

    /**
     * Create an instance of {@link TicketIssuanceFailureFault }
     * 
     */
    public TicketIssuanceFailureFault createTicketIssuanceFailureFault() {
        return new TicketIssuanceFailureFault();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link SegmentSellFailureFault.Passengers }
     * 
     */
    public SegmentSellFailureFault.Passengers createSegmentSellFailureFaultPassengers() {
        return new SegmentSellFailureFault.Passengers();
    }

    /**
     * Create an instance of {@link BookRequestPassengerPricingList }
     * 
     */
    public BookRequestPassengerPricingList createBookRequestPassengerPricingList() {
        return new BookRequestPassengerPricingList();
    }

    /**
     * Create an instance of {@link PassengerPriceDiscrepancyFault.Discrepancies }
     * 
     */
    public PassengerPriceDiscrepancyFault.Discrepancies createPassengerPriceDiscrepancyFaultDiscrepancies() {
        return new PassengerPriceDiscrepancyFault.Discrepancies();
    }

    /**
     * Create an instance of {@link PriceDiscrepancyFault.RequestedPrice }
     * 
     */
    public PriceDiscrepancyFault.RequestedPrice createPriceDiscrepancyFaultRequestedPrice() {
        return new PriceDiscrepancyFault.RequestedPrice();
    }

    /**
     * Create an instance of {@link PriceDiscrepancyFault.ActualPrice }
     * 
     */
    public PriceDiscrepancyFault.ActualPrice createPriceDiscrepancyFaultActualPrice() {
        return new PriceDiscrepancyFault.ActualPrice();
    }

    /**
     * Create an instance of {@link InconsistentBookRequestFault }
     * 
     */
    public InconsistentBookRequestFault createInconsistentBookRequestFault() {
        return new InconsistentBookRequestFault();
    }

    /**
     * Create an instance of {@link CurrencyInconsistency }
     * 
     */
    public CurrencyInconsistency createCurrencyInconsistency() {
        return new CurrencyInconsistency();
    }

    /**
     * Create an instance of {@link ContactInformationInconsistency }
     * 
     */
    public ContactInformationInconsistency createContactInformationInconsistency() {
        return new ContactInformationInconsistency();
    }

    /**
     * Create an instance of {@link DuplicateBookingFault }
     * 
     */
    public DuplicateBookingFault createDuplicateBookingFault() {
        return new DuplicateBookingFault();
    }

    /**
     * Create an instance of {@link CurrencyAmount }
     * 
     */
    public CurrencyAmount createCurrencyAmount() {
        return new CurrencyAmount();
    }

    /**
     * Create an instance of {@link IataLocation }
     * 
     */
    public IataLocation createIataLocation() {
        return new IataLocation();
    }

    /**
     * Create an instance of {@link IataDetailedLocation }
     * 
     */
    public IataDetailedLocation createIataDetailedLocation() {
        return new IataDetailedLocation();
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link Stop }
     * 
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link PaymentByItineraryGroup }
     * 
     */
    public PaymentByItineraryGroup createPaymentByItineraryGroup() {
        return new PaymentByItineraryGroup();
    }

    /**
     * Create an instance of {@link CashPayment }
     * 
     */
    public CashPayment createCashPayment() {
        return new CashPayment();
    }

    /**
     * Create an instance of {@link PaymentOnAccount }
     * 
     */
    public PaymentOnAccount createPaymentOnAccount() {
        return new PaymentOnAccount();
    }

    /**
     * Create an instance of {@link PaymentByCheck }
     * 
     */
    public PaymentByCheck createPaymentByCheck() {
        return new PaymentByCheck();
    }

    /**
     * Create an instance of {@link NonRefundablePayment }
     * 
     */
    public NonRefundablePayment createNonRefundablePayment() {
        return new NonRefundablePayment();
    }

    /**
     * Create an instance of {@link SingleUseVirtualCardPayment }
     * 
     */
    public SingleUseVirtualCardPayment createSingleUseVirtualCardPayment() {
        return new SingleUseVirtualCardPayment();
    }

    /**
     * Create an instance of {@link SpanishResidentDiscount }
     * 
     */
    public SpanishResidentDiscount createSpanishResidentDiscount() {
        return new SpanishResidentDiscount();
    }

    /**
     * Create an instance of {@link AirFranceMetropolitanDiscount }
     * 
     */
    public AirFranceMetropolitanDiscount createAirFranceMetropolitanDiscount() {
        return new AirFranceMetropolitanDiscount();
    }

    /**
     * Create an instance of {@link AirFranceDomDiscount }
     * 
     */
    public AirFranceDomDiscount createAirFranceDomDiscount() {
        return new AirFranceDomDiscount();
    }

    /**
     * Create an instance of {@link AirFranceCombinedDiscount }
     * 
     */
    public AirFranceCombinedDiscount createAirFranceCombinedDiscount() {
        return new AirFranceCombinedDiscount();
    }

    /**
     * Create an instance of {@link LoyaltyProgramList }
     * 
     */
    public LoyaltyProgramList createLoyaltyProgramList() {
        return new LoyaltyProgramList();
    }

    /**
     * Create an instance of {@link FrequentFlyer }
     * 
     */
    public FrequentFlyer createFrequentFlyer() {
        return new FrequentFlyer();
    }

    /**
     * Create an instance of {@link DiscountList }
     * 
     */
    public DiscountList createDiscountList() {
        return new DiscountList();
    }

    /**
     * Create an instance of {@link HeldInfantNamedPassenger }
     * 
     */
    public HeldInfantNamedPassenger createHeldInfantNamedPassenger() {
        return new HeldInfantNamedPassenger();
    }

    /**
     * Create an instance of {@link NonInfantHoldingSeatedNamedPassenger }
     * 
     */
    public NonInfantHoldingSeatedNamedPassenger createNonInfantHoldingSeatedNamedPassenger() {
        return new NonInfantHoldingSeatedNamedPassenger();
    }

    /**
     * Create an instance of {@link InfantHoldingSeatedNamedPassenger }
     * 
     */
    public InfantHoldingSeatedNamedPassenger createInfantHoldingSeatedNamedPassenger() {
        return new InfantHoldingSeatedNamedPassenger();
    }

    /**
     * Create an instance of {@link HeldInfantPassenger }
     * 
     */
    public HeldInfantPassenger createHeldInfantPassenger() {
        return new HeldInfantPassenger();
    }

    /**
     * Create an instance of {@link NonInfantHoldingSeatedPassenger }
     * 
     */
    public NonInfantHoldingSeatedPassenger createNonInfantHoldingSeatedPassenger() {
        return new NonInfantHoldingSeatedPassenger();
    }

    /**
     * Create an instance of {@link InfantHoldingSeatedPassenger }
     * 
     */
    public InfantHoldingSeatedPassenger createInfantHoldingSeatedPassenger() {
        return new InfantHoldingSeatedPassenger();
    }

    /**
     * Create an instance of {@link Luggage }
     * 
     */
    public Luggage createLuggage() {
        return new Luggage();
    }

    /**
     * Create an instance of {@link NonInfantHoldingSeatedPassengerWithServices }
     * 
     */
    public NonInfantHoldingSeatedPassengerWithServices createNonInfantHoldingSeatedPassengerWithServices() {
        return new NonInfantHoldingSeatedPassengerWithServices();
    }

    /**
     * Create an instance of {@link InfantHoldingSeatedPassengerWithServices }
     * 
     */
    public InfantHoldingSeatedPassengerWithServices createInfantHoldingSeatedPassengerWithServices() {
        return new InfantHoldingSeatedPassengerWithServices();
    }

    /**
     * Create an instance of {@link AirExternalRecord }
     * 
     */
    public AirExternalRecord createAirExternalRecord() {
        return new AirExternalRecord();
    }

    /**
     * Create an instance of {@link UnticketedCancellation }
     * 
     */
    public UnticketedCancellation createUnticketedCancellation() {
        return new UnticketedCancellation();
    }

    /**
     * Create an instance of {@link AccommodationPreference }
     * 
     */
    public AccommodationPreference createAccommodationPreference() {
        return new AccommodationPreference();
    }

    /**
     * Create an instance of {@link SegmentAccommodationPreference }
     * 
     */
    public SegmentAccommodationPreference createSegmentAccommodationPreference() {
        return new SegmentAccommodationPreference();
    }

    /**
     * Create an instance of {@link com.europlayas.amadeus.bindings.OriginDestination }
     * 
     */
    public com.europlayas.amadeus.bindings.OriginDestination createOriginDestination() {
        return new com.europlayas.amadeus.bindings.OriginDestination();
    }

    /**
     * Create an instance of {@link Area }
     * 
     */
    public Area createArea() {
        return new Area();
    }

    /**
     * Create an instance of {@link PassengerFareOption }
     * 
     */
    public PassengerFareOption createPassengerFareOption() {
        return new PassengerFareOption();
    }

    /**
     * Create an instance of {@link PassengerFareOptionList }
     * 
     */
    public PassengerFareOptionList createPassengerFareOptionList() {
        return new PassengerFareOptionList();
    }

    /**
     * Create an instance of {@link PassengerFareOptionGroups }
     * 
     */
    public PassengerFareOptionGroups createPassengerFareOptionGroups() {
        return new PassengerFareOptionGroups();
    }

    /**
     * Create an instance of {@link CorporateCodeList }
     * 
     */
    public CorporateCodeList createCorporateCodeList() {
        return new CorporateCodeList();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link AirlineCodeList }
     * 
     */
    public AirlineCodeList createAirlineCodeList() {
        return new AirlineCodeList();
    }

    /**
     * Create an instance of {@link PassengerPricingSegmentDetail }
     * 
     */
    public PassengerPricingSegmentDetail createPassengerPricingSegmentDetail() {
        return new PassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link SolutionPassengerPricingSegmentDetail }
     * 
     */
    public SolutionPassengerPricingSegmentDetail createSolutionPassengerPricingSegmentDetail() {
        return new SolutionPassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link BookRequestPassengerPricingSegmentDetail }
     * 
     */
    public BookRequestPassengerPricingSegmentDetail createBookRequestPassengerPricingSegmentDetail() {
        return new BookRequestPassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link PriceWithInfoRequestPassengerPricingSegmentDetail }
     * 
     */
    public PriceWithInfoRequestPassengerPricingSegmentDetail createPriceWithInfoRequestPassengerPricingSegmentDetail() {
        return new PriceWithInfoRequestPassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link GetInfoRequestPassengerPricingSegmentDetail }
     * 
     */
    public GetInfoRequestPassengerPricingSegmentDetail createGetInfoRequestPassengerPricingSegmentDetail() {
        return new GetInfoRequestPassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link GetInfoResponsePassengerPricingSegmentDetail }
     * 
     */
    public GetInfoResponsePassengerPricingSegmentDetail createGetInfoResponsePassengerPricingSegmentDetail() {
        return new GetInfoResponsePassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link SearchPassengerPricingSegmentDetail }
     * 
     */
    public SearchPassengerPricingSegmentDetail createSearchPassengerPricingSegmentDetail() {
        return new SearchPassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link Allotment }
     * 
     */
    public Allotment createAllotment() {
        return new Allotment();
    }

    /**
     * Create an instance of {@link SearchLuggageAllowance }
     * 
     */
    public SearchLuggageAllowance createSearchLuggageAllowance() {
        return new SearchLuggageAllowance();
    }

    /**
     * Create an instance of {@link PassengerPricing }
     * 
     */
    public PassengerPricing createPassengerPricing() {
        return new PassengerPricing();
    }

    /**
     * Create an instance of {@link SolutionPassengerPricing }
     * 
     */
    public SolutionPassengerPricing createSolutionPassengerPricing() {
        return new SolutionPassengerPricing();
    }

    /**
     * Create an instance of {@link BookRequestPassengerPricing }
     * 
     */
    public BookRequestPassengerPricing createBookRequestPassengerPricing() {
        return new BookRequestPassengerPricing();
    }

    /**
     * Create an instance of {@link PriceWithInfoRequestPassengerPricing }
     * 
     */
    public PriceWithInfoRequestPassengerPricing createPriceWithInfoRequestPassengerPricing() {
        return new PriceWithInfoRequestPassengerPricing();
    }

    /**
     * Create an instance of {@link GetInfoRequestPassengerPricing }
     * 
     */
    public GetInfoRequestPassengerPricing createGetInfoRequestPassengerPricing() {
        return new GetInfoRequestPassengerPricing();
    }

    /**
     * Create an instance of {@link GetInfoResponsePassengerPricing }
     * 
     */
    public GetInfoResponsePassengerPricing createGetInfoResponsePassengerPricing() {
        return new GetInfoResponsePassengerPricing();
    }

    /**
     * Create an instance of {@link SearchPassengerPricing }
     * 
     */
    public SearchPassengerPricing createSearchPassengerPricing() {
        return new SearchPassengerPricing();
    }

    /**
     * Create an instance of {@link PassengerPricingSegmentDetailList }
     * 
     */
    public PassengerPricingSegmentDetailList createPassengerPricingSegmentDetailList() {
        return new PassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link SolutionPassengerPricingSegmentDetailList }
     * 
     */
    public SolutionPassengerPricingSegmentDetailList createSolutionPassengerPricingSegmentDetailList() {
        return new SolutionPassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link BookRequestPassengerPricingSegmentDetailList }
     * 
     */
    public BookRequestPassengerPricingSegmentDetailList createBookRequestPassengerPricingSegmentDetailList() {
        return new BookRequestPassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link PriceWithInfoRequestPassengerPricingSegmentDetailList }
     * 
     */
    public PriceWithInfoRequestPassengerPricingSegmentDetailList createPriceWithInfoRequestPassengerPricingSegmentDetailList() {
        return new PriceWithInfoRequestPassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link GetInfoRequestPassengerPricingSegmentDetailList }
     * 
     */
    public GetInfoRequestPassengerPricingSegmentDetailList createGetInfoRequestPassengerPricingSegmentDetailList() {
        return new GetInfoRequestPassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link GetInfoResponsePassengerPricingSegmentDetailList }
     * 
     */
    public GetInfoResponsePassengerPricingSegmentDetailList createGetInfoResponsePassengerPricingSegmentDetailList() {
        return new GetInfoResponsePassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link SearchPassengerPricingSegmentDetailList }
     * 
     */
    public SearchPassengerPricingSegmentDetailList createSearchPassengerPricingSegmentDetailList() {
        return new SearchPassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link PassengerPricingList }
     * 
     */
    public PassengerPricingList createPassengerPricingList() {
        return new PassengerPricingList();
    }

    /**
     * Create an instance of {@link SolutionPassengerPricingList }
     * 
     */
    public SolutionPassengerPricingList createSolutionPassengerPricingList() {
        return new SolutionPassengerPricingList();
    }

    /**
     * Create an instance of {@link SearchPassengerPricingList }
     * 
     */
    public SearchPassengerPricingList createSearchPassengerPricingList() {
        return new SearchPassengerPricingList();
    }

    /**
     * Create an instance of {@link ValidatingAirlineCodeList }
     * 
     */
    public ValidatingAirlineCodeList createValidatingAirlineCodeList() {
        return new ValidatingAirlineCodeList();
    }

    /**
     * Create an instance of {@link SegmentIdList }
     * 
     */
    public SegmentIdList createSegmentIdList() {
        return new SegmentIdList();
    }

    /**
     * Create an instance of {@link PricingSolutionFees }
     * 
     */
    public PricingSolutionFees createPricingSolutionFees() {
        return new PricingSolutionFees();
    }

    /**
     * Create an instance of {@link TimeRange }
     * 
     */
    public TimeRange createTimeRange() {
        return new TimeRange();
    }

    /**
     * Create an instance of {@link FareTypeInconsistencyWithCause }
     * 
     */
    public FareTypeInconsistencyWithCause createFareTypeInconsistencyWithCause() {
        return new FareTypeInconsistencyWithCause();
    }

    /**
     * Create an instance of {@link UnpricedPassengerList }
     * 
     */
    public UnpricedPassengerList createUnpricedPassengerList() {
        return new UnpricedPassengerList();
    }

    /**
     * Create an instance of {@link UnpricedSegmentList }
     * 
     */
    public UnpricedSegmentList createUnpricedSegmentList() {
        return new UnpricedSegmentList();
    }

    /**
     * Create an instance of {@link InconsistentSegmentDetailList }
     * 
     */
    public InconsistentSegmentDetailList createInconsistentSegmentDetailList() {
        return new InconsistentSegmentDetailList();
    }

    /**
     * Create an instance of {@link IncompleteGetInfoPassengerPricing }
     * 
     */
    public IncompleteGetInfoPassengerPricing createIncompleteGetInfoPassengerPricing() {
        return new IncompleteGetInfoPassengerPricing();
    }

    /**
     * Create an instance of {@link IncompleteGetInfoPassengerPricingList }
     * 
     */
    public IncompleteGetInfoPassengerPricingList createIncompleteGetInfoPassengerPricingList() {
        return new IncompleteGetInfoPassengerPricingList();
    }

    /**
     * Create an instance of {@link GetInfoPassengerPricingInconsistency }
     * 
     */
    public GetInfoPassengerPricingInconsistency createGetInfoPassengerPricingInconsistency() {
        return new GetInfoPassengerPricingInconsistency();
    }

    /**
     * Create an instance of {@link GetInfoPricingInconsistency }
     * 
     */
    public GetInfoPricingInconsistency createGetInfoPricingInconsistency() {
        return new GetInfoPricingInconsistency();
    }

    /**
     * Create an instance of {@link LowFareSearchAirlineRestrictions }
     * 
     */
    public LowFareSearchAirlineRestrictions createLowFareSearchAirlineRestrictions() {
        return new LowFareSearchAirlineRestrictions();
    }

    /**
     * Create an instance of {@link AirlineRestrictions }
     * 
     */
    public AirlineRestrictions createAirlineRestrictions() {
        return new AirlineRestrictions();
    }

    /**
     * Create an instance of {@link ProviderAirlineRestrictions }
     * 
     */
    public ProviderAirlineRestrictions createProviderAirlineRestrictions() {
        return new ProviderAirlineRestrictions();
    }

    /**
     * Create an instance of {@link SimpleAirlineRestrictions }
     * 
     */
    public SimpleAirlineRestrictions createSimpleAirlineRestrictions() {
        return new SimpleAirlineRestrictions();
    }

    /**
     * Create an instance of {@link SimpleAirlineCodeRestrictions }
     * 
     */
    public SimpleAirlineCodeRestrictions createSimpleAirlineCodeRestrictions() {
        return new SimpleAirlineCodeRestrictions();
    }

    /**
     * Create an instance of {@link AirlineCodeRestrictions }
     * 
     */
    public AirlineCodeRestrictions createAirlineCodeRestrictions() {
        return new AirlineCodeRestrictions();
    }

    /**
     * Create an instance of {@link ConnectionRestriction }
     * 
     */
    public ConnectionRestriction createConnectionRestriction() {
        return new ConnectionRestriction();
    }

    /**
     * Create an instance of {@link AirlinesRestrictionsList }
     * 
     */
    public AirlinesRestrictionsList createAirlinesRestrictionsList() {
        return new AirlinesRestrictionsList();
    }

    /**
     * Create an instance of {@link NegotiatedSpace }
     * 
     */
    public NegotiatedSpace createNegotiatedSpace() {
        return new NegotiatedSpace();
    }

    /**
     * Create an instance of {@link PassengerPricingWithFareBasisDiscrepancy }
     * 
     */
    public PassengerPricingWithFareBasisDiscrepancy createPassengerPricingWithFareBasisDiscrepancy() {
        return new PassengerPricingWithFareBasisDiscrepancy();
    }

    /**
     * Create an instance of {@link WizzAirSetting }
     * 
     */
    public WizzAirSetting createWizzAirSetting() {
        return new WizzAirSetting();
    }

    /**
     * Create an instance of {@link PricingOrFareBasisDiscrepancyWarning }
     * 
     */
    public PricingOrFareBasisDiscrepancyWarning createPricingOrFareBasisDiscrepancyWarning() {
        return new PricingOrFareBasisDiscrepancyWarning();
    }

    /**
     * Create an instance of {@link AdditionalServicesUnpriceableWarning }
     * 
     */
    public AdditionalServicesUnpriceableWarning createAdditionalServicesUnpriceableWarning() {
        return new AdditionalServicesUnpriceableWarning();
    }

    /**
     * Create an instance of {@link LowAvailabilityWarning }
     * 
     */
    public LowAvailabilityWarning createLowAvailabilityWarning() {
        return new LowAvailabilityWarning();
    }

    /**
     * Create an instance of {@link AirlineRemark }
     * 
     */
    public AirlineRemark createAirlineRemark() {
        return new AirlineRemark();
    }

    /**
     * Create an instance of {@link Remark }
     * 
     */
    public Remark createRemark() {
        return new Remark();
    }

    /**
     * Create an instance of {@link CategorisedRemark }
     * 
     */
    public CategorisedRemark createCategorisedRemark() {
        return new CategorisedRemark();
    }

    /**
     * Create an instance of {@link ImmediateAmadeusRecordQueuing }
     * 
     */
    public ImmediateAmadeusRecordQueuing createImmediateAmadeusRecordQueuing() {
        return new ImmediateAmadeusRecordQueuing();
    }

    /**
     * Create an instance of {@link DelayedAmadeusRecordQueuing }
     * 
     */
    public DelayedAmadeusRecordQueuing createDelayedAmadeusRecordQueuing() {
        return new DelayedAmadeusRecordQueuing();
    }

    /**
     * Create an instance of {@link ConnectionPoints }
     * 
     */
    public ConnectionPoints createConnectionPoints() {
        return new ConnectionPoints();
    }

    /**
     * Create an instance of {@link ConnectionPoint }
     * 
     */
    public ConnectionPoint createConnectionPoint() {
        return new ConnectionPoint();
    }

    /**
     * Create an instance of {@link GetInfoRequestPricingsByItineraryGroup }
     * 
     */
    public GetInfoRequestPricingsByItineraryGroup createGetInfoRequestPricingsByItineraryGroup() {
        return new GetInfoRequestPricingsByItineraryGroup();
    }

    /**
     * Create an instance of {@link GetInfoRequestPricingByItineraryGroup }
     * 
     */
    public GetInfoRequestPricingByItineraryGroup createGetInfoRequestPricingByItineraryGroup() {
        return new GetInfoRequestPricingByItineraryGroup();
    }

    /**
     * Create an instance of {@link GetInfoRequestPassengerPricingList }
     * 
     */
    public GetInfoRequestPassengerPricingList createGetInfoRequestPassengerPricingList() {
        return new GetInfoRequestPassengerPricingList();
    }

    /**
     * Create an instance of {@link BookRequestPricingDetail }
     * 
     */
    public BookRequestPricingDetail createBookRequestPricingDetail() {
        return new BookRequestPricingDetail();
    }

    /**
     * Create an instance of {@link BookRequestTotalAmount }
     * 
     */
    public BookRequestTotalAmount createBookRequestTotalAmount() {
        return new BookRequestTotalAmount();
    }

    /**
     * Create an instance of {@link BookRequestFees }
     * 
     */
    public BookRequestFees createBookRequestFees() {
        return new BookRequestFees();
    }

    /**
     * Create an instance of {@link BookRequestAdditionalServices }
     * 
     */
    public BookRequestAdditionalServices createBookRequestAdditionalServices() {
        return new BookRequestAdditionalServices();
    }

    /**
     * Create an instance of {@link BookRequestPricingsByItineraryGroup }
     * 
     */
    public BookRequestPricingsByItineraryGroup createBookRequestPricingsByItineraryGroup() {
        return new BookRequestPricingsByItineraryGroup();
    }

    /**
     * Create an instance of {@link BookRequestPricingByItineraryGroup }
     * 
     */
    public BookRequestPricingByItineraryGroup createBookRequestPricingByItineraryGroup() {
        return new BookRequestPricingByItineraryGroup();
    }

    /**
     * Create an instance of {@link Recommendation }
     * 
     */
    public Recommendation createRecommendation() {
        return new Recommendation();
    }

    /**
     * Create an instance of {@link OneWayRecommendation }
     * 
     */
    public OneWayRecommendation createOneWayRecommendation() {
        return new OneWayRecommendation();
    }

    /**
     * Create an instance of {@link LowFareSearchResponsePricingDetail }
     * 
     */
    public LowFareSearchResponsePricingDetail createLowFareSearchResponsePricingDetail() {
        return new LowFareSearchResponsePricingDetail();
    }

    /**
     * Create an instance of {@link LowFareSearchResponseFees }
     * 
     */
    public LowFareSearchResponseFees createLowFareSearchResponseFees() {
        return new LowFareSearchResponseFees();
    }

    /**
     * Create an instance of {@link LowFareSearchResponseAdditionalServices }
     * 
     */
    public LowFareSearchResponseAdditionalServices createLowFareSearchResponseAdditionalServices() {
        return new LowFareSearchResponseAdditionalServices();
    }

    /**
     * Create an instance of {@link PerPassegerCurrencyAmount }
     * 
     */
    public PerPassegerCurrencyAmount createPerPassegerCurrencyAmount() {
        return new PerPassegerCurrencyAmount();
    }

    /**
     * Create an instance of {@link LowFareSearchWarning }
     * 
     */
    public LowFareSearchWarning createLowFareSearchWarning() {
        return new LowFareSearchWarning();
    }

    /**
     * Create an instance of {@link IncompleteSearchWarning }
     * 
     */
    public IncompleteSearchWarning createIncompleteSearchWarning() {
        return new IncompleteSearchWarning();
    }

    /**
     * Create an instance of {@link UnusedLowFareSearchParameterWarning }
     * 
     */
    public UnusedLowFareSearchParameterWarning createUnusedLowFareSearchParameterWarning() {
        return new UnusedLowFareSearchParameterWarning();
    }

    /**
     * Create an instance of {@link IncompleteOneWayCombinableSearchWarning }
     * 
     */
    public IncompleteOneWayCombinableSearchWarning createIncompleteOneWayCombinableSearchWarning() {
        return new IncompleteOneWayCombinableSearchWarning();
    }

    /**
     * Create an instance of {@link PaymentCardFeeMissingWarning }
     * 
     */
    public PaymentCardFeeMissingWarning createPaymentCardFeeMissingWarning() {
        return new PaymentCardFeeMissingWarning();
    }

    /**
     * Create an instance of {@link PassengerFareOptionGroupsInconsistency }
     * 
     */
    public PassengerFareOptionGroupsInconsistency createPassengerFareOptionGroupsInconsistency() {
        return new PassengerFareOptionGroupsInconsistency();
    }

    /**
     * Create an instance of {@link FareRule }
     * 
     */
    public FareRule createFareRule() {
        return new FareRule();
    }

    /**
     * Create an instance of {@link PaymentCardFee }
     * 
     */
    public PaymentCardFee createPaymentCardFee() {
        return new PaymentCardFee();
    }

    /**
     * Create an instance of {@link InconsistentGetFareNotesRequestFault }
     * 
     */
    public InconsistentGetFareNotesRequestFault createInconsistentGetFareNotesRequestFault() {
        return new InconsistentGetFareNotesRequestFault();
    }

    /**
     * Create an instance of {@link FareRulesDescriptions }
     * 
     */
    public FareRulesDescriptions createFareRulesDescriptions() {
        return new FareRulesDescriptions();
    }

    /**
     * Create an instance of {@link IncompleteGetInfoWarning }
     * 
     */
    public IncompleteGetInfoWarning createIncompleteGetInfoWarning() {
        return new IncompleteGetInfoWarning();
    }

    /**
     * Create an instance of {@link IncompleteGetFareNotesRequestWarning }
     * 
     */
    public IncompleteGetFareNotesRequestWarning createIncompleteGetFareNotesRequestWarning() {
        return new IncompleteGetFareNotesRequestWarning();
    }

    /**
     * Create an instance of {@link IncompleteFareNotesWarning }
     * 
     */
    public IncompleteFareNotesWarning createIncompleteFareNotesWarning() {
        return new IncompleteFareNotesWarning();
    }

    /**
     * Create an instance of {@link IncompletePaymentCardFeeWarning }
     * 
     */
    public IncompletePaymentCardFeeWarning createIncompletePaymentCardFeeWarning() {
        return new IncompletePaymentCardFeeWarning();
    }

    /**
     * Create an instance of {@link GetInfoWarning }
     * 
     */
    public GetInfoWarning createGetInfoWarning() {
        return new GetInfoWarning();
    }

    /**
     * Create an instance of {@link GetInfoFault }
     * 
     */
    public GetInfoFault createGetInfoFault() {
        return new GetInfoFault();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponsePricingsByItineraryGroup }
     * 
     */
    public PriceWithInfoResponsePricingsByItineraryGroup createPriceWithInfoResponsePricingsByItineraryGroup() {
        return new PriceWithInfoResponsePricingsByItineraryGroup();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponsePricingByItineraryGroup }
     * 
     */
    public PriceWithInfoResponsePricingByItineraryGroup createPriceWithInfoResponsePricingByItineraryGroup() {
        return new PriceWithInfoResponsePricingByItineraryGroup();
    }

    /**
     * Create an instance of {@link PriceWithInfoPassengerPricingInconsistency }
     * 
     */
    public PriceWithInfoPassengerPricingInconsistency createPriceWithInfoPassengerPricingInconsistency() {
        return new PriceWithInfoPassengerPricingInconsistency();
    }

    /**
     * Create an instance of {@link IncompletePriceWithInfoPassengerPricingList }
     * 
     */
    public IncompletePriceWithInfoPassengerPricingList createIncompletePriceWithInfoPassengerPricingList() {
        return new IncompletePriceWithInfoPassengerPricingList();
    }

    /**
     * Create an instance of {@link IncompletePriceWithInfoPassengerPricing }
     * 
     */
    public IncompletePriceWithInfoPassengerPricing createIncompletePriceWithInfoPassengerPricing() {
        return new IncompletePriceWithInfoPassengerPricing();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponsePassengerPricingList }
     * 
     */
    public PriceWithInfoResponsePassengerPricingList createPriceWithInfoResponsePassengerPricingList() {
        return new PriceWithInfoResponsePassengerPricingList();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponsePassengerPricing }
     * 
     */
    public PriceWithInfoResponsePassengerPricing createPriceWithInfoResponsePassengerPricing() {
        return new PriceWithInfoResponsePassengerPricing();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponsePassengerPricingSegmentDetailList }
     * 
     */
    public PriceWithInfoResponsePassengerPricingSegmentDetailList createPriceWithInfoResponsePassengerPricingSegmentDetailList() {
        return new PriceWithInfoResponsePassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponsePassengerPricingSegmentDetail }
     * 
     */
    public PriceWithInfoResponsePassengerPricingSegmentDetail createPriceWithInfoResponsePassengerPricingSegmentDetail() {
        return new PriceWithInfoResponsePassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponsePricingDetail }
     * 
     */
    public PriceWithInfoResponsePricingDetail createPriceWithInfoResponsePricingDetail() {
        return new PriceWithInfoResponsePricingDetail();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponseTotalAmount }
     * 
     */
    public PriceWithInfoResponseTotalAmount createPriceWithInfoResponseTotalAmount() {
        return new PriceWithInfoResponseTotalAmount();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponseFees }
     * 
     */
    public PriceWithInfoResponseFees createPriceWithInfoResponseFees() {
        return new PriceWithInfoResponseFees();
    }

    /**
     * Create an instance of {@link PriceWithInfoResponseAdditionalServices }
     * 
     */
    public PriceWithInfoResponseAdditionalServices createPriceWithInfoResponseAdditionalServices() {
        return new PriceWithInfoResponseAdditionalServices();
    }

    /**
     * Create an instance of {@link PriceRequestPricingDetail }
     * 
     */
    public PriceRequestPricingDetail createPriceRequestPricingDetail() {
        return new PriceRequestPricingDetail();
    }

    /**
     * Create an instance of {@link PriceRequestFees }
     * 
     */
    public PriceRequestFees createPriceRequestFees() {
        return new PriceRequestFees();
    }

    /**
     * Create an instance of {@link PriceRequestAdditionalServices }
     * 
     */
    public PriceRequestAdditionalServices createPriceRequestAdditionalServices() {
        return new PriceRequestAdditionalServices();
    }

    /**
     * Create an instance of {@link PriceWithInfoRequestPricingByItineraryGroup }
     * 
     */
    public PriceWithInfoRequestPricingByItineraryGroup createPriceWithInfoRequestPricingByItineraryGroup() {
        return new PriceWithInfoRequestPricingByItineraryGroup();
    }

    /**
     * Create an instance of {@link PriceWithInfoRequestPricingsByItineraryGroup }
     * 
     */
    public PriceWithInfoRequestPricingsByItineraryGroup createPriceWithInfoRequestPricingsByItineraryGroup() {
        return new PriceWithInfoRequestPricingsByItineraryGroup();
    }

    /**
     * Create an instance of {@link PriceWithInfoRequestPassengerPricingList }
     * 
     */
    public PriceWithInfoRequestPassengerPricingList createPriceWithInfoRequestPassengerPricingList() {
        return new PriceWithInfoRequestPassengerPricingList();
    }

    /**
     * Create an instance of {@link BookingClass }
     * 
     */
    public BookingClass createBookingClass() {
        return new BookingClass();
    }

    /**
     * Create an instance of {@link NegoSpaceInfo }
     * 
     */
    public NegoSpaceInfo createNegoSpaceInfo() {
        return new NegoSpaceInfo();
    }

    /**
     * Create an instance of {@link MissingSearchWarning }
     * 
     */
    public MissingSearchWarning createMissingSearchWarning() {
        return new MissingSearchWarning();
    }

    /**
     * Create an instance of {@link MissingPaymentCard }
     * 
     */
    public MissingPaymentCard createMissingPaymentCard() {
        return new MissingPaymentCard();
    }

    /**
     * Create an instance of {@link ErrorDuringPnrCreationAfterBookingWarning }
     * 
     */
    public ErrorDuringPnrCreationAfterBookingWarning createErrorDuringPnrCreationAfterBookingWarning() {
        return new ErrorDuringPnrCreationAfterBookingWarning();
    }

    /**
     * Create an instance of {@link SSRDocsNotAddedBookingWarning }
     * 
     */
    public SSRDocsNotAddedBookingWarning createSSRDocsNotAddedBookingWarning() {
        return new SSRDocsNotAddedBookingWarning();
    }

    /**
     * Create an instance of {@link RecordWarning }
     * 
     */
    public RecordWarning createRecordWarning() {
        return new RecordWarning();
    }

    /**
     * Create an instance of {@link ErrorDuringQueueingAfterBookingWarning }
     * 
     */
    public ErrorDuringQueueingAfterBookingWarning createErrorDuringQueueingAfterBookingWarning() {
        return new ErrorDuringQueueingAfterBookingWarning();
    }

    /**
     * Create an instance of {@link KeywordRemarkNotAddedToBookingWarning }
     * 
     */
    public KeywordRemarkNotAddedToBookingWarning createKeywordRemarkNotAddedToBookingWarning() {
        return new KeywordRemarkNotAddedToBookingWarning();
    }

    /**
     * Create an instance of {@link OtherSpecialServiceRequestRemarkNotAddedToBookingWarning }
     * 
     */
    public OtherSpecialServiceRequestRemarkNotAddedToBookingWarning createOtherSpecialServiceRequestRemarkNotAddedToBookingWarning() {
        return new OtherSpecialServiceRequestRemarkNotAddedToBookingWarning();
    }

    /**
     * Create an instance of {@link PassengerPriceDiscrepancy }
     * 
     */
    public PassengerPriceDiscrepancy createPassengerPriceDiscrepancy() {
        return new PassengerPriceDiscrepancy();
    }

    /**
     * Create an instance of {@link BookingWithPriceMarginWarning }
     * 
     */
    public BookingWithPriceMarginWarning createBookingWithPriceMarginWarning() {
        return new BookingWithPriceMarginWarning();
    }

    /**
     * Create an instance of {@link LowAvailabilityBookWarning }
     * 
     */
    public LowAvailabilityBookWarning createLowAvailabilityBookWarning() {
        return new LowAvailabilityBookWarning();
    }

    /**
     * Create an instance of {@link AdditionalServicesUnpriceableBookWarning }
     * 
     */
    public AdditionalServicesUnpriceableBookWarning createAdditionalServicesUnpriceableBookWarning() {
        return new AdditionalServicesUnpriceableBookWarning();
    }

    /**
     * Create an instance of {@link TicketAgreementErrorAfterBookingWarning }
     * 
     */
    public TicketAgreementErrorAfterBookingWarning createTicketAgreementErrorAfterBookingWarning() {
        return new TicketAgreementErrorAfterBookingWarning();
    }

    /**
     * Create an instance of {@link BookWarning }
     * 
     */
    public BookWarning createBookWarning() {
        return new BookWarning();
    }

    /**
     * Create an instance of {@link BookResponsePricing }
     * 
     */
    public BookResponsePricing createBookResponsePricing() {
        return new BookResponsePricing();
    }

    /**
     * Create an instance of {@link BookResponsePricingsByItineraryGroup }
     * 
     */
    public BookResponsePricingsByItineraryGroup createBookResponsePricingsByItineraryGroup() {
        return new BookResponsePricingsByItineraryGroup();
    }

    /**
     * Create an instance of {@link BookResponsePricingByItineraryGroup }
     * 
     */
    public BookResponsePricingByItineraryGroup createBookResponsePricingByItineraryGroup() {
        return new BookResponsePricingByItineraryGroup();
    }

    /**
     * Create an instance of {@link BookPassengerPricingInconsistency }
     * 
     */
    public BookPassengerPricingInconsistency createBookPassengerPricingInconsistency() {
        return new BookPassengerPricingInconsistency();
    }

    /**
     * Create an instance of {@link IncompleteBookPassengerPricingList }
     * 
     */
    public IncompleteBookPassengerPricingList createIncompleteBookPassengerPricingList() {
        return new IncompleteBookPassengerPricingList();
    }

    /**
     * Create an instance of {@link BookResponsePassengerPricingList }
     * 
     */
    public BookResponsePassengerPricingList createBookResponsePassengerPricingList() {
        return new BookResponsePassengerPricingList();
    }

    /**
     * Create an instance of {@link IncompleteBookPassengerPricing }
     * 
     */
    public IncompleteBookPassengerPricing createIncompleteBookPassengerPricing() {
        return new IncompleteBookPassengerPricing();
    }

    /**
     * Create an instance of {@link BookResponsePassengerPricing }
     * 
     */
    public BookResponsePassengerPricing createBookResponsePassengerPricing() {
        return new BookResponsePassengerPricing();
    }

    /**
     * Create an instance of {@link BookResponsePassengerPricingSegmentDetailList }
     * 
     */
    public BookResponsePassengerPricingSegmentDetailList createBookResponsePassengerPricingSegmentDetailList() {
        return new BookResponsePassengerPricingSegmentDetailList();
    }

    /**
     * Create an instance of {@link BookResponsePassengerPricingSegmentDetail }
     * 
     */
    public BookResponsePassengerPricingSegmentDetail createBookResponsePassengerPricingSegmentDetail() {
        return new BookResponsePassengerPricingSegmentDetail();
    }

    /**
     * Create an instance of {@link BookResponsePricingDetail }
     * 
     */
    public BookResponsePricingDetail createBookResponsePricingDetail() {
        return new BookResponsePricingDetail();
    }

    /**
     * Create an instance of {@link BookResponseTotalAmount }
     * 
     */
    public BookResponseTotalAmount createBookResponseTotalAmount() {
        return new BookResponseTotalAmount();
    }

    /**
     * Create an instance of {@link BookResponseFees }
     * 
     */
    public BookResponseFees createBookResponseFees() {
        return new BookResponseFees();
    }

    /**
     * Create an instance of {@link BookResponseAdditionalServices }
     * 
     */
    public BookResponseAdditionalServices createBookResponseAdditionalServices() {
        return new BookResponseAdditionalServices();
    }

    /**
     * Create an instance of {@link ErrorAfterBookingWhileDisplayingTSTWarning.Records }
     * 
     */
    public ErrorAfterBookingWhileDisplayingTSTWarning.Records createErrorAfterBookingWhileDisplayingTSTWarningRecords() {
        return new ErrorAfterBookingWhileDisplayingTSTWarning.Records();
    }

    /**
     * Create an instance of {@link UnconfirmedBookingWarning.UnconfirmedSegments.UnconfirmedSegment }
     * 
     */
    public UnconfirmedBookingWarning.UnconfirmedSegments.UnconfirmedSegment createUnconfirmedBookingWarningUnconfirmedSegmentsUnconfirmedSegment() {
        return new UnconfirmedBookingWarning.UnconfirmedSegments.UnconfirmedSegment();
    }

    /**
     * Create an instance of {@link InconsistentPassenger.PersonalInformationInconsistencies }
     * 
     */
    public InconsistentPassenger.PersonalInformationInconsistencies createInconsistentPassengerPersonalInformationInconsistencies() {
        return new InconsistentPassenger.PersonalInformationInconsistencies();
    }

    /**
     * Create an instance of {@link DetailedSegment.Stops }
     * 
     */
    public DetailedSegment.Stops createDetailedSegmentStops() {
        return new DetailedSegment.Stops();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponseDetailedSegment.BookingClasses }
     * 
     */
    public AvailabilitySearchResponseDetailedSegment.BookingClasses createAvailabilitySearchResponseDetailedSegmentBookingClasses() {
        return new AvailabilitySearchResponseDetailedSegment.BookingClasses();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponseDetailedItinerary.Segments }
     * 
     */
    public AvailabilitySearchResponseDetailedItinerary.Segments createAvailabilitySearchResponseDetailedItinerarySegments() {
        return new AvailabilitySearchResponseDetailedItinerary.Segments();
    }

    /**
     * Create an instance of {@link LowFareSearchTravelClassRestrictions.TravelClassRestriction }
     * 
     */
    public LowFareSearchTravelClassRestrictions.TravelClassRestriction createLowFareSearchTravelClassRestrictionsTravelClassRestriction() {
        return new LowFareSearchTravelClassRestrictions.TravelClassRestriction();
    }

    /**
     * Create an instance of {@link LuggageFee.Passengers }
     * 
     */
    public LuggageFee.Passengers createLuggageFeePassengers() {
        return new LuggageFee.Passengers();
    }

    /**
     * Create an instance of {@link OptionDiscardedSearchWarning.SearchOptions }
     * 
     */
    public OptionDiscardedSearchWarning.SearchOptions createOptionDiscardedSearchWarningSearchOptions() {
        return new OptionDiscardedSearchWarning.SearchOptions();
    }

    /**
     * Create an instance of {@link InconsistentRemark.Remarks }
     * 
     */
    public InconsistentRemark.Remarks createInconsistentRemarkRemarks() {
        return new InconsistentRemark.Remarks();
    }

    /**
     * Create an instance of {@link Passport.Issuance }
     * 
     */
    public Passport.Issuance createPassportIssuance() {
        return new Passport.Issuance();
    }

    /**
     * Create an instance of {@link Passport.Residence }
     * 
     */
    public Passport.Residence createPassportResidence() {
        return new Passport.Residence();
    }

    /**
     * Create an instance of {@link AirAmadeusQueue.Category }
     * 
     */
    public AirAmadeusQueue.Category createAirAmadeusQueueCategory() {
        return new AirAmadeusQueue.Category();
    }

    /**
     * Create an instance of {@link InconsistentSegmentDetail.SegmentDetailInconsistencies }
     * 
     */
    public InconsistentSegmentDetail.SegmentDetailInconsistencies createInconsistentSegmentDetailSegmentDetailInconsistencies() {
        return new InconsistentSegmentDetail.SegmentDetailInconsistencies();
    }

    /**
     * Create an instance of {@link AdditionalServicesInconsistency.LuggageInconsistency }
     * 
     */
    public AdditionalServicesInconsistency.LuggageInconsistency createAdditionalServicesInconsistencyLuggageInconsistency() {
        return new AdditionalServicesInconsistency.LuggageInconsistency();
    }

    /**
     * Create an instance of {@link DateTimeRange.DateRange }
     * 
     */
    public DateTimeRange.DateRange createDateTimeRangeDateRange() {
        return new DateTimeRange.DateRange();
    }

    /**
     * Create an instance of {@link LuggageAllowance.Passengers }
     * 
     */
    public LuggageAllowance.Passengers createLuggageAllowancePassengers() {
        return new LuggageAllowance.Passengers();
    }

    /**
     * Create an instance of {@link LuggageAllowance.Segments }
     * 
     */
    public LuggageAllowance.Segments createLuggageAllowanceSegments() {
        return new LuggageAllowance.Segments();
    }

    /**
     * Create an instance of {@link TaxList.Tax }
     * 
     */
    public TaxList.Tax createTaxListTax() {
        return new TaxList.Tax();
    }

    /**
     * Create an instance of {@link AirRecord.Passengers }
     * 
     */
    public AirRecord.Passengers createAirRecordPassengers() {
        return new AirRecord.Passengers();
    }

    /**
     * Create an instance of {@link AirRecord.ExternalRecords }
     * 
     */
    public AirRecord.ExternalRecords createAirRecordExternalRecords() {
        return new AirRecord.ExternalRecords();
    }

    /**
     * Create an instance of {@link AirRecord.AutomaticProcesses }
     * 
     */
    public AirRecord.AutomaticProcesses createAirRecordAutomaticProcesses() {
        return new AirRecord.AutomaticProcesses();
    }

    /**
     * Create an instance of {@link SeatedPassengerAdditionalServices.Luggages }
     * 
     */
    public SeatedPassengerAdditionalServices.Luggages createSeatedPassengerAdditionalServicesLuggages() {
        return new SeatedPassengerAdditionalServices.Luggages();
    }

    /**
     * Create an instance of {@link com.europlayas.amadeus.bindings.NamedPassenger.Remarks }
     * 
     */
    public com.europlayas.amadeus.bindings.NamedPassenger.Remarks createNamedPassengerRemarks() {
        return new com.europlayas.amadeus.bindings.NamedPassenger.Remarks();
    }

    /**
     * Create an instance of {@link com.europlayas.amadeus.bindings.SeatedNamedPassenger.AccommodationPreferences }
     * 
     */
    public com.europlayas.amadeus.bindings.SeatedNamedPassenger.AccommodationPreferences createSeatedNamedPassengerAccommodationPreferences() {
        return new com.europlayas.amadeus.bindings.SeatedNamedPassenger.AccommodationPreferences();
    }

    /**
     * Create an instance of {@link Redress.Issuance }
     * 
     */
    public Redress.Issuance createRedressIssuance() {
        return new Redress.Issuance();
    }

    /**
     * Create an instance of {@link Redress.Validity }
     * 
     */
    public Redress.Validity createRedressValidity() {
        return new Redress.Validity();
    }

    /**
     * Create an instance of {@link Redress.PersonalInformation }
     * 
     */
    public Redress.PersonalInformation createRedressPersonalInformation() {
        return new Redress.PersonalInformation();
    }

    /**
     * Create an instance of {@link DetailedItinerary.Segments }
     * 
     */
    public DetailedItinerary.Segments createDetailedItinerarySegments() {
        return new DetailedItinerary.Segments();
    }

    /**
     * Create an instance of {@link AdditionalRecordDataInconsistency.InconsistentPayments }
     * 
     */
    public AdditionalRecordDataInconsistency.InconsistentPayments createAdditionalRecordDataInconsistencyInconsistentPayments() {
        return new AdditionalRecordDataInconsistency.InconsistentPayments();
    }

    /**
     * Create an instance of {@link PassengersInconsistency.UnsupportedPassengers }
     * 
     */
    public PassengersInconsistency.UnsupportedPassengers createPassengersInconsistencyUnsupportedPassengers() {
        return new PassengersInconsistency.UnsupportedPassengers();
    }

    /**
     * Create an instance of {@link NamedPassengersInconsistency.InconsistentPassengers }
     * 
     */
    public NamedPassengersInconsistency.InconsistentPassengers createNamedPassengersInconsistencyInconsistentPassengers() {
        return new NamedPassengersInconsistency.InconsistentPassengers();
    }

    /**
     * Create an instance of {@link NamedPassengersInconsistency.LoyaltyProgramInconsistency }
     * 
     */
    public NamedPassengersInconsistency.LoyaltyProgramInconsistency createNamedPassengersInconsistencyLoyaltyProgramInconsistency() {
        return new NamedPassengersInconsistency.LoyaltyProgramInconsistency();
    }

    /**
     * Create an instance of {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes }
     * 
     */
    public NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes createNamedPassengersInconsistencyAccommodationPreferenceInconsistencyMealCodes() {
        return new NamedPassengersInconsistency.AccommodationPreferenceInconsistency.MealCodes();
    }

    /**
     * Create an instance of {@link NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers }
     * 
     */
    public NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers createNamedPassengersInconsistencyAccommodationPreferenceInconsistencySeatNumbers() {
        return new NamedPassengersInconsistency.AccommodationPreferenceInconsistency.SeatNumbers();
    }

    /**
     * Create an instance of {@link BookPricingInconsistency.PassengerPricingInconsistencies }
     * 
     */
    public BookPricingInconsistency.PassengerPricingInconsistencies createBookPricingInconsistencyPassengerPricingInconsistencies() {
        return new BookPricingInconsistency.PassengerPricingInconsistencies();
    }

    /**
     * Create an instance of {@link Booking.Records }
     * 
     */
    public Booking.Records createBookingRecords() {
        return new Booking.Records();
    }

    /**
     * Create an instance of {@link InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction }
     * 
     */
    public InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction createInconsistentAvailabilitySearchRequestFaultConnectionInconsistencyDirectItineraryRestriction() {
        return new InconsistentAvailabilitySearchRequestFault.ConnectionInconsistency.DirectItineraryRestriction();
    }

    /**
     * Create an instance of {@link AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries }
     * 
     */
    public AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries createAvailabilitySearchResponseOriginDestinationsOriginDestinationItineraries() {
        return new AvailabilitySearchResponse.OriginDestinations.OriginDestination.Itineraries();
    }

    /**
     * Create an instance of {@link TravelPreferences.DirectItineraryRestriction }
     * 
     */
    public TravelPreferences.DirectItineraryRestriction createTravelPreferencesDirectItineraryRestriction() {
        return new TravelPreferences.DirectItineraryRestriction();
    }

    /**
     * Create an instance of {@link AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime }
     * 
     */
    public AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime createAvailabilitySearchRequestJourneyOriginDestinationsOriginDestinationArrivalDateTime() {
        return new AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.ArrivalDateTime();
    }

    /**
     * Create an instance of {@link AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime }
     * 
     */
    public AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime createAvailabilitySearchRequestJourneyOriginDestinationsOriginDestinationDepartureDateTime() {
        return new AvailabilitySearchRequest.Journey.OriginDestinations.OriginDestination.DepartureDateTime();
    }

    /**
     * Create an instance of {@link LowFareSearchRequest.SearchPreferences.OneWayCombinable }
     * 
     */
    public LowFareSearchRequest.SearchPreferences.OneWayCombinable createLowFareSearchRequestSearchPreferencesOneWayCombinable() {
        return new LowFareSearchRequest.SearchPreferences.OneWayCombinable();
    }

    /**
     * Create an instance of {@link LowFareSearchRequest.SearchPreferences.DisableProviders }
     * 
     */
    public LowFareSearchRequest.SearchPreferences.DisableProviders createLowFareSearchRequestSearchPreferencesDisableProviders() {
        return new LowFareSearchRequest.SearchPreferences.DisableProviders();
    }

    /**
     * Create an instance of {@link LowFareSearchTravelPreferences.DirectItineraryRestriction }
     * 
     */
    public LowFareSearchTravelPreferences.DirectItineraryRestriction createLowFareSearchTravelPreferencesDirectItineraryRestriction() {
        return new LowFareSearchTravelPreferences.DirectItineraryRestriction();
    }

    /**
     * Create an instance of {@link LowFareSearchRequest.Journey.OriginDestinations }
     * 
     */
    public LowFareSearchRequest.Journey.OriginDestinations createLowFareSearchRequestJourneyOriginDestinations() {
        return new LowFareSearchRequest.Journey.OriginDestinations();
    }

    /**
     * Create an instance of {@link GetInfoResponse.FareRules.Warnings }
     * 
     */
    public GetInfoResponse.FareRules.Warnings createGetInfoResponseFareRulesWarnings() {
        return new GetInfoResponse.FareRules.Warnings();
    }

    /**
     * Create an instance of {@link com.europlayas.amadeus.bindings.TicketingRequirements.TicketingRequirement }
     * 
     */
    public com.europlayas.amadeus.bindings.TicketingRequirements.TicketingRequirement createTicketingRequirementsTicketingRequirement() {
        return new com.europlayas.amadeus.bindings.TicketingRequirements.TicketingRequirement();
    }

    /**
     * Create an instance of {@link BookingRequirements.PaymentCardRequired }
     * 
     */
    public BookingRequirements.PaymentCardRequired createBookingRequirementsPaymentCardRequired() {
        return new BookingRequirements.PaymentCardRequired();
    }

    /**
     * Create an instance of {@link BookingRequirements.Passengers.Passenger.ContactInformation }
     * 
     */
    public BookingRequirements.Passengers.Passenger.ContactInformation createBookingRequirementsPassengersPassengerContactInformation() {
        return new BookingRequirements.Passengers.Passenger.ContactInformation();
    }

    /**
     * Create an instance of {@link DetailedJourney.Itineraries }
     * 
     */
    public DetailedJourney.Itineraries createDetailedJourneyItineraries() {
        return new DetailedJourney.Itineraries();
    }

    /**
     * Create an instance of {@link LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries }
     * 
     */
    public LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries createLowFareSearchResponseOriginDestinationsOriginDestinationItineraries() {
        return new LowFareSearchResponse.OriginDestinations.OriginDestination.Itineraries();
    }

    /**
     * Create an instance of {@link BookRequest.AmadeusRecordQueuing.ImmediateQueuings }
     * 
     */
    public BookRequest.AmadeusRecordQueuing.ImmediateQueuings createBookRequestAmadeusRecordQueuingImmediateQueuings() {
        return new BookRequest.AmadeusRecordQueuing.ImmediateQueuings();
    }

    /**
     * Create an instance of {@link BookRequest.AmadeusRecordQueuing.DelayedQueuings }
     * 
     */
    public BookRequest.AmadeusRecordQueuing.DelayedQueuings createBookRequestAmadeusRecordQueuingDelayedQueuings() {
        return new BookRequest.AmadeusRecordQueuing.DelayedQueuings();
    }

    /**
     * Create an instance of {@link AdditionalRecordData.Remarks }
     * 
     */
    public AdditionalRecordData.Remarks createAdditionalRecordDataRemarks() {
        return new AdditionalRecordData.Remarks();
    }

    /**
     * Create an instance of {@link AdditionalRecordData.Payments }
     * 
     */
    public AdditionalRecordData.Payments createAdditionalRecordDataPayments() {
        return new AdditionalRecordData.Payments();
    }

    /**
     * Create an instance of {@link com.europlayas.amadeus.bindings.Journey.Itineraries }
     * 
     */
    public com.europlayas.amadeus.bindings.Journey.Itineraries createJourneyItineraries() {
        return new com.europlayas.amadeus.bindings.Journey.Itineraries();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InconsistentGetInfoRequestFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.amadeus.fr/air", name = "inconsistentGetInfoRequestFault")
    public JAXBElement<InconsistentGetInfoRequestFault> createInconsistentGetInfoRequestFault(InconsistentGetInfoRequestFault value) {
        return new JAXBElement<InconsistentGetInfoRequestFault>(_InconsistentGetInfoRequestFault_QNAME, InconsistentGetInfoRequestFault.class, null, value);
    }

}
