package factory;

import factory.MijlocTransport;

public interface Factory {
	MijlocTransport createObject(String nrInmatriculare);

}
