package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QualityType;

@XmlRootElement(name = "QualityTypeRefElement")
public class QualityTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public QualityType createInstance() {
		return FhirFactory.eINSTANCE.createQualityType();
	}
	
	public static QualityTypeRef valueOf(String id) {
		QualityTypeRef result = new QualityTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}