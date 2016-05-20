package pl.cyfronet.ltos.beansecurity;

import pl.cyfronet.ltos.bean.Affiliation;
import pl.cyfronet.ltos.security.permission.OwnedResource;

public class AffiliationWrapper implements OwnedResource {
	
	private Affiliation affiliation;

	public AffiliationWrapper(Affiliation affiliation) {
		this.affiliation = affiliation;
	}
	
	@Override
	public String getOwnerId() {
		// fix this - user should be taken from database by id  
		if (affiliation.getOwner() == null) {
			return null;
		}
		return affiliation.getOwner().getLogin();
	}

}