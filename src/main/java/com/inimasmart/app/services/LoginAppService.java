package com.inimasmart.app.services;


import com.inimasmart.app.model.LoginApp;
import com.inimasmart.app.model.vo.TurnoVO;
import com.inimasmart.app.model.vo.UsuarioVO;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class LoginAppService {

    public LoginApp obterLogin(String nomeUsuario, String senha, String urlServidor) throws Exception {

        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("LoginName", nomeUsuario);
        requestBody.put("Senha", senha);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(requestBody, headers);

        try {

        ResponseEntity<Map> response = restTemplate.postForEntity(urlServidor + "/servicefy/api/login", requestEntity, Map.class);

            if (response.getStatusCode() == HttpStatus.OK) {
                Map<String, Object> responseBody = response.getBody();

                LoginApp login = new LoginApp();
                login.setUser((UsuarioVO) responseBody.get("user"));
                login.setToken((String) responseBody.get("TokenSessao"));
                login.setTurno((TurnoVO) responseBody.get("Turno"));
                login.setModel((Map<Object, Object>) responseBody.get("Retorno"));

                return login;

            } else {
                throw new Exception("A chamada à API externa retornou um status HTTP inválido: " + response.getStatusCode());
            }
        } catch (Exception e){
            throw e;
        }

    }
}
