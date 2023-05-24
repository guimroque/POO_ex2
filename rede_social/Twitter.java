package rede_social;

public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int amigos){
        super(senha, amigos);
    }

    @Override
    public void compartilhamento() {
        System.out.println("Compartilhamento no Twitter");
    };
    
    public void postarFoto(){
        System.out.println("Postando foto no Twitter");
    }

    public void postarVideo(){
        System.out.println("Postando video no Twitter");
    }

    public void postarComentario(){
        System.out.println("Postando comentario no Twitter");
    }

    public void curtirPublicacao(){
        System.out.println("Curtindo publicacao no Twitter");
    }
}
