package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.CodeType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "CodeTypeRefElement")
public class CodeTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
	private String id;

	@XmlValue
	@Override
	public String getID() {
		return id;
	}

	@Override
	public void setID(String id) {
		this.id = id;
	}
	

	
	@Override
	public CodeType createInstance() {
		return XhtmlFactory.eINSTANCE.createCodeType();
	}
	
	public static CodeTypeRef valueOf(String id) {
		CodeTypeRef result = new CodeTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}