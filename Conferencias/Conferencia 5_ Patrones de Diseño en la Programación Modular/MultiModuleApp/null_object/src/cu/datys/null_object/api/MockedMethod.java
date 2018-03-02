package cu.datys.null_object.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 11/02/2018.
 */
public class MockedMethod {
    private Class declaringClass;
    private String methodName;
    private Object expectedReturn;
    private Class[] parameterTypes;

    private MockedMethod(Builder builder) {
        this.declaringClass = builder.declaringClass;
        this.methodName = builder.methodName;
        this.expectedReturn = builder.expectedReturn;
        this.parameterTypes = new Class[builder.parametersType.size()];
        if(this.parameterTypes.length > 0){
            builder.parametersType.toArray(this.parameterTypes);
        }
    }

    public Class getDeclaringClass() {
        return declaringClass;
    }

    public String getMethodName() {
        return methodName;
    }

    public Object getExpectedReturn() {
        return expectedReturn;
    }

    public Class[] getParameterTypes() {
        return parameterTypes;
    }

    static class Builder{
        private Class declaringClass;
        private String methodName;
        private Object expectedReturn;
        private List<Class> parametersType;

        public Builder(Class declaringClass, String methodName, Object expectedReturn) {
            this.declaringClass = declaringClass;
            this.methodName = methodName;
            this.expectedReturn = expectedReturn;
            this.parametersType = new ArrayList<>();
        }

        public Builder parameterType(Class parameter){
            if(parameter == null)
                throw new IllegalArgumentException();
            this.parametersType.add(parameter);
            return this;
        }

        public MockedMethod build(){
            return new MockedMethod(this);
        }
    }
}
