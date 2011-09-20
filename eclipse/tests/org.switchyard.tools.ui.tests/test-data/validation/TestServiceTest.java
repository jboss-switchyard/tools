package test.package_name;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.mixins.CDIMixIn;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(mixins = CDIMixIn.class, config = SwitchYardTestCaseConfig.SWITCHYARD_XML)
public class TestServiceTest {

	@ServiceOperation("TestService")
	private Invoker service;

	@Test
	public void testInOnlyOperation() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		service.operation("inOnlyOperation").sendInOnly(message);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

	@Test
	public void testInOutOperation() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		Object message = null;
		String result = service.operation("inOutOperation").sendInOut(message)
				.getContent(String.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

}
