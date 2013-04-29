package org.switchyard.tools.tests.wiring_validation_tests;

import org.switchyard.component.bean.Service;

@Service(value = BaseService.class, name = "WSDLService")
public class InvalidInterfaceComponent implements BaseService {

	@Override
	public int testInOutMethod(String input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void testInOnlyMethod(String input) {
		// TODO Auto-generated method stub

	}

	@Override
	public int testFaultMethod(String input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
