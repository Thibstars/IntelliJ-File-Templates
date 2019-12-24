#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public final class ${NAME} {
    private static ${NAME} classInstance = new ${NAME}();

    private ${NAME}() {
        // Constructor not publicly available
    }

    public static synchronized ${NAME} getInstance() {
        return classInstance;
    }  
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}