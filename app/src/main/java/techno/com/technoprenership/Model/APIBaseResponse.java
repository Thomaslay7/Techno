package techno.com.technoprenership.Model;

import java.io.Serializable;

/**
 * Created by mery on 10/30/2017.
 */
public class APIBaseResponse implements Serializable {
    private int status;
    private String message;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
