package rede_social;

public class Instagram extends RedeSocial{

    public 
        String senha;
        int numAmigos;

    public Instagram(String senha, int amigos){
        super(senha, amigos);
    }

    public void postarFoto(){
        System.out.println("Postando foto no Instagram");
    }

    public void postarVideo(){
        System.out.println("Postando video no Instagram");
    }

    public void postarComentario(){
        System.out.println("Postando comentario no Instagram");
    }
}
