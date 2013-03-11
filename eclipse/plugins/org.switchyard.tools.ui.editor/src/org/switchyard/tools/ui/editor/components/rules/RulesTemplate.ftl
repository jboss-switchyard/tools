package ${packageName}
import org.switchyard.Message
global Message message

rule "${componentName}"
    when
        // insert conditional here
    then
        // insert consequence here
        System.out.println("service: ${serviceName}, payload: " + message.getContent());
end
