package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RelatedArtifact;

@XmlRootElement(name = "RelatedArtifactRefElement")
public class RelatedArtifactRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public RelatedArtifact createInstance() {
		return FhirFactory.eINSTANCE.createRelatedArtifact();
	}
	
	public static RelatedArtifactRef valueOf(String id) {
		RelatedArtifactRef result = new RelatedArtifactRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}