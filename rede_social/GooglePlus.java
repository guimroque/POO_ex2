package rede_social;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int amigos){
        super(senha, amigos);
    }

    @Override
    public void videoConferencia() {
        System.out.println("Video conferencia no GooglePlus");
    }

    @Override
    public void compartilhamento() {
        System.out.println("Compartilhamento no GooglePlus");
    };

    @Override
    public void postarFoto(){
        System.out.println("Postando foto no Google Plus");
    }

    @Override
    public void postarVideo(){
        System.out.println("Postando video no Google Plus");
    }
    
    @Override
    public void postarComentario(){
        System.out.println("Postando comentario no Google Plus");
    }

}
