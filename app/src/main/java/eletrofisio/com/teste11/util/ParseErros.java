package eletrofisio.com.teste11.util;

import java.util.HashMap;

public class ParseErros {

    private HashMap<Integer, String> erros;

    public ParseErros() {

        this.erros = new HashMap<>();
        this.erros.put(125, "Preencha email corretamente!");
        this.erros.put(200, "Login não preenchido");
        this.erros.put(201, "A senha não foi preenchida!");
        this.erros.put(202, "Usuário já existe, escolha um outro nome de usuário!");
        this.erros.put(203, "Email já existe, utilize outro!");
        this.erros.put(204, "Email não preenchido!");

    }

    public String getErro(int codErro){
        return this.erros.get( codErro );
    }
}