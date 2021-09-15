//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.15 at 04:36:20 PM MSK 
//


package com.example.studsoap.schemas;

import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.msr.std.proxy.schemas package. 
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
@Component
public class ObjectFactory {

    private final static QName _FindStudentMFCRequest_QNAME = new QName("http://proxy.std.msr.com/schemas", "findStudentMFCRequest");
    private final static QName _FindStudentMFCResponse_QNAME = new QName("http://proxy.std.msr.com/schemas", "findStudentMFCResponse");
    private final static QName _ServiceException_QNAME = new QName("http://proxy.std.msr.com/schemas", "serviceException");
    private final static QName _ServiceExceptionBeanComment_QNAME = new QName("", "comment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.msr.std.proxy.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindStudentMFCRequest }
     * 
     */
    public FindStudentMFCRequest createFindStudentMFCRequest() {
        return new FindStudentMFCRequest();
    }

    /**
     * Create an instance of {@link FindStudentMFCResponse }
     * 
     */
    public FindStudentMFCResponse createFindStudentMFCResponse() {
        return new FindStudentMFCResponse();
    }

    /**
     * Create an instance of {@link ServiceExceptionBean }
     * 
     */
    public ServiceExceptionBean createServiceExceptionBean() {
        return new ServiceExceptionBean();
    }

    /**
     * Create an instance of {@link UniversityInfo }
     * 
     */
    public UniversityInfo createUniversityInfo() {
        return new UniversityInfo();
    }

    /**
     * Create an instance of {@link SearchBean }
     * 
     */
    public SearchBean createSearchBean() {
        return new SearchBean();
    }

    /**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link Responsible }
     * 
     */
    public Responsible createResponsible() {
        return new Responsible();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link ContactMos }
     * 
     */
    public ContactMos createContactMos() {
        return new ContactMos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentMFCRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentMFCRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://proxy.std.msr.com/schemas", name = "findStudentMFCRequest")
    public JAXBElement<FindStudentMFCRequest> createFindStudentMFCRequest(FindStudentMFCRequest value) {
        return new JAXBElement<FindStudentMFCRequest>(_FindStudentMFCRequest_QNAME, FindStudentMFCRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentMFCResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindStudentMFCResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://proxy.std.msr.com/schemas", name = "findStudentMFCResponse")
    public JAXBElement<FindStudentMFCResponse> createFindStudentMFCResponse(FindStudentMFCResponse value) {
        return new JAXBElement<FindStudentMFCResponse>(_FindStudentMFCResponse_QNAME, FindStudentMFCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceExceptionBean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceExceptionBean }{@code >}
     */
    @XmlElementDecl(namespace = "http://proxy.std.msr.com/schemas", name = "serviceException")
    public JAXBElement<ServiceExceptionBean> createServiceException(ServiceExceptionBean value) {
        return new JAXBElement<ServiceExceptionBean>(_ServiceException_QNAME, ServiceExceptionBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "comment", scope = ServiceExceptionBean.class)
    public JAXBElement<String> createServiceExceptionBeanComment(String value) {
        return new JAXBElement<String>(_ServiceExceptionBeanComment_QNAME, String.class, ServiceExceptionBean.class, value);
    }

}