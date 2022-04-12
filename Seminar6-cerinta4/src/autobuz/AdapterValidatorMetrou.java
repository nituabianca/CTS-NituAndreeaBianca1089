package autobuz;

import metrou.ValidatorMetrou;

public class AdapterValidatorMetrou extends ValidatorMetrou implements ValidatorAutobuz {

	@Override
	public void validareBilet() {
		super.validareCalatorie();
		
	}

}
