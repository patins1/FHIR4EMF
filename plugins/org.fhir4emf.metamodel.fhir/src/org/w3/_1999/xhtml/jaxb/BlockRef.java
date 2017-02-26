package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.Block;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "BlockRefElement")
public class BlockRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public Block createInstance() {
		return XhtmlFactory.eINSTANCE.createBlock();
	}
	
	public static BlockRef valueOf(String id) {
		BlockRef result = new BlockRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}