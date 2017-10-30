package techno.com.technoprenership.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mery on 10/30/2017.
 */
public class APIUser  extends APIBaseResponse implements Serializable {

    private List<UserDataBean> userData;

    public List<UserDataBean> getUserData() {
        return userData;
    }

    public void setUserData(List<UserDataBean> userData) {
        this.userData = userData;
    }

    private int id;
    private String password;
    private String email;
    private String created_at;
    private String updated_at;

}
