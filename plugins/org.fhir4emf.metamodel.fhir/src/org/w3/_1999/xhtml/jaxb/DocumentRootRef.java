package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.DocumentRoot;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "DocumentRootRefElement")
public class DocumentRootRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public DocumentRoot createInstance() {
		return XhtmlFactory.eINSTANCE.createDocumentRoot();
	}
	
	public static DocumentRootRef valueOf(String id) {
		DocumentRootRef result = new DocumentRootRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}