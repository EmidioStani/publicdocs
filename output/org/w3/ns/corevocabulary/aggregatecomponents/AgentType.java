//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.16 at 06:45:55 PM CET 
//


package org.w3.ns.corevocabulary.aggregatecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *                &lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;
 *                &lt;ccts:DictionaryEntryName&gt;Agent. Details&lt;/ccts:DictionaryEntryName&gt;
 *                &lt;ccts:Definition&gt;An entity that is able to carry out actions.&lt;/ccts:Definition&gt;
 *                &lt;ccts:ObjectClass&gt;Agent&lt;/ccts:ObjectClass&gt;
 *             &lt;/ccts:Component&gt;
 * </pre>
 * 
 *          
 * 
 * <p>Java class for AgentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/ns/corevocabulary/AggregateComponents}AgentPlaysRoleCorePublicService" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/corevocabulary/AggregateComponents}AgentProvidesCorePublicService" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/corevocabulary/AggregateComponents}AgentUsesCorePublicService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentType", propOrder = {
    "agentPlaysRoleCorePublicService",
    "agentProvidesCorePublicService",
    "agentUsesCorePublicService"
})
public class AgentType {

    @XmlElement(name = "AgentPlaysRoleCorePublicService")
    protected CorePublicServiceType agentPlaysRoleCorePublicService;
    @XmlElement(name = "AgentProvidesCorePublicService")
    protected CorePublicServiceType agentProvidesCorePublicService;
    @XmlElement(name = "AgentUsesCorePublicService")
    protected CorePublicServiceType agentUsesCorePublicService;

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Agent. Agent Plays Role_ Core Public Service. Core Public Service&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;A public service in which the agent plays a role.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Agent&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Agent Plays Role&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Core Public Service&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Core Public Service&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Core Public Service&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link CorePublicServiceType }
     *     
     */
    public CorePublicServiceType getAgentPlaysRoleCorePublicService() {
        return agentPlaysRoleCorePublicService;
    }

    /**
     * Sets the value of the agentPlaysRoleCorePublicService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePublicServiceType }
     *     
     */
    public void setAgentPlaysRoleCorePublicService(CorePublicServiceType value) {
        this.agentPlaysRoleCorePublicService = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Agent. Agent Provides_ Core Public Service. Core Public Service&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;A public service provided by the agent.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Agent&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Agent Provides&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Core Public Service&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Core Public Service&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Core Public Service&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link CorePublicServiceType }
     *     
     */
    public CorePublicServiceType getAgentProvidesCorePublicService() {
        return agentProvidesCorePublicService;
    }

    /**
     * Sets the value of the agentProvidesCorePublicService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePublicServiceType }
     *     
     */
    public void setAgentProvidesCorePublicService(CorePublicServiceType value) {
        this.agentProvidesCorePublicService = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Agent. Agent Uses_ Core Public Service. Core Public Service&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;A public service used by the agent.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Agent&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Agent Uses&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Core Public Service&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Core Public Service&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Core Public Service&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link CorePublicServiceType }
     *     
     */
    public CorePublicServiceType getAgentUsesCorePublicService() {
        return agentUsesCorePublicService;
    }

    /**
     * Sets the value of the agentUsesCorePublicService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePublicServiceType }
     *     
     */
    public void setAgentUsesCorePublicService(CorePublicServiceType value) {
        this.agentUsesCorePublicService = value;
    }

}