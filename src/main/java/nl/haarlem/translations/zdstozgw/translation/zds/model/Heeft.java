package nl.haarlem.translations.zdstozgw.translation.zds.model;

import static nl.haarlem.translations.zdstozgw.translation.zds.model.namespace.Namespace.ZKN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Heeft {
	@XmlElement(namespace = ZKN)
	public Gerelateerde gerelateerde;

	@XmlElement(namespace = ZKN)
	public String datumStatusGezet;

	@XmlElement(namespace = ZKN)
	public String statustoelichting;

	@XmlElement(namespace = ZKN)
	public GerelateerdeWrapper isGezetDoor;
}
