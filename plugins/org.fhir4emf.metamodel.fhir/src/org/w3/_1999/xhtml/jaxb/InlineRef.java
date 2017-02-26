package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.Inline;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "InlineRefElement")
public class InlineRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public Inline createInstance() {
		return XhtmlFactory.eINSTANCE.createInline();
	}
	
	public static InlineRef valueOf(String id) {
		InlineRef result = new InlineRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}