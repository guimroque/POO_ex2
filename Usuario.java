import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import rede_social.Facebook;
import rede_social.Instagram;
import rede_social.RedeSocial;
public class Usuario {

    private
        String nome;
        String email;
        
        List<RedeSocial> redeSociais = new ArrayList<RedeSocial>();

    public Usuario(String nome, String email, List<RedeSocial> listRedes){
        this.nome = nome;
        this.email = email;

        try{
            for(int i = 0; i < listRedes.size(); i++){
                redeSociais.add(listRedes.get(i));
            }

            for(int i=0; i < listRedes.size(); i++){
                
                if(redeSociais.get(i) instanceof Facebook){
                    Facebook rs = (Facebook) redeSociais.get(i);
                    rs.videoConferencia();
                    rs.compartilhamento();
                    rs.postarFoto();
                }

                redeSociais.get(i).postarComentario();
                redeSociais.get(i).postarVideo();
                redeSociais.get(i).curtirPublicacao();
            }

        }catch(NullPointerException e){
            System.out.println("Erro ao adicionar redes sociais:" + e);
        }

    }

}
