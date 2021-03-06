package red.lixiang.tools.base.exception;



/**
 * @author lixiang
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Throwable throwable;

    private String errorMessage;

    private String errorCode;

    /**
     * 用于保存发生异常时的一些场景信息
     */
    private Object env;

    public BusinessException(String msg) {
        super(msg);
        this.errorMessage = msg;
    }

    public BusinessException(String msg, String code) {
        super(msg);
        this.errorMessage = msg;
        this.errorCode = code;
    }

    public BusinessException(String msg, Throwable exception) {
        super(msg,exception);
        this.throwable = exception;
        this.errorMessage = msg;
    }

    public BusinessException(String msg, String code , Throwable throwable, Object env){
        super(msg,throwable);
        this.errorCode = code;
        this.errorMessage = msg;
        this.throwable = throwable;
        this.env = env;
    }

    public BusinessException(String msg, String code , Object env){
        super(msg);
        this.errorCode = code;
        this.errorMessage = msg;
        this.env = env;
    }

    public BusinessException(ExceptionEnum e , Object env){
        super(e.getErrorCode()+":"+e.getErrorMsg());
        this.errorCode = e.getErrorCode();
        this.errorMessage = e.getErrorMsg();
        this.env = env;
    }

    public BusinessException(ExceptionEnum e ){
        super(e.getErrorCode()+":"+e.getErrorMsg());
        this.errorCode = e.getErrorCode();
        this.errorMessage = e.getErrorMsg();

    }



    public BusinessException(String msg, String code, Throwable exception) {
        super(msg,exception);
        this.errorMessage = msg;
        this.errorCode = code;
        this.throwable = exception;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public BusinessException setThrowable(Throwable throwable) {
        this.throwable = throwable;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public BusinessException setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public BusinessException setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Object getEnv() {
        return env;
    }

    public BusinessException setEnv(Object env) {
        this.env = env;
        return this;
    }
}
