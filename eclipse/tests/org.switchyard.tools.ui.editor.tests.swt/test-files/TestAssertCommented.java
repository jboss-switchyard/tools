package com.example.switchyard.SWTBot_Project;

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
public class PaymentsTest {

    @ServiceOperation("Payments")
    private Invoker service;

    @Test
    public void testSubmit() throws Exception {
        Invoice message = new Invoice();
        message.setDaysOut(118);
        service.operation("submit").sendInOnly(message);

        // validate the results
        //Assert.assertTrue("Implement me", false);
    }

}
