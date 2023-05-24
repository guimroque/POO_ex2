package rede_social;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    public Facebook(String senha, int amigos){
        super(senha, amigos);
    }

    @Override
    public void videoConferencia() {
        System.out.println("Video conferencia no Facebook");
    }

    @Override
    public void compartilhamento() {
        System.out.println("Compartilhamento no Facebook");
    };

    @Override
    public void postarFoto(){
        System.out.println("Postando foto no Facebook");
    }
    @Override
    public void postarVideo(){
        System.out.println("Postando video no Facebook");
    }
    @Override
    public void postarComentario(){
        System.out.println("Postando comentario no Facebook");
    }

}
