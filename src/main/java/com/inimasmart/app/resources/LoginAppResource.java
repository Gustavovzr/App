package com.inimasmart.app.resources;


import com.inimasmart.app.model.LoginApp;
import com.inimasmart.app.services.LoginAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginAppResource {

    @Autowired
    private LoginAppService loginService;

    @RequestMapping(value = "/obter/{nomeusuario}/{senha}/{urlServidor}")
    public ResponseEntity<LoginApp> obterLogin(@PathVariable String nomeUsuario, @PathVariable String senha, @PathVariable String urlServidor) throws Exception {
        LoginApp obj = loginService.obterLogin(nomeUsuario,senha,urlServidor);
        return ResponseEntity.ok(obj);
    }

}
