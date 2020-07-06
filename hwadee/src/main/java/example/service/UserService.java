package example.service;

import example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    private UserDao userdao;
    @Autowired
    public void setUserDao(UserDao userdao) {
        this.userdao = userdao;
    }
    public boolean Match(String UserName,String UserPwd)
    {
        int count=userdao.FindUser(UserName,UserPwd);
        return count>0;
    }
    public void InsertUser(String UserName,String UserPwd){
        userdao.InsertUser(UserName,UserPwd);
    }
}

