package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.QType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "QTypeRefElement")
public class QTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public QType createInstance() {
		return XhtmlFactory.eINSTANCE.createQType();
	}
	
	public static QTypeRef valueOf(String id) {
		QTypeRef result = new QTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}