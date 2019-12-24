#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public final class ${NAME} {
    private static final ${NAME} INSTANCE = new ${NAME}();

    private ${NAME}() {
        // Constructor not publicly available
    }

    public static synchronized ${NAME} getInstance() {
        return INSTANCE;
    }  
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}