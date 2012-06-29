package ${packageName}
import org.switchyard.Message
global Message message

rule "${componentName}"
    System.out.println("service: ${serviceName}, payload: " + message.content);
    when
        // insert conditional here
    then
        // insert consequence here
end
