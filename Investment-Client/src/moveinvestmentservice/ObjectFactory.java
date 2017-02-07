
package moveinvestmentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the moveinvestmentservice package. 
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

    private final static QName _InvestmentValue_QNAME = new QName("http://MoveInvestmentService/", "investmentValue");
    private final static QName _InvestmentValueResponse_QNAME = new QName("http://MoveInvestmentService/", "investmentValueResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: moveinvestmentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvestmentValue }
     * 
     */
    public InvestmentValue createInvestmentValue() {
        return new InvestmentValue();
    }

    /**
     * Create an instance of {@link InvestmentValueResponse }
     * 
     */
    public InvestmentValueResponse createInvestmentValueResponse() {
        return new InvestmentValueResponse();
    }

    /**
     * Create an instance of {@link Stock }
     * 
     */
    public Stock createStock() {
        return new Stock();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MoveInvestmentService/", name = "investmentValue")
    public JAXBElement<InvestmentValue> createInvestmentValue(InvestmentValue value) {
        return new JAXBElement<InvestmentValue>(_InvestmentValue_QNAME, InvestmentValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MoveInvestmentService/", name = "investmentValueResponse")
    public JAXBElement<InvestmentValueResponse> createInvestmentValueResponse(InvestmentValueResponse value) {
        return new JAXBElement<InvestmentValueResponse>(_InvestmentValueResponse_QNAME, InvestmentValueResponse.class, null, value);
    }

}
