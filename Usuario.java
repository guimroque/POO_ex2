import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import rede_social.RedeSocial;
public class Usuario {

    private
        String nome;
        String email;
    public RedeSocial[] redeSociais;

    public Usuario(String nome, String email, List<RedeSocial> listRedes){
        this.nome = nome;
        this.email = email;
        this.redeSociais = new RedeSocial[listRedes.size()];
        try{
            for(int i = 0; i < listRedes.size(); i++){
                redeSociais[0] = listRedes.get(i);
            }

        }catch(NullPointerException e){
            System.out.println("Erro ao adicionar redes sociais:" + e);
        }

    }

}
