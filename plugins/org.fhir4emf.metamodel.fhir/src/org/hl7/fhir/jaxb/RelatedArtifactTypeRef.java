package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RelatedArtifactType;

@XmlRootElement(name = "RelatedArtifactTypeRefElement")
public class RelatedArtifactTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public RelatedArtifactType createInstance() {
		return FhirFactory.eINSTANCE.createRelatedArtifactType();
	}
	
	public static RelatedArtifactTypeRef valueOf(String id) {
		RelatedArtifactTypeRef result = new RelatedArtifactTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}