package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RelatedArtifactType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.RelatedArtifactTypeList;
	
	
	
	

public class RelatedArtifactTypeImplAdapter extends XmlAdapter<String, RelatedArtifactType> {

	@Override
	public RelatedArtifactType unmarshal(String v) throws Exception {
		RelatedArtifactType result = FhirFactory.eINSTANCE.createRelatedArtifactType();
		result.setValue(RelatedArtifactTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(RelatedArtifactType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
