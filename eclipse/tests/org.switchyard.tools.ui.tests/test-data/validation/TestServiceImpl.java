package test.package_name;

import org.switchyard.component.bean.Service;

@Service(TestService.class)
public class TestServiceImpl implements TestService {

	@Override
	public void inOnlyOperation(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public String inOutOperation(String data) {
		// TODO Auto-generated method stub
		return null;
	}

}
