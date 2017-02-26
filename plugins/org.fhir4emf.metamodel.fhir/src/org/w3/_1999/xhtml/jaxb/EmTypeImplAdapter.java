package org.w3._1999.xhtml.jaxb;

import org.w3._1999.xhtml.EmType;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
public class EmTypeImplAdapter extends XmlAdapter<String, EmType> {

	@Override
	public EmType unmarshal(String v) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		Resource res = resourceSet.createResource(URI.createFileURI("/dev/sample/try.xml"));
		InputStream is = new ByteArrayInputStream(v.getBytes());
		res.load(is, resourceSet.getLoadOptions());
		TreeIterator<EObject> it = res.getAllContents();
		while (it.hasNext()) {
			EObject o = it.next();
			if (o instanceof EmType) {
				return (EmType) o;
			}
		}
		return null;
	}

	@Override
	public String marshal(EmType v) throws Exception {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, true);
		options.put(XMLResource.OPTION_FORMATTED, false);
		XMLHelperImpl helper = new XMLHelperImpl() {

			@Override
			protected String getPrefix(EPackage ePackage, boolean mustHavePrefix) {
				return "";
			}

		};
		String sourceString = XMLHelperImpl.saveString(options, Arrays.asList(v), null, helper);
		// rename root element
		sourceString = sourceString.replace("_._type", "");
		// remove unnecessary XMI statements, and define the namespace
		sourceString = sourceString.replace("xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\"", "xmlns=\"" + v.eClass().getEPackage().getNsURI() + "\"");
		// remove trailing line break
		sourceString = sourceString.trim();
		return sourceString;
	}

}
