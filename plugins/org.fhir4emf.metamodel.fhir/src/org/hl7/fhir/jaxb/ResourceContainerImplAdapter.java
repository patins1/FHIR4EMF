package org.hl7.fhir.jaxb;

import java.util.Arrays;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.impl.ResourceImpl;

public class ResourceContainerImplAdapter extends XmlAdapter<Object, ResourceContainer> {

	@Override
	public ResourceContainer unmarshal(Object v) throws Exception {
		ResourceContainer rc = FhirFactory.eINSTANCE.createResourceContainer();
		for (EStructuralFeature f : rc.eClass().getEAllStructuralFeatures()) {
			if (f.getEType().isInstance(v)) {
				rc.eSet(f, v);
				break;
			}
		}
		return rc;
	}

	@Override
	public Object marshal(ResourceContainer v) throws Exception {
		TreeIterator<Object> it = EcoreUtil.getAllContents(Arrays.asList(v));
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof ResourceImpl)
				return (ResourceImpl) o;
		}
		return null;
	}
}
