package com.inimasmart.app.model;

import com.inimasmart.app.model.vo.TurnoColaboradorVO;
import com.inimasmart.app.model.vo.TurnoVO;
import com.inimasmart.app.model.vo.UsuarioVO;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Map;

@Component
public class LoginApp implements Serializable {
    private static final long serialVersionUID = 1L;

    private UsuarioVO user;

    private TurnoVO turno;

    private String token;

    private Map<Object,Object> model;

    public LoginApp (){}

    public LoginApp(UsuarioVO user, TurnoVO turno, String token, Map<Object,Object> model){
        this.user = user;
        this.turno = turno;
        this.token = token;
        this.model = model;
    }

    public UsuarioVO getUser() {
        return user;
    }

    public void setUser(UsuarioVO user) {
        this.user = user;
    }

    public TurnoVO getTurno() {
        return turno;
    }

    public void setTurno(TurnoVO turno) {
        this.turno = turno;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Map<Object, Object> getModel() {
        return model;
    }

    public void setModel(Map<Object, Object> model) {
        this.model = model;
    }
}
