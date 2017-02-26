package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.SpanType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "SpanTypeRefElement")
public class SpanTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public SpanType createInstance() {
		return XhtmlFactory.eINSTANCE.createSpanType();
	}
	
	public static SpanTypeRef valueOf(String id) {
		SpanTypeRef result = new SpanTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}