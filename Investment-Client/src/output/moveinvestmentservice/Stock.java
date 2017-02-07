
package moveinvestmentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latestPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="previousPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stock", propOrder = {
    "latestPrice",
    "previousPrice"
})
public class Stock {

    protected double latestPrice;
    protected double previousPrice;

    /**
     * Gets the value of the latestPrice property.
     * 
     */
    public double getLatestPrice() {
        return latestPrice;
    }

    /**
     * Sets the value of the latestPrice property.
     * 
     */
    public void setLatestPrice(double value) {
        this.latestPrice = value;
    }

    /**
     * Gets the value of the previousPrice property.
     * 
     */
    public double getPreviousPrice() {
        return previousPrice;
    }

    /**
     * Sets the value of the previousPrice property.
     * 
     */
    public void setPreviousPrice(double value) {
        this.previousPrice = value;
    }

}
