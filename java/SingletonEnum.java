#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public enum ${NAME} {
    INSTANCE;
    // If needed, add fields, getters, setters and toString()
}