#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public final class ${NAME} {
    private static final ${NAME} INSTANCE = null;

    private ${NAME}() {
        // Constructor not publicly available
    }

    public static synchronized ${NAME} getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ${NAME}();
        }

        return INSTANCE;
    }  
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}