package rede_social;
public abstract class RedeSocial {
    private 
        String senha;
        int numAmigos;


    public RedeSocial(String senha, int amigos){
        this.numAmigos = amigos;
        this.senha = senha;
    }


    public void postarFoto(){
        System.out.println("Postando foto");
    }

    public void postarVideo(){
        System.out.println("Postando video");
    }

    public void postarComentario(){
        System.out.println("Postando comentario");
    }

    public void curtirPublicacao(){
        System.out.println("Curtindo publicacao");
    }

}
