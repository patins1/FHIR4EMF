package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.ImgType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "ImgTypeRefElement")
public class ImgTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public ImgType createInstance() {
		return XhtmlFactory.eINSTANCE.createImgType();
	}
	
	public static ImgTypeRef valueOf(String id) {
		ImgTypeRef result = new ImgTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}