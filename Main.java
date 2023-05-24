import java.util.ArrayList;
import java.util.List;

import rede_social.*;

public class Main{
    public static void main(String[] args){


        List<RedeSocial> listRedes = new ArrayList<RedeSocial>();
        Facebook facebook = new Facebook("senhaFB", 1);
        Instagram instagram = new Instagram("senhaIG", 3);
        


        listRedes.add(facebook);
        listRedes.add(instagram);



        new Usuario("Guilherme","guilherme.miguel@gea.inatel.br", listRedes);
        
        facebook.videoConferencia();
        facebook.compartilhamento();
        facebook.postarFoto();

        instagram.postarComentario();
        instagram.postarVideo();
        instagram.curtirPublicacao();

    }
}