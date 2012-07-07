package org.hawknetwork.hawkrota.domain.base;

import org.hawknetwork.common.ObjectResolver;

public class BaseDomainClass {
	private String key;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object readResolve() {
		return ObjectResolver.resolveObject(this.getClass(),this.getKey(),this);
	}
}
