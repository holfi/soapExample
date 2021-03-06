//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.15 at 04:36:20 PM MSK 
//

package com.example.studsoap.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindStudentMFCRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindStudentMFCRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="universityInfo" type="{http://proxy.std.msr.com/schemas}UniversityInfo"/&gt;
 *         &lt;element name="personInfo" type="{http://proxy.std.msr.com/schemas}SearchBean"/&gt;
 *         &lt;element name="department" type="{http://proxy.std.msr.com/schemas}Department"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindStudentMFCRequest", propOrder = {
    "universityInfo",
    "personInfo",
    "department"
})
public class FindStudentMFCRequest {

    @XmlElement(required = true)
    protected UniversityInfo universityInfo;
    @XmlElement(required = true)
    protected SearchBean personInfo;
    @XmlElement(required = true)
    protected Department department;

    /**
     * Gets the value of the universityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniversityInfo }
     *     
     */
    public UniversityInfo getUniversityInfo() {
        return universityInfo;
    }

    /**
     * Sets the value of the universityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversityInfo }
     *     
     */
    public void setUniversityInfo(UniversityInfo value) {
        this.universityInfo = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBean }
     *     
     */
    public SearchBean getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBean }
     *     
     */
    public void setPersonInfo(SearchBean value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    @Override
    public String toString() {
        return "FindStudentMFCRequest{" +
                "universityInfo=" + universityInfo +
                ", personInfo=" + personInfo +
                ", department=" + department +
                '}';
    }
}
