package autobuz;

import metrou.ValidatorMetrou;

public class AdapterValidatorObiecte implements ValidatorAutobuz {
	private ValidatorMetrou validatorMetrou;
	public AdapterValidatorObiecte(ValidatorMetrou validatorMetrou) {
		this.validatorMetrou=validatorMetrou;
	}
	
	
	@Override
	public void validareAbonament() {
		validatorMetrou.validareAbonament();
		
	}

	@Override
	public void validareBilet() {
		validatorMetrou.validareCalatorie();;
		
	}

	
}
