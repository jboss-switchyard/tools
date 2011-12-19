package test.package_name;

import java.util.Collection;

public interface TestService {
    public void inOnlyOperation(String data);
    public String inOutOperation(String data);
    public String[] arrayReturnType(String data);
    public Collection<String> parameterizedReturnType(String data);
    public Collection genericReturnType(String data);
}
